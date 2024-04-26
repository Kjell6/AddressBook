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
    private Address address;
    private Phone phone;
    private String face;
    private static final String[] FACES = {
            "👧🏻", "👧🏼", "👧🏽", "👧🏾", "👧🏿", "👧",
            "🧒🏻", "🧒🏼", "🧒🏽", "🧒🏾", "🧒🏿", "🧒",
            "👩🏻", "👩🏼", "👩🏽", "👩🏾", "👩🏿", "👩",
            "👨🏻", "👨🏼", "👨🏽", "👨🏾", "👨🏿", "👨",
            "👵🏻", "👵🏼", "👵🏽", "👵🏾", "👵🏿", "👵",
            "👴🏻", "👴🏼", "👴🏽", "👴🏾", "👴🏿", "👴",
            "👶🏻", "👶🏼", "👶🏽", "👶🏾", "👶🏿", "👶",
            "👱🏻‍", "👱🏼‍", "👱🏽‍", "👱🏾‍", "👱🏿‍", "👱‍",
            "👱🏻‍", "👱🏼‍", "👱🏽‍", "👱🏾‍", "👱🏿‍", "👱‍",
            "🧔🏻", "🧔🏼", "🧔🏽", "🧔🏾", "🧔🏿", "🧔",
            "👩🏻‍🦱", "👩🏼‍🦱", "👩🏽‍🦱", "👩🏾‍🦱", "👩🏿‍🦱", "👩‍🦱",
            "🧑🏻‍🦱", "🧑🏼‍🦱", "🧑🏽‍🦱", "🧑🏾‍🦱", "🧑🏿‍🦱", "🧑‍🦱",
            "👨🏻‍🦱", "👨🏼‍🦱", "👨🏽‍🦱", "👨🏾‍🦱", "👨🏿‍🦱", "👨‍🦱",
            "👩🏻‍🦰", "👩🏼‍🦰", "👩🏽‍🦰", "👩🏾‍🦰", "👩🏿‍🦰", "👩‍🦰",
            "👨🏻‍🦰", "👨🏼‍🦰", "👨🏽‍🦰", "👨🏾‍🦰", "👨🏿‍🦰", "👨‍🦰",
            "👩🏻‍🦳", "👩🏼‍🦳", "👩🏽‍🦳", "👩🏾‍🦳", "👩🏿‍🦳", "👩‍🦳",
            "👨🏻‍🦳", "👨🏼‍🦳", "👨🏽‍🦳", "👨🏾‍🦳", "👨🏿‍🦳", "👨‍🦳",
            "👩🏻‍🦲", "👩🏼‍🦲", "👩🏽‍🦲", "👩🏾‍🦲", "👩🏿‍🦲", "👩‍🦲",
            "👨🏻‍🦲", "👨🏼‍🦲", "👨🏽‍🦲", "👨🏾‍🦲", "👨🏿‍🦲", "👨‍🦲"

    };


    /**
     * Erstellt ein neues Kontaktobjekt mit Vorname, Nachname,
     * Adresse, Telefonnummer und zufälligen Gesicht.
     *
     * @param vname Vorname
     * @param nname Nachname
     * @param adr Adress-Objekt
     * @param p Phone-Objekt
     */
    public Contact(String vname, String nname, Address adr, Phone p) {
        this.firstName = vname;
        this.lastName = nname;
        this.address = adr;
        this.phone = p;
        this.face = FACES[(int) (Math.random() * FACES.length)];
    }

    /**
     * Erstellt ein neues Kontaktobjekt mit Vorname, Nachname, Adresse und Telefonnummer.
     * Entspricht der String f einem Gesichtemoji wird dieser dem Kontaktobjekt hinzugefügt,
     * sonst wird ein zufälliges Gesicht festgelegt.
     *
     * @param vname Vorname
     * @param nname Nachname
     * @param adr Adress-Objekt
     * @param p Phone-Objekt
     * @param f Gesichtemoji
     */
    public Contact(String vname, String nname, Address adr, Phone p, String f) {
        this.firstName = vname;
        this.lastName = nname;
        this.address = adr;
        this.phone = p;

        for (String faceL : FACES) {
            if (faceL.equals(f)) {
                this.face = f;
            }
        }
        if (this.face == null) {
            this.face = FACES[(int) (Math.random() * FACES.length)];
        }
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
    public Address getAddress() {
        return this.address;
    }

    /**
     * Gibt die Telefonnummer dieses Kontakts zurück.
     *
     * @return die Telefonnummer des Kontakts
     */
    public Phone getPhone() {
        return this.phone;
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
        return String.format("%s %s %s,\n \t %s, \n \t %s",
                this.face, this.firstName, this.lastName, this.address, this.phone);
    }
}
