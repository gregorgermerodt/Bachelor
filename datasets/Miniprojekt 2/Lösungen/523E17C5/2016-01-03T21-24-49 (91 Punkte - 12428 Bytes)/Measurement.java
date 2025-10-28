import java.util.Arrays;

/**
 *
 * @author Martin Grunwald
 * @version 01.05.2014
 */
public class Measurement {

    private int[] data;

    /**
     * Konstruktor für Measurement
     */
    public Measurement() {
        data = new int[0];
    }

    /**
     * fuegt value an data an
     *
     * @param value anzufuegender Wert
     */
    public void addValue(int value) {
        // Arrays.copyOf() kopiert einen Array. der zweite Parameter ist die neue Laenge
        // wenn keine Werte mehr vorhanden sind, werden Nullen angehängt
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = value;
    }

    /**
     * fuegt values an data an
     *
     * @param values anzufuegende Werte
     */
    public void addValues(int[] values) {
        // foreach-Schleife
         for (int i = 0; i > data.length ; i++) {
			addValue(i);
        }
    }

    /**
     * gibt den kleinsten Wert aus data zurueck
     *
     * @return kleinster Wert aus data
     */
    public int getMinimumValue() {
        // da wir den kleinsten Wert suchen, ist der erste Vergleichswert der hoechste,
        // den ein Integer annehmen kann (der erste Wert im Array ist also auf jeden
        // Fall kleiner). man haette auch 1000000 o.ä. nehmen koennen
        int cmp = Integer.MAX_VALUE;
        for (int tmp : data) {
            if (tmp < cmp) {
                cmp = tmp;
            }
        }
        return cmp;
    }

    /**
     * gibt einen Array mit allen Werten > threshold zurueck
     *
     * @param threshold Grenze, die alle Werte ueberschreiten muessen
     * @return Array mit allen Werten > threshold
     */
    public int[] getValuesAboveThreshold(int threshold) {
        int[] results = new int[0];
        for (int tmp : data) {
            if (tmp > threshold) {
                // funktioniert genauso wie addValue()
                results = Arrays.copyOf(results, results.length + 1);
                results[results.length - 1] = tmp;
            }
        }
        return results;
    }

    // --------------------------------------------------------------
    public void printData() {
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        Measurement m = new Measurement();
        System.out.println("Neues Measurement-Objekt m erzeugt. m:");
        // ErwarteteAusgabe:
        // []
        m.printData();

        System.out.println("------------------------------------------------------------------");

        m.addValue(85);
        System.out.println("Hinzufügen eines neuen Wertes. m:");
        // Erwartete Ausgabe:
        // [85]
        m.printData();

        System.out.println("------------------------------------------------------------------");

        m.addValues(new int[]{58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93});
        System.out.println("Hinzuzfügen einer Menge von Werten. m:");
        // Erwartete Ausgabe:
        // [85, 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93]
        m.printData();

        System.out.println("------------------------------------------------------------------");

        int minimumValue = m.getMinimumValue();
        System.out.println("Minimaler Wert der Messreihe m:");
        // Erwartete Ausgabe: 58
        System.out.println(minimumValue);

        System.out.println("------------------------------------------------------------------");

        int[] valuesAbove78 = m.getValuesAboveThreshold(78);
        System.out.println("Messwerte über 78:");
        // Erwartete Ausgabe:
        // [85, 93, 81, 79, 81, 93]
        System.out.println(Arrays.toString(valuesAbove78));

        System.out.println("------------------------------------------------------------------");

        int[] valuesAbove93 = m.getValuesAboveThreshold(93);
        System.out.println("Messwerte über 93:");
        // Erwartete Ausgabe:
        // []
        System.out.println(Arrays.toString(valuesAbove93));
    }

}
