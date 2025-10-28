import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int [0];

	}

	public void addValue(int value) {
		int [] neuesArray = new int [data.length + 1];
		neuesArray[neuesArray.length-1] = value;
		for (int i = 0; i < data.length; i++){
			neuesArray[i]=data[i];
		}
		data = new int [neuesArray.length];
		for (int j = 0; j < data.length; j++){
			data[j] = neuesArray[j];
		}
	}

	public void addValues(int[] values) {
//		int [] neuesArray = new int [data.length + values.length];
//		for (int i = 0; i < data.length; i++){
//			neuesArray[i] = data[i];
//		}
//		for (int j = data.length; j < neuesArray.length; j++){
//			neuesArray[j] = values[j];
//		}
//		data = new int [neuesArray.length];
//		for (int z = 0; z < data.length; z++){
//			data[z] = neuesArray[z];
//		}
		
		int [] neu = new int [data.length];
		for (int i = 0; i < data.length; i++){
			neu [i] = data[i];
		}
		int neueLaenge = data.length + values.length;
		data = new int [neueLaenge];
		for (int j = 0; j < neu.length ; j++){
			data [j] = neu [j];
		}
		for (int k = 0; k < values.length ; k++){
			data [neu.length + k] = values [k];
		}
		
		
	}

	public int getMinimumValue() {
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < data.length; i++){
			if (max >= data [i]){
			max = data[i];
			}
		}
		return max;
	}

	public int[] getValuesAboveThreshold(int threshold) {		
		int counter = 0;
		int neueLaenge = 0;

		if (data != null){			
			for (int i = 0; i < data.length; i++){
				if (data[i] > threshold){
					neueLaenge++;
				}
			}
			int [] neuesArray = new int [neueLaenge];
			for (int j = 0; j < neuesArray.length; j++){
			while (counter < data.length){
				if (data[counter] > threshold){
					
						neuesArray[j] = data[counter];
						counter++;
						break;
					}
				counter++;
				}
			
			}
			return neuesArray;
		} else {
			return new int [0];
		}
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
