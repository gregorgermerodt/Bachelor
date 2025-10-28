import java.util.Arrays;

public class Measurement {

	private int[] data;
	//private int[] a;
	//private int[] b;
	
	
	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {
		
		int [] data2 = new int[data.length + 1];
		for(int i =0;i<data.length;i++){
			data2[i]=data[i];
		}
		data2[data.length]= value;
		data = data2;

		
	}

	public void addValues(int[] values) {
		int [] data2 = new int[values.length+data.length]; // hier wird der neue array erstellt
		for(int i= 0;i<data.length;i++){
			data2[i]=data[i];								// data2 kopiert data
		}
		for(int i= data.length;i<data.length+values.length;i++ ){
			data2[i]=values[i-data.length];					// die werte von values werden in data2 eingefügt
		}
		data=data2;
		

	}

	public int getMinimumValue() {
		int min = data[0]; 									// min nimmt den Wert von den ersten index von data an.
		for(int i=1;i<data.length;i++){						// überprüft mit dem Wert von dem ersten index mit den anderen, falls die kleiner ist, ist das der neuer min
			if(min<data[i]){
				min=data[i];
			}
			
		
		}
	
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int a[] = new int[data.length];
		int x = 0;
		for(int i=0;i<data.length;i++){
			if(data[i]>threshold){
				a[i]=data[i];
				x++;
			}
		}
		
		int b[] = new int[x];
		int zahler = 0;
		for(int j=0; j<a.length;j++){
			if(a[j]!=0){
				b[zahler]=a[j];
				zahler++;
				
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
