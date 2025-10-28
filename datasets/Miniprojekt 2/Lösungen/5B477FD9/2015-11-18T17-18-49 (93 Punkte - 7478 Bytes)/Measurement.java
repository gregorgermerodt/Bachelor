import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data= new int [0];
	}

	public void addValue(int value) {
		int[] data2;
		data2= new int [data.length+1];
		for(int j=0;j<data.length;j++){
			data2[j]=data[j];
		}
		data2[data.length]=value;
		data=data2;
	}

	public void addValues(int[] values) {
		int[] data2;
		data2= new int [data.length+values.length];
		for(int j=0;j<data.length;j++){
			data2[j]=data[j];
		}
		int i=0;
		for(int k=data.length;k<data2.length;k++){
			data2[k]=values[i];
			i++;
		}
	data=data2;
	}

	public int getMinimumValue() {
		int u= data[0];
		for(int k=1;k<data.length;k++){
			if(u>data[k]){
				u=data[k];
			}
		}
		
		
		return u;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int yusuf= 0;
		for(int mesut=0;mesut<data.length;mesut++){
			if(threshold<data[mesut]){
				yusuf++;
			}
		}
		int []kerem= new int [yusuf];
		if(kerem.length==0){
			return kerem;
		}
		int t=0;
		for(int ibo=0;ibo<data.length;ibo++){
			if(data[ibo]>threshold){
			kerem[t]=data[ibo];
			t++;
			}
			
		}
		
		return kerem;
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
