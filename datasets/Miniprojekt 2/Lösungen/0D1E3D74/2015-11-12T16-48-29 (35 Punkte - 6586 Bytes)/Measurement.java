import java.util.Arrays;

public class Measurement {

	private int[] data;
	

	public Measurement() {
		
	data = new int [0];

	}

	public void addValue(int value) {
		
		for ( int i = 0; i <= data.length; i++){
			if ( i == data.length ){
				data = new int[value] ;
			}
		}

	}

	public void addValues(int[] values) {
		int y = 0;
		
		for ( int j = 0; j <= values.length; j ++){
			if (j != values.length){
				y ++;
			}
			
		}
		for ( int i = 0; i <= data.length; i++){
			if(i == data.length){
				data = new int[y];
			}
		}

	}

	public int getMinimumValue() {
		int min = 0; 
		int y = 0;
		
		for ( int i = 0; i <= data.length; i++){
			if ( i <= data.length){
				y = i;
			}
			if ( y < i){
				 min =y;
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		return null;
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
		System.out.println("Hinzuf�gen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzf�gen einer Menge von Werten. m:");
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
		System.out.println("Messwerte �ber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte �ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
