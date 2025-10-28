import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0];
	}

	public void addValue(int value) {
		int[]help = new int[data.length];
		
		for(int i = 0; i < data.length; i++){
			help[i] = data[i];
		}
		
		int newLength = data.length + 1;
		
		data = new int[newLength];
		
		for (int j = 0; j < help.length; j++){
			data[j] = help[j];
		}
		
		data[data.length - 1] = value;
	}

	public void addValues(int[] values) {
		int[]help = new int[data.length];
		
		for(int i = 0; i < data.length; i++){
			help[i] = data[i];
		}
		
		int newLength = data.length + values.length;
		
		data = new int[newLength];
		
		for(int j = 0; j < help.length; j++){
			data[j] = help[j];
		}
		for(int k = 0; k < values.length; k++){
			data[help.length + k] = values[k];
		}
	}

	public int getMinimumValue() {
		int smallestValue = data[0]; //oder = Integer.MAX_VALUE
		for(int i = 0; i < data.length; i++){
			if(data[i] <= smallestValue){
				smallestValue = data[i];
			}
		}return smallestValue;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int help = 0;
		
		for(int i = 0; i < data.length; i++){
			if(data[i] > threshold){
				help++;
			}
		}
		int[]solution = new int[help];
		int counter = 0;
		for(int j = 0; j < solution.length; j++){
			while(counter < data.length){
				if(data[counter] > threshold){
					solution[j] = data[counter];
					counter++;
					break;
				}counter++;
			}
		}return solution;
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
