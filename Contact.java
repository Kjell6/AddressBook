import java.util.LinkedList;
import java.util.List;
/**
 * Datenklasse für einen Kontakt mit Vorname, Nachname
 * und Adresse (Straße, Postleitzahl, Stadt und Land).
 *
 * @author Kjell Behrends
 * @author Julian Latendorf
 */

public class Contact {
    String firstName;
    String lastName;
    Address address;


    /**
     * Erstellt ein neues Kontaktobjekt mit den angegebenen Daten.
     *
     * @param vname der Vorname des Kontakts
     * @param nname der Nachname des Kontakts
     */

    public Contact(String vname, String nname, Address adr) {
        this.firstName = vname;
        this.lastName = nname;
        this.address = adr;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * Gibt eine formatierte Zeichenfolge zurück, die die Informationen dieses Kontakts enthält.
     * Die Informationen werden in diesem Format angezeigt:
     * Vorname Nachname, Straße, Postleitzahl Stadt, Land.
     *
     * @return formatierte Zeichenfolge
     */
    public String toString() {
        return String.format("%s %s, %s, %s %s, %s",
                this.firstName, this.lastName);
    }
}
