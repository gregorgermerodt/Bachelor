import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		//Aufgabe 1) a)
		
		data = new int[0];

	}

	//Aufgabe 1) b)
	public void addValue(int value) {

		int[] kopierarray = new int[data.length];	//Neues (leeres) Array zum Kopieren der Werte
		
		for (int i = 0; i < data.length ; i++){
			kopierarray[i] = data[i];				//Elemente vom data array 1 zu 1 in das kopierarray kopieren
		}
		
		int neueLaenge = data.length + 1;			//neue Länge herstellen (Länge vom data array +1)
		
		data = new int[neueLaenge];					//data array mit neuer Länge erstellen
		
		for (int j = 0; j < kopierarray.length ; j++){
			data[j] = kopierarray[j];				//Elemente vom kopierarray 1 zu 1 in das data array zurück kopieren
		}
		
		data[kopierarray.length] = value;			//kopierarray.length = 4 Stellen & data.length = 5 Stellen	ALTERNATIVE: data.length -1

	}

	//Aufgabe 1) c)
	public void addValues(int[] values) {

		int[] kopierarray = new int[data.length];
		
		for (int i = 0; i < data.length ; i++){
			kopierarray[i] = data[i];					//**Bis hier alles gleich wie Aufgabe davor**
		}
		int neueLaenge = data.length + values.length;	//neue Länge herstellen (Länge vom data array + values array)
		
		data = new int[neueLaenge];						//**ab hier wieder wie Aufgabe davor**
		
		for(int j = 0 ; j < kopierarray.length; j++ ){
			data[j] = kopierarray[j];
		}
		for(int k = 0; k < values.length; k++){			//values array durchlaufen...
			data[kopierarray.length + k] = values[k];	//...& ans Ende des vergrößerten data arrays hängen => Ende ist kopierarray.length + die jeweilige Stelle & mit dem jeweiligen Element aus values array einfügen
		}
	}

	//Aufgabe 1) d)
	public int getMinimumValue() {

		int vergleich = Integer.MAX_VALUE;
		
		for(int i = 0; i < data.length ; i++){
			
			if(data[i] <= vergleich){
				vergleich = data[i];
			}
		}
		return vergleich;
	}

	//Aufgabe 1) e)
	public int[] getValuesAboveThreshold(int threshold) {

		int counter1 = 0;							//Counter zum zählen, wie groß das neue Array werden soll
		
		for (int i = 0 ; i < data.length ; i++){	//Größe des neuen Arrays bestimmen
			if(data[i] > threshold)
				counter1++;
		}
		
		int[] arrayloesung = new int[counter1];		//Neues Array mit der vorher bestimmten Größe
		
		int counter2 = 0;							//2. Counter um die Zahlen zu ermitteln die größer als threshold sind
		
		for(int j = 0 ; j < arrayloesung.length; j++)	//'j' wird für die Stellen im arrayloesung gebraucht, wo wir was abspeichern wollen
		{
				
				while(counter2 < data.length)		//solange wir uns im data array befinden (also Zahl ist < als Zahl für die Größe des data Arrays)...
				{
					if(data[counter2] > threshold)	//Wenn die Zahl an der Stelle des Counters im data Array > threshold...
					{
						arrayloesung[j] = data[counter2];	//...Dann speicher die Zahl in unserem Lösungs Array an der jeweiligen Stelle ab
						counter2++;							//Counter muss erhöht werden, sonst überschreibt er immer die selbe Zahl
						break;
					}
					counter2++;						//...falls keine Zahl gefunden wurde die > threshold dann geh zur nächsten Stelle [Zahl]
				}
		}
		return arrayloesung;	
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
