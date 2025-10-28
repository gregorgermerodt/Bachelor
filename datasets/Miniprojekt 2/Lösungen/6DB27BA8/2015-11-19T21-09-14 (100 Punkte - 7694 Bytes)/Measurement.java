import java.util.ArrayList;
import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0];
	}
	

	public void addValue(int value) {
		int[] newdata = new int[data.length+1];
		for(int i =0;i<data.length;i++)
		{
			newdata[i]=data[i];
		}
		newdata[data.length]=value;
		data=newdata;
	}

	public void addValues(int[] values) {
		int[] newdata = new int[data.length+values.length];
		for(int i =0;i<data.length;i++)
		{
			newdata [i]=data[i];
		}
		for(int i =0;i<values.length;i++)
		{
			newdata[i+data.length]=values[i];
		}
		data=newdata;
	}

	public int getMinimumValue() {
		int min = Integer.MAX_VALUE;
		for(int i:data)
		{
			if(i<min)
			{
				min=i;
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
/*int groesse =0; Dann Schleife um die Anzahl zu finden, dann zweite for Schleife mit zwei Laufvariablen*/
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i : data)
		{
			if(i>threshold)
			{	
				list.add(i);
			}
		}
		int[] newdata = new int[list.size()];
		for(int i=0;i<list.size();i++)
		{
			newdata[i]=list.get(i);
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
