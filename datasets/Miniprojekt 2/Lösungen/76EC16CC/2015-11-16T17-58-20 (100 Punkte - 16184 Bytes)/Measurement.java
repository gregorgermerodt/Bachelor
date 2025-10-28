import java.util.Arrays;

public class Measurement {

	private int[] data; //** Arraydeklaration Typ[] arrayname */

	public Measurement() {		
		data = new int[0]; //** Konstruktor wird so erzeugt: arrayname = new Typ[]; Hier haben wir ein Array f�r data in der L�nge 0 erzeugt */
			
	}

	public void addValue(int value) {  //** Aufgabe: Die Methode soll einen Messwert entgegennehmen und unser data Array mit diesem Wert "verl�ngern" */
		if (data.length == 0) {        //** Unser data Array hat die Gr��e 0. Damit wir einen Wert hinzuf�gen (k�nnen), schreiben wir eine Bedingung. */
			int[] data2 = {value};     //** Wenn data also 0 ist, so soll ein Hilfsarray erstellt werden, dieses Array enth�lt den neuen Wert */
			data = data2;			   //** Genauer gesagt steht er im Parameter {value}. data wird dann noch data2 zugewiesen */
			} else {					//** 2. Fall. Wenn data nicht leer ist, dann wird ein Hilfsarray mit der L�nge + 1 ben�tigt. */
				int[] data2 = new int[data.length+1]; //** neues Objekt erzeugt data2 mit l�nge +1.
				for (int i = 0; i < data.length; i++){ //** Ausgabe eines Arrays �ber eine FOR-Schleife. i hier kleiner als die Gesamtl�nge des Array. i++ heisst Erh�hung um 1. */
					data2[i] = data[i];     //** Zuweisung. */
				if(i == data.length-1); {   //** Wenn die letzte Stelle von data erreicht ist, wird nun in die letzte Stelle von data2 der wert aus {value} gespeichert 
					data2[i+1] = value;     
				}
			}
				data = data2;   //** Zuweisung von data auf data2 */
		}
	}

	public void addValues(int[] values) {
	     
        int[] data2 = new int[this.data.length + values.length];
        if (values == null) {            
        } else {            
            for (int i = 0; i <= data.length; i++) {
               if (i == data.length) {
            	   for (int j = i, k = 0; j < data2.length; j++, k++) {
                      data2[j] = values[k];
                    }
             } else {
                    data2[i] = data[i];
                }
            }
        }
        
        data = data2;
    }


	public int getMinimumValue() {
		  
	        int minValue = data[0];

	       
	        for (int i = 0; i < this.data.length; i++) {
	            
	            if (data[i] < minValue) {
	                minValue = data[i];
	            }
	        }
	       
	        return minValue;		
	}

	public int[] getValuesAboveThreshold(int threshold) {
	   
	        
	        if (threshold == 0) {
	            return null;
	        } else {
	           
	            int counter = 0;
	           
	            int[] temp = new int[data.length];
	            
	            for (int i = 0; i < this.data.length; i++) {
	               
	                if (data[i] > threshold) {
	                  
	                    temp[counter] = data[i];
	                    counter++;
	                }
	            }

	           
	            int[] newThreshold = new int[counter];

	          
	            for (int i = 0; i < newThreshold.length; i++) {
	                newThreshold[i] = temp[i];
	            }

	           
	            return newThreshold;
	            }
				
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
