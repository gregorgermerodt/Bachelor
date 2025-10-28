import java.util.Arrays;

public class Measurement {

	private int[] data;

	
	public Measurement() {
		
		data = new int [0];
	}

	public void addValue(int value) {

		int aktuellelaenge = data.length;
		
		int [] newdata = new int [aktuellelaenge +1];
		
		 for (int i = 0; (i < aktuellelaenge); i++) {
           newdata[i] = data[i];
		 }
		 
		 newdata[aktuellelaenge] = value;
		 
		 data = newdata;
		
	}

	public void addValues(int[] values) {

		int aktuellelaenge = data.length;
		int uebergebenelaenge = values.length;
		int [] insgesamt = new int [aktuellelaenge + uebergebenelaenge];
		
		for ( int i = 0; i < aktuellelaenge; i++){
			insgesamt[i] = data[i];
		}
		
		for ( int j = 0; j < uebergebenelaenge; j++){
			insgesamt[j+aktuellelaenge] = values[j];
			
		}
		
		data = insgesamt;
	}

	public int getMinimumValue() {
		
		int temp = data[0];
		
		for ( int i = 0; i <data.length; i++){
			if (data[i]< temp){
				temp = data[i];
			}
		}
		return temp;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int counter = 0;
		
		for ( int i = 0; i < data.length; i++){
			if ( data[i] > threshold){
				counter ++;
			}
		}
		
		int [] wertuebertreshold = new int [counter];
		
		int nachsteIndex = 0;
		for ( int j = 0; j < data.length; j++){
			if (data[j] > threshold){
				wertuebertreshold[nachsteIndex] = data[j];
				nachsteIndex ++;	
			}	
		}
		return wertuebertreshold;
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
