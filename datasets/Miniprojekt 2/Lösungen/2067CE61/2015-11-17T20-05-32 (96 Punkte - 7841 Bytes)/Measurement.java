import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		int i;
		int[] ablage = this.data.clone();
		this.data = new int[this.data.length + 1];
		for (i=0;i<this.data.length;i++){
			if (i == (ablage.length)){
				this.data[i] = value;
			} else this.data[i] = ablage[i];
		}
	}

	public void addValues(int[] values) {
		int i;
		int[] ablage = this.data.clone();
		this.data = new int[this.data.length + values.length];
		for (i=0;i<this.data.length;i++){
			if (i > ablage.length-1){
				this.data[i] = values[i-ablage.length];
			}else this.data[i] = ablage[i];
		}
	}

	public int getMinimumValue() {
		int min = -1, i;
		for (i=0;i<this.data.length;i++){
			if (this.data.length > 0){
				if (min != -1){
					if (this.data[i] < min){
						min = this.data[i];
					}
				} else min = this.data[i];
			} else return 0;
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] above = new int[0];
		int[] ablage;
		int i, j;
		for (i=0;i<this.data.length;i++){
			if (this.data[i] > threshold){
				ablage = above.clone();
				above = new int[above.length+1];
				for (j=0;j<above.length;j++){
					if (j == above.length-1){
						above[j] = this.data[i];
					}else above[j] = ablage[j];
				}
			}
		}
		return above;
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
