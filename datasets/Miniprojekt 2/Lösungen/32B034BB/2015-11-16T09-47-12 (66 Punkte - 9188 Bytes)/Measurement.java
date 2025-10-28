import java.util.Arrays;

public class Measurement {

	private int[] data = new int [0];

	public Measurement() {

	}

	public void addValue(int value) {
	     int[] arrayNeu = new int[data.length + 1]; // 	Neues Array welches eine Einheit größer als data ist
	     for(int i = 0; i < data.length; i++) {		//	counter wird definiert
	         arrayNeu[i] = data[i];					//	Die ersten Einheiten von Data werden aufs neue Array übertragen
	     }
	     arrayNeu[data.length] = value;				//	Value wird als letztes Element im Array definiert
	     data = arrayNeu;							//	data wird mit arrayNeu gleichgesetzt
	
	}
	     
    public void addValues(int[] values) {
	    int[] arrayNeu = new int[data.length + values.length];	// 	Neues Array welches eine Einheit größer als data ist
	         for(int i = 0; i < data.length; i++) {				//	counter wird definiert
	             arrayNeu[i] = data[i];							//	Die ersten Einheiten von Data werden aufs neue Array übertragen
	         }
	         for (int i = data.length; i < data.length + values.length; i++) { //i als counter der bei dem nächsten Element anfängt
	             arrayNeu[i] = values[i - data.length];						   //Die nächsten Elemente werden initialisiert, "i - data.length" fängt bei 0 an 
	         }
	         arrayNeu = data;													//data wird mit arrayNeu gleichgesetzt
	     }
		


	public int getMinimumValue() {								
        int min = Integer.MAX_VALUE;						// mindestwert wird (initialisiert mit Maximalwert)
        for(int i = 0; i < data.length; i++) {				// counter wird initialisiert
            if(data[i] < min) {								// falls data[i] kleiner als der maximalwert ist wird der wert als neues min definiert
                min = data[i];								// ""
            }
        }
        return min;
    }
 
    public int[] getValuesAboveThreshold(int threshold) {	// methode mit integer wird deklariert
        int groesse = 0;									// int mit 0 wird initialisiert
        for(int i = 0; i < data.length; i++) {				// counter wird definiert
            if(data[i] > threshold) {						// wenn das Element größer als der int ist wird größe um eins erhöht
                groesse++;									// ""
            }
        }
        int[] arrayNeu = new int[groesse];															// neues Array mit der größe  "int groesse" wird erstellt
        for(int indexData = 0, indexArrayNeu = 0; indexArrayNeu < arrayNeu.length; indexData++) {   // 
            if(data[indexData] > threshold) {														//
                arrayNeu[indexArrayNeu] = data[indexData];											//
                indexArrayNeu++;
            }
        }
        return arrayNeu;
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
