import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int [0];
	}

	public void addValue(int value) {
		int [] neu = new int [data.length+1];
		data = new int [neu.length];
		data[data.length-1] = value;
	}

	public void addValues(int[] values) {
		int i;
		int [] neu = new int [values.length + data.length];
		/*System.arraycopy(data, 0, neu, 0, data.length);
		System.arraycopy(values, 0, neu, data.length, values.length);
		data = new int [neu.length];
		System.arraycopy(neu,0,data,0,neu.length);*/
		for (i=0 ;i < data.length ;i++){
		neu[i] = data[i];
		}
		for (i=data.length-1; i < values.length ;i++){
			neu[i+1]=values[i] ;
		data = new int[neu.length];
		}
		for (i=0; i < neu.length; i++){
		data[i] = neu[i];
		}
		
	}

	public int getMinimumValue() {
		int i;
		int min;
		min = data[0];
		for (i=0; i<data.length;i++){
			if (min>data[i]){
				min=data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int i;
		int count = 0;
		for (i= 0; i < data.length; i++){
			if (threshold<data[i]){
				count++;
				}
		}
			int[] neu = new int[count];
			int next = 0;
			for (i= 0; i < data.length; i++){
				if (threshold<data[i]){
					neu[next] = data[i];
					next++;
				}
			}
		
		return neu;
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
