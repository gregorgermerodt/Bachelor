import java.util.Arrays;

public class Measurement {

	private int[] data;


	public Measurement() {
		data = new int[0];

	}

	public void addValue(int value) {
		int[] data_1 = new int [data.length+1]; // Neues Array mit Länge von Data +1
		
		for (int i=0 ; i<data.length ; i++){
			data_1[i] = data[i];				// Schleife zum durchlaufen des Arrays
		}
			data_1[data_1.length-1] = value;	// Letzte freie Stelle wird mit dem neuen Value belegt
			
			data = data_1; 						// Main arbeitet nur mit Data, deswegen muss man Data = Data_1 setzen
	}

	public void addValues(int[] values) {
		int[] data_2 = new int [data.length+values.length];	// Neues Array mit Länge von Data + Länge von Values
		
		for (int i=0 ; i<data.length ; i++){
			data_2[i] = data[i];
		}
		for (int j=data.length ; j<data_2.length ; j++ ){	// 1. Schleife zum durchlaufen von Data
			for (int k=0 ; k<values.length ; k++, j++){		// 2. Schleifen zum durchlaufen von Values und Sprung ins nächste freie Feld
				data_2[j] = values[k];						// Noch freie Stellen in data_2 werden mit den Werten aus values belegt
				}
		}
			data = data_2;
	}

	public int getMinimumValue() {
		int min = data[0];						// Hilfsvariable zum speichern der kleinsten Wertes
		
		for (int i=0 ; i<data.length ; i++){
			if (data[i] < min){					// Wenn der Wert vom Feld i kleiner als der gespeicherte Wert in min ist, wird dieser ersetzt
				min = data[i];
			}
		}
	
		return min;								// Da Methode den Datentyp int hat ist eine Rückgabe erforderlich
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int counter = 0;						// Zähler für Werte über Schwellenwert
		int[] temp = new int [data.length];		// Temporäres Array mit der Länge von data, da nicht bekannt ist wie lang das Array sein wird
		
		for (int i=0 ; i<data.length ; i++){
			if (data[i] > threshold){
				temp[counter] = data[i];
				counter++;	
			}
		}
		int[] newThreshold = new int[counter];	// Neues Array mit allen vorher gespeicherten Werten
												// Annahme, dass das Array genau so lang sein soll, wie die abgespeicherten Werte
		for (int i=0 ; i<newThreshold.length ; i++){
			newThreshold [i] = temp[i];
		}
		return newThreshold;
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
