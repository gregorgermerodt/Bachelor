import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int[] temp = new int[data.length];
		temp = data; // temporär speichern, da nicht direkt deklarierbar-->sonst wird data überschrieben
		data = new int[data.length + 1];// damit Array nicht überschrieben wird
		for (int i = 0; i < temp.length; i++) {

			data[i] = temp[i];
		}
		data[data.length-1] = value;

	}

	public void addValues(int[] values) {

		int[] temp = new int[data.length];
		temp = data; // temporär speichern
		data = new int[data.length + values.length];// damit Array nicht
													// überschrieben wird
		for (int i = 0; i < temp.length; i++) {

			data[i] = temp[i];
		}
		for (int i = 0; i < values.length; i++) {
			data[temp.length + i] = values[i];
		}

	}

	public int getMinimumValue() {
		int min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (min > data[i])
				min = data[i];
		}
		return min;
	}
	public int getMaximumValue(){
		int max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (max < data[i])
				max = data[i];
		}
		return max;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] thresholdHolder = new int[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] > threshold) {// falls data[i]>threshold, dann vergrößerst du dein Array thresholdHolder
				int[] temp = new int[thresholdHolder.length];
				temp = thresholdHolder;
				thresholdHolder = new int[thresholdHolder.length + 1];
				for (int j = 0; j < temp.length; j++) {
					thresholdHolder[j] = temp[j];
				}
				thresholdHolder[thresholdHolder.length-1] = data[i];
			}
		}
		
		return thresholdHolder;
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
		
		int maximumValue = m.getMaximumValue();
		System.out.println("Maximaler Wert der Messreihe m:");
		// Erwartete Ausgabe: 58
		System.out.println(maximumValue);

		System.out
				.println("------------------------------------------------------------------");
		
	}
		

}
