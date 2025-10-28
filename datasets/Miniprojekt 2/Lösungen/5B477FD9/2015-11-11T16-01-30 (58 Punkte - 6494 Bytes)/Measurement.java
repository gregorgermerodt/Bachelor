import java.util.Arrays;

public class Measurement {

	private int[] data;
	public int i=0;
	
	public Measurement() {
		data=new int[i];
	}

	public void addValue(int value) {
		int z= data.length;
		int[] va1;
		va1=new int[z+1];
		int j=0;
		while(j<z){
			va1[j]=data[j];
			j++;
		}
		va1[z]= value;
		data=va1;
	}
	public void addValues(int[] values) {
		int y= data.length;
		int[] va2;
		va2= new int[y+values.length];
		for(int l=0;l<y;l++){
			va2[l]=data[l];
		}
		int q = 0;
		for(int o= y; o<y+values.length;o++){
			va2[o]=values[q];
		q++;
		}
		data=va2;
		
	}

	public int getMinimumValue() {
		int k=data[0];
		for(int s=1;s<data.length-1;s++){
			if(k>data[s]){
				k= data[s];
				s=1;
			}
		}
		
		return k;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int p=0;
		for(int t=0;t<data.length;t++){
			if(data[t]>threshold){
				p++;
				}
		}
		int w=0;
		int[]ueber;
		ueber= new int[p];
		if(p==0){
			return ueber;
		}
		for(int q=0;q<data.length;q++){
			if(data[q]>threshold){
				ueber[w]=data[q];
				w++;
			}
		}
		
		return ueber;
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
