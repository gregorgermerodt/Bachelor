import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) 
	{
		int[] tmpData = new int[data.length+1];
		for(int a=0; a<data.length; a++)
		{
			tmpData[a] = data[a];
		}
		tmpData[data.length] = value;
		data = tmpData;
	}

	public void addValues(int[] values) 
	{
		int[] tmpData = new int[data.length+values.length];
		for (int a=0; a<data.length; a++)
		{
			tmpData[a] = data[a];			
		}
		for (int a=0; a<values.length; a++)
		{
			tmpData[a+data.length] = values[a];
		}
		data = tmpData;
	}

	public int getMinimumValue() 
	{
		int tmpValue = Integer.MAX_VALUE;
		for (int a=0; a<data.length; a++)
		{
			if (data[a] < tmpValue)
			{
				tmpValue = data[a];
			}
		}
		return tmpValue;
	}

	public int[] getValuesAboveThreshold(int threshold) 
	{
		int num = 0;
		for (int a=0; a<data.length; a++)
		{
			if (data[a] < threshold)
			{
				num ++;
			}
		}
		
		int[] bigger = new int[num];
		if (num > 0)
		{
			num = 0;
			for (int a=0; a<data.length; a++)
			{	
				if (data[a] > threshold)
				{
					bigger[num] = data[a];
					num ++;
				} 
			}
		}
		return bigger;
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
