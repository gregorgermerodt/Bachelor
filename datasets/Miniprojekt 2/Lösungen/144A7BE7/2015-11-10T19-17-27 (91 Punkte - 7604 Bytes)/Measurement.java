import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		 data = new int[0];
	}

	public void addValue(int value) {
		 int[] neues = new int [data.length+1];
	
		 	for(int i = 0; i<data.length;i++){
		 		neues[i] = data[i];
		 		
		 	}
		 	neues[neues.length-1] = value;
		 	data = neues;
	}

	public void addValues(int[] values) {
		int[] neues2 = new int [data.length+values.length];
		for(int i=0; i<data.length;i++){
			neues2[i] = data[i];
			}
		for(int j=0; j<values.length;j++){
			neues2[data.length+j] = values[j];
		}
		data = neues2;
	
	
	}

	public int getMinimumValue() {
		int min = data[0];
		for(int i=0;i<data.length;i++){
			if(min>data[i]){
				min = data[i];
			}
		}
		
			return min;
	}

	
	public int[] getValuesAboveThreshold(int threshold) {
		int [] leer = new int [0];
		int wert=0;
		for(int i=0;i<data.length;i++){
			if(data[i]>threshold){
				wert++;
			}
		}
		if(wert==0){
			return leer;
		}
		
		int[] neues3 = new int[wert];
		int index = 0;
		for(int j=0;j<data.length;j++){
			if(data[j]>threshold){
				neues3[index] = data[j];
				index++;
			}
		}
		
		
		
		
		
		return neues3;
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
