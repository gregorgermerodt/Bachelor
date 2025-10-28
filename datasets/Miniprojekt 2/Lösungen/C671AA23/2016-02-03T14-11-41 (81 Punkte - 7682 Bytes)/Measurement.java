
import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0];
	}

	public void addValue(int value) {
		int length = data.length;
		this.data = new int[length + 1];
		data[length] = value;
	}

	public void addValues(int[] values) {
		int lengthdata = this.data.length;
		int lengthvalues = values.length;
		this.data = new int[lengthdata + lengthvalues];
		int n = lengthdata;
		for(int i=0;i<lengthvalues;i++,n++){
			data[n] = values[i];
		}
	}

	public int getMinimumValue() {
		int min = this.data[0];
		for(int i=1;i<this.data.length;i++){
			if(data[i] < min)
				min = data[i];
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] gross = {0};
		int n = 0;
		for(int i=0;i<data.length;i++){
			if(data[i] > threshold){
				gross = new int[n + 1];
				gross[n] = data[i];
				n++;
			}
		}
		return gross;
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
		System.out.println("Hinzuf��gen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzf��gen einer Menge von Werten. m:");
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
		System.out.println("Messwerte ��ber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte ��ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
