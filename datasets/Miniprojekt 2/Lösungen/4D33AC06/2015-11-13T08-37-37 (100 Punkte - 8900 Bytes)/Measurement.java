import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];

	}

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

	public int getMinimumValue() {

		int vergleich = Integer.MAX_VALUE;
		
		for(int i = 0; i < data.length ; i++){
			
			if(data[i] <= vergleich){
				vergleich = data[i];
			}
		}
		return vergleich;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int counter = 0;
		
		for (int i = 0 ; i < data.length ; i++){
			if(data[i] > threshold)
				counter++;
		}
		
		int[] loesung = new int[counter];
		
		int counter2 = 0;
		
		for(int j = 0 ; j < loesung.length; j++)
		{
				
				while(counter2 < data.length)
				{
					if(data[counter2] > threshold)
					{
						loesung[j] = data[counter2];
						counter2++;
						break;
					}
					counter2++;		
				}
		}
		return loesung;	
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
