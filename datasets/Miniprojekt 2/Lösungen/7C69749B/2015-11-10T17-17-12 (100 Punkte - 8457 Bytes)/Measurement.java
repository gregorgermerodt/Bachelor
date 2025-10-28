import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int laengealt = this.data.length;
		int [] erweitertesarray = new int[laengealt+1];
		
		for (int i=0; i<laengealt; i++){
			erweitertesarray[i] = this.data[i];
		}
		
		erweitertesarray[laengealt] = value;
		
		this.data = erweitertesarray;
	}

	public void addValues(int[] values) {
		int laengealt = this.data.length;
		int laengezusatz = values.length;
		
		int [] erweitertesarray = new int[laengealt+laengezusatz];
		
		for (int i=0; i<laengealt; i++){
			erweitertesarray[i] = this.data[i];
		}
		for (int i=0; i<laengezusatz; i++){
			erweitertesarray[laengealt+i] = values[i];
		}
		
		this.data = erweitertesarray;
	}

	public int getMinimumValue() {
		int kleinster = this.data[0];
		
		for (int i=0; i<this.data.length; i++){
			if(this.data[i]<kleinster){
				kleinster = this.data[i];
			}
		}
		
		return kleinster;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int count=0;
		for (int i = 0; i<this.data.length;i++){
			if(this.data[i]>threshold) count++;
		}
		int [] returnarray = new int [count];
		
		int zaehler = 0;
		for (int i = 0; i<this.data.length; i++){
			if(this.data[i]>threshold){
				returnarray[zaehler]=this.data[i];
				zaehler++;
			}
		}
		
		return returnarray;
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
