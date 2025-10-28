import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];

	}

	public void addValue(int value) {
		
	 int [] k = new int [data.length];
	 k= data;
	 data= new int[k.length+1];
	 for (int i=0;i<k.length;i++)
	 {data[i]=k[i];
		 
	 }
	 data[data.length-1] = value;
	 /*int[] neu = new in[data.length+1]
	  * for (int i=0;i<data.length;i++)
	  * 	{neu[i]=data[i]
	  * 	}
	  * neu[neu.length-1] =value;
	  * data=neu;
	  */
	 

	}

	public void addValues(int[] values) {
		int[] t = new int [data.length];
				t=data;
		data = new int [t.length+values.length];
				for (int i=0;i<t.length;i++)
				{
					data[i]=t[i];
				}
	
		for (int k=0;k<values.length;k++)
			{data[t.length +k]= values[k];
			
			}
		/*for ( int i=data.length;i<data.length+values.length;i++)
		 * 		{	neu[i]=values[index-data.length]
		 * 		}
		 * 
		 */
				
		

	}

	public int getMinimumValue() {
		int minimum = Integer.MAX_VALUE;
		for (int i=0; i<data.length;i++)
			if(data[i]<minimum)
				minimum = data[i];
		return minimum;
		
		/* int min= Interger.MAX_VAlUE;
		 * for (int i=0;i<data.length;i++)
		 * 	if (data[i]<min)
		 * 		min = data[i]
		 * 
		 * return min;
		 * 
		 */
	}

	public int[] getValuesAboveThreshold(int threshold) {
		//übung vorlesung
		int grosse=0;
		for(int i=0;i<data.length;i++)
		{ if (data[i]>threshold)
			{grosse++;
			
			}}
		int[] neu = new int[grosse];
		for (int indexData =0,indexNeu = 0 ;indexNeu < neu.length;indexData++)
			{if (data[indexData]>threshold)
				{neu[indexNeu] =data[indexData];
				indexNeu++;
				
				}
			
			}
		
		return neu;
		}
		
		/*int[] t = new int[data.length];
		int n=0;
		for (int i=0;i<data.length;i++)
		{if (data[i]>threshold)
			{t[n]=data[i];
			n++;
			
			}
		}
		if (n==0)
			{data= new int[0];
			
			}
		else {
					for(int i=0;i<t.length;i++)
					{data[i]=t[i];
				
					}
			}
		
		
		return data; 
		*/
	

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
