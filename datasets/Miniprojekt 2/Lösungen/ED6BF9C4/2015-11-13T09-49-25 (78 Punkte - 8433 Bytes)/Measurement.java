import java.util.Arrays;

public class Measurement {
	//Implementieren Sie den Konstruktor so, dass data als neues int-Array mit der Länge 0
		//initialisiert wird.
		
	private int[] data;
	
	

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		//Die Methode addValues(int value) nimmt einen Messwert value entgegen und
		//soll diesen als neuen Messwert an das Ende des data-Arrays setzen. Erzeugen Sie dazu ein
		//neues, vergrößertes Array.
		int[] data1 = new int[data.length + 1];
		for(int i = 0; i < data.length; i++){
			data1[i] = data[i];
		}
		data1[data1.length - 1] = value;
		data = data1;
	
	}

	public void addValues(int[] values) {
		//Die Methode addValues(int[] values) nimmt ein ganzes Array von Messwerten
		//entgegen und soll diese als neue Messwerte an das Ende des data-Arrays setzen.
		//Erzeugen Sie auch hier ein neues, vergrößertes Array
		int[] data2 = new int[data.length + values.length];
		for(int i = 0; i < data.length; i++){
			data2[i] = data[i];
		}
		for(int i=data.length; i < data.length + values.length; i++){
			data2[i] = values[i-data.length];
		}
		data = data2;

	}

	public int getMinimumValue() {
		//Die Methode getMinimumValue() soll den kleinsten, in data enthaltenen Wert
		//zurückgeben. Sie können den Fall, dass data keine Messwerte enthält, ignorieren.
		int min = Integer.MAX_VALUE;
		for(int i=0; i< data.length; i++){
			if(data[i]<min){
				min=data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		//Implementieren Sie die Methode getValuesAboveThreshold(int threshold)
		//so, dass sie ein int-Array mit allen Werten aus data zurückgibt, die echt größer sind als
		//der Schwellenwert treshold. Entspricht kein Wert diesem Kriterium oder enthält data
		//keine Elemente, soll die Methode ein int-Array der Größe 0 zurückgeben.
		int grosser =0;
		for (int i=0; i<data.length; i++){
			if(data[i]>threshold){
				grosser++;
			}
		}
		
		int[] neu = new int[grosser];
		for (int indexData = 0, indexNeu = 0; indexNeu < neu.length;indexData++){
			if(data[indexData]>threshold){
				neu[indexNeu] = data[indexData];
				indexNeu++;
			}
		}
		

		return neu;
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
