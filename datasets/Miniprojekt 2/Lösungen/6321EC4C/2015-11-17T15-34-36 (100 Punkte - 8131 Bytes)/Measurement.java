import java.util.Arrays;

public class Measurement {

	private int[] data;
	

	public Measurement() {
		
		data = new int[0];			// Erzeugen eines Arrays der Laenge 0
	}

	public void addValue(int value) {

		int [] hilfe = new int [data.length];
		
		for (int i = 0; i < data.length; i++){
			hilfe[i] = data[i];
		}
		
		data = new int [data.length +1];
		
		for (int j = 0;j < hilfe.length; j++){	// da data einen laenger ist
			data[j] = hilfe[j];
		}
		data[data.length -1] = value;
	}

	public void addValues(int[] values) {
		
		int [] hilfe = new int [data.length];
		
		for (int i = 0; i < data.length; i++){
			hilfe[i] = data[i];					// kopie des data arrays
		}
		
		int laenge = data.length + values.length;
		
		data = new int [laenge];
		
		for (int j = 0; j < hilfe.length; j++){
			data[j] = hilfe[j];
		}
		
		for (int k = 0; k < values.length; k++){
			data[hilfe.length + k] = values[k];	// es wird erst an dem Punkt begonnen wo anderes array zu ende ist! sonst wird �berschrieben!
		}
	}

	public int getMinimumValue() {
		
		int minimum = Integer.MAX_VALUE;		// greift auf das Maximalen wert des arrays zu
		
		for (int i = 0; i < data.length; i++){
			if (data[i] < minimum){
				minimum = data[i];
			}
		}
		
		return minimum;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int counter = 0;
		
		for (int i = 0; i < data.length; i++){
			if (data[i] > threshold){
				counter++;
			}
		}
		
		int [] hilfe = new int [counter];
		
		int counter2 = 0;
		
		for (int j = 0; j < data.length; j++){
			if (data[j] > threshold){
				hilfe[counter2] = data[j];
				counter2++;
			}
		}		
		
		return hilfe;
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
