import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int [0] ;
	}

	public void addValue(int value) {
	int erg‰nzt [] = new int[data.length +1 ] ;
	for (int i = 0 ; i < data.length ; i++ ){
		erg‰nzt[i] = data [i] ;
	}
	erg‰nzt[data.length] = value ; 
	
	this.data = new int [erg‰nzt.length];
	this.data = erg‰nzt ; 
	}
	
	 public void addValues(int[] values) {
	 int grˆsser[]  = new int [data.length+ values.length] ;
	 for (int i = 0 ; i < data.length ; i++){
		 grˆsser[i] = data[i] ; 
	 }
	 for (int j = 0 ; j < values.length ; j++){
		 grˆsser[data.length +j ] = values[j] ;  
	 }
	 this.data = new int [grˆsser.length];
	 this.data = grˆsser ; 
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
