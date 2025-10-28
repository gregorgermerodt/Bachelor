import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {

		this.data = new int [0];
	}

	public void addValue(int value) {
		int [] speicher = new int[data.length];
		for(int i = 0; i < data.length; i++)
		{
			speicher[i] = data[i];
			
		}
	
		data = new int[data.length+1];
		
		for(int j = 0; j < speicher.length;j++)
		{
			data[j] = speicher[j];
		}
		
		data[data.length-1] = value;
		
	}

	public void addValues(int[] values) {
		int speicher[] = new int[data.length];
		for(int i = 0; i < data.length; i++)
		{
			speicher[i] =data[i];
		}
		
		data = new int[data.length + values.length];
		
		for(int j = 0; j < speicher.length; j++)
		{
			data[j] = speicher[j];
		}
		
		for(int a = 0; a < values.length; a++)
		{
			data[speicher.length + a] = values[a];
		}

	}

	public int getMinimumValue() {
		int kleinster = data[0];
		for(int i = 0; i < data.length; i++)
		{
			if(data[i] < kleinster)
			{
				kleinster = data[i];
			}
		}
		
		return kleinster;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int count = 0;
		for(int i = 0; i < data.length; i++)
		{
			if(data[i] > threshold)
			{
				count++;
			}
		}
		int [] speicher = new int [count];
		int a = 0;
		for(int j = 0; j < data.length; j++)
		{
			if(data[j] > threshold)
			{
				speicher[a] = data[j];
				a++;
				
			}
		}
		
		return speicher;
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
