import java.util.Arrays;

public class Measurement {

	private int[] data;
	

	public Measurement() {
		
		data = new int [0];

	}

	public void addValue(int value) {
		
		// neues Array mit length erzeugen
		int [] dataNeu = new int [data.length+1];
		
		for (int i=0; i<data.length; i++){
			
			dataNeu[i] = data[i];
			
			
		}
		
		dataNeu[dataNeu.length-1] = value;
		data = dataNeu;
		
		
		
		
		
		

	}

	public void addValues(int[] values) {
		
		// 1.) Neues Array Grˆﬂer
		int neueGrˆﬂe = values.length+data.length;
		
		int[] neuesData;
		neuesData = new int [neueGrˆﬂe];
		
		
		// 2.) Kopieren alte Array
		
		for (int i=0; i<data.length; i++){
			
			neuesData[i] = data[i];
			
		}
		
		// 3.) Neue Werte dransetzen
		
		for (int i =data.length; i<neuesData.length; i++){
			
		
				
			neuesData[i] = values[values.length-i];
			
			
		
			
		}
		
		//4.) Data ersetzen
		
		data = neuesData;
		
	}

	public int getMinimumValue() {
		
		int minimal = 0;
		
		for (int i = 0; i<data.length; i++){
			
			
			
			if (data[i]<data[minimal]){
			
				data[minimal] = data[i];
			}
			
		}
		
		return data[minimal];
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int x = 0;
		
		for (int i = 0; i<data.length; i++){
			
			if (data[i]>threshold){
				
				x++;
				
			}
			
		}
		
		int [] neuesArray;
		neuesArray = new int [x];
		int y = 0;
		
		for (int i = 0; i<data.length; i++){
			
			if (data[i]>threshold){
				
				neuesArray[y] = data[i];
				y++;
			
			}
			
		}
		
		
		return neuesArray;
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
