import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0]; // !!! angucken

	}

	public void addValue(int value) { // !!! angucken!

		int[] neuesarray = new int[data.length + 1]; // neues array erstellen +
														// einen wert

		for (int i = 0; i < data.length; i++) { // array durchlaufen
			neuesarray[i] = data[i]; // die vorhanden daten in das neue array
										// speichern
		}
		neuesarray[neuesarray.length - 1] = value; // index bei 0 anfangen

		data = neuesarray; // endspeicher

	}

	public void addValues(int[] values) { // !!! angucken! 
		for (int i = 0; i < values.length; i++) { //einzel array durchlaufen
			addValue(values[i]);   //einzelne arrays hier rein
		}
	}

	public int getMinimumValue() { //!!! angucken!
		int min  = Integer.MAX_VALUE; 
		for(int i = 0; i < data.length; i++){
			if(min > data[i]){
				min = data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) { //!!! angucken!
		
		int anzahl = 0;  //zahlt alle zahlen die größer sind
		for (int i = 0; i < data.length; i++){
			if(data[i] > threshold)
			anzahl++; //hat hier dann 4 platzhaler bekommen 
		}
		
		int[] newdata = new int[anzahl]; // erstellen array mit den zahlen die größer sind als thershold
		
		int index = 0; //
		
		for(int i = 0; i < data.length; i++){ //vergleich nochmal mit 4 platzhaltern und schreibt ins iindex immer mit einem weter 
			if(data[i] > threshold){
				newdata[index] = data[i];
				index++;
			}
		}
		
		return newdata;
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
		System.out.println("HinzufÃ¼gen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();

		System.out
				.println("------------------------------------------------------------------");

		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("HinzuzfÃ¼gen einer Menge von Werten. m:");
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
		System.out.println("Messwerte Ã¼ber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));

		System.out
				.println("------------------------------------------------------------------");

		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte Ã¼ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
