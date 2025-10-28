import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0];
	}

	public void addValue(int value) {
		int[] hilfarray= new int[this.data.length+1];
		
		int index= 0;
		for (int current:data)
		{
			hilfarray[index]=this.data[index];
			index++;
		}
		hilfarray[hilfarray.length-1]=value;
		this.data=null;
		this.data=hilfarray;

	}

	public void addValues(int[] values) {
		int[] hilfarray = new int[this.data.length+values.length];
		
		int index = 0;
		for (int current:data)
		{	
			hilfarray[index]=this.data[index];
			index++;
		}
		
		int index2=0;
		for (int current:values)
		{	
			hilfarray[index]=values[index2];
			index++;
			index2++;
		}
		this.data=null;
		this.data=hilfarray;
	
	}

	public int getMinimumValue() {
		
		int min = Integer.MAX_VALUE;
		
		for (int current=0; current<this.data.length;current++){
			if (min>=this.data[current]){
				min = this.data[current];
			}
		
		}
			
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int[] hilfsarray = new int[this.data.length];
		for (int current:hilfsarray)
		{
			hilfsarray[current]=0;
		}
		
		int index=0;
		int index2=0;
		int panjang = 0;
		for (int current : this.data)
		{
			if (this.data[index2]>threshold){
				hilfsarray[index]=this.data[index2];
				index++;
				panjang++;
			}
			index2++;
		}
		
		int[] hilfsarray2= new int[panjang];
		
		for (int i = 0; i<panjang;i++){
			hilfsarray2[i]=hilfsarray[i];
		}
			
		return hilfsarray2;
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
