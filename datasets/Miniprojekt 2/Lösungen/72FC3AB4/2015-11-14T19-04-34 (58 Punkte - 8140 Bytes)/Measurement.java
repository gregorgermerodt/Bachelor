import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		// Statt den ganzen Code zu duplizieren einfach die Methode addValues aufrufen
		//addValues(new int[] { value });
		
		// Anzahl der Zeilen des alten Arrays
		int alteLaenge = data.length;
		// Anzahl der Zeilen des neuen Arrays
		int neueLaenge = alteLaenge + 1;
		
		// Neues Array muss um eine Zeile l‰nger sein als altes Array
		int[] neuesData = new int[neueLaenge];
		
		// Werte vom alten Array in das neue Array kopieren
		for (int i = 0; i < alteLaenge; i++) {
			// Wert in Zeile "i" vom alten Array in das neue Array kopieren
			neuesData[i] = data[i];
		}
		
		// Neuen Wert an letzter position im neuen Array ablegen
		neuesData[alteLaenge] = value;
		// Altes Array durch neues Array ersetzen
		data = neuesData;
	}

	public void addValues(int[] values) {
		// Anzahl der Zeilen des alten Arrays
		int alteLaenge = data.length;
		// Anzahl der Zeilen des neuen Arrays
		int neueLaenge = alteLaenge + values.length;
		
		// Neues Array muss um eine Zeile l‰nger sein als altes Array
		int[] neuesData = new int[neueLaenge];
		
		// Werte vom alten Array in das neue Array kopieren
		for (int i = 0; i < alteLaenge; i++) {
			// Wert in Zeile "i" vom alten Array in das neue Array kopieren
			neuesData[i] = data[i];
		}
		
		// Neuen Wert an letzter position im neuen Array ablegen
		for (int i = 0; i < values.length; i++) {
			neuesData[alteLaenge + i] = values[i];
		}
		// Altes Array durch neues Array ersetzen
		data = neuesData;
	}

	public int getMinimumValue() {
		int minimalerWert = Integer.MAX_VALUE;
		
		//untersucht komplette Liste
		for (int i = 0; i < data.length; i++){
			//aktueller Wert an Position i
			int aktuellerWert = data [i];
		
			//wenn neuer Wert kleiner als minimaler Wert, dann neuer minimaler Wert
			if (aktuellerWert < minimalerWert){
				minimalerWert = aktuellerWert;
			}		
		}
		return minimalerWert;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		//wenn data leer ist, wird eine leere Liste zur¸ckgegeben (new int [0])
		if (data.length == 0){
			return new int [0];
		}
		int neueLaenge = 0;
		
		for (int i = 0; i < data.length; i++){
			int aktuellerWert = data [i];
			
			if (aktuellerWert > threshold){
				neueLaenge = neueLaenge + 1 ;				
			}
		}
		
		int[] neuesData = new int[neueLaenge];
		int einfuegeIndex = 0;
		
		for (int i = 0; i < data.length; i++){
			int aktuellerWert = data [i];
			
			if (aktuellerWert > threshold){
				neuesData[einfuegeIndex] = aktuellerWert ;
				
				einfuegeIndex = einfuegeIndex + 1;
			}
		}
		return neuesData;
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
		System.out.println("Hinzuf√ºgen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzf√ºgen einer Menge von Werten. m:");
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
		System.out.println("Messwerte √ºber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte √ºber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
