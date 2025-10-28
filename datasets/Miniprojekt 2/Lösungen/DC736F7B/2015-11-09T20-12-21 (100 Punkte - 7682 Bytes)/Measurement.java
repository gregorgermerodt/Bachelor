import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data= new int[0];

	}

	public void addValue(int value) {
		int[] vergleich=new int [data.length];
		for(int i=0;i<data.length;i++){
			vergleich[i]=data[i];
		}
		data=new int [data.length+1];
		for(int j=0;j<vergleich.length;j++){
			data[j]=vergleich[j];
		}
		data[data.length-1]=value;

	}

	public void addValues(int[] values) {
		int hilf=data.length;
		int [] vergleich=new int [data.length+values.length];
		for(int i=0;i<data.length;i++){
			vergleich[i]=data[i];
		}
		for(int j=0;j<values.length;j++){
			vergleich[hilf]=values[j];
			hilf++;
		}
		data= new int [data.length+values.length];
		for(int a=0;a<vergleich.length;a++){
			data[a]=vergleich[a];
		}

	}

	public int getMinimumValue() {
		int res=data[0];
		for(int i=0;i<data.length;i++){
			if(data[i]<res)res=data[i];
		}
		return res;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int vergleich=0;
		for(int i=0;i<data.length;i++){
			if(data[i]>threshold)vergleich++;
		}
		int [] res;
		res= new int [vergleich];
		int vergl=0;
		
		for(int j=0;j<data.length;j++){
			if(data[j]>threshold){
				res[vergl]=data[j];
				vergl++;
			}
		}
		
		return res;
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
