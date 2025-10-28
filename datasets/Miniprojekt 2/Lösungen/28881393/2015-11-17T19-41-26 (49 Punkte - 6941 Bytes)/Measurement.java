import java.util.Arrays;

public class Measurement {

	private int[] data;


	public Measurement() {
		
		data = new int[0];
		

	}

	public void addValue(int value) {
		
		int[] neu = new int [data.length + 1 ];
		for (int index = 0; index < data.length; index++ ){
			neu[index] = data[index];
			
		}
		neu[neu.length - 1] = value;
		data = neu;
	}
		
		
		
	

	

	public void addValues(int[] values) {
		
		
		int[] hilfsarray = new int [data.length];
		
		
		for (int i = 0; i < data.length; i++) {
			hilfsarray[i] = data[i];
		}
		
		int neueLaenge = data.length + values.length;
		
		data = new int[neueLaenge];
		
		for (int j = 0; j < data.length; j++){
			data[j] = hilfsarray[j];
		}
		
		for (int k = 0; k < values.length;k++){
			data[hilfsarray.length + k] = values[k];
		}

	}

	public int getMinimumValue() {
		int hilfe = Integer.MAX_VALUE;
		
		for (int i=0; i < data.length;i++){
			
			
			if (data[i] <= hilfe){
				hilfe = data[i];
			}
		}
		
		return hilfe;
	}

	public int[] getValuesAboveThreshold(int threshold) {
	
		
		int hilfe = 0;

		for (int i = 0; i < data.length; i++){
			if(data[i] > threshold) {
				hilfe++;
		}
		}
		
		int[] loesung = new int[hilfe];
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
