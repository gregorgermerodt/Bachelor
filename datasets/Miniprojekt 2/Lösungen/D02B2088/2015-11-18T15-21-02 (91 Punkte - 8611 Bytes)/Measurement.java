import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int[] temp = new int[data.length+1];
		for(int i = 0; i < data.length; i++)
		{
			temp[i] = data[i];
		}
		temp[data.length] = value;
		data = temp;
	}

	public void addValues(int[] values) {
		int[] temp = new int[data.length + values.length];
				for(int i = 0; i < data.length; i++)
				{
					temp[i] = data[i];
				}
		for(int j = data.length, k = 0; k < values.length; j++, k++)
		{
			temp[j] = values[k];
		}
		data = new int[temp.length];
		data = temp;
		
	}
	
	public void addValues2 (int[] values){					//for each schleife mit methodenzugriff: alternative
		for(int index : values)
		{
			addValue(values[index]);
		}
	}

	public int getMinimumValue() {
		int min = Integer.MAX_VALUE;
		for (int index = 0; index < data.length; index++)
		{
			if(data[index] < min)
			{
				min = data[index];
			}
		}
			return min;
		
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int zaehler = 0;
		for(int index = 0; index < data.length; index++)
		{
			if(data[index] > threshold)
			{
				zaehler++;
			}
		}
		int[] valuesAbove = new int[zaehler];
		for(int index = 0, zaehler2 = 0; index < data.length; index++)
		{
			if(data[index] > threshold)
			{
			valuesAbove[zaehler2] = data[index];
			zaehler2++;
			}
		}
		return valuesAbove;
	}
	
	public int[] getValuesAboveThreshold2(int threshold) {
		int[] temp = new int[0];
		for(int index = 0; index < data.length; index++)
		{
			if(data[index] > threshold)
			{
				int[] tempNeu = new int[temp.length+1];
				for(int i = 0; i < temp.length; i++)
				{
					tempNeu[i] = temp[i];
				}
				tempNeu[tempNeu.length-1] = data[index];
				temp = tempNeu;
			}
		}
		return temp;
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
