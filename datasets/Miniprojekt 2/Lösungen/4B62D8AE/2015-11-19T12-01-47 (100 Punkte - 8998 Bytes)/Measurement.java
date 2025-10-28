

import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int [0];  //variable Data wird als neuer Array der Länge 0 deklariert
		
	} 

	public void addValue(int value) {
		int[] newData;
		newData = new int[data.length+1]; 		//neues Array mit einem länger als data
		for (int i = 0; i<data.length;i ++){   // für jedes i von newData wird das jew. element von data hinzugefügt
			newData[i] = data[i];			  // kopiert jedes Element aus data nach newData
		}
		newData[newData.length-1] = value;	    // neuer Wert value wird auf letzte stelle des neuen Arrays gesetzt
		data = newData;						   // data wird auf newData gesetzt => Ausgabe wird gegeben
	} 

	public void addValues(int[] values) {
		for (int i=0; i<values.length; i++){ // Schleife, die für die länge von values 
			addValue(values[i]);            // ruft die Klasse addValue solange auf, bis die Länge von I erreicht ist
		}
		
	}

	public int getMinimumValue() {
		Arrays.sort(data);			// Funktion, die alle Inhalte des Arrays nach der größe aufsteigend sortiert
		int minimum = data[0];	   // und dann einen int ausgibt,der den ersten Wert des Arrays beinhaltet
		return minimum;
	} 

	public int[] getValuesAboveThreshold(int threshold) {
		int groesse = 0;									//erstellt eine Variable groesse, die immer dann um eines erhoeht
		for (int i = 0; i<data.length; i++){			   //wird, wenn das Element i des Arrays data groesser als die Var 
			if(data[i]> threshold){						  //Threshold ist
				groesse++;
			}
		}
		int[] neu = new int[groesse];					//erzeugt ein neues Array mit der länge von groesse 
		for (int indexData = 0, indexNeu=0; indexNeu< neu.length; indexData++){ //soll wenn die Länge von Data konstant erhöhen
			if (data[indexData] > threshold){      // solange der index von data groesser ist als threshold soll der Array 
				neu[indexNeu]=data[indexData];    // neu mit der Länge indexNeu auf die exakten Werte von data gesetzt werden 
				indexNeu++;						 // danauch soll die Var indesNeu um 1 erhöht werden
			}
		}
		return neu; 						  // rückgabe sind die werte des Arrays neu, der alle Werte beinhaltet, die
											 // über dem jew.gegebenen Schwellenwert liegen
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
