import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {

		this.data = new int[0];

	}

	public void addValue(int value) {

		int[] neuesArray = new int[data.length + 1];

		for (int i = 0; i < data.length; i++) {
			neuesArray[i] = data[i];
		}
		neuesArray[data.length - 1] = value; // dieser stelle wird neue zahl
												// eingetragen

		data = neuesArray;
	}

	public void addValues(int[] values) {

		for (int i = 0; i < data.length; i++) {
			addValue(values[i]);
			// benutzt methode, neues array wird schon erstellt
		}

	}

	public int getMinimumValue() {

		int min = Integer.MIN_VALUE;

		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				data[i] = min;
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {

		int anzahl = 0; // zählt alle zahlen die echt größer sind

		for (int i = 0; i < data.length; i++) {
			if (data[i] > threshold) {
				anzahl++;					//nur platzhalter
			}

		}

		int[] newData = new int[anzahl]; // länge, so viele zahlen sind görßer

		int index = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] > threshold) {
				newData[index] = data[i];
				index++;				//nächste stelle im index
										//muss nochmal alles vergleich, oben nur platzhalter
			}
		}

		return newData;
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

		System.out
				.println("------------------------------------------------------------------");

		m.addValue(85);
		System.out.println("HinzufÃ¼gen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();

		System.out
				.println("------------------------------------------------------------------");

		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("HinzuzfÃ¼gen einer Menge von Werten. m:");
		// Erwartete Ausgabe:
		// [85, 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93]
		m.printData();

		System.out
				.println("------------------------------------------------------------------");

		int minimumValue = m.getMinimumValue();
		System.out.println("Minimaler Wert der Messreihe m:");
		// Erwartete Ausgabe: 58
		System.out.println(minimumValue);

		System.out
				.println("------------------------------------------------------------------");

		int[] valuesAbove78 = m.getValuesAboveThreshold(78);
		System.out.println("Messwerte Ã¼ber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));

		System.out
				.println("------------------------------------------------------------------");

		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte Ã¼ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
