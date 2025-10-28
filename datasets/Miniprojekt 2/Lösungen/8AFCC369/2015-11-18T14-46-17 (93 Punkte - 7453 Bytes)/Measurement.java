import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data=new int [0]; 	
	}

	public void addValue(int value) {
	int new_Array [] = new int [data.length+1];
	 
	for( int i = 0; i < data.length; i++){
		new_Array[i]=data[i];
	}
		new_Array[new_Array.length-1] = value;
		data = new_Array; 
	}

	
	public void addValues(int[] values) {
		int new_Array [] = new int [data.length+values.length];
		for( int i=0; i<data.length; i++){
			new_Array[i]= data[i];
		}
		for( int j=0; j< values.length; j++){
			new_Array[data.length+j] = values[j];
		}
		data=new_Array;
		
		
	
	}

	public int getMinimumValue() {
		int groesster= Integer.MAX_VALUE;    //  2, 5, 4, 1, 7 , 9   kleinster Wert ist 1   wir finden den 
		
		for( int i=0; i< data.length; i++){
			if (groesster > data[i]){
				groesster= data[i];
				
			}
			
		}
		return groesster;
	}

	public int[] getValuesAboveThreshold(int threshold) {
	if( threshold==0){
		return new int [0];
	}
	else {
		int counter=0;
		
		for(int i=0; i< data.length; i++){
			if( threshold < data[i]){
				counter++;
			}	
		}
		int new_array [] = new int[counter];
		counter=0;
		for( int i=0; i< data.length; i++){
			if( data[i] > threshold){
				counter++;
				new_array[counter-1]= data[i];
			}
		}
		return new_array;
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
