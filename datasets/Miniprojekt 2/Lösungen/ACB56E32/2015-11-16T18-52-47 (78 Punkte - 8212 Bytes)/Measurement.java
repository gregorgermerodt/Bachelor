import java.util.Arrays;

public class Measurement {

	private int[] data = new int[0];

	public Measurement() {

	}

	public void addValue(int value) {
		int[] zwischenspeicher = new int[data.length];
		System.arraycopy(data, 0, zwischenspeicher, 0, data.length);
		data = new int [zwischenspeicher.length+1];
		System.arraycopy(zwischenspeicher, 0, data, 0, zwischenspeicher.length);
		data[data.length-1] = value;
		
	}

	public void addValues(int[] values) {
		int[] zwischenspeicher2 = new int[data.length];
		System.arraycopy(data, 0, zwischenspeicher2, 0, data.length);
		data = new int [zwischenspeicher2.length+values.length];
		System.arraycopy(zwischenspeicher2, 0, data, 0, zwischenspeicher2.length);
		System.arraycopy(values, 0, data, zwischenspeicher2.length, values.length);
	}

	public int getMinimumValue() {
		int[] zwischenspeicher3 = new int[data.length];
		System.arraycopy(data, 0, zwischenspeicher3, 0, data.length);
		Arrays.sort(zwischenspeicher3);
		return zwischenspeicher3[0];
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int anzahlZahlenUeberGrenze = 0;
		for(int i=0; i<data.length; i++){
			if (data[i]>threshold)
				anzahlZahlenUeberGrenze = anzahlZahlenUeberGrenze+1;
		}	
		int[] zwischenspeicher4 = new int[anzahlZahlenUeberGrenze];
	
		for (int i=0; i<data.length; i++){
		if (data[i]>threshold && zwischenspeicher4[0]==0)
			zwischenspeicher4[0] = data[i];
			else if (data[i]>threshold && zwischenspeicher4[1]==0)
				zwischenspeicher4[1] = data[i];
				else if (data[i]>threshold && zwischenspeicher4[2]==0)
					zwischenspeicher4[2] = data[i];
					else if (data[i]>threshold && zwischenspeicher4[3]==0)
						zwischenspeicher4[3] = data[i];
						else if (data[i]>threshold && zwischenspeicher4[4]==0)
							zwischenspeicher4[4] = data[i];
							else if (data[i]>threshold && zwischenspeicher4[5]==0)
								zwischenspeicher4[5] = data[i];
		}
				
		data = new int[anzahlZahlenUeberGrenze];
		System.arraycopy(zwischenspeicher4, 0, data, 0, anzahlZahlenUeberGrenze);
		return data;
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
