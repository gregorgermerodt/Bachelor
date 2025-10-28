import java.util.Arrays;

public class Measurement {

	private int[] data;
	private int[] dataneu;
	private int[] dataabove;
	private int minVal;
	private int count;


	public Measurement() 
	{
		data = new int[0];
	}

	public void addValue(int value) 
	{		
		dataneu = new int[data.length+1];
		dataneu[data.length]= value;
		data = dataneu;
	}

	public void addValues(int[] values) 
	{
		dataneu = new int[data.length+values.length];
		for (int i = 0;i<data.length;i++) 
		{
			dataneu[i]= data[i];
		}
		for (int j = data.length;j<(data.length+values.length);j++) 
		{
			dataneu[j]= values[j-data.length];
		}
		data = dataneu;
	}

	public int getMinimumValue() 
	{
		minVal=data[0];
		for (int i=1;i<data.length;i++)
		{
			if (data[i]<=minVal)
			{
				minVal=data[i];
			}
		}
		return minVal;
	}

	public int[] getValuesAboveThreshold(int threshold) 
	{
		count=0;
		for (int i=0;i<data.length;i++)
		{
			if (data[i]>threshold)
			{
				count++;
			}
		}
		dataabove = new int[count];
		
		count=0;
		for (int i=0;i<data.length;i++)
		{
			if (data[i]>threshold)
			{
				count++;
				dataabove[count-1] = data [i];
			}
		}
		return dataabove;
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
