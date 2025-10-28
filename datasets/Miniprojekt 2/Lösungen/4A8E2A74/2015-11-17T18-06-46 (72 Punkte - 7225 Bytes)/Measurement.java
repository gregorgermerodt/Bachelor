import java.util.Arrays;

public class Measurement {

	private int[] data;
	private int[] data2;
	private int zaehler = 0;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		zaehler = zaehler + 1;
		data = new int[zaehler];
		data[zaehler-1] = value;
		data2 = data;
	}

	public void addValues(int[] values) {
		data = new int[values.length+zaehler];
		for (int y = 0; y < data2.length;y++){
			data[y] = data2[y];
		}
		for(int x = 0; x < values.length; x++){
			data[x+zaehler] = values[x];
		}
	}

	public int getMinimumValue() {
		int minimum = data[0];
		for (int x=0;x<data.length;x++){
			if (data[x] < minimum ){
				minimum = data[x];
			}
		}
		return (minimum);
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int zaehler = 0;
		for (int x = 0; x <data.length; x++){
			if (data[x] > threshold){
				zaehler = zaehler + 1;
			}
		}
		int [] C = new int[zaehler];
		zaehler = 0;
		for (int x = 0; x <data.length; x++){
			if (data[x] > threshold){
				C[zaehler] = data[x];
				zaehler = zaehler + 1;
			}
		}
		
		return C;
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