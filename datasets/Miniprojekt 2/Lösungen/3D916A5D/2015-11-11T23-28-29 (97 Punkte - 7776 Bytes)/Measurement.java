import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int oldLength = data.length;
		
		data = new int[oldLength + 1];
		data[oldLength] = value;
	}

	public void addValues(int[] values) {
		int oldLength = data.length;
		int lengthToAdd = values.length;
		
		int dataNew[] = new int[oldLength + lengthToAdd];
		
		for(int j = 0; j < data.length; j++){
			dataNew[j] = data[j];
		}
		
		for(int i = 0; i < lengthToAdd; i++){
			dataNew[oldLength + i] = values[i];
		}
		data = new int[dataNew.length];
		data = dataNew;
	}

	public int getMinimumValue() {
		int min = data[0];
		
		for(int i = 1; i < data.length; i++){
			if(data[i] < min){
				min = data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] overThreshold = new int[0];
		int count = 0;
		
		for(int i = 0; i < data.length; i++){
			if(data[i] > threshold){
				count++;
			}
		}
		
		if(count != 0){
			overThreshold = new int[count];
			int access = 0;
			for(int j = 0; j < data.length; j++){
				if(data[j] > threshold){
					overThreshold[access++] = data[j];
				}
			}
		}
		return overThreshold;
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
