import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];

	}

	public void addValue(int value) {
		int[] dataCopy =  new int[data.length+1];
		
		for(int i = 0; i < data.length; i++) {
			dataCopy[i] = data[i];
		}
		dataCopy[dataCopy.length-1] = value;
		/*data = new int[dataCopy.length];
		
		for(int i = 0; i < dataCopy.length; i++) {
			data[i] = dataCopy[i];
		}*/
		data = dataCopy;

	}

	public void addValues(int[] values) {
		int[] dataValuesCopy = new int[data.length+values.length];
		
		for(int i = 0; i < data.length; i++){
			dataValuesCopy[i] = data[i];
		}
		for(int j = data.length, k = 0; j < dataValuesCopy.length && k < values.length; j++,k++) {
			dataValuesCopy[j] = values[k];
		}
		data = new int[dataValuesCopy.length];
		for (int i = 0; i < dataValuesCopy.length; i++) {
			data[i] = dataValuesCopy[i];
		}
			
		
	}

	public int getMinimumValue() {
		int min = 0;
		for(int i = 0, j = 0; i < data.length-1; i++) {
			if(data[j]>=data[i+1]){
				min = data[i+1];
				j = i+1;
			}
			else
				min = data[j];
			
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int[] dataAboveThreshold;
		int length = 0;
		for(int i = 0; i < data.length; i++) {
			if(data[i] > threshold)
				length++;
		}
		dataAboveThreshold = new int[length];
		
		for(int i = 0, j = 0; i < data.length; i++) {
			if(data[i] > threshold){
				dataAboveThreshold[j] = data[i];
				j++;
			}
		}
		return dataAboveThreshold;
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
		//m.addValue(10);
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
