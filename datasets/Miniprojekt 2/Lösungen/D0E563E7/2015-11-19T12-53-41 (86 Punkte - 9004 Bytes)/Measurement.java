import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {

	}

	public void addValues(int[] values) {

	}

	public int getMinimumValue() {
		int min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] a = new int[0];
		int index = 0;
		int leer = 0;
		int bigger = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == 0) {
				leer++;
			} else if (data[i] > threshold) {
				bigger++;
			}
		}
		if (bigger == 0 || leer == data.length) {
			return a;
		}
		int[] c = new int[bigger];
		for (int j = 0; j < data.length; j++) {
			if (data[j] > threshold) {
				c[index] = data[j];
				index++;
			}
		}
		return c;
	}
	
	

	
	
	// Diese Methode soll in einem uebergebenen Array die Reihenfolge der
	 // Elemente umkehren.
	 // Beispiel: Eingabe = {4, 12, 7, 18}
	 // Rueckgabe = {18, 7, 12, 4}
	 // ACHTUNG: Diese Methode hat keine Rueckgabe. Das Array Elements soll
	 // nach Ausfuehrung der Methode das Ergebnis beinhalten.
	 public static void reverseArray(int[] elements) {
	  int [] a = new int [elements.length];
	  int index=elements.length-1;
	  
	  for (int i = 0; i < elements.length; i++) {
	   a[index]=elements[i];
	   index--;
	  }
	  for(int j=0;j<a.length;j++){
		  elements[j]=a[j];
	  }
	 }
	
	// Elements {1, 2, 3, 4}    Gr��e 4
	// A        {4, 3, 2, 1}
	
	
	
	

	// Diese Methode soll ein Array zurueckgeben, in dem alle Elemente des
	// uebergebenen Arrays dupliziert wurden und in der gleichen Reihenfolge
	// wie im Originalarray stehen. Beispiel:
	// Ubergeben wird ein Array der Form {4, 16, 8},
	// Das zurueckgegebene Array soll dann {4, 4, 16, 16, 8, 8} beinhalten.
	public static int[] duplicateElements(final int[] elements) {
		int[] a = new int[elements.length * 2];
		int index = 0;
		for (int i = 0; i < elements.length; i++) {
			a[index] = elements[i];
			a[index + 1] = elements[i];
			index += 2;
		}
		return a;
	}

	public static int maxElement(final int[] elements) {
		  int max=elements[0];
		  int ergebnis=0;
		  for(int i=0;i<elements.length;i++){
			  if(elements[i]>max){
				  max=elements[i];
			  }
		  }
		  for(int j=0;j<elements.length;j++){
			  if(elements[j]==max){
				  ergebnis=max*j;
			  }
		  }
		  return ergebnis;
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

		System.out
				.println("------------------------------------------------------------------");

		m.addValue(85);
		System.out.println("Hinzuf端gen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();

		System.out
				.println("------------------------------------------------------------------");

		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzf端gen einer Menge von Werten. m:");
		// Erwartete Ausgabe:
		// [85, 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93]
		m.printData();

		System.out
				.println("------------------------------------------------------------------");

		int minimumValue = m.getMinimumValue();
		System.out.println("Minimaler Wert der Messreihe m:");
		// Erwartete Ausgabe: 58
		System.out.println(minimumValue);

		System.out
				.println("------------------------------------------------------------------");

		int[] valuesAbove78 = m.getValuesAboveThreshold(78);
		System.out.println("Messwerte 端ber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));

		System.out
				.println("------------------------------------------------------------------");

		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte 端ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
