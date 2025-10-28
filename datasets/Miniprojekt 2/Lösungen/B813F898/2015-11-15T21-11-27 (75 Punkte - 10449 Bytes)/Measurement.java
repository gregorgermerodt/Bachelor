import java.util.Arrays;

public class Measurement {

    private int[] data;

    public Measurement() {
        data = new int[0];
    }

    public void addValue(int value) {
        int[] temp = new int[data.length]; //Warum -1 ???
        temp[data.length] = value;

        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }

        data = temp;
        //data = new int[10];
        //data[data.length - 1] = value;
        //int i = 0;
        //int j = 0;
        /*boolean k = false;
        while(i < data.length && (k != true)){
        i++;
        if(data[i] == 0){
        data[i] = value;
        k = true;
        }    
        }*/
    }

    public void addValues(int[] values) {
        int[] temp = new int[data.length + values.length];

        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }

        for(int i = 0; i < values.length; i++){
            temp[data.length+i] = values[i];
        }
        data = temp;

    }

    public int getMinimumValue() {
        int i = 1;
        int min = data[i];
        while(i < data.length){
            if(min > data[i]){
                min = data[i];
            }
            i++;
        }
        return min;
    }

    public int[] getValuesAboveThreshold(int threshold) {
        /*i
        nt y=0;
        if (data[y]> threshold) {
            y++;
            int [] valuesabove = new int [y];
            for (int i=0; i<data.length; i++) {
                if (data[i]> threshold) {
                    
                    valuesabove[i]=data[i];

                }
            }
            return valuesabove;
        }
        return data;
        */
        int j=0;
        int[] valuesabove = new int[data.length];
        for(int i=0; i<data.length; i++){
            if(data[i]> threshold){
                valuesabove[j]=data[i];
                j++;
            }
        }
        
        
        
        int[] valuesaboveready = new int[j];
        for(int i=0; i<j; i++){
            valuesaboveready[i] = valuesabove[i];
        }
        
        data = valuesaboveready;
        return data;
        /*int i = 0;
        int j = 0;
        boolean k = false;
        int []valuesabove = new int[0];
        int []zero = new int[0];
        while(i < data.length){
        if(data[i] > threshold){
        valuesabove[j] = data[j];
        j++;
        k = true;
        }
        i++;
        }

        if(k = true){
        return valuesabove;
        }

        else{
        return zero;
        }*/
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
