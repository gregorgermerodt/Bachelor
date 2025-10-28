import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0];
	}

	public void addValue(int value) {
		//Neues Array anlegen
		int[] newArray = new int[data.length+1];
		
		//Dem neuen Array die Werte des alten Arrays übergeben
		for(int i = 0; i < data.length; i++){
			newArray[i] = data[i];
		}
		
		//Dem neuen Array den neuen Wert hinzufügen
		newArray[newArray.length - 1] = value;
		
		//Dem Array data die neuen Werte übergeben
		data = newArray;
	}

	public void addValues(int[] values) {
		for(int i = 0;  i < values.length; i++){
			addValue(values[i]);
		}
	}

	public int getMinimumValue() {
		int minValue = data[0];
		for(int i = 0; i < data.length; i++){
			if(data[i] <= minValue){
				minValue = data[i];
			}
		}
		return minValue;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] temp = data;
		data = new int[0];
		for(int value : temp){
			if(value > threshold){
				addValue(value);
			}
		}
		
		int[] values = data;
		data = temp;
		
		if(values.length > 0){
			return values;
		}else{
			return new int[0];
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
		System.out.println("HinzufÃ¼gen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("HinzuzfÃ¼gen einer Menge von Werten. m:");
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
		System.out.println("Messwerte Ã¼ber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte Ã¼ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
