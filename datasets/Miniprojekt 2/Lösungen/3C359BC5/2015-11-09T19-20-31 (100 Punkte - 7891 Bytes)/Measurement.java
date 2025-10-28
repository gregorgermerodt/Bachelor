import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0];
	}

	public void addValue(int value) {
		int[] newData = new int[this.data.length+1];
		
		//add old values
		for(int i = 0; i < this.data.length; i++) {
			newData[i] = this.data[i];
		}
		//add new value
		newData[newData.length-1] = value;
		
		//set data
		this.data = newData;
	}

	public void addValues(int[] values) {
		int[] newData = new int[this.data.length+values.length];
		
		//add old values
		for(int i = 0; i < this.data.length; i++) {
			newData[i] = this.data[i];
		}
		//add new value
		for(int i = this.data.length; i < newData.length; i++) {
			newData[i] = values[i-this.data.length];
		}
		
		//set data
		this.data = newData;
	}

	public int getMinimumValue() {
		int min = this.data[0];
		for(int i : this.data) {
			if(i < min)min = i;
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		//serach for values
		int valueCount = 0;
		for(int i : this.data) {
			if(i > threshold)valueCount++;
		}
		
		//create array
		int[] returnArray = new int[valueCount];
		
		//add values
		int index = 0;
		for(int i : this.data) {
			if(i > threshold) {
				returnArray[index] = i;
				index++;
			}
		}
		
		//return
		return returnArray;
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
