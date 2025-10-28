package MiniProjekt2;

import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {

		data = new int[0]; // Struktur auswendig lernen

	}

	public void addValue(int value) {

		int[] neu = new int[data.length + 1];
		for (int index = 0; index < data.length; index++) {  // das ist die bedingung wird hier nicht ausgeführt da 0 nicht kleiner 0 ist
			neu[index] = data[index];  //dies wird ausgeführt wenn die bedingung stimmt , stimmt aber nicht also zum anderen
		}
		neu[neu.length - 1] = value; //hier haben wir am Index 0 den wert Value gegeben
		data = neu; // alles in data gespeichert (siehe aufgabe)

		// int [] neu = new int [data.length+1];
		// int n = neu.length-1;
		// neu [n] = value;

	}

	public void addValues(int[] values) {

		int[] neu = new int[data.length + values.length]; // new hat jetzt die größe von den beiden
		for (int index = 0; index < data.length; index++) { // das ist die bedingung
			neu[index] = data[index]; // wenn ja wird das ausgeführt gespeichert
		}
		for (int index = data.length; index < data.length + values.length; index++) { // das wird ausgeführt wenn die bedingung oben nicht stimmt
			neu[index] = values[index - data.length]; // man nimmt wert values vom index rechts , fügt dem wert dann links dem index hinzu
		
			//oder for ( int i = 0; i < values.lenght; i++)
			//neu [data.length+index] = values[index] ;
		
		}
		
		data=neu;

	}

	public int getMinimumValue() {
		int min = Integer.MAX_VALUE;
		for ( int i = 0; i < data.length;i++) {
			if (data [i] < min){
				min = data [i];
			}
		}
		return min;
		
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		//2.Möglichkeit int [] temp = new int [0] ;
		//for (int i = 0; i < data.length;i++)
		//{
		//	if(data[i] >threshold)
		//	{
		//		int[] neu = new int[temp.length];
		//	for (int j = 0; index < temp.length; j++) {
		// {
		//	neu[j] = data[j];
		//}
		//	neu [temp.length] = data [i]
		//	temp = neu ;
		//		}
		// }
		// }
		
		int groesse = 0;
		for (int i = 0; i < data.length;i++) {
			if (data [i] > threshold) {
				groesse++;
			}
		}
		int [] neu = new int [groesse];
		for (int indexData = 0,  indexNeu = 0; indexNeu < neu.length; indexData++ ){
			if (data[indexData] > threshold) {
				neu[indexNeu] = data [indexData];
				indexNeu++ ;
			
			
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
		System.out.println("Hinzufügen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		m.addValue(8);
		System.out.println("Hinzufügen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();

		System.out.println("------------------------------------------------------------------");

		m.addValues(new int[] { 58, 78 });
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
