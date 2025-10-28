import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0];

	}

	public void addValue(int value) {		
		if(data.length == 0){
			int [] wert = {value};
			data = wert;
		}
		int [] neuesArray = new int[data.length + 1];
		for(int i = 0; i < data.length; i++){
			neuesArray[i] = data[i];
			if(i == data.length-1){
				neuesArray[i+1] = value;
			}
		}
	}

	public void addValues(int[] values) {
		int[] neuesArray = new int[data.length + values.length];
		if (data.length == 0) {
			int[] array = new int[values.length];
			for (int i = 0; i < array.length; i++) {
				array[i] = values[i];
			}
		}
		for (int i = 0; i < data.length; i++) {
			if (i == data.length) {
				for (int j = i, a = 0; j < neuesArray.length; j++, a++) {
					neuesArray[j] = values[a];
				}
			}
			else neuesArray[i] = data[i];
		}
		data = neuesArray;
	}

	public int getMinimumValue() {
		int minWert = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] < minWert) {
				minWert = data[i];
			}
		}
		return minWert;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] tempArray = new int[data.length];
		int counter = 0;
		for (int i = 0; i < data.length; i++) {
			if(data[i] > threshold){
				tempArray[counter] = data[i];
				counter++;
			}
		}
		int [] array = new int[counter];
		for(int j = 0; j < array.length; j++){
			array[j] = tempArray[j];
		}
		return array;
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
