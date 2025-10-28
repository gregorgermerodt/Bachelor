import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {

		this.data =new int [0];
	}

	public void addValue(int value) {

	    int temp[] = new int[this.data.length + 1];
	    
	    for( int i = 0; i< this.data.length ; i++){
	    	
	    	temp[i] = this.data[i];
	    }
	    temp[temp.length -1] = value;
	 this.data = temp;
	}

	public void addValues(int[] values) {
		
		int temp[] = new int[this.data.length + values.length]; 
		int k = 0;
		for( int i = 0; i< this.data.length ; i++){
			
			temp [k++] = this.data[i];
		}

        for( int i = 0; i< values.length ; i++){
			
			temp [k++] = values[i];
		}
		this.data = temp;
	}

	public int getMinimumValue() {
		
		int min = data[0];
		
		for( int i = 0; i<this.data.length; i++){
			
			if( min > this.data[i]) min = this.data[i];
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int [] temp = new int[0];
		if ( this.data == null) return temp;
		
		int counter = 0;
		
		for( int i = 0; i<this.data.length; i++){
			
			if( this.data[i] > threshold ) counter++;
		}
		if( counter == 0){
			
			return temp;
		} 
		else {
			
			 temp = new int[counter];
			
			int k = 0;
			for( int i = 0; i<this.data.length; i++){
				
				if( this.data[i] > threshold){
					temp[k++] = this.data[i];
				}
			}
			return temp;
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
