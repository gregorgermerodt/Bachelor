import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int [] newArr = new int[data.length + 1];
		
		for (int i=0; i<data.length; i++) {
			newArr[i] = data[i];
		}
		
		newArr[data.length] = value;
		
		data = newArr;
	}

	public void addValues(int[] values) {
		int [] newArr = new int[data.length + values.length];
		
		for (int i=0; i<data.length; i++) {
			newArr[i] = data[i];
		}
		
		for (int i=data.length; i<(data.length + values.length); i++) {
			newArr[i] = values[i - data.length];
		}
		
		// this.printData();
		data = newArr;
		// this.printData();
	}

	public int getMinimumValue() {
		int min = data[0];
		for (int i=1; i<data.length; i++) {
			if (data[i] < min) 
				min = data[i];
		}
		
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int count = 0;
		
		for (int i: data) {
			if (i > threshold) 
				count++;
		}
		
		int[] returnArray = new int[count];
		
		if (count == 0) 
			return returnArray;
		
		int j = 0;
		for (int i=0; i<data.length; i++) {
			if (data[i] > threshold) {
				returnArray[j] = data[i];
				j++;
			}
		}
		
		return returnArray;
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
