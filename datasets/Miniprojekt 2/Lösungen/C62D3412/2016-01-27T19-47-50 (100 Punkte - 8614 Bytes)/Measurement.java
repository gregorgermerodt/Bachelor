import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		data = new int[0];

	}

	public void addValue(int value) {
		int[] savedData = data;
		
		// Neues Array mit angepasster Größe erzeugen
		int[] data = new int[savedData.length + 1];
		
		// Werte aus dem altem Array übernehmen
		for(int i = 0; i < savedData.length; i++) {
			data[i] = savedData[i];
		}
		// Value ans Ende des Array einfügen
		data[data.length - 1] = value;
		
		this.data = data;

	}

	public void addValues(int[] values) {
		
		//Neues Array mit angepasster Größer erzeugen
		int[] newArray = new int[data.length + values.length];
		
		// Zähler zur Bestimmung der Position/Index im neuen Array
		int counter = 0;
		
		//Kopiert bestehenden Werte in das neue Array
		for(int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
			counter++;
		}
		for(int i = counter, j = 0; i < newArray.length; i++, j++) {
			newArray[i] = values[j];
		}
		
		this.data = newArray;
		
		

	}

	public int getMinimumValue() {
		
		int max = Integer.MAX_VALUE;
		int cnt = 0;
		
		for(int i = 0; i < this.data.length; i++) {
			if(this.data[i] < max) {
				max = data[i];
			}
		}
		return max;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		// Hilfsvariable zur Bestimmung der größe des neuen Arrays
		int cnt = 0;
		
		// Data enthält kein Element --> return Array mit Größe 0
		if(data.length == 0) {
			int[] newArray = new int[0];
			return newArray; 
		}
		// Bestimme die Größe des neuen Arrays
		for(int i = 0; i < data.length; i++) {
			if(data[i] > threshold) {
				cnt++;
			}
		}
		// Erstelle das neue Array und füge die echt größeren Zahlen aus dem vorherigen Array ein
		int[] newArray = new int[cnt];
		int index = 0;
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] > threshold) {
				newArray[index] = data[i];
				index++;
			}
		}
		return newArray;
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
