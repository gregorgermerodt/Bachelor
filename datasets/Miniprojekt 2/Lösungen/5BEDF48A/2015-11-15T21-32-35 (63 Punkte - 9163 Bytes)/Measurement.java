import java.util.Arrays;

public class Measurement {

	private int[] data;				// Feld data
	

	public Measurement() {					// wird unten wieder aufgenommen - duh.
		data = new int[0];
		
	}
	
	public void addValue(int value) {
		int[] neu = new int[data.length +1];	// neues Array mit länge data+1 angelegt
		for(int i = 0;i<data.length; i++){		// Bedingungen für die Schleife festgelegt
			neu[i] = data[i];					// bestimmt, dass neu = data ist / [i] ist in /15/ bestimmt durch die Bedingungen "=0" und "<data.length"
			
		}
		neu[neu.length-1] = value;			// die Länge neu-1 entspricht value	
		data = neu;							// bestimmt, dass data = neu ist.
		
	}

	public void addValues(int[] values) {
		int[] neu = new int[data.length+2];		// neues Array mit Länge data+2 angelegt
		for(int i = 0;i<data.length; i++){			// Bedingungen für die Schleife festgelegt
			neu[i] = data[i];				// bestimmt, dass neu = data ist, erneut mit dem jeweiligen Index [i]
			
		}
		for(int i = data.length;i < data.length + values.length; i++){		// sub-Schleife angelegt, die besagt, dass i = der Länge von data ist | und i < als die kombinierte Länge aus data und values ist.
			neu[i] = values[i-data.length];								// der index [i] wird weiterhin definiert  Wert von values - Länge von data
		
	}
		data = neu;							// bestimmt, dass data ganzNeu ist.
	}

	public int getMinimumValue() {
		//Arrays.sort(data);
		//int min = data[0];
		int min = Integer.MAX_VALUE;		// der neue Integer min wird festgelegt als der Maximale Wert (MAX_VALUE)
		for(int i= 0;i < data.length;i++){	// die Bedingungen der Schleife werden festgelegt und Index [i] bestimmt
			if (data[i]<min){				// neue If-Bedingungen. / wenn der Index von data kleiner ist als der MAX_VALUE min
				min = data[i];				// dann ist min gleich dem Index von data und somit unser minimaler Wert
			}								// forts. /43/ begingt durch die Schleife.
		}
		
		return min;
		
	
		
	}
									
	

	public int[] getValuesAboveThreshold(int threshold) {
		int groesse = 0;									// es wir ein Integer groesse angelegt und = 0 gesetzt.
		for (int i = 0; i<data.length;i++){					// Bedingungen für die Schleife und Bestimmung vom Index[i]
			if(data[i] > threshold){						// if-Bedingung verschachtelt in der Schleife
				groesse++;									// forts. /58/ besagend, dass der Index von data größer als der threshold sein muss
			}
			
		int[] neu = new int[groesse];							// neuer Integer neu wird angelegt und mit dem Integer groesse verknüpft
		for(int iData = 0,iNeu = 0;iNeu<neu.length;iData++){	// Bedingungen der Schleife, Bestimmung von zwei Index [iData] und [iNeu]	Schleife besteht solange :iNeu ist kleiner als die Länge von neu
			if(data[iData] > threshold){						// if-Bedingung. Wenn iData von data größer ist als Threshold
				neu[iNeu] = data[iData];						// so ist, iNeu = iData
				iNeu++;
			}
		}													// Zusammenfassung /55-66/:	es wird bestimmt, dass die groesse = 0 ist. 
		}													//	dann wird Index [i] = 0 gesetzt und gesagt, dass die Schleife fortgeführt wird, bis i < als die Länge von data ist. 
															//	die Schleife wird nur dann ausgeführt, wenn der Index von data > threshold ist.
															// dann ist der Index[iNeu]von neu = dem Index[Idata]von data.
		return null;
	}
	

		// Measurement.printData();
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
