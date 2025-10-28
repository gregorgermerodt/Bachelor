import java.util.Arrays;

public class Measurement {

	private int[] data;
	private int[] data2;

	public Measurement() {
		data = new int[0];

	}

	public void addValue(int value) {
		data2  = new int[data.length];
		data2 = data.clone();
		data = new int[data2.length+1];
		for (int i = 0;i < data2.length;i++)
		{
			data[i]=data2[i];
		}
		data[data.length-1] = value; 

	}

	public void addValues(int[] values) {
		data2 = new int[data.length];
		data2 = data.clone();
		data = new int [data.length + values.length];
		for (int i = 0;i < data2.length;i++)
		{
			data[i]=data2[i];
		}
		for (int i = 0 ; i < values.length; i++ )
		{
			data[data.length-1-i]=values[values.length-1-i];
		}

	}

	public int getMinimumValue() {
		int min  = 999999999 ;
		for (int i = 0; i < data.length;i++)
		{
			if (data[i]<min)
			{
				min = data[i];
			}
		}
		
		
		
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int zaeler = 0;
		for (int i = 0; i<data.length; i++)
		{
			if( data[i] > threshold)
			{
				zaeler++;
			}
		}
		int[] above = new int[zaeler];
		int pos = 0;
		for (int i = 0; i<data.length; i++)
		{
			if( data[i] > threshold)
			{
				above[pos]=data[i];
				pos++;
			}
		}
		return above;
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
