import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		data= new int[0];

	}

	public void addValue(int value) {
		int neu[]= new int[data.length];
		
		for(int i=0; i< data.length; i++){
			neu[i]=data[i];
		}
		data= new int[neu.length+1];
		
		for(int k=0; k<neu.length; k++){
			data[k] = neu[k];
			
		}data[neu.length] = value;

		
	}

	public void addValues(int[] values) {
		int neue[]= new int[data.length];
		
		for(int i=0; i<data.length; i++){
			neue[i] = data[i];
		}
		data= new int [neue.length + values.length];
		
		for(int k=0; k< neue.length; k++){
			data[k]= neue[k];
		}
		for(int j=0; j<values.length; j++){
			
			data[neue.length + j]= values[j];
			
		}
		
		
		
		
		

	}

	public int getMinimumValue() {
		int a= Integer.MAX_VALUE;
		
		for(int i=0; i<data.length; i++){
			if(data[i]<a){
				a= data[i];
			}
		}
		
		
		return a;
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
