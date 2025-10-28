import java.util.Arrays;

public class Measurement {

	
	private int[] data;

	
	public Measurement() {
		
	data = new int[0];	//wir machen ein neues Array mit der änge 0
	
	}
	

	public void addValue(int value) { // Parameter als Rückgabewert...in den Klammern steht immer, was man als Rückgabe erwarten
		
	
	int[] array = new int [data.length+1]; // neues Array gemacht 
	 
	for (int i = 0 ; i < data.length; i++) // schleife, welche das ganze array durchgehen muss.  data.lenght = länge des Array
	
	{ array[i] = data [i]; }
	
	array[data.length]= value;    // array an der Stelle data.length wird Wert Value hinzugefügt 
	data = array;                // ich mache ein neues Array und weise dieses dem alten hinzu ? 
	
	}

	public void addValues(int[] values) {
		
		int[] array = new int [data.length+ values.length]; // neues Array gemacht
		
		for (int i=0; i < data.length; i++) // schleife, welche das ganze array durchgehen muss.  data.lenght = länge des Array
		
		{ array[i] = data[i]; } // neu array an der stelle i = data an der stelle i 
		
		for (int i=0; i < values.length; i++)
			
		{ array [data.length+i] = values [i]; }
		
		data = array;
		
		}
	

  
	public int getMinimumValue() {
	
	
	int min = data [0];
		
	for (int i=0; i< data.length; i++) // das immer, damit er das Array durchläuft
		
	{        
	if ( data[i] < min) { 
		min = data[i];
	}
		
	}	
		return min;
	}

	
	
	public int[] getValuesAboveThreshold(int threshold) {
		
		int [] temp = new int [0] ; 
		for (int i=0; i < data.length; i++)
		
		{
		
		if (data[i] > threshold)
			
		{
			// mehtode von getValue
		
		int[] temp2= new int [temp.length+1];
		temp2 [temp.length]= data[i];
		for ( int j = 0; j < temp.length; j++)
		{ 
			temp2[j]= temp[j];
			
		}
		temp = temp2;	
		}
		
		}
		
		return temp;
		
	}

	// --------------------------------------------------------------------------------------------------------------
	
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
