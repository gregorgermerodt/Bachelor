import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
      data = new int[0];
	}

	public void addValue(int value) {
       int[] günter = new int[data.length+1];
       günter[günter.length-1] = value;
		for(int i = 0;i<data.length;i++){
			günter[i] = data[i];
		}
		data = günter;
	}

	public void addValues(int[] values) {
		int[] mari = new int[data.length+values.length];
		for(int i = 0;i < data.length;i++){
			mari[i] = data[i];
		}for(int i = 0;i<values.length;i++){
			mari[data.length+i] = values[i];
		}
          data = mari;
	}

	public int getMinimumValue() {
		int i = 0;
		int min = data[i];
		while(i < data.length){
			if(min > data[i]){
				min = data[i];
				
			}
			i++;
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int i = 0;
		int j = 0;
		int[] vacu = new int[data.length];
		while(i < data.length){
			if(data[i]> threshold){
				vacu[j]=data[i];
				j++;
			}
			i++;
		}
		int[] fin = new int[j];
		for(int k= 0;k<fin.length;k++){
			fin[k] = vacu[k];
			
		}
		data = fin;
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
