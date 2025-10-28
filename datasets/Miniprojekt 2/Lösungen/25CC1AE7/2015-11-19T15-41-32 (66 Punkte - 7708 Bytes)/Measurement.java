import java.util.Arrays;

public class Measurement {

	private int[] data = new int[0];

	public Measurement() {
		
		int[] array = new int[0];

	}

	public void addValue(int value) {
		
		int[] temp = new int[data.length + 1];
		
		for(int i=0 ; i < data.length ; i++){
			
			temp[i] = data[i];
						
		}
		temp[data.length] = value;
		data = temp;

	}

	public void addValues(int[] values) {
		
		int[] temp = new int[data.length + values.length];
		
		for(int i=0 ; i< data.length ; i++){
			temp[i] = data[i];
			
		}
		for(int j= data.length +1  ; j< data.length + values.length ; j++ ){
			temp[j] = values[j - data.length];
		}
		
		data = temp;
	}

	public int getMinimumValue() {
		
		int kwert = data[0];
		
		for(int i = 0 ; i< data.length ; i++){
			if(data[i] < kwert){
				kwert = data[i];
			}
		}
		return kwert;
		
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int[] temp = new int[data.length];
		int counter = 0;
		
		
		
			for(int i = 0; i< data.length ; i++){
				if(data[i] > threshold){
					
					temp[counter] = data[i];
					counter ++;
				}
			}	
			int[] erg = new int[counter];
			for(int j = 0; j < erg.length; j++){
				erg[j] = temp[j];
			}
				
			
			return temp;
		
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
