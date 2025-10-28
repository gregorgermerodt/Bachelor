

import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		data= new int [0];								//Initialisierung

	}

	public void addValue(int value) {					//Ein Kasten dran haengen mti Wert value
		
		int [] helper= new int[data.length+1];
		
		for (int i=0; i<data.length;i++){				//Kopie erstellen; Helper soll alle Werte von data kopiert bekommen
			
			helper [i]= data[i];
		}
		
		helper [helper.length-1]= value;
		
		data= helper;									//Verweis auf ursprungsarray wegen der Void Methode!

	}

	public void addValues(int[] values) {
		
		int [] helper= new int [data.length + values.length];
		
		for (int i=0; i<data.length; i++){				//Werte rueber kopieren
			
			helper [i]= data[i];
		}
		
														// jetzt hat man ein array das nur mit den Zahlen von data gefuellt ist, ansonsten ist es leer
														// jetzt muessen noch werte von values [] uebernommen werden
		for (int i=data.length; i<helper.length;i++){	//Anfang: data.length, ist erstes kaestchen von values 
			
			helper [i]= values[i-data.length];			// Warum: values[i-data.length] ? weil values kuerzer ist als helper und man will ja von anfang an anfangen
		}												// Schleife muss der Laenge von Values angepasst werden
		
		//for (int i=0; i<values.length;i++){				// values.length als abbruchbedingung //so geht es auch
			
			//helper[data.length+i]= values[i];
		//}
		
		data= helper;

	}

	public int getMinimumValue() {
		
		int kleinsterWert= Integer.MAX_VALUE;				//hier erst mal groesster Wert ueberhaupt
		
		for (int i=0; i<data.length;i++){
			
			if(data[i]< kleinsterWert){
				kleinsterWert= data[i];
			}
		}
		
		return kleinsterWert;
	}

	public int[] getValuesAboveThreshold(int threshold) {
																		//ermitteln wie lang das Hilfsarray sein soll
		int zaehler = 0;
		
		for (int i=0; i<data.length;i++){
			
			if(data [i]> threshold){
				zaehler++;
			}
		}
		
		int [] helper= new int [zaehler];								//leeres Array mit der laenge des Zaehlers
		
		for (int i=0, j=0; i<data.length; i++){							// zwei zaehler!!
			
			if(data [i]> threshold){
				helper [j]= data [i];
				j++;													//j++;
			}
		}
		
		return helper;
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
