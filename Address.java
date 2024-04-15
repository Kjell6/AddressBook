public class Address {
    String street;
    String postalCode;
    String city;
    String country;

    /**
     * Erstellt ein Address Objekt mit Straße, PLZ, Stadt, Land
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

}
