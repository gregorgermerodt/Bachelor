import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new  int[0];

	}

	public void addValue(int value) {
		int[] box = new  int[data.length + 1];
		box[box.length - 1] = value;
		for(int index = 0; index + 1 <= data.length; index++) {
			box[index] = data[index];
		}
		data = box;

	}

	public void addValues(int[] values) {
		int[] nex = new  int[data.length + values.length];
		for(int go = 0; go < data.length; go++) {
			nex[go] = data[go];
		}
		for(int go = 0; go + 1 <= values.length; go++) {
			nex[go + data.length] = values[go];
		}
		data = nex;

	}

	public int getMinimumValue() {
		int min = Integer.MAX_VALUE;
		for(int ind = 0; ind < data.length; ind++) {
			if(data[ind] < min)
			{min = data[ind];}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int size = 0;
		for(int i = 0; i < data.length; i++) {
			if(data[i] > threshold)
			{size++;}
		}
		int nex[] = new  int[size];
		for(int i = 0, n = 0; n < data.length; n++) {
			if(data[n] > threshold)
			{nex[i] = data[n]; i++;}
		}
		return nex;
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
		System.out.println("Hinzufuegen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzfuegen einer Menge von Werten. m:");
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
		System.out.println("Messwerte Ueber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte Ueber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
