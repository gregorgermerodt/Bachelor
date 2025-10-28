import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];

	}

	public void addValue(int value) {
		int length = data.length+1;
		int[] varArray = new int[length];
		for (int i=0;i<data.length;i++){
			varArray[i] = data[i];
			System.out.println(i);
		}
		varArray[data.length] = value;
		data=varArray;
	}

	public void addValues(int[] values) {
		int[] varArray = new int[data.length+values.length];
		for (int i=0;i<data.length;i++){
			varArray[i] = data[i];
			System.out.println(i);
		}
		for (int j=0;j<values.length;j++){
			varArray[j+1] = values[j];
			System.out.println(j);
			System.out.println(values.length);
		}
		data=varArray;
	}

	public int getMinimumValue() {
		int min = data[0];
		for(int i=1;i<data.length;i++){
				int current = data[i];
				int previous = 0;

				previous = data[i-1];
				


				if(previous<current && previous<min){
					min=previous;
				}else{

			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] varArray = new int[0];
		for(int i=0;i<data.length;i++){
			int current = data[i];

			if(current>threshold){
				int[] varArray2 = new int[varArray.length+1];
				for (int j=0;j<varArray.length;j++){
					varArray2[j] = varArray[j];
				}
				varArray2[varArray.length] = current;
				varArray=varArray2;
			}else{

			}
		}
		return varArray ;
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
