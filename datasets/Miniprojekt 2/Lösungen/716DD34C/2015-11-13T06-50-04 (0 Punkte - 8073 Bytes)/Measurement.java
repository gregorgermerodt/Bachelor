import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int[] speicher;
		speicher = new int [data.length];
		System.arraycopy(data, 0, speicher, 0, data.length);
		data = new int[data.length + 1];
		System.arraycopy(speicher, 0, data, 0, speicher.length);
		data[data.length - 1] = value;
	}

	public void addValues(int[] values) {
		int k = 0;
		int[] speicher;
		speicher = new int [data.length];
		System.arraycopy(data, 0, speicher, 0, data.length);
		int a = data.length;
		data = new int[a + values.length];
		System.arraycopy(speicher, 0, data, 0, speicher.length);
		for (int i=a; i <= a + values.length - 1; i++){
			data[i] = values[k];
			k++;
		}
	}

	public int getMinimumValue() {
		int x = data[0];
		for (int i=1; i <= data.length - 1; i++){
			if (data[i] < x){
				x = data[i];
			}
			else
			{
				x = x;
			}
		}
		return x;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int k = 0;
		int n = 0;
		for (int i =0; i<= data.length - 1; i++){
			if (data[i] > threshold){
				k++;
			}
		}
		int[] result;
		result = new int[k];
		for (int v =0; v<= data.length - 1; v++){
			if (data[v] > threshold){
				result[n] = data[v];
				n++;
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
