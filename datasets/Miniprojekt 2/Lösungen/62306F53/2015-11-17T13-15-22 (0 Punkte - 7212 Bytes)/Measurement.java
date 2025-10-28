import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		int[] data = new int [0];
	}

	public void addValue(int value) {
		private int[] data2 = new int[data.length + 1];
		data2[data.length+1] = value;
	}

	public void addValues(int[] values) {
		private int[] data3 = new int[data2.length + values.length];
		for(int i = 0; i <= values.length; i ++){
			data3[i + data2.length] = values[i];
		}
		}
	

	public int getMinimumValue() {
		for(int i = 0; i <= data3.length;i++){
			if(data3[i] < data3[i+1]){
				break;
			}
		return data[i];
	}

	public int[] getValuesAboveThreshold(int threshold) {
		private int Array[] = new Array[data3.length];
		for(int i = 0; i <= data3.length;i++){
		if(data3[i] > threshold)
		{for(int z = 0; z <= Array.length;z++)
			{Array[z] = data3[i];}
		for(int value : Array)
			return value;
		}
		if(Array[0] = null || data3[0] = null)
		{return 0;}
		}
		}
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
