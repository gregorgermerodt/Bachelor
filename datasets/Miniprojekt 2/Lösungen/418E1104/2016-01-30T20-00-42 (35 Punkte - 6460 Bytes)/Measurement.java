import java.util.Arrays;

public class Measurement {

	private int[] data;
	


	public Measurement() {
		
		data=new int [0];
	}

	public void addValue(int value) {
		if (data.length!=0){
			int []data2=new int [data.length+1];
		int i=0;
		for (i=0; i<data.length; i++){
			data2[i]=data[i];
		}
		data2[i]=value;
		data=data2;
	}}

	public void addValues(int[] values) {
		if (data.length!=0){int data2[]= new int [data.length+values.length];
		int i;
		for(i=0;i<data.length;i++){
			data2[i]=data[i];
		}
		for(i=i;i<values.length+data.length;i++)
		{data2[i]=values[i-values.length];}

		data=data2;}
	}
	public int getMinimumValue() {
	   
		int min= 0;
		for (int i=0; i<data.length;i++)
		{if (data[i]<min){
		min=data[i];}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		if (data.length!=0)
			{int k=0;
			int data2 []=new int [data.length];
			for (int i=0; i<data.length;i++)
			{
				if(data[i]>threshold)
				{
					data2[k]=data[i]
				;k++;}
			}
			data2=new int[k-1];
			return data2;
			} else{return null ;
	}}

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
