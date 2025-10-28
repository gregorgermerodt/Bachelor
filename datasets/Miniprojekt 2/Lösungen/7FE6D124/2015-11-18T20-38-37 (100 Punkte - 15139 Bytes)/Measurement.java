import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		// data = new int [0] : laut Uebung
		this.data = new int []{};
	}

	public void addValue(int value) {
	    int neu[] = new int[data.length +1];
	    for (int i =0; i < data.length;i++){
	    	neu[i] = data[i];
	    }
	    neu[neu.length - 1] = value;
	    data = neu;
		
		
		
	 /* int[] neu = new int[data.length + 1] 
	    for (int index = 0; index < data.length; index++){		// Loesung der Uebung
		neu[index] = data[index];
	    }
	    
	    neu[neu.length - 1] = value;
	    neu[data.length] = value;
	    data = neu;
	 */
		
	}
	


	public void addValues(int[] values) {
		int[] speicher = new int [data.length+values.length]; // erzeugt ein neues Array mit der länge vom neuen Array + Ursprungsarray
		for(int j=0; j<data.length;j++){ // durchläuft das Ursprungs-Array
			speicher[j]= data[j]; // setzt die jeweiligen stellen vom Ursprungs-Array in das NEUE Array
		}
		/* [ 1 | 2 | 3 ]  = [ 1 | 2 | 3 | 4 | 5 | 6 | 7]
	         ^   ^   ^		  ^   ^   ^   ^   ^   ^   ^
	         0   1   2 <--    0   1   2   3 <-- genau an der Stelle wo x.length ist wird weiter geführt!!!
	    x.length ergibt hier 3 
	         		 ^------------------->^
		*/		//   ^
		int zahl= data.length; // wir brauchen genau die Zahl an der das Array endet um es fortzusetzen: Erklärung an der Zeichnung
		data = speicher;	   // da Wir am Ende das UrsprungsArray "ausgeben" müssen wird data = NEUES Array gesetzt
		for(int i=0;i<values.length;i++){ // Durchläuft das Eingabe- Array (in diesem Fall: values)
			 data[zahl]= values[i];       // setzt ab der "ZAHL" das Ursprungs-Array fort mit den Werten des Eingabe-Arrays!!
			 zahl++;					  // erhöht Zahl um 1 
			
		}
		
	}
		
	
	
	
	
	public int getMinimumValue() {
		int minimum = Integer.MAX_VALUE; 
		for (int i=0; i<data.length; i++){
			if (data[i] < minimum){
				minimum = data[i];
			}
		}
	return minimum;
	}
	
	
 
	public int[] getValuesAboveThreshold(int threshold) {
		
		// Erster Programmteil:
		
		// Alle Zahlen werden schon hier herausgefunden, aber es muss doppelt gemacht werden.
		// Denn wir muessen ein Array mit der Laenge der Zahlen erzeugen, die groeßer als der
		// uebergebene Wert sind
		
		int zahl = 0;
		for ( int indexZahl= 0; indexZahl<data.length; indexZahl++){
			if(threshold < data[indexZahl]){
				zahl++;
			}
		}
		
		// Zweiter Programmteil:
		
		 
		
		// Ein neues Array wird erzeugt mit der von uns gebrauchten Laenge 
		
		int[] meinSpeicher = new int [zahl];
		for(int i = 0, j=0; j< meinSpeicher.length;i++){
			if(threshold < data[i]){
				meinSpeicher[j] = data[i];
				j++;
				
			}	
		}
		return meinSpeicher;
	}
	
	
     /* int groesse = 0;
     for(int i=0; i<data.length;i++){
    	 if (data[i] > threshold){
    		 groesse++;
    	 }
     }
     
     int neu[] = new int[groesse];
     for(int indexData = 0, indexNeu=0; indexNeu < neu.length; indexData++) {
    	 if(data[indexData] > threshold){
    		 neu[indexNeu] = data[indexData];
    		 indexNeu++;
    	 }
     }
       return neu;
       
	}  	
    */
	// --------------------------------------------------------------
	
	
	// AB HIER BEGINNEN MEINE METHODEN 
	
	// bestimmt den maximalen Wert des Arrays 
	public int getMaximumValue(){
	int max = Integer.MIN_VALUE;
		for(int i=0;i<data.length;i++){
			if(max < data[i]){
				max = data[i];
			}
		}
		return max;
	}
	
	
	
	 // Implementieren Sie die Methode getValuesUnderThreshold(int threshold) so,
	// dass sie ein int-Array mit allen Werten aus data zurückgibt, die echt kleiner sind als der Schwellenwert treshold. 
	// Entspricht kein Wert diesem Kriterium oder enthält data keine Elemente, soll die Methode ein int-Array der Größe 0 zurückgeben.
	
	public int[] getValuesUnderThreshold (int threshold){
		int zahl = 0;
		for(int j=0;j<data.length;j++){
			if(data[j] < threshold){
				zahl++;
			}
		}
		int [] speicher = new int [zahl] ;
		for(int i=0, j=0;i<data.length;i++){
			if(data[i] < threshold){
				speicher[j]=data[i];
				j++;
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
		
		
		
		
		
		
		
		
		System.out.println("--------------HIER BEGINNEN MEINE TESTS----------------------------------");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		
		Measurement n = new Measurement();
		n.data = new int [] {111, 123, 222, 333, 567, 678};
		System.out.println("Neues Measurement-Objekt n erzeugt. n:");
		// ErwarteteAusgabe:
		// [111, 123, 222, 333, 567, 678]
		n.printData();

		System.out.println("------------------------------------------------------------------");
		
		n.addValue(99);
		System.out.println("HinzufÃ¼gen eines neuen Wertes. n:");
		// Erwartete Ausgabe:
		// [99]
		n.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		n.addValues(new int[] { 44, 78, 61, 72, 93,});
		System.out.println("HinzuzfÃ¼gen einer Menge von Werten. n:");
		// Erwartete Ausgabe:
		// [111, 123, 222, 333, 567, 678, 99, 44, 78, 61, 72, 93]
		n.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		
		
		int minValue = n.getMinimumValue();
		System.out.println("Minimaler Wert der Messreihe n:");
		// Erwartete Ausgabe: 44
		System.out.println((minValue));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove100 = n.getValuesAboveThreshold(100);
		System.out.println("Messwerte Ã¼ber 100:");
		// Erwartete Ausgabe:
		// [111, 123, 222, 333, 567, 678]
		System.out.println(Arrays.toString(valuesAbove100));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove150 = n.getValuesAboveThreshold(150);
		System.out.println("Messwerte Ã¼ber 150:");
		// Erwartete Ausgabe:
		// [222, 333, 567, 678]
		System.out.println(Arrays.toString(valuesAbove150));
		
		System.out.println("------------------------------------------------------------------");
		
		int maxValue = n.getMaximumValue();
		System.out.println("Maximaler Wert der Messreihe n:");
		// Erwartete Ausgabe: 678
		System.out.println((maxValue));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesUnder500 = n.getValuesUnderThreshold(500);
		System.out.println("Messwerte Unter 500:");
		// Erwartete Ausgabe:
		// [111, 123, 222, 333, 99, 44, 78, 61, 72, 93]
		System.out.println(Arrays.toString(valuesUnder500));
		
		System.out.println("------------------------------------------------------------------");
		
		
	}
	}
		
	
