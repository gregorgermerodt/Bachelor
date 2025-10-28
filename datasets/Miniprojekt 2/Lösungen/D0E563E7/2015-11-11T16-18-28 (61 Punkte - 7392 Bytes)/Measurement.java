import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data=new int [0];
	}

	public void addValue(int value) {
		int [] a=new int[data.length+1];
		for(int i=0;i<a.length;i++)
		{
			if(i<=data.length)
			{
				a[i]=data[i];
			}
			else
			{
				a[i]=value;
			}
		}
	}

	public void addValues(int[] values) {
		int c=0;
		int [] a=new int[data.length+values.length];
		for(int i=0;i<data.length;i++)
		{
			a[i]=data[i];
		}
		for(int j=data.length;j<a.length;j++)
		{
			a[j]=values[c];
			c++;
		}
		for(int t=0;t<data.length;t++)
		{
	}
}
	

	public int getMinimumValue() {
		int min=data[0];
		for(int i=0;i<data.length;i++)
		{
			if(min>data[i])
			{
				min=data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int [] a=new int[0];
		int b=0;
		int leer=0;
		int bigger=0;
		for(int i=0;i<data.length;i++)
		{
			if(data[i]==0)
			{
				leer++;
			}
			else if(data[i]>threshold)
			{
				bigger++;
			}
		}
		if(bigger==0 || leer==data.length)
		{
			return a;
		}
		int[]c=new int[bigger];
		
		for(int j=0;j<data.length;j++)
		{
			if(data[j]>threshold)
			{
				c[b]=data[j];
				b++;
			}
		}
		return c;
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
