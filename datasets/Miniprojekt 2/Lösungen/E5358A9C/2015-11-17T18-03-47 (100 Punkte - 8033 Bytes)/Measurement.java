import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int [0];
	}

	public void addValue(int value) {
		int datalength = this.data.length;
		int[] backup = this.data;
		this.data = new int [datalength+1];
		if (datalength > 0){
			for (int i = 0; i < datalength; i++) {
				this.data[i] = backup[i];
			}
			this.data[datalength++] = value;
		}
		else {
			this.data[0] = value;
		}
		
		
	}

	public void addValues(int[] values) {
		int newlength  = this.data.length + values.length;
		int[] backup = this.data;
		this.data = new int[newlength];
		int k = 0;
		
		for (int i = 0; i < backup.length; i++) {
			this.data[i] = backup[i];
		}
		
		for (int j = backup.length; j < this.data.length; j++) {
				this.data[j] = values[k];
				k++;
			}
		

	}

	public int getMinimumValue() {
		int kleinster = 0;
		for (int i = 0; i < this.data.length; i++) {
			if (kleinster > this.data[i]){
				kleinster = this.data[i];
			}
		}
		
		return kleinster;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int length = 0;
		int y = 0;
		for (int i = 0; i < this.data.length; i++) {
			if (this.data[i] > threshold) {
				length++;
			}
		}
		int[] thresholdarray = new int[length];
		
		for (int j = 0; j < this.data.length; j++) {
			if (this.data[j] > threshold) {
				thresholdarray[y] = this.data[j];
				y++;
			}
		}
		
		return thresholdarray;
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
