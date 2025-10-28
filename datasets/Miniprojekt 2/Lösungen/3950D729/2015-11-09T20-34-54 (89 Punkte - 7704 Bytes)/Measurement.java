import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		
		int zdata[] = new int[data.length+1];
		zdata[zdata.length-1] = value;
		data = zdata;
	}

	public void addValues(int[] values) {
		int zdata[] = new int[data.length+values.length];
		for(int i = 0;i<zdata.length;i++)
		{
			if(i < data.length)
			{
				zdata[i] = data[i];
			}
			else if(i < zdata.length)
			{
				zdata[i] = values[i-data.length];
			}
		}
		data = zdata;
	}

	public int getMinimumValue() {
		if(data != null)
		{
			int ret = data[0];
			for(int i = 0;i<data.length;i++)
			{
				if(ret > data[i])
				{
					ret = data[i];
				}
			}
			return ret;
		}
		else return 0;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int length = 0;
		for(int i = 0;i<data.length;i++)
		{
			if(data[i]>threshold)
			{
				length++;
			}
		}
		int ret[] = new int[length];
		int it = 0;
		for(int i = 0;i<data.length;i++)
		{
			
			if(data[i]>threshold)
			{
				ret[it] = data[i];
				it++;
			}
		}
		if(length == 0)
		{
			return new int[0];
		} else return ret;
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
