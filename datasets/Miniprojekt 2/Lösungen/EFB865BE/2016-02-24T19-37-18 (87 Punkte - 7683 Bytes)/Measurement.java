import java.util.Arrays;



public class Measurement {

	private int[] data;

	public Measurement() {
		
		this.data = new int [0];

	}

	public void addValue(int value) {
		
		int [] neuarray = new int [data.length +1];
		
		for (int i = 0; i < data.length; i++){
			neuarray[i] = data[i];
		}
		
		neuarray[neuarray.length -1] = value;  //eckige klammer index 
		
		
		data = neuarray; //? Quang fragen

	}

	public void addValues(int[] values) {
		for(int i = 0; i < values.length; i++){
			addValue(values[i]);
		}

	}

	public int getMinimumValue() {
		
		int min =Integer.MAX_VALUE;
		
		for(int i =0; i < data.length; i++){
			if(data[i] < min){
				min = data[i];
			}
		}
		
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) { 
		
		int anzahl = 0; //anzahl die echt grˆﬂer sind z‰hlen
		
		for(int i  = 0; i < data.length; i++){
			if(data[i] > threshold){
				anzahl++;
			}
		}
		
		int [] neu = new int [anzahl]; //erstelle das array mit echtgrˆﬂer anzahl
		int index = 0;   //die arrays durchlaufen im n‰chsten durchgang eintragen 
		for(int i = 0; i < data.length; i++){
			
			if(data[i] >  threshold){
				neu[index] = data[i];
				index++;
			}
		}
		return neu;
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
		System.out.println("Hinzuf√ºgen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzf√ºgen einer Menge von Werten. m:");
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
		System.out.println("Messwerte √ºber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte √ºber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
