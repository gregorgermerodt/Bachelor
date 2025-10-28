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
		int i=0, f=data.length;
		while (i< hilf.length)
			 {
				data[i]=hilf[i];
				i++;
			}
		data[f-1]=value;		
			}
	public void addValues(int[] values) {
		hilf =new int [data.length];
		hilf=data;
		data = new int[data.length+values.length];	
		int i=0, j=0;
		while (i< hilf.length)
		 {
			data[i]=hilf[i];
			i++;
		}
		
		while (j<values.length)
		{
			data[i]=values[j];
			i++;
			j++;
		}
	}

	public int getMinimumValue() {
		int mini,hilf,i;
		mini=123121;
		i=0;
		while (i<data.length)
		{
			hilf=data[i];
			if (hilf<mini) {
				mini=hilf;
			}
			i++;
		}
		return mini;
		
		
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int hilf,i,j;
		int[]drueber,hilf2;
		drueber=new int[data.length];
		i=0;
		j=0;
		while (i<data.length)
		{
			hilf=data[i];
			if (hilf>threshold) {
				drueber[j]=hilf;
				j++;
			}
			i++;
		}
		hilf2=new int[j];
		i=0;
		while (i<j)
		{
			hilf2[i]=drueber[i];
			i++;
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
