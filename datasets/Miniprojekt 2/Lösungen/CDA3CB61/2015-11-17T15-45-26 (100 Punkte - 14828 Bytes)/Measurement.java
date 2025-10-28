import java.util.Arrays;

public class Measurement {
    
	private int[] data;
   
	public Measurement() {
    //a)
		this.data = new int[0];
    }
    public void addValue(int value) {
       //b)
    	if (data.length == 0) {
            int[] data2 = {value};
            data = data2;
        } else {
            int[] data2 = new int[this.data.length + 1];
            for (int i = 0; i < this.data.length; i++) {
                data2[i] = this.data[i];
                if (i == this.data.length - 1) {
                    data2[i + 1] = value;
                }
            }
            data = data2;
        }
    }
    public void addValues(int[] values) {
        int[] data2 = new int[this.data.length + values.length];
       
        if (values == null) {
        
        } else {
            for (int i = 0; i <= data.length; i++) {
                if (i == data.length) {
                    for (int j = i, k = 0; j < data2.length; j++, k++) {
                        data2[j] = values[k];
                    }
                } else {
                    data2[i] = data[i];
                }
            }
        }
        data = data2;
    }
    public int getMinimumValue() {
        int minValue = data[0];
        for (int i = 0; i < this.data.length; i++) {
            if (data[i] < minValue) {
                minValue = data[i];
            }
        }
        return minValue;
    }
    public int[] getValuesAboveThreshold(int threshold) {
        if (threshold == 0) {
            return null;
        } else {
            int counter = 0;
            int[] temp = new int[data.length];
            for (int i = 0; i < this.data.length; i++) {
                if (data[i] > threshold) {
                    temp[counter] = data[i];
                    counter++;
                }
            }
            int[] newThreshold = new int[counter];
            for (int i = 0; i < newThreshold.length; i++) {
                newThreshold[i] = temp[i];
            }
            return newThreshold;
        }
    }
    public void printData() {
        System.out.println(Arrays.toString(data));
    }
    public static void main(String[] args) {
        Measurement m = new Measurement();
        System.out.println("Neues Measurement-Objekt m erzeugt. m:");
        m.printData();
        System.out.println("------------------------------------------------------------------");
        m.addValue(85);
        System.out.println("Hinzufügen eines neuen Wertes. m:");
        m.printData();
        System.out.println("------------------------------------------------------------------");
        m.addValues(new int[]{58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93});
        System.out.println("Hinzuzfügen einer Menge von Werten. m:");
        m.printData();
        System.out.println("------------------------------------------------------------------");
        int minimumValue = m.getMinimumValue();
        System.out.println("Minimaler Wert der Messreihe m:");
        System.out.println(minimumValue);
        System.out.println("------------------------------------------------------------------");
        int[] valuesAbove78 = m.getValuesAboveThreshold(78);
        System.out.println("Messwerte über 78:");
        System.out.println(Arrays.toString(valuesAbove78));
        System.out.println("------------------------------------------------------------------");
        int[] valuesAbove93 = m.getValuesAboveThreshold(93);
        System.out.println("Messwerte über 93:");
        System.out.println(Arrays.toString(valuesAbove93));
    }
}