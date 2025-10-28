import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0];
	}

	public void addValue(int value) {
		int[] newData = new int[ this.data.length + 1 ];
		for (int i = 0; i < this.data.length; i++){
			newData[i] = this.data[i];
		}
		newData[this.data.length] = value;
		this.data = newData;
	}

	public void addValues(int[] values) {
		int[] newData = new int[ this.data.length + values.length ];
		for (int i = 0; i < this.data.length; i++){
			newData[i] = this.data[i];
		}
		for (int i = this.data.length;
				i < this.data.length + values.length;
				i++)
		{
			newData[i] = values[i - this.data.length];
		}
		this.data = newData;
	}

	public int getMinimumValue() {
		int temporaeresMinimum = this.data[0];
		for ( int i = 0; i < this.data.length; i++ )
		{
			if (temporaeresMinimum > this.data[i])
			{
				temporaeresMinimum = this.data[i];
			}
		}
		return temporaeresMinimum;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		// Implementieren Sie die Methode getValuesAboveThreshold(int threshold) so, dass
		// sie ein int-Array mit allen Werten aus data zur�ckgibt, die echt gr��er sind
		// als der Schwellenwert treshold.
		// Entspricht kein Wert diesem Kriterium oder enth�lt data keine Elemente,
		//soll die Methode ein int-Array der Gr��e 0 zur�ckgeben.
		Measurement valuesAboveThreshold = new Measurement();
		for ( int i = 0; i < this.data.length; i++){
			if(this.data[i] > threshold){
				valuesAboveThreshold.addValue( this.data[i] );
			}
		}
		return valuesAboveThreshold.data;
	}

	// --------------------------------------------------------------
	
	public void printData() {
		// �ber die Hilfsmethode Measurement.printData() k�nnen Sie die Messreihe ausgeben lassen.
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