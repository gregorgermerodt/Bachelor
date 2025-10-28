import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int[] neu = new int[data.length];
			for(int i = 0; i < data.length; i++)
				neu[i] = data[i];
		data = new int[neu.length+1];
		
		for(int i = 0; i < neu.length; i++)
			data[i] = neu[i];
		
		data[data.length-1] = value;
	}

	public void addValues(int[] values) {
		int[] neu = new int [data.length];
			for(int i = 0; i < data.length; i++)
				neu[i] = data[i]; 
			
		int laenge = values.length + data.length;	
		
		data = new int[laenge];
		
			for(int i = 0; i < neu.length; i++)
				data[i] = neu[i];
			
			for(int j = 0; j < values.length; j++)
				data[neu.length + j] = values[j];
	}

	public int getMinimumValue() {
		int kleiner = data[0];
		for (int i = 1; i < data.length; i++)
			if(kleiner > data[i])
				kleiner = data[i];
		return kleiner;				
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int count = 0, count2 = 0;
		for (int i = 0; i < data.length; i++)
			if(data[i] > threshold)
				count++;
		int[] schwelle = new int[count];
		if(count > 0)
			for(int i = 0; i < data.length; i++)
				if(data[i] > threshold)
					schwelle[count2++] = data[i];
		return schwelle;
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
