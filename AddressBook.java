import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Datenklasse für ein Adressbuch in dem Kontakte gespeichert werden.
 *
 * @author Kjell Behrends
 * @author Julian Latendorf
 */
public class AddressBook {
    private List<Contact> contacts;

    /**
     * Erstellt ein neues, leeres Adressbuch.
     */
    public AddressBook() {
        this.contacts = new LinkedList<>();
    }

    /**
     * Fügt einen Kontakt in das Adressbuch.
     *
     * @param newContact hinzuzufügender Kontakt
     */
    public void addContact(Contact newContact) {
        this.contacts.add(newContact);
    }

    /**
     * Entfernt einen Kontakt.
     *
     * @param c zu entfernender Kontakt
     */
    public void removeContact(Contact c) {
        this.contacts.remove(c);
    }

    /**
     * Entfernt alle Kontakte.
     */
    public void clearContacts() {
        this.contacts.clear();
    }

    /**
     * Sucht nach Zeichenfolge im Adressbuch und gibt die entsprechenden Kontakte aus.
     *
     * @param search zu suchende Zeichen
     * @return fromatierte Kontakte, die mit der Suche übereinstimmen
     */
    public String searchContacts(String search) {
        String ergebnis = "Suchergebnisse: \n";
        for (Contact k : this.contacts) {
            String name = k.getFirstName() + k.getLastName();
            if ((name.toLowerCase()).contains(search.toLowerCase())) {
                ergebnis += "\t" + k + "; \n";
            }
        }
        return ergebnis;
    }

    /**
     * Sortiert die Kontakte Alphabetisch nach Namen.
     *
     * @return sortierte Liste als String formatiert.
     */
    public String sortContacts() {
        List<String> sortiert = new LinkedList<>();
        for (Contact k : contacts) {
            sortiert.add(k.toString());
        }

        Collections.sort(sortiert);

        String sortiertFormatiert = "Adressbuch Sortiert: \n";
        for (String s : sortiert) {
            sortiertFormatiert += "\t" + s + "; \n";
        }

        return sortiertFormatiert;
    }

    /**
     * Gibt eine formatierte Liste zurück, die die Informationen der Kontakte enthält.
     * Die Informationen werden in diesem Format angezeigt: [Kontakt], [Kontakt] ...
     *
     * @return formatierte Zeichenfolge
     */
    public String toString() {
        String formatiert = "";
        formatiert += "Adressbuch: \n";
        for (Contact k : this.contacts) {
            formatiert += "\t" + k + "; \n";
        }
        return formatiert;
    }


}
