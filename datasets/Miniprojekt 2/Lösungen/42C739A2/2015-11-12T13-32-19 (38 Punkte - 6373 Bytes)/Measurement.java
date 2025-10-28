import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
    data = new int[0];
	}

	public void addValue(int value) {
    int l = data.length;
    int[] puf = new int[l];
    
    for(int k=0; k<l; k++)
    {
        puf[k] = data[k];
    }
    
    data = new int[l+1];
    
    for(int k=0; k<l; k++)
    {
        data[k] = puf[k];
    }
    data[l] = value;
	}

	public void addValues(int[] values) {
    int lData = data.length;
    int lValues = values.length;
    int i = lData;
    int j = 0;
    int[] puf = new int[i];
    
    for(int k=0; k<i; k++)
    {
        puf[k] = data[k];
    }
    
    data = new int[lData+lValues];
    
    for(int k=0; k<i; k++)
    {
        data[k] = puf[k]; 
    }
    
    for(i=lData; i<lData+lValues; i++)
    {
        data[i] = values[j++];
    }
	}

	public int getMinimumValue() {
		return -1;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		return null;
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
