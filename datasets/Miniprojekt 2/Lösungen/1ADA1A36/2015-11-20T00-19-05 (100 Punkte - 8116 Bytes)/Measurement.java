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
		//Array Laenge nicht einfach vergroessern deshalb neues Array
		int[] tempdata = new int[data.length+1]; //neue Länge +1Value
				//int[] tempdata = new int[data.length+1];
		
		for(int i= 0; i<data.length; i++)
		  {
		  tempdata[i]= data[i];
		  }
		
		  tempdata[tempdata.length-1]=value;
		  data= tempdata; 				
	}
	

	public void addValues(int[] values) 
	{
		int[] tempdata= new int[(values.length)+data.length]; // neue Länge +ArrayValues
		
		for (int i=0; i<data.length; i++)
		  {
		  tempdata[i]=data[i];
		  }
		  		for(int j= data.length, i=0; j<tempdata.length; j++, i++ )
		  		{
		  		tempdata[j]=values[i];
		  		}
		  data= tempdata; 				  		 
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
		int groesse=0;
		  for(int i=0; i<data.length;i++)
		  {
		  		if(data[i]> threshold)
		  		{
		  		groesse++;
		  		}
		  }
		  int[] tempdata = new int[groesse];
		  
		 
		  for(int j= 0, k=0; j< data.length; j++)
		  {
		  		if(data[j]> threshold)
		  		{
		  		tempdata[k]=data[j];
		  		k++;
		  		}
		  }
		  
		data=tempdata;
		
		return data;
				
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
