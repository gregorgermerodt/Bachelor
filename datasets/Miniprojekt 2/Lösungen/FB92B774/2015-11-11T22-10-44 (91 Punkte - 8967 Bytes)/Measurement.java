import java.util.Arrays;
//FÜR PRIMITIVE DATENTYPEN gibt es KEIN nullH
public class Measurement {

	private int[] data;

/**1a)*/
	public Measurement()	//Constructor 
	{	
		this.data = new int[0];
	}

/**1b)*/
	public void addValue(int value) 
	{
		int[] neu = new int[data.length +1]; //0. Schritt neues & größeres Array erstellen
		for(int i=0; i<data.length; i++) //1. Schritt kopieren
		{
			neu[i] = data[i];
		}
		neu[neu.length - 1] = value; 
		data = neu;
	}
	
/**1c)*/
	public void addValues(int[] values) 
	{
		for(int i = 0; i < values.length; i++)
		{
			addValue(values[i]);
		}
		
		
	}

/**1d)*/
	public int getMinimumValue() 
	{
		int min=data[0];
		
		for(int i=0; i < data.length; i++)
		{
			if(data[i] <= min) min=data[i];
		}
		return min;
		
	}

/**1e)*/
	public int[] getValuesAboveThreshold(int threshold) 
	{
		int zaehler = 0;					//1. Schritt
		for(int i = 0; i<data.length; i++)
		{
			if(data[i] > threshold) zaehler++;
		}
		 									
							
		int[] result = new int[zaehler];	// 2. Schritt
		
		
		
		int fillIndex = 0;					//3. Schritt
		for(int i = 0; i<data.length; i++)
		{
			if(data[i] > threshold) 
				{
				result[fillIndex] = data[i];
				fillIndex++;	//nur dann für das nächste Element erhöhen, wenn aktueller Wert tatscählich größer ist.
				}
		}
		
		return result;
		
		
		
	}

	// --------------------------------------------------------------
	
	public void printData() 
	{
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
