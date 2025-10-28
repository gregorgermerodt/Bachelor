import java.util.Arrays;
public class Measurement {
    private int[] data;
    public Measurement() {
        data = new int[0];
    }
    public void addValue(int value) {
        int[] hilfsarray = new int[data.length + 1]; // hilfsarray erzeugen,
                                                        // dass 1 Element mehr
                                                        // hat
        for (int i = 0; i < data.length; i++) { // Werte gleichsetzen
            hilfsarray[i] = data[i];
        }
        data = new int[hilfsarray.length]; // data-array mit neuer l�nge
                                            // definieren
        data[data.length - 1] = value; // letzten Wert festsetzen
    }
    public void addValues(int[] values) {
        int[] neuesarray = new int[data.length + values.length];
        for (int i = 0; i < data.length; i++) {
            neuesarray[i] = data[i];
        }
        for (int i = data.length; i < data.length + values.length; i++) {
            neuesarray[i] = values[i - data.length];
        }
        data = neuesarray;
    }
    public int getMinimumValue() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
    public int[] getValuesAboveThreshold(int threshold) {
        
        int groesse = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > threshold){
                groesse++;
                
            }
            
        }
        
        int[] neu = new int[groesse];
        
        for (int indexData = 0, indexNeu = 0, indexNeu < neu.length, indexData++) {
            
            if (data[indexData] > threshold){
                neu[indexNeu] = data[indexData];
                indexNeu++;
            
        }}
                
        
        return data;
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
        System.out
                .println("------------------------------------------------------------------");
        m.addValue(85);
        System.out.println("Hinzufügen eines neuen Wertes. m:");
        // Erwartete Ausgabe:
        // [85]
        m.printData();
        System.out
                .println("------------------------------------------------------------------");
        m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
        System.out.println("Hinzuzfügen einer Menge von Werten. m:");
        // Erwartete Ausgabe:
        // [85, 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93]
        m.printData();
        System.out
                .println("------------------------------------------------------------------");
        int minimumValue = m.getMinimumValue();
        System.out.println("Minimaler Wert der Messreihe m:");
        // Erwartete Ausgabe: 58
        System.out.println(minimumValue);
        System.out
                .println("------------------------------------------------------------------");
        int[] valuesAbove78 = m.getValuesAboveThreshold(78);
        System.out.println("Messwerte über 78:");
        // Erwartete Ausgabe:
        // [85, 93, 81, 79, 81, 93]
        System.out.println(Arrays.toString(valuesAbove78));
        System.out
                .println("------------------------------------------------------------------");
        int[] valuesAbove93 = m.getValuesAboveThreshold(93);
        System.out.println("Messwerte über 93:");
        // Erwartete Ausgabe:
        // []
        System.out.println(Arrays.toString(valuesAbove93));
    }
}