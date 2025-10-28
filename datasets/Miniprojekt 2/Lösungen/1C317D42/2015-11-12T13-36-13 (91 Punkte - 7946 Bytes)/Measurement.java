import java.util.Arrays;

public class Measurement {

	private int [ ] data;

	public Measurement() {
		data = new int [0];

	}
// Länge ist immer index -1
// index ist immer von 0 beginnend (länge+1)
	
	public void addValue(int value) {
		data = Arrays.copyOf(data, data.length+1);
		data [data.length-1] = value ;
	}

	public void addValues(int[] values) {
		for (int a:data){
			addValue(a);
		}
	}

	public int getMinimumValue() {
		int maximal = Integer.MAX_VALUE ;
		for (int a:data){
			if (maximal > a) {
			maximal = a;
			} 
		}
		return maximal;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int [] results = new int [0] ; // erzeugt ein neues Array mit der länge 0. 
		for (int a:data) { // für alle Variablen (a) in data
			if(a>threshold){
				results = Arrays.copyOf(results, results.length+1); // hier kopiert er einen Array
				//results un fügt eine neue länge hinzu
				results [results.length-1 ] = a; // hier füllt er das Array an letzter Stelle
				
			}
		}
		return results;
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
