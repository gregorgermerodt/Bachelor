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
		int [] temp_data;
		temp_data = new int[data.length];
		temp_data = data;
		
		data = new int[temp_data.length+1];
		
		for (int i=0; i< temp_data.length; i++)
		{
			data[i] = temp_data[i];
		}
		data[temp_data.length] = value;
	}

	public void addValues(int[] values) 
	{
		int [] temp_data;
		temp_data = new int[data.length];
		temp_data = data;
		int j=0;
		
		data = new int[temp_data.length+values.length];
		
		for (int i = 0; i < temp_data.length; i++)
		{
			data[i] = temp_data[i];
		}
		
		for (int i=temp_data.length; i < temp_data.length+values.length; i++)
		{
			data[i] = values[j];
			j++;
		}
	}

	public int getMinimumValue() 
	{
		return Math.min(data[0], data[1]);
	}

	public int[] getValuesAboveThreshold(int threshold) 
	{
		int [] data1;
		data1 = new int[1];
		if (this.data[1] > threshold)
		{
			data1 = this.data;
			return data1;
		}
		return data1;
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
