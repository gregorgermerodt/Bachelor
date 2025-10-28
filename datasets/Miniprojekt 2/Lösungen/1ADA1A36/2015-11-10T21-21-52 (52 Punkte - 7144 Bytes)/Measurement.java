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
		int[] tempdata;
		tempdata = new int[data.length+1]; //neue Länge +1Value
		
		int a=0;		
		
		while(tempdata.length-a>0)
		{
			tempdata[data.length-a]=value;
			a++;
		} 
		data=tempdata;
				
	}

	public void addValues(int[] values) 
	{
		int[] tempdata;
		tempdata= new int[(values.length)+data.length]; // neue Länge +ArrayValues
		
		int i=0;
		int j=0;
		int k=data.length;
		
		int a=0;
		
		while(i<data.length || j<values.length)
		{
			tempdata[k]= values[j];
			
			i++;
			j++;
			k++;
		} 
		
		while(data.length-a>0)
		{
			tempdata[(data.length-a-1)]=data[(data.length-a-1)];
			a++;
		} 
		data=tempdata;
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
		int k=0;
		
		int[] newdata;
		newdata= new int[0];
		
		while(i<=data.length-1)
		{
			if(data[j]>threshold)
			{
				newdata= new int[newdata.length+1];
				newdata[j]=data[k];
				j++;
				i++;
				k++;
			}
			i++;
			k++;
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
