import java.lang.reflect.Array;
import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		data = new int[0];

	}
	
	//###### Hilfsmethode - getter ######## Eigene ######
	
	public int[] getDataArray() {
		
		return data;
	}
	
	
	//###### Ende #######################################

	public void addValue(int value) {
		
		// Aktuelle Werte des data-array speichern 
	//	int [] tmpArray = this.data;
		int [] tmpArray = getDataArray();
		
		// Die Länge des Array herausfinden
		//int lengthOfTmpArray = tmpArray.length;
		
		// Erzeuge ein neues größeres Array
		int[] newArray = new int[tmpArray.length + 1];
		
		// Kopiere den Inhalt von tmpArr in das neue Array
		for(int i = 0; i < tmpArray.length; i++) {
			newArray[i] = tmpArray[i];
		}
		
		// Dem neuen Array den aktuellen Wert aus dem Parameter übergeben
		newArray[newArray.length - 1] = value;
		
		// Das fertige Array data zuweisen.
		this.data = newArray;
		
		
	}

	public void addValues(int[] values) {
		
		// Aktuelles data-Array mit seinen Werten
		int[] tmpArray = getDataArray();
		
		//Neue vergrößertes Array
		int[] newArray = new int[tmpArray.length + values.length];
		
		// Hilfsindex für das neue Array. Bestimmt die Position auf dem Index um die neuen Values hinzuzufügen
		int index = 0;
		
		// Kopiere Inhalt von tmpArray in das neue Arrray
		for(int i = 0; i < tmpArray.length; i++) {
			newArray[i] = tmpArray[i];
			index++;
		}
		
		// Füge die neuen Werte aus Value dem array hinzu
		for(int i = 0; i < values.length; i++) {
			newArray[index] = values[i];
			index++;

		}
		this.data = newArray;

	}

	public int getMinimumValue() {
		
		int[] tmpArray = getDataArray();
		int min = Integer.MAX_VALUE;
		
		// Suche den keinsten Wert
		for(int i = 0; i < tmpArray.length; i++) {
			if(tmpArray[i] < min) {
				min = tmpArray[i];
			}	
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int min = threshold;
		int[] tmpArray = this.data;
		
		
		int cnt = 0;
		
		for(int i = 0; i < tmpArray.length; i++) {
			if(tmpArray[i] > min) {
				cnt++;
			}
		}

		int[] newArray = new int[cnt];
		int index = 0;
		
		for(int i = 0; i < tmpArray.length; i++) {
			if(tmpArray[i] > min) {
				newArray[index] = tmpArray[i];
				index++;
			}
		}
		data = newArray;
		
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
