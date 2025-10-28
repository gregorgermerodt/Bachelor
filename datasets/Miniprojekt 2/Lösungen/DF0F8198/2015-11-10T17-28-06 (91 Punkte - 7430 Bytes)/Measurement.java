import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int[] oldData = data;
		data = new int [oldData.length + 1];
		for (int i = 0; i < oldData.length; i++){
			data[i] = oldData[i];
		}
		data[data.length - 1] = value;
		//System.out.println(oldData.length);
		//System.out.println(data.length);
	}

	public void addValues(int[] values) {
		int[] oldData = data;
		data = new int[oldData.length + values.length];
		for (int i = 0; i < oldData.length; i++){
			data[i] = oldData[i];
		}
		for (int i = 0; i < values.length; i++){
			data[oldData.length + i] = values[i];
		}

	}

	public int getMinimumValue() {
		int kleinsterWert = data[0];
		for (int i = 0; i < data.length; i++){
			if (data[i] < kleinsterWert){
				kleinsterWert = data[i];
			}
		}
		return kleinsterWert;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		Measurement x = new Measurement();
		for (int i = 0; i < this.data.length; i++){
			if(this.data[i] > threshold){
				x.addValue(this.data[i]);
			}
		}
		return x.data;
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
