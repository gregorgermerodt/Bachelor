import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int[] newData = new int[data.length + 1];

		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		newData[newData.length - 1] = value;

		data = newData;

	}

	public void addValues(int[] values) {
		int[] newData = new int[data.length + values.length];
		for(int i =0; i< data.length; i++){
			
			newData[i]= data[i];
		}
		for(int i =0; i< values.length; i++){
			
			newData[data.length+i]=values[i];
		}
		data = newData;

		//Das selbe k¸rzer
		
//	for(int i =0; i< values.length; i++){
//		addValue(values[i]);
//	}

	}

	public int getMinimumValue() {
			
		int minimalerWert = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] < minimalerWert)
				minimalerWert = data[i];
		}
		return minimalerWert;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		// Programierberatung
		int[] temp= new int [0];
		for(int i =0; i< data.length; i++){
			if(data[i]> threshold){
				
				int []newData = new int [temp.length+1];
				for(int j=0; j< temp.length; j++){
					
					newData[j]= temp[j];
				}
				newData [temp.length]= data[i];
				temp = newData;
			}
		}
		return temp;
		
//		int counter = 0;
//		int[] grˆﬂereWert = new int[data.length];
//		for (int i = 0; i < data.length; i++) {
//			if (data[i] > threshold) {
//				grˆﬂereWert[i]=data [i];
//				
//			} else {
//			}
//		}
//		
//		return null;
	}

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
		System.out.println("Hinzuf√ºgen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();

		System.out
				.println("------------------------------------------------------------------");

		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzf√ºgen einer Menge von Werten. m:");
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
		System.out.println("Messwerte √ºber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));

		System.out
				.println("------------------------------------------------------------------");

		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte √ºber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
