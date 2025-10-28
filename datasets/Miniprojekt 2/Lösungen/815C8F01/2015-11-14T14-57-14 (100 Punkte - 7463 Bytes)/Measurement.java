import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int x = data.length;
		int[] datanew = new int[x+1];
		datanew = data;
		data = new int[x+1];
		for(int i=0;i<x;i++)
			data[i]=datanew[i];
		data[x] = value;
	}

	public void addValues(int[] values) {
		int x = data.length;
		int y = values.length;
		int[] datanew = new int[x+y];
		datanew = data;
		int k = 0;
		data = new int[x+y];
		for(int i=0;i<x;i++)
			data[i]=datanew[i];
		for(int i=x;i<x+y+1;i++)
			while(k<y){
			data[i]=values[k];
			k = k+1;
			break;
			}
	}

	public int getMinimumValue() {
		int a = data[0];
			for(int i=0;i<data.length;i++)
				if(a>data[i])
					a = data[i];
		return a;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] returnarray = new int[0];
		int x = 0;
		int k = 0;
		for(int i=0;i<data.length;i++)
			if(data[i]>threshold){
				x=x+1;}
		int[] thresarray = new int[x];
		for(int i=0;i<data.length;i++)
			if(data[i]>threshold){
				thresarray[k]=data[i];
				k=k+1;
	}
		if(thresarray.length>0){
			returnarray=thresarray;
		}
		return returnarray;
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
