import java.util.Arrays;

public class Measurement {

	private int[] data;

	// Konstruktor:
	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int[] neu = new int[data.length + 1];
		for (int i = 0; i < data.length; i++) {
			neu[i] = data[i];
		}
		neu[data.length] = value;
		data = neu;
	}

	public void addValues(int[] values) {
		int[] neu = new int[data.length + values.length];
		for (int i = 0; i < data.length; i++) {
			neu[i] = data[i];
		}
		for (int i = 0; i < values.length; i++) {
			neu[data.length + i] = values[i];
		}
		data = neu;
	}

	public int getMinimumValue() {
		int result = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] < result) {
				result = data [i];
			}
		}
		return result;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		// Länge von neu[] bestimmen abhängig von der Menge an Elementen aus data[],
		// die größer als int threshold sind:
		int length = 0;
		for(int i = 0; i < data.length; i++) {
			if (data[i] > threshold) {
				length++;
			}
		}
		
		// Initialisierung von neu[]:
		int[] neu = new int[length];
		
		// wenn data[i] größer als threshold ist,
		// wird es dem ersten Feld von neu[] zugeordnet und j um 1 erhöht,
		// sodass im nächsten positiven Durchlauf dem zweiten Feld von neu[]
		// ein Element aus data größer als threshhold zugeordnet wird:
		int j = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] > threshold) {
				neu[j] = data[i];
				j++;
			}
		}
		
		// data durch neu überschreiben:
		// (muss nicht gemacht werden, da der Rückgabewert dieser Methode nicht void ist)
		data = neu;
		
		// Rückgabe von data:
		return data;
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
		System.out.println("Hinzufuegen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();

		System.out
				.println("------------------------------------------------------------------");

		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzfuegen einer Menge von Werten. m:");
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
		System.out.println("Messwerte ueber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));

		System.out
				.println("------------------------------------------------------------------");

		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte ueber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
