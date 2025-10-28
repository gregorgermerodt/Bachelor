import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {

	data = new int [0];
	
	}

	public void addValue(int value) {
		int x = data.length;
		data = new int[x+1];
		this.data[x] = value;
		
	}

	public void addValues(int[] values) {
		int x = data[0];
		data = new int[values.length+1];
		data[0]=x;
		for (int i=0; i < values.length;  i++ ){
			data[i+1]=values[i];
			}
		}
	

	public int getMinimumValue() {
		java.util.Arrays.sort(this.data);
		int min = this.data[0];
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int a[] = new int [data.length];
		int y=0;
		for (int i=0;i < data.length;i++){
			if (threshold < data[i] ){
				a[i] = data[i];
				y++;
				
			}
			
			
			}
			
		int b[] = new int [y];
		int z = 0;
		for (int j=0; j < a.length; j++){
			if ( a[j] !=0 ){
				b[z] = a[j];
				z++;
			}
			
		}
			return b;
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
