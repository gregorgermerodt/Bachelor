import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data= new int[0];

	}

	public void addValue(int value) {
	int [] hilfsarray = new int [data.length+1];
	
	for (int i=0; i < data.length; i++){
		hilfsarray[i]=data[i];
		
	}
	for (int j=data.length; j<hilfsarray.length; j++){
		hilfsarray[j]=value;
	}
	data= new int[hilfsarray.length];
	for (int k=0; k<hilfsarray.length; k++){
		data[k]= hilfsarray[k];
	}

	}

	public void addValues(int[] values) {
		int [] hilfsarray= new int[data.length+ values.length];
		for (int i=0; i< data.length; i++){
			hilfsarray[i] = data[i];
		}
		for (int j= data.length, k=0; k<values.length; j++, k++){
			hilfsarray[j]= values[k];
		}
		data = new int[hilfsarray.length];
		for (int l=0; l<hilfsarray.length; l++){
			data[l]=hilfsarray[l];
		}

	}
	/////////////////////HILFSMETHODE ZUM ERMITTELN DES MAXIMALEN WERTES///////////////////////
	public int getMaximumValue(){
		int max=0;
		for (int i=0; i< data.length; i++){
			if (data[i]> max){
				max=data[i];
			}
		}
		
		
		return max;
		
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	public int getMinimumValue() {
		int min=data[0];
		for (int i=0; i< data.length; i++){
			if (min > data[i]){
				min= data[i];
			}
		}
		
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int zaehler=0;
		for (int k=0; k< data.length; k++){
			if (data[k]> threshold){
				zaehler++;
			 }
			}
		int [] ValuesAbove= new int [zaehler];
		for (int i=0, j=0; i< data.length; i++){
			if (data[i]> threshold){
				ValuesAbove[j]= data[i];
				j++;
			}
		}
		
		
		return ValuesAbove;
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
