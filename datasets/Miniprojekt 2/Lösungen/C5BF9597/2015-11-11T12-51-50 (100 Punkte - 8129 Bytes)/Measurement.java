import java.util.Arrays;

public class Measurement {

	//Array-Variable
	private int[] data;

	public Measurement() {
		this.data = new int[0];

	}

	public void addValue(int value) {
		//hier ist erst ein Array mit der L�nge 0 vorhanden 
		int[] temp = new int[data.length + 1];
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		temp[data.length] = value;
		data = temp;

	}

	public void addValues(int[] values) {
		int[] temp = new int[data.length + values.length];
		
		//Kopieren des Inhalts in temp-Array
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		//ab der letzten Stelle die Werte aus Array Values hinzuf�gen
		for (int y = 0; y < values.length; y++) {
			temp[data.length + y] = values[y];
		}
		data = temp;

	}
	
//	public void addValues(int[] values) {
//						
//		for (int y = 0; y < values.length; y++) {
	
		//hier wird y als ein Wert an an die addValue-methode als value (nicht values) geschickt
//			addValue(values[y]);
//		}
//	
//	}
	

	public int getMinimumValue() {
		int min = data[0];
		for(int i = 1; i < data.length; i++){
			if(data[i] < min){
				min = data[i];
			}
		}
		return min;
	}
		
	

	public int[] getValuesAboveThreshold(int threshold) {
		int temp[] = new int[0];

		for (int i = 0; i < data.length; i++) {
			if (data[i] > threshold) {
				int[] temp2 = new int[temp.length + 1];
				temp2[temp.length] = data[i];

				for (int y = 0; y < temp.length; y++) {
					temp2[y] = temp[y];
				}
				temp = temp2;
			}
		}
		return temp;
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
