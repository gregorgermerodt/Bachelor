import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		data = new int[0];

	}
	
// Ziel der Methode ist es, an das Array data zum Schluss einen neuen Wert anzuf�gen, dieser Wert
// wird druch value gegeben
	
	public void addValue(int value) {
		
// Erstellen eines neuen Arrays mit der gleichen L�nge wie data aber plus 1
// L�nge eines Arrays kann nicht ver�ndert werden, diese ist final, daher ein neues anlegen
// 1 Wert mehr bedeutet eine L�nge mehr
		
		int[] neuesArray = new int[data.length+1];
		
// Durchlaufen des alten (k�rzeren) data-Arrays	
		
			for (int i=0; i<data.length; i++)
				
// Kopieren der Werte aus dem data-Array in das neue Array			
			
			{
				neuesArray[i] = data[i];
			}

// dem letzten Speicherplatz des neuen, laengeren Arrays wird der Wert value zugewiesen
// ein Array mit der L�nge n beginnt bei dem Index 0, somit ist der letzte Wert die L�nge des Arrays -1
			
				neuesArray[neuesArray.length-1] = value;
				
// der Verweis von data soll zukuenftig nicht mehr auf den Speicherplatz des alten Arrays zeigen, sondern
// auf exakt den Speicherplatz auf den auch neuesArray zeigt
				
				data = neuesArray;
				
	}

	public void addValues(int[] values) {
		
// Anlegen eines neuen Arrays, welches die Groe�e von data plus die hinzuzufuegenden Werte beinhaltet
		
	int[] neuesArray = new int[data.length + values.length];
	
// Durchlaufen des data-Arrays mit for-Schleife 
	
		for(int i=0; i<data.length; i++) 
			
// Kopieren der data-Werte in das neue Array
			
		{
			neuesArray[i] = data[i];
		}
	
// Durchlaufen des values-Arrays, um die neuen Werte hinten anzuf�gen
		
		for(int j=0; j<values.length; j++)
		{
			
// um die values-Werte anzuf�gen und die Werte aus data nicht zu �berschreiben, muss von der L�nge des 
// data-Arrays ausgegangen werden und erst ab dort anfangen die Werte des values-Arrays hineinzukopieren
			
			neuesArray[data.length+j] = values[j]; 
		}

// data-Array soll auf den Speicherplatz von neuesArray (data-Array plus die Werte aus dem values-Array) 
// zeigen
		
			data = neuesArray;
		
	}

	public int getMinimumValue() {
		
// neue Variable kleinsterWert deklarieren + initialisieren
// Zugewiesen wird data[0], da f�r den Vergleich der Werte im data-Array ein Wert - der 1. Wert - gesetzt 
// werden muss - 0 oder data.length-1, da die L�nge des Arrays nicht bekannt ist
		
		int kleinsterWert = data[0];
		
			for(int i=0; i<data.length; i++) 
			{
				if(data[i] < kleinsterWert)
				{
					kleinsterWert = data[i];
				}
			}
			
			return kleinsterWert;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		
		
		return null;
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
