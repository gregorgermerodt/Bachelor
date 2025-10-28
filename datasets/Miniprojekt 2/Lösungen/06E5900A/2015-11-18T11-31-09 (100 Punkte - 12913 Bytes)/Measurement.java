import java.util.Arrays;

public class Measurement {

	private int[] data; // 1 Dimensionales Int Array 
	
	/*Implementieren Sie den Konstruktor so, dass 
	 *data als neues int-Array mit der Länge 0 
	initialisiert wird. */
	public Measurement() {
	this.data = new int [0]; 	
	}
	/*Die Methode addValues(int value) nimmt einen Messwert value entgegen 
	 * und soll diesen als neuen Messwert an das 
	 * Ende des data-Arrays setzen. Erzeugen Sie dazu ein neues, 
	 * vergrößertes Array. */
	public void addValue(int value) {
		//neues Array was genau 1 größer ist, da genau ein Wert hinzugefügt
		//wird
		int [] hilfsarray = new int [data.length+1];
		//Kopiervorgang
		for(int index =0; index < data.length;index++){
			hilfsarray[index]=data[index];
		}
		//length-1 ist genau letzte Stelle eines Arrays
		hilfsarray[hilfsarray.length-1]=value;
		//da man Data Array zurückgeben soll Referenz 
		data = hilfsarray;
	}
	/*Die Methode addValues(int[] values) nimmt ein ganzes Array 
	 * von Messwerten entgegen und soll diese als neue 
	 * Messwerte an das Ende des data-Arrays setzen. 
	Erzeugen Sie auch hier ein neues, vergrößertes Array. */
	public void addValues(int[] values) {
		//neues Array was genau die Größe von Data und Values hat
		int [] biggerArray = new int [data.length+values.length];
		//Speichervariable für den Index, damit genau an der Stelle 
		//weiter geführt werden kann
		int indexspeicher =0;
		//kopiervorgang
		for(int index =0;index < data.length;index++){
			biggerArray[index]=data[index];
			indexspeicher = index +1; //index +1, damit beim nächsten
			//step mit dem richtigen index weitergeführt wird
		}
		//kopiervorgang values, Start bei indexspeicher
		//also der Stelle wo gerade aufgehört wurde
		for(int j = 0;j<values.length;j++){
			biggerArray[indexspeicher]=values[j];
			indexspeicher++; // manuelle Indexerhöhung
		}
		data = biggerArray; //referenz data
	}
	/*Die Methode getMinimumValue() soll den kleinsten, in data 
	 * enthaltenen Wert zurückgeben. 
	 * Sie können den Fall, dass data keine Messwerte
	 *  enthält, ignorieren. */
	public int getMinimumValue() {
		int min = Integer.MAX_VALUE; //größtmöglicher INTWERT oder halt bei data[0] starten
		//und immer wieder vergleichen
		//Arraydurchlauf
		//for (int index:data) - for each schleife
		// durchläuft jedes Array Element von 0 - Ende -> man kann aufjedenfall nicht zu weit
		//gehen
		for(int index = 0; index < data.length;index++){
			if(min > data[index]){ //wenn Min > aktuelle Wert
				min = data[index]; //aktuellen wert in min einspeichern
			}
		}
		return min;
	}
	/*Implementieren Sie die Methode getValuesAboveThreshold(int threshold) 
	so, dass sie ein int-Array mit allen Werten aus data 
	zurückgibt, die echt größer sind als 
	der Schwellenwert treshold. Entspricht kein Wert 
	diesem Kriterium oder enthält data keine Elemente, 
	soll die Methode ein int-Array der Größe 0 zurückgeben.  */
	public int[] getValuesAboveThreshold(int threshold) {
		//Array mit Länge von Data worin die Werte gespeichert werden
		// die größer als der übergebene Limit
		int [] speicher = new int [data.length];
		//zählt anzahl der werte die den Limit überschreiten
		int zaehler = 0;
		//Array wird durchlaufen, dabei werden alle größeren werte in 
		//dem speicher array übergeben und die anzahl festgehalten
		for(int index = 0; index < data.length;index ++){
			if (data[index]>threshold){
				speicher[zaehler] = data[index];
				zaehler++;
			}	
		}
		//neues Array was genau die Länge der Größeren Zahlen hat
		int [] rueckgabe = new int [zaehler];
		//Werte werden in neuem Array reinkopiert
		for(int j = 0; j<rueckgabe.length;j++){ //index würde auch gehen statt j weil 
			// schleifenvariablen kann man außerhalb der eig. schleife wiederverwenden
			//da diese nur innerhalb der schleife gültig sind
			rueckgabe[j]=speicher[j];
		}
		return rueckgabe;
	}
	//Alternative Ansatz: erst zählen danach array erstellen und speichern 
	

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
