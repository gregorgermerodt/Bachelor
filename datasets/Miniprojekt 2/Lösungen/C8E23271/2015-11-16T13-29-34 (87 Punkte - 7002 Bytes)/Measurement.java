import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data=new int[0];

	}

	public void addValue(int value) {
		int[]safe;
		safe=new int[data.length+1];

		for(int i=0;i<data.length;i++){
			safe[i]=data[i];
		}
		safe[safe.length-1]=value;
		data=safe;

	}

	public void addValues(int[] values) {
		int[]safe;
		safe=new int[data.length+values.length];

		for(int i=0;i<data.length;i++){
			safe[i]=data[i];
		}
		for(int k=data.length;k<safe.length;k++){
			safe[k]=values[k-data.length];
		}
		data=safe;

	}

	public int getMinimumValue() {
		int speicher=Integer.MAX_VALUE;
		for(int i=0;i<data.length;i++){
			if(data[i]<speicher){
			speicher=data[i];
			}
		}
		return speicher;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int groesse=0;
		for(int i=0;i< data.length;i++){
			if(data[i]>threshold){
				groesse++;
			}
		}
		int[] neu=new int[groesse];
		for(int k=0,j=0;j<neu.length;k++){
			if(data[k]>threshold){
				neu[j]=data[k];
				j++;
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
