import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
      data = new int[0];
	}
	public void addValue(int value) {
int[] data2 = new int[data.length+1];
for (int i = 0; i<data.length;  i++){
	data2[i]=data[i];
}
data2[data2.length-1]=value;
data = data2;
	}

	public void addValues(int[] values) {

int[] data2 = new int[data.length+values.length];
for (int i = 0; i<data.length; i++){
data2[i] = data[i];
									}
for (int j = data.length; j<data2.length; j++){
	data2[j] = values[j-data.length];
	
}
	data = data2;
	}

	public int getMinimumValue() {
		int vergleich = Integer.MAX_VALUE;
		for (int i = 0; i<data.length; i++){
		if(data[i]<vergleich){
			vergleich = data[i];
		}
		}
		
		return vergleich;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int counter=0;
		int[] speicher2 = new int [1];
		
		
		for(int i = 0; i<data.length; i++){
		if(data[i]>threshold){
			counter++;
							}
		
										  }
		
		if(counter>0){
		int[] speicher = new int[counter];
		for (int j=0, k = 0; j<data.length; j++){
			if( data[j]>threshold){
				speicher[k]=data[j];
				k++;
							  }
						}
	return speicher;
		}
		
		
		else return speicher2;
		
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
