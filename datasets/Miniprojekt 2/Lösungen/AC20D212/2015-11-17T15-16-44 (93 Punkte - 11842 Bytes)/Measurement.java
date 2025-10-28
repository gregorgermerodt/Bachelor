import java.util.Arrays;
public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0]; //data wird als neues int Array mit der L�nge 0 initialisiert

	}

	public void addValue(int value) {
		int[] temp = new int [data.length+1]; //NEUES Array (temp) mit alten Werten um EINS erh�ht
		for(int i = 0; i < data.length; i++){//durchl�uft das gesamte data-Array. nicht length+1, da ein arry bei 0 beginnt und bei .length endet
			temp[i] = data[i];// weist temp die "alten" Werte von data zu. [i] stellt hierbei den Index dar, der alle Werte von 0 bis n (Arrayende) annehmen kann.
		}                     //Darauf achten, dass der Wert au�erhalb der Schleife zugewiesen wird.
			temp[data.length] = value; //letzter Wert (value) wird an das ende des array "geh�ngt". letzter wert ist [data.length] und nicht lenght+1.
		
			data = temp;//data werden die Werte von temp zugewiesen.
	}
	

	public void addValues(int[] values) {//ein int Array mit der Bezeichnung values
		int[] temp = new int [data.length+values.length];//hier values.length da es sich um ein Array handelt und dieses angeh�ngt wird und nicht nur ein Wert.
		                                                //es wird ein neues "tempor�res Array gebildet, das die l�nge des data-array plus die des values-array besitzt.
		for(int i = 0; i < data.length; i++){// for-Schleife durchl�uft das data-array
			
			temp[i] = data[i];// die Werte des data-arrays werden dem neuen array temp �bergeben.
		}
		for(int j = 0; j < values.length; j++){// das values-array wird durchlaufen
			                                   // [j] da neues Array oder ist das egal????
			temp[data.length+j] = values[j];// die Werte des Arrays "values" werden ans Endes des temp array "angeh�ngt"
		}
		data = temp; //data bekommt die Werte des Arrays temp �bergeben
	}
		
		//Alternativ:
		//for(i = 0; i< value.length; i++){
		//  addValue(values[i]);
		//}
		//}
	

	public int getMinimumValue() {
		int min = data[0];//min bekommt den ersten Wert des data-Arrays zugewiesen. dieser ist zu dem Zeitpunkt gleichzeitig der kleinste Wert.
		for(int i = 0; i < data.length; i++){//durchl�uft das data-Array
			if(data[i] < min){//falls ein Wert des data-Arrays kleiner als der aktuell kleinste ist
				
				min = data[i];//dann ersetzte den alten kleinsten Wert durch den aktuelle kleinsten. danach wird wieder die Schleife durchlaufen.
			}
		}
				return min;//gibt den kleinsten Wert zur�ck.
	}

	
	public int[] getValuesAboveThreshold(int threshold) { //threshold ist eine int-Variable, die den Schwellenwert darstellt.
		int[] temp =  new int [0];//ein �bergangs-array (temp) wird erstellt, dieses hat die L�nge 0, 
		                          //da falls keine Werte �ber threshold, dann R�ckgabe eines Arrays mit der Gr��e 0.
		for(int i = 0; i < data.length; i++){//for-Schleife durchl�uft das data-Array
			
			if(data[i] > threshold){//falls Werte aus dem data-Array gr��er sind als der threshold
				int[] temp2 = new int [temp.length+1];//erstellt ein neues Array mit der Bez. "temp2", 
				                                      //dieses hat die L�nge von "temp" plus 1.
				temp2[temp.length] = data[i];// temp2 bekommt die Werte von data ans Ende 
				for(int j = 0; j < temp.length; j++){//for-Schleife durchl�uft das temp-Array,
					temp2[j] = temp[j];//temp2 werden die Werte von temp �bergeben(hier fehlt noch was)
					
				}
				temp = temp2;//temp bekommt die Werte von temp2 zugewiesen
			}
		}
		return temp;//gibt temp zur�ck
			
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
		System.out.println("Hinzuf�gen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzf�gen einer Menge von Werten. m:");
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
		System.out.println("Messwerte �ber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte �ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
