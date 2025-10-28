import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int zValue = value;
		int zArrNewLength = data.length;
		int[] oldData = data;
		
		data = new int[zArrNewLength+1];
		
		for(int i=0; i<zArrNewLength; i++){
			data[i] = oldData[i];
		}
		data[zArrNewLength] = zValue;				
	}

	public void addValues(int[] values) {
		int[] oldData = data;
		data = new int[oldData.length + values.length];
		
		for(int i=0; i<oldData.length; i++){
			data[i] = oldData[i];
		}
		int i = 0;
		for(int j=oldData.length; j<data.length; j++){
			
			data[j] = values[i];
			i++;
		}
	}

	public int getMinimumValue() {
		int number = data[0];
		for(int i=1; i<data.length; i++){
			if(number > data[i]){
				number = data[i];
			}
		}
		return number;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] newData = new int[0];
				
		for(int i=0; i<data.length; i++){
			if(data[i] > threshold ){
				int[] oldData = newData;
				newData = new int[oldData.length+1];
				for(int k=0; k<newData.length-1; k++){
					newData[k] = oldData[k];
				}
				newData[newData.length-1] = data[i];
			}
		}
		return newData;
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
