import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int [0];
	}

	public void addValue(int value) {
	
		int[] speicher = new int [data.length+1] ;
		
		for(int i =0;i<data.length;i++){
			speicher[i] = data[i];
			}
		speicher[speicher.length-1] = value;
			data = speicher;
		}
		
	
		
	

	public void addValues(int[] values) {
		int zahl = data.length;
		int[] speicher = new int [values.length+data.length];
		for(int i=0;i<data.length;i++){
			speicher[i] = data[i];
		}
		for(int i=0;i<values.length;i++){
			speicher[zahl] = values[i];
			zahl++;
		}
		data = speicher;
	}

	public int getMinimumValue() {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<data.length;i++){
			if(data[i] < min){
				min = data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int zahl =0;
		for(int i=0;i<data.length;i++){
			if(threshold < data[i]){
				zahl++;
				
			}
		}
		int speicher[] = new int [zahl];
		for(int i=0, j=0;i<data.length;i++){
			if(threshold < data[i]){
				speicher[j] = data[i];
				j++;
			}
		}
		return speicher;
	}
	
	public int[] getValuesUnderThreshold(int threshold) {
		int zahl =0;
		for(int i=0; i<data.length;i++){
			if(data[i] < threshold){
				zahl++;
			}
		}
		int speicher[] = new int [zahl];
		for(int i=0, j=0; i<data.length;i++){
			if (data[i] < threshold){
				speicher[j] = data[i];
				j++;
			}
		}
		data = speicher;
		return data;
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
		System.out.println("Messwerte �ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
		
		int[] valuesUnder78 = m.getValuesUnderThreshold(78);
		System.out.println("Messwerte Unter 78:");
		// Erwartete Ausgabe:
		// [58, 61, 72, 75]
		System.out.println(Arrays.toString(valuesUnder78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesUnder50 = m.getValuesUnderThreshold(50);
		System.out.println("Messwerte Unter 50:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesUnder50));
		
		Measurement n = new Measurement();
		
		System.out.println("Neues Measurement-Objekt n erzeugt. n:");
		// ErwarteteAusgabe:
		// []
		n.printData();
	}

}
