import java.util.Arrays;

public class Measurement {

	private int[] data;

	//Implementieren Sie den Konstruktor so, dass data als neues int-Array mit der Länge 0 initialisiert wird.
	public Measurement() { // ist der Konstruktor
		data = new int[0];		// instalizieren von data gleich als neuen Int- Datei	
		
		
	}
	// AddValues nimmt den Messwert values entgegen und soll als neuen Messwert an das Ende
	//des data-Arrays setzt. neues größeres Array
	public void addValue(int value) {  	
		int[] neu =new int[data.length +1];						 //alte länge des Arrays "data" um eins erweitern// data altes array . lenght gibt die länge an des data Arrays und wir dann mit +1 um eins erweitert.
		for (int index = 0; index < data.length;index ++){		 //prüfen welche größe data.length hat mit einer schleife  // int indx wird als null deklariert, damit nicht das "null" ausgegebne wird  
																 // data muss solange laufen, bis data.length kleiner als indexist
		neu[index] =data[index];							 // data wird auf neu gesetzt => Ausgabe wird geben  // kopiert jedes elemt aus data nach neu
		}
			neu[neu.length -1] = value;								 // value wird als länge des Array deklariert // muss minus eins weil array mit 0 anfängtund die länge von 1-10 ist (10 in der länge letzter wert = bei array 9)
			data = neu;												 // data muss den neuen Wert übernehmen, damit es nicht den alten Array aus gibt.
	}
	
	
	//Die Methode addValues(int[] values) nimmt ein ganzes Array von Messwerten entgegen und soll diese als neue Messwerte an 
	//das Ende des data-Arrays setzen. Erzeugen Sie auch hier ein neues, vergrößertes Array.
	public void addValues(int[] values) { 							// man kann array nicht beliebig vergrößern (neues Array um ein 1 größer als das andere.
		for (int i=0 ; i<values.length; i++){						// so lange den array values benutzten bis der wert values erreicht wurde
			addValue(values[i]);  									// wollen um mehrere Werten erweitern, 
		}
	}

		
	//Kleinster Wert Die Methode getMinimumValue() soll den kleinsten, in data enthaltenen Wert zurückgeben. 
	//Sie können den Fall, dass data keine Messwerte enthält, ignorieren.	
	public int getMinimumValue() {									 // mit befehl Arrays.sort() zum sortieren der Zahlen von data von klein nach groß
		Arrays.sort(data);											// Sachen sortieren aller Zahlen der größe nach	
		int minimum = data[0];										//von Array den ersten Speicher aufrufen
		return minimum;												//Ausgabe des ersten  auch kleinsten Wert
	}
//Implementieren Sie die Methode getValuesAboveThreshold(int threshold) so, dass sie ein int-Array mit allen 
//Werten aus data zurückgibt, die echt größer sind als der Schwellenwert treshold. 
//Entspricht kein Wert diesem Kriterium oder enthält data keine Elemente, soll die Methode ein int-Array der Größe 0 zurückgeben.
	public int[] getValuesAboveThreshold(int threshold) {
		Measurement measurement = new Measurement(); 	//erste eine neue Klasse wo man die Befehle ausdem Measurment benutzen kann. Mann kann  alle Methoden beutzen
		  for (int i = 0; i < data.length; i++)			// gucken wie lang data  ist und führt die schleifenoch so oft aus
		  {
		   if(data[i]>threshold)						//prüfen ob dieWerte von data größer sind als threshold
		   {
		    measurement.addValue(data[i]);				// nutzt die addValueMethode fügt neue Werte(größer als threshold) dem neuen arryas hinzu  
		   }
		  }
		  return measurement.data;						// Ausgeben des data Wertes
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

