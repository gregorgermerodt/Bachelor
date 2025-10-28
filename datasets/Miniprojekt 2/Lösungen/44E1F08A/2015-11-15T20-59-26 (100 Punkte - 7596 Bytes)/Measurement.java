import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int[] tmp = new int[data.length+1];
		for(int i = 0; i< tmp.length; i++){
			if(i < tmp.length-1 && data.length>0){
				tmp[i] = data[i];
			}else if(data.length == 0){
				tmp[i]=value;
				break;
			}else{
				tmp[i]=value;
			}
		}
		data = tmp;
			
	}

	public void addValues(int[] values) {
		int[] tmp = new int[data.length+values.length];
		for(int i = 0; i< tmp.length; i++){
			if(i < data.length){
				tmp[i] = data[i];
			}else{
				tmp[i]=values[i-data.length];
			}
		}
		data = tmp;
	}

	public int getMinimumValue() {
		int min = data[0];
		for(int i = 0; i<data.length; i++){
			for(int j=i+1; j<data.length; j++){
				if(data[j]<=min){
					min = data[j];
				}
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int counter=0;
		for(int i =0; i<data.length; i++){
			if(data[i]>threshold){
				counter++;
			}
		}
		if(counter == 0){
			return new int[0];
		}
		else{
			int [] tmp = new int [counter];
			counter = 0;
			for(int i = 0; i<data.length; i++){
				if(data[i] >threshold){
					tmp[counter] = data[i];
					counter++;
				}
			}
			return tmp;
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
		System.out.println("HinzufГјgen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("HinzuzfГјgen einer Menge von Werten. m:");
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
