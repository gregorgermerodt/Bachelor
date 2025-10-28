import java.util.Arrays;

public class Measurement {

	private int[] data,hilf;

	public Measurement() {
		data = new int [0];
	}

	public void addValue(int value) {
		hilf =new int [data.length];
		hilf=data;
		data = new int[data.length+1];
		int f=data.length;
		for (int i=0; i< hilf.length; i++)
			 {
				data[i]=hilf[i];
				
			}
		data[f-1]=value;		
			}
	public void addValues(int[] values) {
		hilf =new int [data.length];
		hilf=data;
		data = new int[data.length+values.length];	
		int  f=0;
		for (int i=0 ; i< hilf.length; i++)
		 {
			data[i]=hilf[i];
			f++;
		}
		
		for (int j=0; j<values.length; j++)
		{
			data[f]=values[j];
			f++;
		}
	}

	public int getMinimumValue() {
		int mini,hilf,i;
		mini=data[0];
		for (i=0; i<data.length; i++)
		{
			hilf=data[i];
			if (data[i]<mini) {
				mini=hilf;
			}
		}
		return mini;
		
		
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int hilf,j;
		int[]drueber,hilf2;
		drueber=new int[data.length];
		j=0;
		for (int i=0; i<data.length; i++)
		{
			hilf=data[i];
			if (hilf>threshold) {
				drueber[j]=hilf;
				j++;
			}
			
		}
		hilf2=new int[j];
		
		for  (int i=0; i<j; i++)
		{
			hilf2[i]=drueber[i];
		}
		
		return hilf2;
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
