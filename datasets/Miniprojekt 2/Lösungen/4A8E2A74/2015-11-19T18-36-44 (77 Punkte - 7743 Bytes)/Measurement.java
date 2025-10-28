import java.util.Arrays;

public class Measurement {

	private int[] data;
	private int[] data2 = new int[0];
	private int zaehler = 0;
	private int zaehler2;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		zaehler = zaehler + 1;
		data2 = data;
		data = new int[zaehler];
		if (zaehler > 1){
			for (int x = 0; x < zaehler-1; x++)
			{
				data [x] =  data2[x];
			}
		}
		data[zaehler-1] = value;
		data2 = data;
	}

	public void addValues(int[] values) {
		data = new int [values.length + zaehler];
		for (int x = 0; x < zaehler; x++){
			data[x] = data2[x];
		}
		for (int x = zaehler; x < zaehler + values.length; x++){
			data[x] = values[x-zaehler];
		}
	}

	public int getMinimumValue() {
		int minimum = data[0];
		for (int x = 0; x < data.length; x++){
			if (minimum > data[x]){
				minimum = data[x];
			}
		}
		return minimum;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int A[] = new int[0];
		zaehler2 = 0;
		for (int x = 0; x < data.length; x++){
			if (data[x] > threshold){
				zaehler2 = zaehler2 + 1;
			}
		}
		if (zaehler2>0){
			A = new int [zaehler2];
			zaehler2 = 0;
			for (int x = 0; x < data.length; x++){
				if (data[x] > threshold){
					A[zaehler2] = data[x];
					zaehler2 = zaehler2 + 1;
				}
			}
		} else {
			A = new int [0];
		}
		return A;
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
