import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0] ;

	}

	public void addValue(int value) {
		int arr2[] = new int[data.length+1];		
		for(int i= 0; i <data.length;i++){
			arr2[i] = data[i];
		}
		arr2[arr2.length-1] = value;
		data = arr2;
		
		
		 

	}

	public void addValues(int[] values) {
        int arr3[] = new int[data.length+values.length];
        for(int i= 0; i <data.length;i++){
			arr3[i] = data[i];
		}
        for(int i = data.length; i < data.length + values.length ;i++){
        	arr3[i] = values[i - data.length];
        }
        data = arr3;
        
        
		
		
		

	}

	public int getMinimumValue() {
		int minvalue = Integer.MAX_VALUE;
	for(int i =0;i < data.length; i++){
		if(data[i] < minvalue){
			minvalue= data[i];
		}
	}
	return minvalue;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int groesse = 0;
		for(int i= 0; i<data.length;i++){
			if(data[i] > threshold){
				groesse++;
			}
		}
		int arr4[] = new int[groesse];
		for(int indexData = 0, indexArr4 = 0; indexArr4 < arr4.length; indexData++ ){
			if(data[indexData] > threshold){
				arr4[indexArr4] = data[indexData];
				indexArr4++;
			}	
		}
	return arr4;
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
