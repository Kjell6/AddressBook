/**
 * Hauptklasse für die Ausführung des Programms.
 * Die Klasse erstellt einige Kontaktobjekte und fügt sie einem Adressbuch hinzu.
 * Anschließend werden verschiedene Operationen wie das Suchen,
 * Entfernen und Löschen von Kontakten durchgeführt.
 * Diese Klasse dient als Einstiegspunkt für das Programm.
 *
 * @author Kjell Behrends
 * @author Julian Latendorf
 */

public class Main {

    /**
     * Hauptmethode des Programms.
     * Hier werden Kontaktobjekte erstellt, einem Adressbuch hinzugefügt
     * und Operationen auf dem Adressbuch durchgeführt.
     *
     * @param args Die Befehlszeilenargumente (nicht verwendet)
     */
    public static void main(String[] args) {
        Address a1 = new Address("Dorfstraße 7", "23701", "Eutin", "Deutschland");
        Phone p1 = new Phone("+49", "0159", "01979016");
        Contact kjell = new Contact("Kjell", "Behrends", a1, p1, "😀");

        Address a2 = new Address("Wolkenweg 42", "99999", "Wolkenschloss", "Wolkenland");
        Phone p2 = new Phone("+00", "123", "456789");
        Contact spongebob = new Contact("Spongebob", "Squarepants", a2, p2, "👨‍🦲");

        Address a3 = new Address("Geheimstraße 007", "66666", "Geheimstadt", "Geheimland");
        Phone p3 = new Phone("+98", "765", "43210987");
        Contact jamesBond = new Contact("James", "Bond", a3, p3);

        Address a4 = new Address("Arndtstraße 11", "23566", "Lübeck", "Deutschland");
        Phone p4 = new Phone("+46", "873", "98754789");
        Contact julian = new Contact("Julian", "Latendorf", a4, p4);

        System.out.println(kjell);

        AddressBook buch1 = new AddressBook();
        buch1.addContact(kjell);
        buch1.addContact(spongebob);
        buch1.addContact(jamesBond);
        buch1.addContact(julian);
        System.out.println(buch1);

        System.out.println(buch1.searchContacts("sponge"));

        buch1.removeContact(spongebob);
        System.out.println(buch1);

        buch1.clearContacts();
        System.out.println(buch1);
    }

}
