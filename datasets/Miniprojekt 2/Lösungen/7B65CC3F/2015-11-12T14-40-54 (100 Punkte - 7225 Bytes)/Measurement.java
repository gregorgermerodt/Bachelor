import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Measurement {
	
	private int[] data;
	
	public Measurement() {
		this.data = new int[0];
	}
	
	public void addValue(int value) {
		data = Arrays.copyOf(data, data.length + 1);
		data[data.length - 1] = value;
	}
	
	public void addValues(int[] values) {
		for (int i : values) {
			addValue(i);
		}
	}
	
	public int getMinimumValue() {
		int result = data[0];
		for (int i : data) {
			if (i < result == true) {
				result = i;
			}
		}
		return result;
	}
	
	public int[] getValuesAboveThreshold(int threshold) {
		int length = 0;
		List<Integer> hilf = new ArrayList<Integer>();
		for (int i : data) {
			if (i > threshold == true) {
				length++;
				hilf.add(i);
			}
		}
		int[] result = new int[length];
		for (int i = 0; i < hilf.size(); i++) {
			result[i] = hilf.get(i);
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
