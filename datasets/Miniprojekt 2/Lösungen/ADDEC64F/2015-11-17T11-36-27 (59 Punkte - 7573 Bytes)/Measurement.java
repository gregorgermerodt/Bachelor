import java.util.Arrays;

public class Measurement {

	private int[] data;
	//Aufgabe 1a
	public Measurement() {
		
		data = new int[0];

	}
	//Aufgabe 1b 
	public void addValue(int value){
		data = new int[3];
		
		data [0] = 5;
		data [1] = 2;
		data [2] = 9;
		
		this.addValue(7);		
	
	}
	//Aufagbe 1c
	public void addValues(int[] values) {
		data = new int[3];
		
		data [0] = 5;
		data [1] = 2;
		data [2] = 9;
		
		this.addValues(new int []{0,3});

	}
	//Aufgabe 1d
	public int getMinimumValue() {
			return this.getMinimumValue();
			
	
	
	}
	//Aufgabe 1e
	public int[] getValuesAboveThreshold(int threshold) {
		return this.getValuesAboveThreshold(threshold);
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
