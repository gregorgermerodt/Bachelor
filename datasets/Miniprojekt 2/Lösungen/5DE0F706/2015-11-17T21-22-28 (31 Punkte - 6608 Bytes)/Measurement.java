import java.util.Arrays;

public class Measurement {

    private int[] data;
    int min;

    public Measurement() {
        int[] data;
    }

    public void addValue(int value) {
        if(data==null){
            data[0] = value;
        }
        else{
            int newLength = data.length;
            data [newLength] = value;
        }
    }

    public void addValues(int[] values) {
        int vLength = values.length;
        for(int a=0; a < vLength; a++){
            data[data.length] = values[a];
        }
    }

    public int getMinimumValue() {

        for(int b=0; b<data.length; b++){
            if(min>data[b]){
                min = data[b];
            }
        }

        return min;
    }

    public int[] getValuesAboveThreshold(int threshold) {
        int c = 0;
        int[] re = null;

        for(int d=0; d<data.length; d++){
            if(data[d]>threshold){
                re[c]=data[d];
                c++;
            }
        }

        return re;
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

        m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
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
