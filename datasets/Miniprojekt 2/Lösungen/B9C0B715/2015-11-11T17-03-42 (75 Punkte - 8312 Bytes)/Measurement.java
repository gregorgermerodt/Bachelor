import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data  = new int[0];
	}

	public void addValue(int value) {
		
		int arr2[] = new int[data.length +1]; // array vergrößern
		if(data.length == 0) {
			
			int[] arr3 = {value}; // neues array wenn es LEER ist
			data = arr3;			
			
		  } else { // ab hier wenn werte vorhanden sind
		
			for(int i=0; i<data.length;i++) 
		{ 
			data[i] = arr2[i];
			if(i==data.length-1) {
				arr2[i+1] =value; // ist die letzte stelle
		}
		
		}	
		data = arr2; // data ersetzen mit neuem array
	}
	}
	

	public void addValues(int[] values) {
		
		int neu[] = new int [data.length + values.length];
		for(int i=0; i<data.length;i++) {
			if(i == data.length) { 
				for(int j=i,k=0; j<neu.length; j++, k++ ) {
					neu[j] = values[k];
				}
			} else {
				neu[i] = data[i];
			}
		} 
			data = neu;
	}
	
	

	public int getMinimumValue() {
	
		int min = data[0]; // man nimmt den ersten wert
		
		for(int i=0; i< data.length;i++) {
			if(data[i] < data[0]) {
				min = data[i];
			}
		}
		return min;
	}

	
	public int[] getValuesAboveThreshold(int threshold) {
		// gucken ob die werte im DATA array kleiner sind als die werte im THRESHOLD
		if(threshold ==0) {
			return null;
		}
		else{ // laenger des arrays rausfinden!
			int zaehler = 0;
			int  thresholder[] = new int[data.length]; // länge von data von übergeben
			for(int i=0; i < data.length; i++) {
				if(data[i] > threshold) {
					thresholder[zaehler] = data[i];// neuer wert wird in thresholder eingesetzt
													// zaehler dient als spalte. spalte wird erhöht 
													//wenn ein neuer wert hinzukommt
					zaehler++; 
				}
			}
			int finalArray[] = new int[zaehler];
			for (int i=0; i< finalArray.length;i++) {
				finalArray[i] = thresholder[i];
			}
			return finalArray;
		} 
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
