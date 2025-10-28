import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int [0];

	}

	public void addValue(int value) {
		data = new int [data.length+1];
		data [data.length-1] = value;

	}

	public void addValues(int[] values) {
		int [] bob = new int [data.length+values.length];
		int b=0;
		for(int i=0;i<data.length;i++)
		{
			bob[i]=data[i];
		}
		for(int i=data.length;i<values.length;i++)
		{
			
			bob[i]=values[b];
			b++;
		}
		data=bob;

	}

	public int getMinimumValue() {
		int min= data[0];
		for(int i=1;i<data.length;i++)
		{
			if(min>data[i])
			{
				min=data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] bob = new int[0];
		for(int i=0;i<data.length;i++)
		{
			if(data[i]>threshold)
			{
				int[] temp=bob;
				bob= new int[bob.length+1];
				for(int j=0;j<temp.length;j++)
				{
					bob[j]=temp[j];
				}
				bob[bob.length-1]=data[i];
			}
		}
		return bob;
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
