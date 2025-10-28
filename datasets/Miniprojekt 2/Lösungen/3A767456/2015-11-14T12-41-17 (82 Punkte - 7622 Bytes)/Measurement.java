import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0];

	}

	public void addValue(int value) {
		int[] bigArray = new int[data.length + 1];

		for(int i=0; i<data.length; i++){
			bigArray[i] = data[i];

			}
		bigArray[data.length] = value;
		data = bigArray;
		}

	public void addValues(int[] values) {
		int[] bigArray = new int[data.length + values.length];

		for(int i=0; i<data.length; i++){
			bigArray[i] = data[i];
			for(int j=0; j<values.length; j++){
				bigArray[data.length + j] = values[j];
			}
		}
		data = bigArray;
	}


	int getMinimumValue() {
		int min = data[0];
		for(int i=0; i<data.length; i++){
			if(data[i] < min){
				min = data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int count = 0;
		if(threshold == 0){
			return null;
		}
		if(data!=null){
			int[] above = new int[data.length];
			for(int i=0; i<data.length; i++){
				if(data[i]>threshold){
					above[count] = data[i];
					count++;
				}
			}
			int[] array = new int[count];
			for(int i=0; i<array.length;i++){
				array[i] = above[i]; 
			}
			return array;
		}
		else {
			return null;
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
