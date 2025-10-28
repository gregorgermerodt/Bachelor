import java.util.Arrays;

public class Measurement {

	private int[] data;
	private int[] data3;

	public Measurement() {
		data = new int[0];

	}

	public void addValue(int value) {
    int[] hilfsarray = new int[data.length+1];
    for ( int i=0; i<data.length; i++){
    	hilfsarray[i]=data[i];
    }
    hilfsarray[hilfsarray.length-1]=value;
    data = hilfsarray;
    }

	public void addValues(int[] values) {
		for (int i =0; i<values.length; i++){
			addValue(values[i]);
		}
	}

	public int getMinimumValue() {
		int zw =1000;
		for ( int i = 0; i<data.length; i++){
			if(data[i]<zw){
				zw = data[i];
			}
		}
		return zw;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int laenge = 0 ;
		for (int i=0; i< data.length; i++){
			if(i>threshold){
				++laenge;
			}
		}
		if (laenge!=0){
		data3= new int[laenge];
		int j = 0 ; 
		for ( int k = 0; k<data.length; k++){
			if(data[k]>threshold){
				data3[j]=data[k];
				j++;
			}
		}
		}
		else {
			
			data3= new int[laenge];
		}
		return data3;
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
