import java.util.Arrays;

public class Measurement 
{

	private int[] data;

	public Measurement() 
	{
		data = new int[0];
	}

	public void addValue(int value) 
	{
		int [] old_data;
		old_data = new int[data.length];
		old_data = data;					//
		
		data = new int[old_data.length+1];
		
		for (int i=0; i< old_data.length; i++)
		{
			data[i] = old_data[i];
		}
		
		data[old_data.length] = value;
	}

	public void addValues(int[] values) 
	{
		int [] old_data;
		old_data = new int[data.length];
		old_data = data;
		int j=0;
		
		data = new int[old_data.length+values.length];
		
		for (int i = 0; i < old_data.length; i++)
		{
			data[i] = old_data[i];
		}
		
		for (int i=old_data.length; i < old_data.length+values.length; i++)
		{
			data[i] = values[j];
			j++;
		}
	}

	public int getMinimumValue() 
	{
		int minimum = Integer.MAX_VALUE;
		for (int i=0; i < data.length; i++)
		{
			if (data[i] < minimum)
			{
				minimum = data [i];
			}
		}
		return minimum;
	}

	public int[] getValuesAboveThreshold(int threshold) 
	{
		int count = 0;
		int count2 = 0;
		
		for (int i=0; i< data.length; i++)
		{
			if (data[i]>threshold)
			{
				count++;
			}
		}
	
		int[] valuesAboveThreshold;
		valuesAboveThreshold = new int[count];
		
		for (int i=0; i<data.length; i++)
		{
			if (data[i]>threshold)
			{
				valuesAboveThreshold[count2]=data[i];
				count2++;
			}
		}
		return valuesAboveThreshold;
	}

	// --------------------------------------------------------------
	
	public void printData() 
	{
		System.out.println(Arrays.toString(data));
	}

	public static void main(String[] args) 
	{
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
