import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() 
	{
		data = new int[0];
	}

	public void addValue(int value) 
	{
		int data2[] = new int[(data.length+1)];
		for(int i=0; i<data.length; i++)
		{
			data2[i] = data[i];
		}
		data2[(data2.length-1)] = value; //data.length -1, weil length die Stellen zaehlt, das Array aber bei 0 beginnt!	
	}

	public void addValues(int[] values) {

	}

	public int getMinimumValue() 
	{
		int kleinstes;
		kleinstes = Integer.MAX_VALUE;
		
		if(data != null)
		{
			for (int i=0; i < data.length; i++)
			{				
				if(data[i]<kleinstes)
				{
					kleinstes = data[i];
				}
			}
		}
		
		return kleinstes;
	}

	public int[] getValuesAboveThreshold(int threshold) 
	{
		int ergebnis[] = new int[Integer.MAX_VALUE];
		
		if(data != null)
		{
			for (int i=0; i<data.length; i++)
			{
				if(data[i] > threshold)
				{
					for(int k=0; k<ergebnis.length; k++)
					{
						ergebnis[k] = data[i];
					}
				}
			}
		}
		
		return ergebnis;
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
