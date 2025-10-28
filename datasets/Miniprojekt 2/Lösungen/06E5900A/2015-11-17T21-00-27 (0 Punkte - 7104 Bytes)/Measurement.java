import java.util.Arrays;

public class Measurement {

	private int[] data; // 1 Dimensionales Int Array 
	
	/*Implementieren Sie den Konstruktor so, dass 
	 *data als neues int-Array mit der Länge 0 
	initialisiert wird. */
	public Measurement() {
	this.data = new int [0];	
	}
	/*Die Methode addValues(int value) nimmt einen Messwert value entgegen 
	 * und soll diesen als neuen Messwert an das 
	 * Ende des data-Arrays setzen. Erzeugen Sie dazu ein neues, 
	 * vergrößertes Array. */
	public void addValue(int value) {
		int [] groeßereArray = new int [data.length+1];
		for(int index =0; index < data.length;index++){
			groeßereArray[index]=data[index];
		}
		groeßereArray[groeßereArray.length-1]=value;
		data = groeßereArray;
	}

	public void addValues(int[] values) {
		int [] biggerArray = new int [data.length+values.length];
		int indexspeicher =0;
		for(int index =0;index < data.length;index++){
			biggerArray[index]=data[index];
			indexspeicher = index +1;
		}
		for(int j = 0;j<values.length;j++){
			biggerArray[indexspeicher]=values[j];
			indexspeicher++;
		}
		data = biggerArray;
	}

	public int getMinimumValue() {
		int min = Integer.MAX_VALUE;
		for(int index = 0; index < data.length;index++){
			if(min > data[index]){
				min = data[index];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int [] speicher = new int [data.length];
		int zaehler = 0;
		for(int index = 0; index < data.length;index ++){
			if (data[index]>threshold){
				speicher[zaehler] = data[index];
				zaehler++;
			}	
		}
		int [] rueckgabe = new int [zaehler];
		for(int j = 0; j<rueckgabe.length;j++){
			rueckgabe[j]=speicher[j];
		}
		return rueckgabe;
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
		System.out.println("HinzufÃ¼gen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("HinzuzfÃ¼gen einer Menge von Werten. m:");
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
		System.out.println("Messwerte Ã¼ber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte Ã¼ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
