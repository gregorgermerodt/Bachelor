import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
	this.data = new int [0]; // Konstruktor mit Array L‰nge von 0
	}

	public void addValue(int value) {
		int [] vergroesserterArray = new int [data.length+1];  //array welches genau eine zahl grˆﬂer ist
		for(int index =0; index <data.length;index++) //kopiervorgang
		{
			vergroesserterArray[index] = data[index];
		}
		vergroesserterArray [vergroesserterArray.length-1]=value; //letzte array element mit values
		data = vergroesserterArray; //verweis von data auf neuem array
	}

	public void addValues(int[] values) {
		int [] biggerArray = new int[data.length+values.length]; // neues array mit entsprechender
		//l‰nge
		int speicher = 0; //speicher f¸r index 
		for(int index = 0; index<data.length;index++){ //kopiervorgang
			biggerArray[index] = data[index];
			speicher = index+1; //speichert aktuellen index um eins erhˆht zur weiternutzung
		}
		for(int neuerindex =0; neuerindex <values.length;neuerindex++){
			biggerArray[speicher]= values[neuerindex]; //start beim x. index 
			speicher++;
		}
		data=biggerArray; //verweis von 
	}

	public int getMinimumValue() {
		int min = Integer.MAX_VALUE;
		for(int index =0; index<data.length;index++){
			if(min>data[index]){
				min = data[index];
			}
		}
		return min;
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
