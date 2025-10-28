import java.util.Arrays;

public class Measurement {

	private int[] data = new int [0];

	public Measurement() {
		

	}

	public void addValue(int value) {
		if (data.length == 0){
			int [] a={value};
			data=a;
		}
		else{
		int []a =new int [data.length+1];
		for(int i=0; i<data.length;i++){
			a[i]=data[i];
			if(i==data.length-1){
				a[i+1]=value;
			}
			
		}
		data=a;
		}
		

	}

	public void addValues(int[] values) {
		if (data.length == 0){
			int [] a=values;
			data=a;
		}
		else{
		int [] a= new int[data.length+values.length];
		int index=0;
		for(int i=0; i<data.length;i++){
			a[i]=data[i];
			if(i==data.length-1){
				a[data.length+i+1]=values[index];
				index++;	
			}
			
		}
		data=a;
	}
	}
	public int getMinimumValue() {
		int min=data[0];
		for(int i=1; i<=data.length;i++){
			if(data[i]<min){
				min=data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		if(threshold==0){
			return null;
		}
		int x=0;
		for(int i=0; i<=data.length;i++){
			if(data[i]>threshold){
				x++;
			}
		}
		int index=0;
		int [] a= new int[x];
		for(int j=0; j<data.length;j++){
			if(data[j]>threshold){
				a[index]=data[j];
				index++;
			}
		}
		return a;
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
