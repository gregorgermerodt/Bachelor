package Miniprojekt2;

import java.util.Arrays;

public class Measurement {

    private int[] data;

    public Measurement() {

        data = new int[0];
    }

    public void addValue(int value) {

        if(data.length != 0) {

            int[] temp = new int[data.length];
            for(int i = 0; i < temp.length; i++) {
                temp[i] = data[i];
            }

            data = new int[temp.length + 1];
            for(int i = 0; i < data.length; i++) {
                if(i == temp.length) {
                    data[i] = value;
                }
                else {
                    data[i] = temp[i];
                }
            }
        }
        else {

            data = new int[1];
            data[0] = value;
        }

    }

    public void addValues(int[] values) {

        if(data.length != 0) {

            int[] temp = new int[data.length + values.length];
            for(int i = 0; i < temp.length; i++) {
                if(i < data.length) {
                    temp[i] = data[i];
                }
                else {
                    temp[i] = values[i-data.length];
                }
            }

            data = new int[temp.length];
            for(int i = 0; i < data.length; i++) {
                data[i] = temp[i];
            }
        }
        else {

            data = new int[values.length];
            for(int i = 0; i < data.length; i++) {
                data[i] = values[i];
            }
        }
    }

    public int getMinimumValue() {
        int result = 0;

        for(int i = 0; i < data.length-1; i++) {
            if(i == 0) {
                result = data[i];
            }
            else if(data[i] < result) {
                result = data[i];
            }
        }

        return result;
    }

    public int[] getValuesAboveThreshold(int threshold) {
        int[] result;

        if(data == null) {
            result = new int[0];
        }
        else {

            int count = 0;
            for(int i = 0; i < data.length; i++) {
                if(threshold < data[i]) {
                    count++;
                }
            }
            result = new int[count];
            int index = count;

            for(int i = 0; i < data.length; i++) {
                if(threshold < data[i]) {
                    result[index-count] = data[i];
                    count--;
                }
            }
        }

        return result;
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

        /*
        System.out.println("------------------------------------------------------------------");

        int[] valuesAbove1 = m.getValuesAboveThreshold(1);
        System.out.println("Messwerte über 1:");
        // Erwartete Ausgabe:
        // []
        System.out.println(Arrays.toString(valuesAbove1));

        System.out.println("------------------------------------------------------------------");

        int[] valuesAbove92 = m.getValuesAboveThreshold(92);
        System.out.println("Messwerte über 92:");
        // Erwartete Ausgabe:
        // []
        System.out.println(Arrays.toString(valuesAbove92));
        */
    }

}
