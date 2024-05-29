import java.util.HashSet;
import java.util.Set;

/**
 * Datenklasse für einen Kontakt mit Vorname, Nachname
 * und Adresse (Straße, Postleitzahl, Stadt und Land) und Telefonnummer.
 *
 * @author Kjell Behrends
 * @author Julian Latendorf
 */

public class Contact {
    private String firstName;
    private String lastName;
    private Set<Address> addresses;
    private Set<Phone> phones;
    private String face;

    /**
     * Erstellt einen neuen Kontakt mit dem angegebenen Vornamen, Nachnamen, Adresse und Telefonnummer.
     *
     * @param vname der Vorname des Kontakts
     * @param nname der Nachname des Kontakts
     * @param a die Adresse des Kontakts
     * @param p die Telefonnummer des Kontakts
     */

    public Contact(String vname, String nname, Address a, Phone p) {
        this.firstName = vname;
        this.lastName = nname;
        this.addresses = new HashSet<>();
        if (a != null) this.addresses.add(a);
        this.phones = new HashSet<>();
        if (p != null) this.phones.add(p);
    }

    /**
     * Erstellt einen neuen Kontakt mit dem angegebenen Vornamen und Nachnamen.
     *
     * @param vname der Vorname des Kontakts
     * @param nname der Nachname des Kontakts
     */
    public Contact(String vname, String nname) {
        this(vname, nname, null, null);
    }

    /**
     * Erstellt einen neuen Kontakt mit dem angegebenen Vornamen, Nachnamen und Adresse.
     *
     * @param vname der Vorname des Kontakts
     * @param nname der Nachname des Kontakts
     * @param a die Adresse des Kontakts
     */
    public Contact(String vname, String nname, Address a) {
        this(vname, nname, a, null);
    }

    /**
     * Erstellt einen neuen Kontakt mit dem angegebenen Vornamen, Nachnamen und Telefonnummer.
     *
     * @param vname der Vorname des Kontakts
     * @param nname der Nachname des Kontakts
     * @param p die Telefonnummer des Kontakts
     */
    public Contact(String vname, String nname, Phone p) {
        this(vname, nname, null, p);
    }


    /**
     * Gibt den Vornamen dieses Kontakts zurück.
     *
     * @return der Vorname des Kontakts
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Gibt den Nachnamen dieses Kontakts zurück.
     *
     * @return der Nachname des Kontakts
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gibt die Adresse dieses Kontakts zurück.
     *
     * @return die Adresse des Kontakts
     */
    public Set<Address> getAddress() {
        return this.addresses;
    }

    /**
     * Überprüft, ob der Kontakt eine Adresse hat.
     *
     * @return true, wenn der Kontakt mindestens eine Adresse hat, sonst false
     */
    public boolean hasAddress() {
        return !this.addresses.isEmpty();
    }

    /**
     * Fügt dem Kontakt eine Adresse hinzu.
     *
     * @param a die hinzuzufügende Adresse
     */
    public void addAddress(Address a) {
        this.addresses.add(a);
    }

    /**
     * Entfernt eine Adresse aus dem Kontakt.
     *
     * @param a die zu entfernende Adresse
     */
    public void removeAddress(Address a) {
        this.addresses.remove(a);
    }

    /**
     * Löscht alle Adressen des Kontakts.
     */
    public void clearAddress() {
        this.addresses.clear();
    }


    /**
     * Gibt die Telefonnummer dieses Kontakts zurück.
     *
     * @return die Telefonnummer des Kontakts
     */
    public Set<Phone> getPhone() {
        return this.phones;
    }

    /**
     * Überprüft, ob der Kontakt eine Telefonnummer hat.
     *
     * @return true, wenn der Kontakt mindestens eine Telefonnummer hat, sonst false
     */
    public boolean hasPhone() {
        return !this.phones.isEmpty();
    }

    /**
     * Fügt dem Kontakt eine Telefonnummer hinzu.
     *
     * @param p die hinzuzufügende Telefonnummer
     */
    public void addPhone(Phone p) {
        this.phones.add(p);
    }

    /**
     * Entfernt eine Telefonnummer aus dem Kontakt.
     *
     * @param p die zu entfernende Telefonnummer
     */
    public void removePhone(Phone p) {
        this.phones.remove(p);
    }

    /**
     * Löscht alle Telefonnummern des Kontakts.
     */
    public void clearPhone() {
        this.phones.clear();
    }



    /**
     * Gibt eine formatierte Zeichenfolge zurück, die die Informationen dieses Kontakts enthält.
     * Die Informationen werden in diesem Format angezeigt:
     * Vorname Nachname,
     *  Straße, Postleitzahl Stadt, Land
     *  Telefonnummer
     *
     * @return formatierte Zeichenfolge
     */
    public String toString() {
        String formated = String.format("%s %s", this.firstName, this.lastName);

        if (!this.addresses.isEmpty()) {
            String stringA = "Adresses:";
            for (Address a : this.addresses) {
                stringA += "\n \t \t" + a;
            }
            formated += String.format(",\n \t %s",
                    stringA);
        }

        if (!this.phones.isEmpty()) {
            String stringP = "Phonenumbers:";
            for (Phone p : this.phones) {
                stringP += "\n \t \t" + p;
            }
            formated += String.format("\n \t %s",
                    stringP);
        }

        return formated;
    }
}
