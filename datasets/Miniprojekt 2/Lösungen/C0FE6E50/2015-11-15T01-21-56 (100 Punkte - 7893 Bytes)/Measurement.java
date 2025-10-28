import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data=new int[0];

	}

	public void addValue(int value) {
		int[] newdata=new int[data.length+1];
		System.arraycopy(data, 0, newdata, 0, data.length);
		newdata[data.length]=value;
		data=newdata;
	}

	public void addValues(int[] values) { 
		int[] newdata=new int[data.length+values.length];
		System.arraycopy(data, 0, newdata, 0, data.length);
		System.arraycopy(values, 0, newdata, data.length, values.length);
		data=newdata;

	}
 
	public int getMinimumValue() {
		int []a=new int[data.length];
		System.arraycopy(data, 0, a, 0, data.length);
		
		Arrays.sort(a); 
		return a[0];
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] newdata=new int[0];
        int i=0; int j=0;
        while(i<=data.length-1)
        {
        	if(data[i]>threshold)
        	{
        		j++;
        		newdata=new int[j];
        		i++;
        	}
        	else
        		i++;
        }
        int k=0; int l=0;
        while(k<=data.length-1)
        {
        	if(data[k]>threshold)
        	{
        		newdata[l]=data[k];
        		l++;
        		k++;
        	}
        	else
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
