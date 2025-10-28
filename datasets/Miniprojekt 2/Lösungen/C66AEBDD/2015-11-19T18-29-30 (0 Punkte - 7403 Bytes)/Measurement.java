import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
	data=new int[0];

	}

	public void addValue(int value) {

		int [] neu=new int[data.length+1];
		for(int i=0;i<data.length;i++){
			neu[i]=data[i];
		}
		neu[data.length]=value;
		data=neu;
	}

	public void addValues(int[] values) {
		
		int[] groe�er=new int[data.length+values.length];
		for(int i=0;i<data.length;i++){
			groe�er[i]=data[i];
		}
		for (int i =0;i<values.length;i++){
			groe�er[data.length+i]=values[i];
		}
		data=groe�er;

	}

	public int getMinimumValue() {
		int minimum =99999;
		for (int i=0;i<data.length;i++){
			if(data[i]<minimum){
				minimum=data[i];
			}
			
		}
		return minimum;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int groe�er=0;
		for (int i=0;i<data.length;i++){
			if(data[i]>threshold){
				groe�er++;
			}
		}
		
		int[]neu=new int[groe�er];
		int z=0;
		for(int i=0;i<data.length;i++){
			if(data[i]>threshold){
				neu[z]=data[i];
				z++;
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
