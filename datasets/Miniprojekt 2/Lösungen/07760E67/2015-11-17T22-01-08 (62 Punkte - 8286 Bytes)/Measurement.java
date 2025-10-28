import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		data = new int [0];								// 1a Initialisierung

	}

	public void addValue(int value) {
														//1b
	int [] data2 = new int [data.length+1];				//Hilfsvariable; Neues Array mit der Laenge des 1. Arrays +1
	
	for(int i=0; i<data.length; i++){					// Inhalte vom Data Array in Data2 einfuegen
		data2[i]= data[i];								// jedes Element von data2 uebernimmt den Wert der Elemente von data
	}													// die Werte von data2 gleichen den Werten von data
		
	data2[data2.length-1]=value;						// data2.length-1 verweist auf das letzte Element von data2
														// dieses letzte Element bekommt den Wert "Value"
	data= data2;										// data verweist auf data2
		
	
	}

	public void addValues(int[] values) {
														//1c
	int [] data2= new int[data.length+values.length];	// Hilfsvariable; Neues Array mit der Laenge des 1. Arrays + die Laenge von value
	for(int i=0; i<data.length; i++){					// Inhalte vom Data Array in Data2 einfuegen				
			data2[i]= data[i];							// jedes Element von data2 uebernimmt den Wert der Elemente von data
		}												// die Werte von data2 gleichen den Werten von data
	
	for (int i=data.length; i<data.length+values.length; i++){
		data2[i]= values[i-data.length];
	}
	data= data2;
	}

	public int getMinimumValue() {
		return -1;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		return null;
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
