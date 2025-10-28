import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int [0] ;
	}

	public void addValue(int value) {
	int ergaenzt [] = new int[data.length +1 ] ;
	for (int i = 0 ; i < data.length ; i++ ){
		ergaenzt[i] = data [i] ;
	}
	ergaenzt[data.length] = value ; 
	
	this.data = new int [ergaenzt.length];
	this.data = ergaenzt ; 
	}
	
	 public void addValues(int[] values) {
	 int groesser[]  = new int [data.length+ values.length] ;
	 for (int i = 0 ; i < data.length ; i++){
		 groesser[i] = data[i] ; 
	 }
	 for (int j = 0 ; j < values.length ; j++){
		 groesser[data.length +j ] = values[j] ;  
	 }
	 this.data = new int [groesser.length];
	 this.data = groesser ; 
		}
	

	public int getMinimumValue() {
		int minimum = data[0]; 
		for (int i = 0 ; i < data.length ; i++){
			if (data[i] < minimum){
				minimum = data[i] ;
			}
		}
		return minimum;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int nichts [] = new int [0] ;
		if (data.length == 0 ){
			return  nichts ; 
		}
		int count = 0 ; 
		for (int i = 0; i< data.length ; i++){
			if (data[i] > threshold){
				count++;
			}
		}
		int[] Werte = new int [count];
		int thresholdcount = 0 ; 
		for (int j = 0 ; j < data.length; j++ ){
			if (data[j] > threshold){
				Werte[thresholdcount] = data[j];
				thresholdcount ++ ; 
			}
			
		}
		return Werte;
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
