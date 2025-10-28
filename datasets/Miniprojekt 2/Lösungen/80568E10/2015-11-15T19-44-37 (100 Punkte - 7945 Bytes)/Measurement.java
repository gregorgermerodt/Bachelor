

import java.util.ArrayList;
import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {

		data = new int [0];
	}

	public void addValue(int value) {

		int [] neu = data;
		data = new int [neu.length +1];
		
		for (int i=0; i<neu.length; i++)
		{
			data [i] = neu [i];
		}
		data [data.length -1] = value;
	}

	public void addValues(int[] values) {

		int [] neu = data;
		data = new int [neu.length + values.length];
		
		for (int i=0; i<neu.length; i++)
		{
			data [i] = neu [i];
		}
		
		for (int i=0, j=neu.length; i<values.length; i++, j++)
		{
			data [j] = values [i];
		}
	}

	public int getMinimumValue() {
		
		int kleinsterWert = data [0];
		
		for (int i=0; i<data.length; i++)
		{
			if (data [i] < kleinsterWert)
			{
				kleinsterWert = data [i];
			}
		}
		return kleinsterWert;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		ArrayList <Integer> neuer = new ArrayList <Integer> ();
		
		for (int i=0; i<data.length; i++)
		{
			if (data [i] > threshold)
			{
				neuer.add (data [i]);
			}
		}
		
		if (neuer.size () == 0)
		{
			return new int [0];
		}
		else
		{
			int [] neu = new int [neuer.size ()];
			
			for (int i=0; i<neuer.size(); i++)
			{
				neu [i] = neuer.get (i);
			}
			
			return neu;
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
