import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[1];

	}

	public void addValue(int value) {
		int laenge =data.length;
		data = new int[laenge+1];
		data[laenge+1] = value;
		return;

	}

	public void addValues(int[] values) {
		int laenge = data.length+values.length;
		data = new int[laenge];
		int dauer = values.length;
		while(dauer!=0){
			data[data.length-1] = values[dauer];
			dauer--;
		}
		return;
		

	}

	public int getMinimumValue() {
		int min=0;
		int laenge = data.length;
		while(laenge!=0){
			if( min < data[laenge-1]){
				min = data[laenge-1];
			}
			laenge--;
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] uber = new int[1];
		int laenge = data.length;
		int uberlaenge=0;
		while(laenge!=0){
			if(threshold<data[laenge-1])
				uber[uberlaenge] = data[laenge-1];
				uberlaenge++;
				laenge--;
		}
		return uber;
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
