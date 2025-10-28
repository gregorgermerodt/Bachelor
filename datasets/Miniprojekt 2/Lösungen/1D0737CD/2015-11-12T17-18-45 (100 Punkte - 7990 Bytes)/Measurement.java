import java.util.Arrays;

import org.omg.Messaging.SyncScopeHelper;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0]; 
}

	public void addValue(int value) {
		int [] vData = this.data;
			
		this.data = new int[this.data.length+1];
		
		for (int i = 0; i <= vData.length-1; i++) {
			this.data[i] = vData[i];
		}
		
		this.data[data.length-1] = value;
	}

	public void addValues(int[] values) {
		int [] vData = this.data;
		
		this.data = new int[this.data.length+values.length];
		
		for (int i = 0; i <= vData.length-1; i++) {
			this.data[i] = vData[i];
		}
		
		for (int i = vData.length; i <= this.data.length-1; i++) {
			this.data[i] = values[i-vData.length];
		}
	}

	public int getMinimumValue() {
		if (this.data.length > 0){
			int min = this.data[0];
			
			for (int i = 1; i < this.data.length; i++) {
				if (this.data[i] < min ){
					min = this.data[i];
				}
			}
			return min;
		}
		return -1;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] vArray = new int[this.data.length];
		int vIndizes = 0;
		
		int[] vhelp = new int[vIndizes];
		
		if (this.data.length > 0){
			
			for (int i = 0; i < this.data.length; i++) {
			
				if (this.data[i] > threshold ){
					vArray[vIndizes] = this.data[i];
					vIndizes ++;				
				}
			}
			//vArray.length = vIndizes;
			//int[] vhelp = vArray;
			
			 vhelp = new int[vIndizes];
			
			if (vIndizes>0){
				for (int i = 0; i <= vhelp.length-1; i++) {
					vhelp[i] = vArray[i];
				}
			}
 			
		}
		
		return vhelp;
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
