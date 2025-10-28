import java.util.Arrays;

public class Measurement {

	private int[] data;


	public Measurement() {
		
		data = new int[0];
		
	}

	public void addValue(int value) {
		
		// Lege Hilfsarray an
		int[] data2 = new int[100];
		
		// Kopiere data-Array nach Hilfsarray
		for(int i= 0; i<data.length; i++)
		{
			data2[i]= data[i];
		}
		// neues Array data mit alter L�nge + 1, f�r einen �bergebenen Wert
		data = new int[1+data.length];
		// Kopiere aus Hilfsarray nach data
		for(int i= 0; i<data.length; i++)
		{
			data[i]= data2[i];
		}
		// Schreibe ans Ende von Data (L�nge-1, letzter Index) value 
		data[data.length-1] = value;
	}

	public void addValues(int[] values) {
		
		// Lege Hilfsarray an
		int[] data2 = new int[100];
		// Alte data-Array-L�nge
		int a= data.length;
		for(int i= 0; i<a; i++)
		{
			data2[i]= data[i];
		}
		
		// neues Array data mit alter L�nge + L�nge von value-Array.
		data = new int[a+values.length];
		// Kopiere aus Hilfsarray nach data mit alter L�nge
		for(int i= 0; i<a; i++)
		{
			data[i]= data2[i];
		}
		// Ab Index alter L�nge (a) Array value nach Array data kopieren 
		int j= a;
		for(int i=0; i<values.length; i++)
		{
				data[j] = values[i];
				j=j+1;
		}


	}

	public int getMinimumValue() {
		int min= 100000;
		for(int i= 0; i<data.length; i++)
		{
			if(data[i]<min)
			{
				min= data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] data2 = new int[data.length];
		
		int j= 0;
		for(int i= 0; i<data.length; i++)
		{
			if(data[i]>threshold)
			{
				data2[j]= data[i];
				j++;
			}
		}
		
		int[] data3 = new int[j];
		for(int i= 0; i<j; i++)
		{
			data3[i]= data2[i];
		}
		return data3;

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
