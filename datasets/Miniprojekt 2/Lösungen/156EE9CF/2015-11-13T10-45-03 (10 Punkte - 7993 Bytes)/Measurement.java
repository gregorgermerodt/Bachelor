package MP2;

import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];		
	}

	public void addValue(int value) {
		if (data.length == 0) {
			int[] newData = {value};
			data = newData;
		}
		else {
			int[] newData = new int[data.length+1];
			for (int i = 0; i < data.length; i++) {
				newData[i] = data[i];
				if (i == data.length-1) {
					newData[i+1]=value;
				}
			}
			data = newData;
		}
	}

	public void addValues(int[] values) {
		int[] newData = new int[data.length+values.length];
		if (values == null) {			
		}
		else {
			for (int i = 0; i <= data.length; i++) {
				if (i == data.length) {
					for (int j = i, k = 0; j < newData.length; j++, k++) {
						newData[j] = values[k];
					}
				}
				else {
					newData[i] = data[i];
				}
			}
		}
		data = newData;
	}

	public int getMinimumValue() {
		int minimum = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < minimum) {
				minimum = data[i];
			}
		}
		return minimum;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		if (threshold == 0) {
			return null;
		}
		else {
			int counter = 0;
			int[] temp = new int[data.length];
			for (int i = 0; i < data.length; i++) {
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
