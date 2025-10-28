import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data= new int[0];
	}

	public void addValue(int value) {
		int [] hilfe = new int[data.length];
		for(int i=0;i<data.length;i++){
			hilfe[i]=data[i];
		}
	data=new int[hilfe.length+1];
	for(int j=0;j<hilfe.length;j++){
		data[j]=hilfe[j];
	}
	data[data.length-1]=value;
	}

	public void addValues(int[] values) {
		int[] hilfe = new int[data.length];
		for(int i=0;i<data.length;i++){
			hilfe[i]=data[i];
		}
	int laenge = hilfe.length+values.length;	
	data=new int[laenge];
	for(int j=0; j<values.length;j++){
		data[j]=values[j];
	}
	for(int k=0;k<hilfe.length;k++){
		data[values.length+k]=hilfe[k];
	}
	}

	public int getMinimumValue() {
		int min =Integer.MAX_VALUE;
		for(int i=0;i<data.length;i++){
			if(data[i]<min){
				min=data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int counter=0;
		for(int i=0;i<data.length;i++){
			if(data[i]>threshold){
				counter++;
			}			
		}
		
		int [] hilfe = new int[counter];
		int x= 0;
		
		for(int j=0;j<data.length;j++){
			
			if(data[j]>threshold){
				hilfe[x]=data[j];
				x++;
			}
		}
		
	
		
		
		return hilfe;
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
