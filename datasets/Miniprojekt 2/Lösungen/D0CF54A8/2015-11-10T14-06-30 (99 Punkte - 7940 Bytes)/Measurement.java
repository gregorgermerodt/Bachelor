import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int[] new_data = new int[data.length + 1];
		
		int i;
		
		for(i = 0; i < data.length; i++){
			new_data[i] = data[i];
		}
		
		new_data[i] = value;
		
		data = new_data;
	}

	public void addValues(int[] values) {
		int[] new_data = new int[data.length + values.length];
		
		int i;
		for(i = 0; i < data.length; i++){
			new_data[i] = data[i];
		}
		
		for(int j = 0; j < values.length; j++, i++){
			new_data[i] = values[j];
		}
		
		data = new_data;
	}

	public int getMinimumValue() {
		
		if(data.length == 0){
			return -1;
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < data.length; i++){
			if(min > data[i]){
				min = data[i];
			}
		}
		
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int size = 0;
		
		for(int i = 0; i < data.length; i++){
			if(data[i] > threshold)
			{
				size++;
			}
		}
		
		int rezult[] = new int[size];
		
		if(size == 0){
			return rezult;
		}
		
		for(int i = data.length - 1; i > -1; i--){
			if(data[i] > threshold){
				rezult[--size] = data[i];
			}
		}
		
		return rezult;
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
