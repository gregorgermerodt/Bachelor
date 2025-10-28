import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		data = new int [0];

	}

	public void addValue(int value) {
		
		int [] kopierArray = new int [data.length];
		
		for (int i = 0; i < data.length; i++) {
			
			kopierArray[i] = data[i];
			
		}
		
		data = new int [kopierArray.length + 1];
		
		for (int j = 0; j < kopierArray.length; j++) {
			
			data[j] = kopierArray[j];
		}
		data[kopierArray.length] = value;

	}

	public void addValues(int[] values) {
		
		int [] kopierArray = new int [data.length];
		
		for (int i = 0; i < data.length; i++) {
			
			kopierArray[i] = data[i];
			
		}
		data = new int [kopierArray.length + values.length];
		
		for (int j = 0; j < kopierArray.length; j++) {
			
			data[j] = kopierArray[j];
		}
		
		for (int k = 0; k < values.length; k++) {
			
			data[kopierArray.length + k] = values[k];
		}
		

	}

	public int getMinimumValue() {
		int vergleich = Integer.MAX_VALUE;
		
		for (int i = 0; i < data.length; i++) {
			
			if(data[i] <= vergleich){
				vergleich = data[i];
			}
		}
		return vergleich;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int counter = 0;
		
		for (int i = 0; i < data.length; i++) {
			
			if(data[i] > threshold){
				counter++;
			}
		}
		
		int [] arrayLoesung = new int [counter];
		
		int counter2 = 0;
		
		for (int j = 0; j < arrayLoesung.length; j++) {
			
			while(counter2 < data.length){
				
				if(data[counter2] > threshold){
					
					arrayLoesung[j] = data[j];
					
					counter2++;
					break;
				}
				counter2++;
			}
			
		}
		return arrayLoesung;
		
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
