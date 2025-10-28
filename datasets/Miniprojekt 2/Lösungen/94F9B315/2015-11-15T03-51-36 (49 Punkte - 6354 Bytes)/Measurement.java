import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
//		if(data.length == 0){
//			data[data.length] = value;
//		}
//		else{
			data = Arrays.copyOf(data, data.length+1);
			data[data.length-1] = value;
//		}
	}

	public void addValues(int[] values) {
		data = Arrays.copyOf(data, data.length+values.length);
		int j = data.length;
		
		for(int i=1;i<j;i++){
			data[i]=values[i-1];
		}
	}

	public int getMinimumValue() {
		int j = data.length;
		int k = data[0];
		
		for(int i=1;i<j;i++){
			if(data[i]<k){
				k = data[i];
			}
		}
		
		return k;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int j = data.length;
		int[] result = new int[]{};
		int k = result.length;
		
		for(int i=0;i<j;i++){
			if(data[i]>threshold){
				k = k+1;
				result = Arrays.copyOf(result, k);
				result[k-1] = data[i];
			}
		}
		
		return result;
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