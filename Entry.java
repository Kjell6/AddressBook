/**
 * Eine Klasse, die ein Eintrag mit einem topic repräsentiert.
 *
 * @author Kjell Behrends
 * @author Julian Latendorf
 */
public class Entry {
    private String topic;

    /**
     * Erstellt einen neuen Eintrag mit dem angegebenen topic.
     *
     * @param t das topic des Eintrags
     */
    public Entry(String t) {
        this.topic = t;
    }

    /**
     * Gibt das topic dieses Eintrags zurück.
     *
     * @return das topic des Eintrags
     */
    public String getTopic() {
        return this.topic;
    }
}

