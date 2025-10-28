import java.util.Arrays;
/*
 * Die Klasse Measurement verwaltet über das Feld data 
 * eine Messreihe in Form eines eindimensionalen Arrays von 
 * Integer-Werten. 
 * Über die Hilfsmethode Measurement.printData() 
 * können Sie die Messreihe ausgeben lassen.
 */


public class Measurement {

	private int[] data;

	/*
	 * Konstruktor: 
	 * Implementieren Sie den Konstruktor so, 
	 * dass data als neues int-Array mit der Länge 0 initialisiert wird.
	 */
	
	public Measurement() {
		//Der Array data wird mit der Laenge 0 initialisiert
		data = new int[0];
	}

	/*
	 * Messwert hinzufügen: 
	 * Die Methode addValues(int value) 
	 * nimmt einen Messwert value entgegen und soll diesen als 
	 * neuen Messwert an das Ende des data-Arrays setzen. 
	 * Erzeugen Sie dazu ein neues, vergrößertes Array.
	 */
	
	public void addValue(int value) {
		
		// Ein neuer, vergrößerter Array wird erstellt 
		int[] array = new int[data.length+1];
		
		//Der neue Array kriegt die Inhalte von data
		for(int i=0;i<data.length;i++ )
		{
			array[i]=data[i];
		}
		
		//Der Array kriegt an der letzter Stelle den neuen Messwert zugeordnet
		array[data.length] = value;
		
		//Das Attribut data wird nun der vergrößerte Array
		data = array;
	}

	/*
	 *  Mehrere Messwerte hinzufügen:
	 *  Die Methode addValues(int[] values)
	 *  nimmt ein ganzes Array von Messwerten entgegen 
	 *  und soll diese als neue Messwerte
	 *  an das Ende des data-Arrays setzen. 
	 *  Erzeugen Sie auch hier ein neues, vergrößertes Array.
	 */
	public void addValues(int[] values) {
		
		//Der Array values wird durchgegangen und jeder Wert wird mit der Methode addValue an den Array data angehängt
		for(int i=0;i<values.length;i++)
		{
			this.addValue(values[i]);
		}
	}

	/*
	 * Kleinster Wert:
	 * Die Methode getMinimumValue() soll den kleinsten, 
	 * in data enthaltenen Wert zurückgeben. 
	 * Sie können den Fall, dass data keine 
	 * Messwerte enthält, ignorieren.
	 */
	public int getMinimumValue() {
		
		//Der erste Wert vom Array data wird der Variable min zugeschrieben (Der Fall, dass data leer ist, wird ignoriert)
		int min = data[0];
		
		//Nun wird der Wert min mit jeden anderen Wert von data verglichen
		for(int i=0;i<data.length;i++)
		{
			//Wenn der aktuelle Wert kleiner ist als min, dann wird er das neue min
			if(data[i] < min)
			{
				min = data[i];
			}
		}
		return min;
	}

	/*
	 * Werte über Schwellenwert: 
	 * Implementieren Sie die Methode getValuesAboveThreshold(int threshold) so, 
	 * dass sie ein int-Array mit allen Werten aus data zurückgibt, 
	 * die echt größer sind als der Schwellenwert treshold. 
	 * Entspricht kein Wert diesem Kriterium oder enthält data keine Elemente, 
	 * soll die Methode ein int-Array der Größe 0 zurückgeben.
	 */
	public int[] getValuesAboveThreshold(int threshold) {
		
		int[] array = new int[0];
		
		//Wenn Data leer ist, wird der leere Array zurueckgegeben; wenn nicht, dann wird die Methode weiterhin ausgefuehrt
		if(data!=null)
		{
			//Data wird durchgegangen
			for(int i=0;i<data.length;i++)
			{
				//Wenn das aktuelle Element echt groesser ist als threshold
				if(data[i]>threshold)
				{
					//Eine neuer Hilfsarray wird erstellt mit einer größeren Menge als array
					int[] initArray = new int[array.length+1];
					
					//Werte von array werden in initArray übergegeben und threshold wird hinzugefügt
					for(int j=0;j<array.length;j++)
					{
						initArray[j] = array[j];
					}
					
					initArray[array.length] = data[i];
					
					array = initArray;
					
				}
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
