/**
 * Datenklasse für eine Telefonnummer mit Ländervorwahl, national Vorwahl, Anschlusskennung.
 *
 * @author Kjell Behrends
 * @author Julian Latendorf
 */
public class Phone extends Entry{

    private String areaCode;
    private String prefix;
    private String number;

    /**
     * Erstellt ein Phone-Objekt mit den angegebenen Daten und einer Beschreibung.
     *
     * @param t Beschreibung
     * @param ac Vorwahl
     * @param p Präfix
     * @param n Nummer
     */
    public Phone(String t, String ac, String p, String n) {
        super(t);
        this.areaCode = ac;
        this.prefix = p;
        this.number = n;
    }

    /**
     * Gibt die Vorwahl dieser Telefonnummer zurück.
     *
     * @return Ländervorwahl
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Gibt die national Vorwahl dieser Telefonnummer zurück.
     *
     * @return Präfix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Gibt die Anschlusskennung dieser Telefonnummer zurück.
     *
     * @return Nummer
     */
    public String getNumber() {
        return number;
    }

    /**
     * Gibt eine formatierte Zeichenfolge zurück, die
     * die Informationen dieser Telefonnummer enthält.
     * Die Informationen werden in diesem Format angezeigt: Vorwahl Präfix Nummer
     *
     * @return formatierte Zeichenfolge
     */
    public String toString() {
        return String.format("%s: %s %s %s",
                super.getTopic(), this.areaCode, this.prefix, this.number);
    }
}
