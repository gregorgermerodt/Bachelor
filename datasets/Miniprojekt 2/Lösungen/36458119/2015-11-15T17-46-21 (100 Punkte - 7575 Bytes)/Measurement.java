import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		this.data= new int[0];

	}

	public void addValue(int value) {
		int[] temp = new int[data.length+1];
		for (int i=0;i<data.length; i++ )
		{
			temp[i]=data[i];
		}
			temp[temp.length-1]=value;
			data=temp;
		
	}

	public void addValues(int[] values) {
		int[] data2= data;
		this.data = new int[data2.length+values.length];
		for (int i=0;i<data.length; i++ )
		{
			if (i<data2.length) 
			{
				data[i]=data2[i];
			}
			
			if(i==data2.length)
			{
				for (int j=0; j<values.length; j++)
				{
					data[i]=values[j];
					i++;
				}
			}
			else continue;
		}
	}

	public int getMinimumValue() {
		int min=data[0], temp=0;
		
		for (int i=1; i<data.length;i++)
		{
			temp=data[i];
			if (temp<min) min=temp;
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int count=0;
		for (int i=0; i<data.length; i++)
		{
			if (data[i]>threshold)
			{
				count++;
			}
		}
		int[] data2 = new int[count];
		int j=0;
		for (int i=0; i<data.length; i++)
		{
			if(threshold<data[i] && j<=count)
			{
				data2[j]=data[i];
				j++;
			}
		}

		return data2;
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
