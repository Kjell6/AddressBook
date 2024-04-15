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
    List<Contact> contacts;

    /**
     * Erstellt ein neues, leeres Adressbuch.
     */
    public AddressBook() {
        this.contacts = new LinkedList<>();
    }

    /**
     * Fügt einen Kontakt in das Adressbuch.
     *
     * @param neuerKontakt hinzuzufügender Kontakt
     */
    public void addContact(Contact neuerKontakt) {
        this.contacts.add(neuerKontakt);
    }

    /**
     * Sucht nach Zeichenfolge im Adressbuch und gibt die entsprechenden Kontakte aus.
     *
     * @param search zu suchende Zeichen
     * @return fromatierte Kontakte mit Übereinstimmung
     */
    public String searchContacts(String search) {
        String ergebnis = "Suchergebnisse: \n";
        for (Contact k : this.contacts) {
            if ((k.toString().toLowerCase()).contains(search.toLowerCase())) {
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
