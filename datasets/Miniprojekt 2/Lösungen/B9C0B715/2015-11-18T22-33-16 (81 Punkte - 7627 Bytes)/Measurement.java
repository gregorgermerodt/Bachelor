import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0];
	}

	public void addValue(int value) {
		
		int[] array2 = new int[data.length+1];
		for(int i=0; i<data.length;i++){
			array2[i]=data[i];
			}
		array2[data.length-1] = value;
		data=array2;
		}
	

	public void addValues(int[] values) {
		int[] array2 = new int[data.length+ values.length];
		for(int i=0; i<data.length;i++ ){
			array2[i]=data[i];
		}
		for(int i=0; i<data.length + values.length;i++) {
			array2[i] = values[i - data.length];
		}
		data = array2;
	}

	public int getMinimumValue() {
		
			int min=Integer.MAX_VALUE;
			for(int i=0;i<data.length;i++){
				if(data[i] <= min){
					min = data[i];
				}
			} return min;
	}

	
	public int[] getValuesAboveThreshold(int threshold) {
		int zaehler = 0;
		for (int i = 0; i < data.length; i++){
			if(data[i] > threshold) {
				zaehler++;
		 }
		}
		int[] loesung = new int[zaehler];
		int counter = 0;
		for (int j = 0; j < loesung.length; j++)

		{
			while(counter < data.length)
			{

				if(data[counter] > threshold) 
				{
					loesung[j] = data[counter];
					counter++;
					break;
				}
				counter++;
			}

		}return loesung;
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
