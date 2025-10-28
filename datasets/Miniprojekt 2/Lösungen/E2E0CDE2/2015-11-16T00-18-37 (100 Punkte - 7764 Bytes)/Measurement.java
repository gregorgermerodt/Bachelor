import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];

	}

	public void addValue(int value) {
		int[] add=new int[data.length+1];
		for (int index=0;index < (add.length-1);index++){
			add[index]=data[index];
		}
		add[add.length-1]=value;
		data=add;
		
		
		
		

	}

	public void addValues(int[] values) {
		int[] add=new int[data.length+values.length];
		
		for(int i=0;i<data.length;i++){
			add[i]=data[i];
		}
		
		for(int j=data.length;j<add.length;j++){
			add[j]=values[j-data.length];
		}
		data=add;
		

	}

	public int getMinimumValue() {
		int min=999999;
		for(int i=0;i<data.length;i++){
			if (data[i]<min){
				min=data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int anzahl=0;
		
		for(int i=0;i<data.length;i++){
			if(data[i]>threshold){
				anzahl++;
				
			}
			
		}
		int[] array_anzahl=new int[anzahl];
		
		for (int i=0, j=0;i<data.length;i++){
			if (data[i]>threshold){
				
				array_anzahl[j]=data[i];
				j++;
			}
		}
		
		return array_anzahl;
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
