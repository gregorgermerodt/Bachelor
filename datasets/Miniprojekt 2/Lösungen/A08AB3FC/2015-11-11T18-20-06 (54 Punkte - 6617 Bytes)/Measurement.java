import java.util.Arrays;

public class Measurement {

	private int[] data;
	


	public Measurement() {
		data = new int [0];
	}

	public void addValue(int value) {
		int asa [] = new int [data.length +1];
		System.arraycopy(data, 0, asa, 0, data.length);
		data = asa;
		data [data.length -1] = value;
		
		 
	}

	public void addValues(int[] values) {
		int ba = data.length;
		int asa [] = new int[data.length +values.length];
		System.arraycopy(data, 0, asa, 0, data.length);
		data = asa;
		for (int i = data.length - values.length; i < data.length; i ++){
			data[i]= values[i - ba];
			
		}
			
			
			

	}

	public int getMinimumValue() {
		int a = 0;
		for (int i = 0; i < data.length -1; i ++){
			if( data [i]<= data[i +1]){
				data[i +1] = data[i];
			}else {
				data[i]= data[i +1];
			
			}
			a = data[i];
		}
		return a;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int a = 0;
		for (int i = 0; i < data.length; i ++){
		if (data[i] > threshold){
			a += 1;	
		}
		}
		int b [] = new int [a];
		for (int i = 0; i < b.length; i++){
			for(int j = 0; j < data.length; j++){
				if (data[j] > threshold){
					b[i] = data[j];
				}
			}
		}
		
		
		return b;
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
		System.out.println("HinzufÃ¼gen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("HinzuzfÃ¼gen einer Menge von Werten. m:");
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
		System.out.println("Messwerte Ã¼ber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte Ã¼ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
