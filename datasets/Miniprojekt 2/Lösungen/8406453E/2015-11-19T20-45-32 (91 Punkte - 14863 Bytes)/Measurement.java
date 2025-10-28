import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0]; //Dem neuen Array eine Länge geben
		
		/* Aufgabe a) Konstruktor
    	Implementieren Sie den Konstruktor so, dass data als neues
    	int-Array mit der Länge 0 initialisiert wird.
    	 */

	}

	public void addValue(int value) {
		int[] neuerArray;
		neuerArray = new int[data.length + 1]; //Einen neuen Array erstellen und einen neuen "Platz" für das neue Element schaffen
		for(int i = 0; i < data.length; i++){
			neuerArray[i] = data[i]; //Dem neuen Array mittels der Zähl-Schleife die jeweiligen Werte von dem alten Array(data) zuweisen(o.a. "kopieren")
		
		} 
		neuerArray[neuerArray.length - 1] = value; // Das Element bilden das nicht mehr zu den Werten vom alten Array(data) gehört
		data = neuerArray; //Dem alten Array(data) die Werte des neuen Arrays(neuerArray) zuweisen, sodass data sozusagen seine alten Werte erhält + value, also das neue Element
		
		/* Aufgabe b) Messwerte hinzufügen
         * Die Methode addValues(int value) nimmt einen Messwert value
         * entgegen und soll diesen als neuen Messwert an das Ende
         * des data-Arrays setzen. Erzeugen Sie dazu ein neues,
         * vergrößertes Array.
         */
		
			}
		

	public void addValues(int[] values) {
		int[] neuerArray2 = new int[data.length + values.length]; //Einen neuen Array erstellen dessen Länge der Länge vom alten Array(data) entspricht + die Werte die dem alten Array hinzugefügt werden sollen
		for(int index = 0; index < data.length; index++){
			neuerArray2[index] = data[index]; // Wie bei Aufgabe b) Es werden dem neuen Array(neuerArray2) die Werte vom alten Array(data) zugewiesen 
		}
		for(int index2 = data.length; index2 < data.length + values.length; index2++){
			neuerArray2[index2] = values[index2 - data.length];} //Es wird gesagt, dass die Stelle(index) gleich der Länge des alten Arrays ist. Durch "index < Länge des alten Arrays + Länge der hinzuzufügenen Werte(values)" Werden die Werte aufgezählt, die neu hinzugefügt werden sollen. Anschließend müssen die restlichen Werte des alten Arrays abgezogen werden, sodass nur noch die neuen Elemente übrig bleiben
			data = neuerArray2; //Dem alten Array werden wie bei Aufgabe b) die Werte des neuen Arrays(neuerArray) zugewiesen, inklusive der neuen Elemente
		
			/* Aufgabe c) Mehrere Messwerte hinzufügen
	         * Die Methode addValues(int[] values) nimmt ein ganzes
	         * Array von Messwerten entgegen und soll diese als neue
	         * Messwerte an das Ende des data-Arrays setzen.
	         * Erzeugen Sie auch hier ein neues, vergrößertes Array.
	         */
	}


	public int getMinimumValue() {
		int minimum = Integer.MAX_VALUE; // "minimum soll zunächst den größten Wert in sich aufnehmen
		for(int index3 = 0; index3 < data.length; index3++){
			if(data[index3] < minimum){ //Falls der Index des Arrays bei der Überprüfung kleiner ist als minimum (welcher zunächst das maximum enthielt, sodass dies bei der ersten Überprüfung auf jeden Fall der Fall ist), soll der gerade überprüfte Werte "ninimum" zugewiesen werden, sodass der kleinste Wert am Ende übrig bleibt und "minimum" zugewiesen wird und bleibt
				minimum = data[index3];
			}
		}
		return minimum;
	
		/* Aufgabe d) Kleinster Wert
         * Die Methode getMinimumValue() soll den kleinsten, in data
         * enthaltenen Wert zurückgeben. Sie können den Fall, dass
         * data keine Messwerte enthält, ignorieren.
         */
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int groesse = 0;
		for(int index4 = 0; index4 < data.length; index4++){
			if(data[index4] > threshold){ // Es muss zunächst überprüft werden, wie lang der Array sein soll, der die Werte augeben soll die über dem Schwellenwert(threshold) liegen. Dazu werden die Werte des Arrays data einzeln überprüft und jedes mal, wenn ein Wert über dem Schwellenwert liegt wird der Integer "groesse" um 1 vergrößert 
				groesse++;
			}
		}
		int[] neu = new int[groesse]; //Hier wird mittels des Verfahrens von oben die groesse des neuen Arrays festgelet
		for(int indexData = 0, indexNeu = 0; indexNeu < neu.length; indexData++){
			if(data[indexData] > threshold){ //Es wird geprüft, ob der aktuell zu überprüfunde Wert von data über dem Schwellenwert liegt, ist das der Fall, dann wird dem neuen Array dieser Wert übergeben
				neu[indexNeu] = data[indexData];
				indexNeu++; //Es wird auf die nächste Stelle des neuen Arrays verwiesen, damit ein neuer Wert der über dem Schwellenwert liegt dieser Stelle übergeben werden kann
			}
		}
		return neu;
				
		/* Aufgabe e) Werte über Schwellenwert
         * Implementieren Sie die Methode getValuesAboveThreshold
         * (int threshold) so, dass sie ein int-Array mit allen 
         * Werten aus data zurückgibt, die echt größer sind als der
         * Schwellenwert threshold. Entspricht kein Wert diesem
         * Kriterium oder enthält data keine Elemente, soll die 
         * Methode ein int-Array der Größe 0 zurückgeben.
         */	
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