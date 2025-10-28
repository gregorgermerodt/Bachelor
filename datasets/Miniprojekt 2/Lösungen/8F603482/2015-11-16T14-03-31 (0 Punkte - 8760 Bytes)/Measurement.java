import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int [0];
	}

	public void addValue(int value) {
		// Erzeugen eines neuen Arrays mit der L�nge des Data-Arrays plus 1
		int [] neu = new int [data.length + 1];
		// Hinzuf�gend der Werte des Data-Arrays zum neuen Array
		for (int index = 0; index < data.length; index++){
			neu[index] = data[index];
		}
		// Hinzuf�gen der neuen, letzten Zahl zum neuen Array
		neu[neu.length - 1] = value;
		// Setzen der Referenz vom Data-Array auf das neue Array
		data = neu;
	}

	public void addValues(int[] values) {
		// Erzeugen eines neuen Hilfsarrays mit der Lnge des bereits existierenden Arrays
		// plus der Gr��e des Arrays, welche die zus�tzlichen Werte enth�lt
		int[] neu = new int[data.length + values.length];
		// F�llen des Hilfsarrays mit den Werten aus dem urspr�nglichen Data Array
		for (int index = 0; index < data.length; index++){
			neu[index] = data[index];
		}
		// Hinzuf�gen der Werte aus dem values Array
		for (int index = data.length; index < data.length + values.length; index++){
			neu[index] = values[index - data.length];
		}
		// Setzen der Referenz vom Data Array auf das Hilfsarray
		data = neu;
	}

	public int getMinimumValue() {
		// Erzeugen einer Hilfsvariable f�r den kleinsten Wert und setzen dieser auf den gr��tm�glichen
		// (damit jeder neue auch wirklich kleiner ist)
		int minimum = Integer.MAX_VALUE;
		// Pr�fen jedes Wertes des Data-Arrays. Wenn dieser kleiner ist als minimum, dann wird er zum neuen Wert f�r minimum
		for (int i = 0; i < data.length; i++){
			if (data[i] < minimum){
				minimum = data[i];
			}
		}
		// Ausgabe von minimum
		return minimum;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		// Erzeugen einer Hilfsvariablen zum Speichern der Anzahl der Werte �ber dem Threshold
		int groesse = 0;
		// Schleife zum Herausfinden, wie viele Werte �ber dem Threshold liegen
		for (int i = 0; i < data.length; i++){
			if (data[i] > threshold){
				groesse++;
			}
		}
		// Erzeugen eines neuen Arrays, welche alle Werte �ber dem Threshold enthalten soll
		// Index = vorher herausgefundene Anzahl von Werten �ber dem Threshold (Variable groesse)
		int[] neu = new int[groesse];
		// Pr�fen, ob Wert von Data am aktuellen Index gr��er als Threshold - wenn ja, hinzuf�gen zu neu Array
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