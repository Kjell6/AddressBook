import java.io.File;

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
        Address a1 = new Address("Privat", "Dorfstraße 7", "23701", "Eutin", "Deutschland");
        Phone p1 = new Phone("Privat","+49", "0159", "01979016");
        Contact kjell = new Contact("Kjell", "Behrends", a1, p1);

        Address a2 = new Address("Ananas", "Wolkenweg 42", "99999", "Wolkenschloss", "Wolkenland");
        Phone p2 = new Phone("Geschäftlich","+00", "123", "456789");
        Phone p2_2 = new Phone("Privat:","+00", "753", "45678609");
        Contact spongebob = new Contact("Spongebob", "Squarepants", a2, p2);
        spongebob.addPhone(p2_2);
        spongebob.addPhone(p2_2);

        Address a3 = new Address("Privat","Geheimstraße 007", "66666", "Geheimstadt", "Geheimland");
        Phone p3 = new Phone("Privat","+98", "765", "43210987");
        Contact jamesBond = new Contact("James", "Bond", a3, p3);

        Contact billBond = new Contact("Bill", "Bond");

        AddressBook buch1 = new AddressBook();
        buch1.addContact(kjell);
        buch1.addContact(spongebob);
        buch1.addContact(jamesBond);
        buch1.addContact(billBond);


        File kontakte = new File("Kontakte.txt");
        buch1.importContacts(kontakte);
        System.out.println(buch1);

        File kontakteError = new File("Error.txt");
        buch1.importContacts(kontakteError);
    }

}
