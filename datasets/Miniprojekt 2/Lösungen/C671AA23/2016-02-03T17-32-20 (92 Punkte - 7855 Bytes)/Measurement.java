
import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0];
	}

	public void addValue(int value) {
		int length = data.length;
		int[] temp = new int[length + 1];
		
		for(int i=0; i< length;i++){
			temp[i] = data[i];
		}
		temp[length] = value;
		data = temp;
	}

	public void addValues(int[] values) {
		int lengthdata = this.data.length;
		int lengthvalues = values.length;
		int[] temp = new int[lengthdata + lengthvalues];
		int i = 0;
		for(; i< lengthdata;i++){
			temp[i] = data[i];
		}
		for(int n=0;n < lengthvalues; n++,i++ ){
			temp[i] = values[n];
		}
		data = temp;
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
		int[] gross = new int[data.length];
		int n=0;
		for(int i=0;i<data.length;i++){
			if(data[i] > threshold){
				gross[n] = data[i];
				n++;
			}
		}
		if(n==0) return null;
		else{
			int[] temp = new int[n];
			for(int i =0;i<n;i++){
				temp[i] = gross[i];
			}
			return temp;
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
