import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		 data = new int[0];		

	}

	public void addValue(int value) {
		
		int[] hilfsA = new int[data.length+1];
		int i = 0;
		for(i = 0; i < data.length; i++)
		{
			hilfsA[i] = data[i];
		}
		hilfsA[data.length] = value;
		data = hilfsA;

	}

	public void addValues(int[] values) {
		int[] hilfsA = new int[data.length + values.length];
		for(int i = 0; i < (data.length); i++)
		{
			hilfsA[i] = data[i];
		}
		for(int o = data.length; o < values.length+data.length; o++)
		{
			hilfsA[o] = values[o-data.length];
		}
		data = hilfsA;
	}

	public int getMinimumValue() {
		
		int i;
		i = data[0] ;
		for (int o = 0; o < data.length; o++)
		{
			if(data[o]<i)
			{
				i = data[o];				
			}
		}
		return i;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int x = 0;
		for(int y = 0; y < data.length; y++)
		{
			if(data[y] > threshold)
			{
				x++;
			}
		}
		
		int [] hilfsC = new int [x];
		
		int u = 0;
		for(int i=0; i < data.length; i++)
		{
			if(data[i] > threshold)
			{
				hilfsC[u] = data[i];
				u++;
			}
		}
		
		if(hilfsC == null || data.length == 0)
		{
			int [] ausgabe = new int [0];
			return ausgabe;
		}
		else
		{
			return hilfsC;
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
