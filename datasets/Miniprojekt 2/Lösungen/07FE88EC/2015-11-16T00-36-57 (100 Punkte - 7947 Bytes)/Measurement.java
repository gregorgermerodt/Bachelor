import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		data = new int[0];
		
	}

	public void addValue(int value) {

		int[] save = data;
		
		data = new int[data.length + 1];
		
		for(int i=0; i<save.length; i++){
			
			data[i] = save[i];
		}
		
		
		for(int k=data.length-1; k<data.length; k++){
			
			data[k] = value;
		}

	}

	public void addValues(int[] values) {
		
		int[] save = data;
		
		data = new int[data.length + values.length];
		
		for(int i=0; i<save.length; i++){
			
			data[i] = save[i];
		}
		
		for(int j=data.length-values.length, k=0; j<data.length && k<values.length; j++, k++){
			
			data[j] = values[k];
		}

	}

	public int getMinimumValue() {
		
		int minimum = data[0];
		
		for(int i=0; i<data.length; i++){
			
			if(data[i]<=minimum){
				
				minimum = data[i];
			}
			
		}
		return minimum;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int[] speicher;
		
		int zaehler = 0;
		
		for(int i=0; i<data.length; i++){
			
			if(data[i]>threshold){
				
				zaehler++;
			}
		}
		
		if(zaehler == 0){
			
			speicher = new int[0];
		}
		
		else{
			
			speicher = new int[zaehler];
		}
		
		for(int j=0, k=0; j<data.length && k<speicher.length; j++){
			
			if(data[j]>threshold){
				
				speicher[k]=data[j];
				
				k++;
			}
		}
		
		return speicher;
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
