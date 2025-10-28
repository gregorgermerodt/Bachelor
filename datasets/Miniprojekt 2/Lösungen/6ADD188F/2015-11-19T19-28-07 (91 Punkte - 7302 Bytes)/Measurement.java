import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
    data = new int [0];
	}

	public void addValue(int value) {
		
		int[]neuerWert = new int[data.length+1];
				
				for(int i=0; i<neuerWert.length; i++)
				{
					if(i==data.length)	neuerWert[i]=value;
						else	neuerWert[i]=data[i];
				}
				
		data=neuerWert;
	}

	public void addValues(int[] values) {
		
		int[]neuerWert=new int[data.length+values.length];
		
		for(int i=0; i<=data.length; i++){
			if(i==data.length){
				for(int j=i, k=0; j<neuerWert.length; j++, k++){
					neuerWert[j]=values[k];
				}
			}
				else neuerWert[i]=data[i];
		
		
		}
		data=neuerWert;

	}
	

	public int getMinimumValue() {
		
		int min=data[0];
		
		for(int i=0; i< data.length; i++)
			if(data[i]<min)
				min=data[i];
		
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int[]temp=new int[data.length];
				int x=0;
				
				for(int i=0; i<data.length; i++)
					if(data[i]>threshold){
						temp[x]=data[i];
						x++;
					}
				
				int[]temp2=new int[x];
				for(int i=0;i<x;i++)
					temp2[i]=temp[i];
		
		
		return temp2;
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
		System.out.println("Hinzuf�gen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzf�gen einer Menge von Werten. m:");
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
		System.out.println("Messwerte �ber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte �ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
