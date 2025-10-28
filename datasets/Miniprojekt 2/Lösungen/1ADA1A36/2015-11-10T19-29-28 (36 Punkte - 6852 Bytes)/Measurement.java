import java.util.Arrays;

public class Measurement 
{

	private int[] data;

	public Measurement() 
	{
		data= new int[0];
	}

	public void addValue(int value) 
	{
		data = new int[data.length+1]; //neue Länge +1Value
		
		data[data.length-1]=value;
				
	}

	public void addValues(int[] values) 
	{
		data= new int[(values.length-1)+data.length]; // neue Länge +ArrayValues
		int i=0;
		int j=0;
		
		//data[((values.length-1)+data.length)-i]=values[values.length-i];
		
		while(i<data.length && j<values.length)
		{
			data[i]= values[j];
			
			i++;
			j++;
		} 		
	}

	public int getMinimumValue() 
	{
		int b=data[0];
		for(int i=0; i<data.length-1; i++)
		{
			if(data[i]<b)
			{
				b=data[i];
			}
		}
		return b;
	}

	public int[] getValuesAboveThreshold(int threshold) 
	{
		int i=0;
		int j=0;
		int[] newdata;
		newdata = new int[data.length];
		
		while(data[i]<data.length)
		{
			if(data[i]>threshold)
			{
				data[i]=newdata[j];
				j++;
				i++;
			}
			i++;
			j++;
		}
		
		return newdata;
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
