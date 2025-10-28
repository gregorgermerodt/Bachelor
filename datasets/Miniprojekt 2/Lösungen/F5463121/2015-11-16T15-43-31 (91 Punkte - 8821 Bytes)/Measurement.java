import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() 
	{
		data = new int[0];
	}

	public void addValue(int value) 
	{
		int[] array = new int[data.length+1]; //neuer, vergrößerter Array wird erstellt
		
		for(int i = 0; i < data.length; i++) //Array bekommt Werte von data
		{ 
			array[i] = data[i];
		}
		
		array[data.length] = value; //Array bekommt an letzter Stelle value (Messwert) zugeordnet
		
		data = array; //Attribut data wird nun array
	}

	public void addValues(int[] values) 
	{
		for(int i = 0; i < values.length; i++) //Der Array values wird durchgangen und jeder Wert wird
		{ 
			this.addValue(values[i]); 			//mit der Methode addValue an den Array data angehängt
		}
	}

	public int getMinimumValue() 
	{
		int min = data[0]; //erste Wert vom Array data wird der Variable min zugeschrieben
		
		for(int i = 0; i < data.length; i++) //vergleich von Wert min mit jeden anderen Wert von data
		{ 
			if(data[i] < min) //falls Wert kleiner als min, dann wird er das neue min
			{ 
				min = data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) 
	{
		int[] array = new int[0];
		
		if( data != null) //wenn data leer, wird leerer Array zurückgegeben, sonst normal weiter
		{
			for(int i = 0; i < data.length; i++) //data wird durchgegangen
			{
				if(data[i] > threshold) //wenn Element größer ist als threshold
				{
					int[] initArray = new int[array.length+1]; //Hilfsarray wird erstellt mit größerer Menge als array
					for(int j = 0; j < array.length; j++) //Werte von array werden initArray übergeben + threshold
					{
						initArray[j] = array[j];
					}
					initArray[array.length] = data[i];
					
					array = initArray;
				}
			}
		}
		return array;
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
