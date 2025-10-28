import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int[] data2 = new int[data.length+1];
		System.arraycopy(data, 0, data2, 0, data.length);
		data2[data.length] = value;
		data = data2;
	}

	public void addValues(int[] values) {
		int[] data2 = new int[data.length+values.length];
		System.arraycopy(data, 0, data2, 0, data.length);
		System.arraycopy(values, 0, data2, data.length, values.length);
		data = data2;
	}

	public int getMinimumValue() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; data[i] < min; i++) {
			min = data[i];
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] abovet = new int[0];
		int i = 0;
		while (i < data.length) {
			if (data[i] > threshold) {
			int[] abovet2 = new int[abovet.length+1];
			System.arraycopy(abovet, 0, abovet2, 0, abovet.length);
			abovet2[abovet.length] = data[i];
			abovet = abovet2;
		}
			i++;
		}
		return abovet;
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
