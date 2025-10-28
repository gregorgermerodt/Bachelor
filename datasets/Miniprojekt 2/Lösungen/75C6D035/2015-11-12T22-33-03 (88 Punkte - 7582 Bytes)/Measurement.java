import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];

	}

	public void addValue(int value) {
		int n = data.length;
		int[] data1 = new int[n+1];
		if(n == 0){
			data1[0] = value ;
		}else{
		int i = 0;
		while(i < n){
			data1[i] = data[i];
			i ++;
		}
		data1[i] = value;
		}
		data = data1;
	}

	public void addValues(int[] values) {
		int i = 0;
		int n = data.length;
		int[] data1 = new int[n + values.length];
		int m = values.length;
		if(n == 0){
			if(values.length != 0){
				while(i <= m){
					data1[i] = values[i];
					i ++;
				}
			}
		}else{
		while(i < n){
			data1[i] = data[i];
			i ++;
		}
		int im = 0;
		while(im < m){
			data1[i] = values[im];
			im ++;
			i++;
		}
	}
		data = data1;

	}

	public int getMinimumValue() {
		int n = data[0];
		for( int i = 0; i < data.length; i++){
			if(data[i] < n){
				n = data[i];
			}
		}
		return n;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int c = 0; 
		for(int i = 0; i < data.length; i++){
			if(data[i] > threshold){
				c++;
			}
		}
		int[] data1 = new int[c];
		if(c != 0 ){
			int n = 0;
			for(int i = 0; i < data.length; i++){
				if(data[i] > threshold){
					data1[n] = data[i];
					n++;
				}
		}
	}
		return data1;
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
