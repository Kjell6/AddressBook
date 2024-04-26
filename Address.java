/**
 * Datenklasse für eine Adresse mit Straße, Postleitzahl, Stadt und Land.
 *
 * @author Kjell Behrends
 * @author Julian Latendorf
 */

public class Address {
    private String street;
    private String postalCode;
    private String city;
    private String country;

    /**
     * Erstellt ein Address Objekt mit Straße, PLZ, Stadt, Land.
     *
     * @param str Straße
     * @param plc Postleitzahl
     * @param cty Stadt
     * @param cou Land
     */
    public Address(String str, String plc, String cty, String cou) {
        this.street = str;
        this.postalCode = plc;
        this.city = cty;
        this.country = cou;
    }

    /**
     * Gibt die Straße dieser Adresse zurück.
     *
     * @return die Straße
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * Gibt die Postleitzahl dieser Adresse zurück.
     *
     * @return die Postleitzahl
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Gibt die Stadt dieser Adresse zurück.
     *
     * @return die Stadt
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Gibt das Land dieser Adresse zurück.
     *
     * @return das Land
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Gibt eine formatierte Zeichenfolge zurück, die die Informationen dieser Adresse enthält.
     * Die Informationen werden in diesem Format angezeigt:
     * Straße, Postleitzahl Stadt, Land
     *
     * @return formatierte Zeichenfolge
     */
    public String toString() {
        return String.format("%s, %s %s, %s",
                this.street, this.postalCode, this.city, this.country);
    }
}
