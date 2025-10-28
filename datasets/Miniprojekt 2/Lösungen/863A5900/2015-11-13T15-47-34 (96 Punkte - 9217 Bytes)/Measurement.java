import java.util.Arrays;

public class Measurement {

	private int[] data;

	//a
	public Measurement() {
		data = new int [0];
		
		
	}

	/*b) Messwert hinzufügen Die Methode addValue(int value) nimmt einen Messwert
	value entgegen und soll diesen als neuen Messwert an das Ende des data-Arrays setzen.
 	Erzeugen Sie dazu ein neues, vergrößertes Array.*/
	
	public void addValue(int value) {
		// neues Array mit der größe plus 1 Element 
		int[] neu = new int[data.length + 1];
		
		// data array wird durchlaufen
		for(int index = 0; index < data.length; index++ ){
				neu[index] = data[index]; 
				// bestehendes data array wird in neues array übertragen
			}
			
			// neuer Wert fehlt
			//letzte Stelle durch neu.length -1
			neu[neu.length-1] = value; // man speichert den value wert an der letzten stelle
			 /*
			  * oder neu[data.lenth] = value ;
			  */
			
			data = neu;
		
	
	}

	public void addValues(int[] values) {

		int[] neu = new int[data.length + values.length];
		for(int index = 0; index < data.length; index++ ){
			neu[index] = data[index];
		}
		
		for(int index= data.length; index < data.length + values.length;index++){
			neu[index] = values[index - data.length];
		}
		
		/* Values Index[] data.length = 1
		 * values.length = 11
		 * 
		 * 1 .Schleifendurchlauf
		 * index - data.length = 1 -1 = 0
		 * 
		 * letzter Durchlauf:
		 * index - data.length = 11-1 = 10 
		 */ 
		 data = neu;
	}

	public int getMinimumValue() {
		int min = Integer.MAX_VALUE; 
		for(int i = 0; i < data.length; i++){
			if(data[i] < min){
				min = data[i];
			}
		}
		return min;
	}
	
	
	/*
	 * public int getMinimumValue() {
		int min = data[0]; 
		for(int i = 0; i < data.length; i++){
			if(data[i] < min){
				min = data[i];
			}
		}
		return min;
	}
	 */

	public int[] getValuesAboveThreshold(int threshold) {
	  // wie gro0 das array ist
		int groesse = 0;
	  for(int i= 0; i < data.length; i++){
		  if(data[i] > threshold){
			  groesse++;
		  }
	  }
	  
	  int[]  neu = new int[groesse];
	  for(int indexData = 0, indexNeu = 0; indexNeu < neu.length; indexData++){
		  if(data[indexData] > threshold){
			  neu[indexNeu] = data[indexData];
			  indexNeu++;
		  }
	  }
	  return neu;
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
