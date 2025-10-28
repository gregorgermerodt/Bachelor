import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int [0];

	}

	public void addValue(int value) {
		int[] neu = new int [data.length + 1];
		data = new int [neu.length];
		//System.out.println(neu.length);
		//System.out.println(value);
		data[data.length-1] = value ;

	}

	public void addValues(int[] values) {
		int [] neu = new int [values.length+data.length];
		for(int i=0; i<data.length; i++){
			neu[i] = data[i];
		}
		for(int i=data.length-1; i<values.length;i++){
			neu[i+1] = values[i];
		}
		data = new int [neu.length];
		for(int i=0; i<neu.length;i++){
			data[i] = neu[i];
		}
		//System.arraycopy(data, 0, neu, 0, data.length);
		//System.arraycopy(values, 0, neu, data.length, values.length);
		//System.arraycopy(neu, 0, data, 0, neu.length);
		
	}

	public int getMinimumValue() {
		int mini;
		mini = data[0];
		for(int i=0; i<data.length; i++){
			if(mini>data[i]){
				mini=data[i];
			}
		}
		return mini;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int anzahl = 0;
		for(int i=0; i<data.length; i++){
			if(threshold<data[i]){
				anzahl++;
			}
		}
		int[] neu = new int [anzahl];
		int neuint = 0;
		for(int i=0; i<data.length;i++){
			if(threshold<data[i]){
				neu[neuint] = data[i];
				neuint++;
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
