import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {

		int[] erg = new int[data.length + 1];
		for (int i = 0; i < data.length; i++) {
			erg[i] = data[i];
		}

		for (int i = data.length; i < erg.length; i++) {
			erg[i] = value;
		}

		data = new int[erg.length];
		for (int i = 0; i < erg.length; i++) {
			data[i] = erg[i];
		}

	}

	public void addValues(int[] values) {

		int[] erg = new int[data.length + values.length];

		for (int i = 0; i < data.length; i++) {
			erg[i] = data[i];
		}
		for (int i = data.length; i < erg.length; i++) {
			erg[i] = values[i - data.length];
		}

		data = new int[erg.length];

		for (int i = 0; i < erg.length; i++) {
			data[i] = erg[i];
		}

	}

	public int getMinimumValue() {
		int speicher = 0;
		
		int[] copy = data.clone();

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < copy.length; j++) {
				if (copy[i] > copy[j]) {
					speicher = copy[j];
					copy[i]=copy[j];
					
				}
			}
		}

		

		return speicher;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] erg = new int[data.length];
		int[] speicher = new int[data.length];
		int count = 0;
		int index=0; 
		int index1=0; 
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] > threshold) {
				count++;
			}
		}
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] > threshold) {
				erg[index] = data[i];
				index++;
		
		}}

		
		speicher = new int[count];
		for (int i =0; i < erg.length; i++) {
				if (erg[i] != 0) {
					speicher[index1] = erg[i];
					index1++;
				}
		}		

		
		
		
		return speicher;
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
		System.out.println("Hinzufügen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();

		System.out
				.println("------------------------------------------------------------------");

		m.addValues(new int[] {  58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93});
		System.out.println("Hinzuzfügen einer Menge von Werten. m:");
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
		System.out.println("Messwerte über 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));

		System.out
				.println("------------------------------------------------------------------");

		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte über 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
