import java.lang.reflect.Array;
import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		//erstellen eines größeren arrays
		
		int[]array = new int[data.length + 1];
		
		//füllen des arrays mit den alten daten
		
		for(int i = 0; i < data.length; i++){
		array[i] = data[i];
		}
		
		//hinzufügen der "value" an letzter stelle
		
		array[data.length] = value;
		
		//data auf den neuen array setzen
		
		this.data = array;
	}

	public void addValues(int[] values) {
		
		//Erstellen eines größeren Arrays
		int[] array = new int[data.length + values.length];
		
		//Füllen des Arrays mit den alten Daten
		for(int i = 0; i < data.length; i++){
			array[i] = data[i];
		}
		
		//Hinzufügen der Werte des neuen Arrays an letzter Stelle
		for(int i = data.length, k = 0; i < array.length; i++, k++){
			array[i] = values[k];
		}
		
		//Data auf den neuen Array setzen
		this.data = array;
	}

	public int getMinimumValue() {
		int klein = data[0];
		for(int i = 0; i < data.length; i++){
			if(data[i] <= klein){
				klein = data[i];
			}
		}
		return klein;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int arraygroesse = 0;
		int arrayplace = 0;
		for(int i = 0; i < data.length; i++){
			if(data[i] > threshold){
				arraygroesse++;
			}
		}
		int[] array = new int[arraygroesse];
		for(int i = 0; i < data.length; i++){
			if(data[i] > threshold){
				array[arrayplace] = data[i];
				arrayplace++;
			}
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
		System.out.println("HinzufÃ¼gen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("HinzuzfÃ¼gen einer Menge von Werten. m:");
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
		System.out.println("Messwerte Ã¼ber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte Ã¼ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
