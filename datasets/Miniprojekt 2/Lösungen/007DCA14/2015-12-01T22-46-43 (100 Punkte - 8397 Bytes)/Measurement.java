import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0];
	}

	public void addValue(int value) {
		int[] newData = new int [this.data.length+1];
		for(int i = 0; i < this.data.length; i++){	
				newData[i] = this.data[i];
		}
		newData[this.data.length] = value;
		this.data = newData;
	}

	public void addValues(int[] values) {
		for(int i = 0; i < values.length; i++){
			this.addValue(values[i]);
		}
	}

	public int getMinimumValue() {
		if(this.data.length == 0 || this.data == null)
		return Integer.MIN_VALUE;
		else{
			int z = Integer.MAX_VALUE;
			for(int i = 0; i < this.data.length; i++){
				if(this.data[i] <= z){
					z = this.data[i];
				}
			}
			return z;
		}
	}

	public int[] getValuesAboveThreshold(int threshold) {
		//idee: bentutze addValue Methode um newData zu erzeugen, klappt jedoch nur mit data, 
		//Deswegen muss data kurz anders genutzt werden, dafür Zwischenspeicher festlegen
		//data mit addValue mit entsprechenden Werten auffüllen, newData Verweis dann auf diesen Array
		//Am Ende muss data wieder der ursprüngliche Array übergeben werden
		
		int[] newData;
		int[] tempData = this.data;  //tempData - Zwischenspeicher von data
		this.data = new int[0];
		
		if(tempData.length == 0 || tempData == null)
			newData = new int[0];
		else{
			for(int i = 0; i < tempData.length; i++){
				if(tempData[i] > threshold){
					this.addValue(tempData[i]);
				}
			}
			newData = this.data;
		}
		
		this.data = tempData;
		
		return newData;
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
		System.out.println("HinzufÃ¼gen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("HinzuzfÃ¼gen einer Menge von Werten. m:");
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
		System.out.println("Messwerte Ã¼ber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte Ã¼ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
