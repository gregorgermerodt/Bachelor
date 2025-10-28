import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data =new int[0];

	}

	public void addValue(int value) {
		int[] add_value=new int[data.length+1];
		for(int i=0;i<data.length;i++){
			add_value[i]=data[i];
		}
		add_value[data.length]=value;
		data=add_value;

	}

	public void addValues(int[] values) {
		int[] new_Length= new int[data.length+values.length];
		for(int i=0;i<data.length;i++){
			new_Length[i]=data[i];
		}
		for(int i=0;i<values.length;i++){
			new_Length[data.length+i]=values[i];
		}
		data=new_Length;
		
		

	}

	public int getMinimumValue() {
		int minValue=data[0];
		for(int i=0;i<data.length;i++){
			if(data[i]<minValue) {
				minValue=data[i];
				}
									}
		return minValue;
		}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] threshold_values=new int[0];
		int[] save_threshold_values=new int[0];
		for(int i=0;i<data.length;i++){
		if(data[i]>threshold){
		save_threshold_values=threshold_values;
		threshold_values=new int[threshold_values.length+1];
		for(int m=0;m<save_threshold_values.length;m++){
		threshold_values[m]=save_threshold_values[m];	
		}
		threshold_values[threshold_values.length-1]=data[i];
		}
		}
		return threshold_values;
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
