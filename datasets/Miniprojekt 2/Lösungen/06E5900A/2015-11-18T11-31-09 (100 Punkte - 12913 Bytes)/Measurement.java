import java.util.Arrays;

public class Measurement {

	private int[] data; // 1 Dimensionales Int Array 
	
	/*Implementieren Sie den Konstruktor so, dass 
	 *data als neues int-Array mit der L�nge 0 
	initialisiert wird. */
	public Measurement() {
	this.data = new int [0]; 	
	}
	/*Die Methode addValues(int value) nimmt einen Messwert value entgegen 
	 * und soll diesen als neuen Messwert an das 
	 * Ende des data-Arrays setzen. Erzeugen Sie dazu ein neues, 
	 * vergr��ertes Array. */
	public void addValue(int value) {
		//neues Array was genau 1 gr��er ist, da genau ein Wert hinzugef�gt
		//wird
		int [] hilfsarray = new int [data.length+1];
		//Kopiervorgang
		for(int index =0; index < data.length;index++){
			hilfsarray[index]=data[index];
		}
		//length-1 ist genau letzte Stelle eines Arrays
		hilfsarray[hilfsarray.length-1]=value;
		//da man Data Array zur�ckgeben soll Referenz 
		data = hilfsarray;
	}
	/*Die Methode addValues(int[] values) nimmt ein ganzes Array 
	 * von Messwerten entgegen und soll diese als neue 
	 * Messwerte an das Ende des data-Arrays setzen. 
	Erzeugen Sie auch hier ein neues, vergr��ertes Array. */
	public void addValues(int[] values) {
		//neues Array was genau die Gr��e von Data und Values hat
		int [] biggerArray = new int [data.length+values.length];
		//Speichervariable f�r den Index, damit genau an der Stelle 
		//weiter gef�hrt werden kann
		int indexspeicher =0;
		//kopiervorgang
		for(int index =0;index < data.length;index++){
			biggerArray[index]=data[index];
			indexspeicher = index +1; //index +1, damit beim n�chsten
			//step mit dem richtigen index weitergef�hrt wird
		}
		//kopiervorgang values, Start bei indexspeicher
		//also der Stelle wo gerade aufgeh�rt wurde
		for(int j = 0;j<values.length;j++){
			biggerArray[indexspeicher]=values[j];
			indexspeicher++; // manuelle Indexerh�hung
		}
		data = biggerArray; //referenz data
	}
	/*Die Methode getMinimumValue() soll den kleinsten, in data 
	 * enthaltenen Wert zur�ckgeben. 
	 * Sie k�nnen den Fall, dass data keine Messwerte
	 *  enth�lt, ignorieren. */
	public int getMinimumValue() {
		int min = Integer.MAX_VALUE; //gr��tm�glicher INTWERT oder halt bei data[0] starten
		//und immer wieder vergleichen
		//Arraydurchlauf
		//for (int index:data) - for each schleife
		// durchl�uft jedes Array Element von 0 - Ende -> man kann aufjedenfall nicht zu weit
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
	zur�ckgibt, die echt gr��er sind als 
	der Schwellenwert treshold. Entspricht kein Wert 
	diesem Kriterium oder enth�lt data keine Elemente, 
	soll die Methode ein int-Array der Gr��e 0 zur�ckgeben.  */
	public int[] getValuesAboveThreshold(int threshold) {
		//Array mit L�nge von Data worin die Werte gespeichert werden
		// die gr��er als der �bergebene Limit
		int [] speicher = new int [data.length];
		//z�hlt anzahl der werte die den Limit �berschreiten
		int zaehler = 0;
		//Array wird durchlaufen, dabei werden alle gr��eren werte in 
		//dem speicher array �bergeben und die anzahl festgehalten
		for(int index = 0; index < data.length;index ++){
			if (data[index]>threshold){
				speicher[zaehler] = data[index];
				zaehler++;
			}	
		}
		//neues Array was genau die L�nge der Gr��eren Zahlen hat
		int [] rueckgabe = new int [zaehler];
		//Werte werden in neuem Array reinkopiert
		for(int j = 0; j<rueckgabe.length;j++){ //index w�rde auch gehen statt j weil 
			// schleifenvariablen kann man au�erhalb der eig. schleife wiederverwenden
			//da diese nur innerhalb der schleife g�ltig sind
			rueckgabe[j]=speicher[j];
		}
		return rueckgabe;
	}
	//Alternative Ansatz: erst z�hlen danach array erstellen und speichern 
	

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
