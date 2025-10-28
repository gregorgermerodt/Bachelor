import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		data = new int[0];

	}

	public void addValue(int value) {
		
		if(data.length == 0){
			
			int [] array1 = {value};
			
			data = array1;
		
		}else{
			
		
		int array1[] = new int[data.length + 1];
		
		for(int i=0; i< data.length; i++){
			array1[i] = data[i];
			
			if(i== data.length -1){
				array1[i+1] = value;
			}
		}
		
		
		
		data = array1;
	 }
	}

	public void addValues(int[] values) {
		
		if(data.length == 0){
			
			int[] array1 = new int[values.length];
			
			for(int i=0; i< array1.length; i++){
				array1[i] = values[i];
			}
			data = array1;			
		}else{
			
			
			int[] array1 = new int[data.length + values.length];
			
			for(int i=0 ; i< data.length; i++){
				array1[i] = data[i];
				
				if(i == data.length - 1	){

					for(int j=0; j< values.length; j++){
						array1[i+j+1] = values[j];
					}
				}
			}
			data = array1;
		}

	}

	public int getMinimumValue() {
		
		int min = data[0];
		
		for(int i=0; i< data.length; i++){
			if(min > data[i]){
				min = data[i];
			}
		}
		return min;		
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int counter = 0;
		
		for(int i = 0; i< data.length; i++){
			if(data[i] > threshold){
				counter++;
			}
		}
		
		int[] array1 = new int[counter];
		int x = 0;
		
		for(int j=0; j< data.length; j++){
			if(data[j] > threshold){
				
				
					array1[x] = data[j];
					x = x + 1;
					
			}
		}
		return array1;
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
