import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];

	}

	public void addValue(int value) {
		int[] werte = new int[data.length+1];
		werte [werte.length-1] = value;
		for(int i = 0; i < data.length; i++){
			werte[i] = data[i];
		}
        data = werte;
	}

	public void addValues(int[] values) {
		int [] werte = new int[data.length +values.length];

		for(int i = 0;i < data.length; i++){
			werte[i] = data[i];
		}
		for(int i = 0;i < values.length;i++){
			werte[data.length+i] = values[i];
		}
		data = werte;
	}

	public int getMinimumValue() {
		int i = 0;
		int min = data[i];
		while(i < data.length){
			if (min > data[i]){
				min = data[i];
			}
			i++;
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
        int j = 0;
        int i = 0;
        int []valuesabove = new int[data.length];
        int []zero = new int[0];
        while(i < data.length){
            if(data[i] > threshold){
                valuesabove[j] = data[i];
                j++;
            }
            i++;
        }
        
        int []valuesabovefinal = new int[j];
   
        for(int k=0; k<valuesabovefinal.length; k++){
            valuesabovefinal[k] = valuesabove[k];
        }
        data = valuesabovefinal;
        return data;
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
