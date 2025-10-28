import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int [0];
	}

	public void addValue(int value) {
		// Erzeugen eines neuen Arrays mit der Länge des Data-Arrays plus 1
		int [] neu = new int [data.length + 1];
		// Hinzufügend der Werte des Data-Arrays zum neuen Array
		for (int index = 0; index < data.length; index++){
			neu[index] = data[index];
		}
		// Hinzufügen der neuen, letzten Zahl zum neuen Array
		neu[neu.length - 1] = value;
		// Setzen der Referenz vom Data-Array auf das neue Array
		data = neu;
	}

	public void addValues(int[] values) {
		// Erzeugen eines neuen Hilfsarrays mit der Lnge des bereits existierenden Arrays
		// plus der Größe des Arrays, welche die zusätzlichen Werte enthält
		int[] neu = new int[data.length + values.length];
		// Füllen des Hilfsarrays mit den Werten aus dem ursprünglichen Data Array
		for (int index = 0; index < data.length; index++){
			neu[index] = data[index];
		}
		// Hinzufügen der Werte aus dem values Array
		for (int index = data.length; index < data.length + values.length; index++){
			neu[index] = values[index - data.length];
		}
		// Setzen der Referenz vom Data Array auf das Hilfsarray
		data = neu;
	}

	public int getMinimumValue() {
		// Erzeugen einer Hilfsvariable für den kleinsten Wert und setzen dieser auf den größtmöglichen
		// (damit jeder neue auch wirklich kleiner ist)
		int minimum = Integer.MAX_VALUE;
		// Prüfen jedes Wertes des Data-Arrays. Wenn dieser kleiner ist als minimum, dann wird er zum neuen Wert für minimum
		for (int i = 0; i < data.length; i++){
			if (data[i] < minimum){
				minimum = data[i];
			}
		}
		// Ausgabe von minimum
		return minimum;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		// Erzeugen einer Hilfsvariablen zum Speichern der Anzahl der Werte über dem Threshold
		int groesse = 0;
		// Schleife zum Herausfinden, wie viele Werte über dem Threshold liegen
		for (int i = 0; i < data.length; i++){
			if (data[i] > threshold){
				groesse++;
			}
		}
		// Erzeugen eines neuen Arrays, welche alle Werte über dem Threshold enthalten soll
		// Index = vorher herausgefundene Anzahl von Werten über dem Threshold (Variable groesse)
		int[] neu = new int[groesse];
		// Prüfen, ob Wert von Data am aktuellen Index größer als Threshold - wenn ja, hinzufügen zu neu Array
		for (int indexData = 0, indexNeu = 0; indexNeu < neu.length; indexData++){
			if(data[indexData] > threshold){
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