import java.util.Arrays;
import java.util.LinkedList;

public class Measurement {

	private int[] data;

	public Measurement() {
		int[] data = new int[0];
	}

	public void addValue(int value) {
		int[] newArray = new int[data.length +1];
		for(int i=0;i<data.length;i++){
			newArray[i]= data[i];
		}
		newArray[newArray.length-1] = value;
		data = newArray;
	}

	public void addValues(int[] values) {
		int[] newsArray = new int[data.length + values.length];
		for(int i=0;i<data.length+values.length;i++){			
			if(i < data.length){
				newsArray[i]= data[i];
			}
			else if(i > data.length && i < values.length){
				newsArray[i]= values[i];
			}
		}

		data = newsArray;
	}

	public int getMinimumValue() {
		int minValue = data[0];
		for(int i=0;i<data.length;i++){
			if(data[i]<minValue){
				minValue=data[i];
			}
		}
		return minValue;
	}

	public int[] getValuesAboveThreshold(int threshold) {

		int[] temp = new int[data.length];
		
		for(int i = 0; i< temp.length; i++){
			temp[i] = -99999;
		}
		
		for(int i=0;i<data.length;i++){
			if(data[i]>threshold){
				temp[i] = data[i];			
			}
		}
		
		int counter = 0;
		for(int i =0 ; i < temp.length; i++){
			if(temp[i] != -99999){
				counter++;
			}
		}
		
		int[] res = new int[counter];
		
		for (int j = 0; j < res.length; j++) {
			res[j] = temp[j];
		}
		
		return res;
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