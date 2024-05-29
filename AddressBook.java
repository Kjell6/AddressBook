
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

/**
 * Datenklasse für ein Adressbuch in dem Kontakte gespeichert werden.
 *
 * @author Kjell Behrends
 * @author Julian Latendorf
 */
public class AddressBook {
    private Set<Contact> contacts;

    /**
     * Erstellt ein neues, leeres Adressbuch.
     */
    public AddressBook() {
        this.contacts = new HashSet<>();
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
     * Fügt Kontakte aus einer TXT-Datei in das Tagebuch hinzu.
     * Die Kontakte müssen im folgenden Format sein:
     * Vorname, Nachname, topic Adresse, straße, postleitzahl, Stadt, Land, topic Telefonnummer,
     * ländervorwahl, nationale vorwahl, telefonnummer
     *
     * @param kontakte die Datei, aus der die Kontakte importiert werden sollen
     */
    public void importContacts(File kontakte) {
        try {
            Scanner scan = new Scanner(kontakte);

            while (scan.hasNext()) {
                String[] cParts = scan.nextLine().split(",");
                Address a = new Address(cParts[2], cParts[3], cParts[4], cParts[5], cParts[6]);
                Phone p = new Phone(cParts[7], cParts[8], cParts[9], cParts[10]);
                Contact c = new Contact(cParts[0], cParts[1], a, p);
                this.addContact(c);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }


    }

    /**
     * Sucht nach den Namen der Kontakte.
     *
     * @param search zu suchende Zeichen
     * @return fromatierte Kontakte, die mit der Suche übereinstimmen
     */
    public String searchContacts(String search) {
        String ergebnis = "Suchergebnisse: \n";
        for (Contact k : this.contacts) {
            String name = k.getLastName();
            if ((name.toLowerCase()).contains(search.toLowerCase())) {
                ergebnis += "\t" + k + "; \n";
            }
        }
        return ergebnis;
    }

    /**
     * Sucht nach allen Attributen der Kontakte.
     *
     * @param search zu suchende Zeichen
     * @return Kontakte, die der search entsprechen
     */
    public String findBy(String search) {
        String ergebnis = "Find Ergebnisse: \n";
        for (Contact k : this.contacts) {
            String s = k.toString();
            if ((s.toLowerCase()).replaceAll("\\s+", "").contains(search.toLowerCase())) {
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
