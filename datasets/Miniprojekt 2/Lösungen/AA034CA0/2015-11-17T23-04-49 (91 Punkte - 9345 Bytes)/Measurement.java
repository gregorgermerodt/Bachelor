import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int [0];

	}

	public void addValue(int value) {
		
		//data = new int [data.length +1];
		
		int[] neu = new int [data.length +1]; 		//data [data.length-1]= value;	
		
		for (int index = 0; 						// 0 ist erster Index den ich anspreche
				index < data.length; 				//Abbruchbedingung
				index++){ //
			
		neu [index] = data [index]; } 				// jetzt wird jedes array ins andere kopiert
		neu [neu.length-1] = value;
													//neu[data.length] = value ALTERNATIVE
		data = neu; 								// da "data" die einzige Konstante ist, die hier verwendet
	}													// wird. 

	public void addValues(int[] values) {
													//data = new int [data.length+2];
													//data [data.length-2]= values[5];
		
		int [] neu1 = new int [data.length + values.length];
		
		for (int index = 0; index < data.length; index++){
			
		neu1 [index] = data [index]; } 				// jetzt habe ich Elemente in Array drin stehen
		
		for (int index =data.length; // das leere element 
				index <values.length; index++) {	
			
		neu1[index] = values[data.length+1];// index-data.lenth = 0
		
			}
		data = neu1;
		
			
	}

	public int getMinimumValue() {
				
		int min = Integer.MAX_VALUE;//wir legen uns ne Varaible an, in der wir uns das Minimum merken
		for (int i = 0 ;  i < data.length; i++){
		
			if (min>data[i] ) { 
			
			min = data[i]; // weise min den Wert an der Stelle i zu (z.B. an der Stelle 1)
			}
	}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		//int groesse = 0;
		//for (int i = 0; i < data.length; i++) {
			//if (data[i]>threshold); {
			
			//groesse++;
			//}
		//}
	
		int [] temp = new int [0];
		for(int i = 0; i < data.length; i++)
			
		{
			if (data[i] > threshold) // habe ich eine Zahl gefunden die größer Threshold ist
		{
				int [] neuData = new int [temp.length+1]; // wir wollen ein Element mehr als wir vorher gefunden habe
													   // ich kann immer nur EIN Element hinzufügen
				for (int j = 0; j <temp.length; j++)
				{
					neuData [j] = temp [j];
				}
				neuData [temp.length] = data [i];
				temp = neuData;
		}
		}
		return temp;

	//int [] neu = new int [groesse];
	//for (int indexData = 0, indexNeu = 0;indexNeu <neu.length;indexData++){
	//	 if (data[indexData] > threshold) {
	//	neu[indexNeu]= data [indexData];
	//	indexNeu++;
	//}
//}
	//	return neu;
	
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
