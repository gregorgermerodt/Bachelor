import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int [0];
	}

	public void addValue(int value) {
		int []bigD = new int [data.length+1];
		for(int index = 0; index<data.length;index++){
			bigD[index]=data[index];
		}
		bigD[bigD.length-1]=value;
		data=bigD;
	}

	public void addValues(int[] values) {
		int [] biggerD = new int [data.length+values.length];
		int count = 0;
		for(int index = 0; index<data.length;index++){
			biggerD[index]=data[index];
			count = index+1;
		}
		for(int j = 0; j<values.length;j++){
			biggerD[count]=values[j];
			count++;
		}
		data = biggerD;
	}

	public int getMinimumValue() {
		int min = Integer.MAX_VALUE;
		for(int index = 0; index<data.length;index++){
			if(min > data[index]){
				min = data[index];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int []zwspeicher = new int [data.length];
		int laengenZaehler=0;
		for(int index = 0; index<data.length;index++){
			if(threshold < data[index]){
				zwspeicher[laengenZaehler]=data[index];
				laengenZaehler++;
			}
		}
		
		int []limit = new int[laengenZaehler];
		for(int j= 0; j<limit.length;j++){
			limit[j]=zwspeicher[j];
		}
		data = limit;
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
		System.out.println("Messwerte über 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
