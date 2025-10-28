import java.util.Arrays;

public class Measurement {

	private int[] data;

	public  Measurement() {
	data= new int[0];
		

	}

	public void addValue(int value) {
		int t[]=new int[data.length];
		int a=data.length;
		for(int i=0;i<data.length;i++){
			t[i]=data[i];
		}
		data=new int[a+1];
		data[data.length-1]=value;
		for(int i=0;i<data.length;i++){
			data[i]=t[i];
		}
		
		
		
	}

	public void addValues(int[] values) {
		
		int a=data.length;
		int t[]=new int[a];
		for(int i=0;i<data.length;i++){
			t[i]=data[i];
		}
		data=new int[a+values.length];
		for(int k=0;k<t.length;k++){
			data[k]=t[k];
		}
		for(int n=0;n<values.length;n++){
			data[a+n]=values[n];
		}
		
	}

	public int getMinimumValue() {
		int minimum=data[0];
	
		for(int i=1;i<data.length;i++){
			if(minimum>data[i])
				minimum=data[i];
		}
		return minimum;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int t[]= new int[data.length];
		int n=0;
		for(int i=0;i<data.length;i++){
			if(data[i]>threshold){
			t[n]=data[i];
			n++;		
				
			}
		}
		if(n==0){data=new int[0];
		}
		
		else
		data=new int[data.length-n];
		for(int k=0;k<data.length;k++){
			data[k]=t[k];
		}
		
		return data;
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
