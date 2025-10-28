import java.util.Arrays;
public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0]; //data wird als neues int Array mit der Länge 0 initialisiert

	}

	public void addValue(int value) {
		int [] temp = new int [data.length+1]; //neues Array (temp) mit alten Werten um EINS erhöht
		for( int i = 0; i< data.length; i++){//durchläuft das gesmte Array. nicht length+1, da ein arry bei 0 beginnt und bei .length endet
			temp[i] = data[i];// weist temp die "allten" werte von data zu. [i] stellt hierbei eine Variable dar, die alle Werte von 0 bis ende array annehmen kann.
			temp[data.length] = value; //letzter Wert (value) wird an das ende des array "gehängt". letzter wert ist [data.length] und nicht lenght+1.
		}
     data = temp; //data werden die Werte von temp zugewiesen.
	}

	public void addValues(int[] values) {//ein int Array mit der Bezeichnung values
		int[] temp =new int [data.length+values.length];//hier values.length da es sich um ein Array handelt und dieses angehängt wird und nicht nur ein Wert.
		                                                //es wird ein neues "temporäres Array gebildet, das die länge des data-array plus die des values-array besitzt.
		for(int i = 0; i < data.length;i++){// for-Schleife durchläuft das data-array
			
			temp[i] = data[i];// die Werte des data-arrays werden dem neuen array temp übergeben.
		}
		for(int j = 0; j < values.length; j++){// das values-array wird durchlaufen
			
			temp[data.length+j] = values[j];// die Werte des Arrays "values" werden ans Endes des temp array "angehängt"
		}
		data = temp; //data bekommt die Werte des Arrays temp übergeben
	}
		
		//Alternativ:
		//for(i = 0; i< value.length; i++){
		//  addValue(values[i]);
		//}
		//}
	

	public int getMinimumValue() {
		int min = data[0];//spiecherort für den minimalsten wert
		for(int i = 0; i < data.length; i++){
			if(data[i] < min){
				
				min = data[i];
			}
		}
				return min;
	}

	
	public int[] getValuesAboveThreshold(int threshold) {
		int[] temp =new int [0];
		for(int i = 0; i < data.length;i++){
			
			if(data[i] > threshold){
				int[] temp2 = new int [temp.length+1];
				temp2[temp.length] = data[i];
				for(int j = 0; j < temp.length; j++){
					temp2[j] = temp[j];
					
				}
				temp = temp2;
			}
		}
		return temp;
			
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
