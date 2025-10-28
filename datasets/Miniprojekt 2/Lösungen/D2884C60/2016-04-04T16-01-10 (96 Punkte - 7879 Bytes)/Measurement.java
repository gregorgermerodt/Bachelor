import java.util.Arrays;

public class Measurement {

	private static final int INTEGER_MAXIMUM = 0;
	private int[] data;

	public Measurement() {
		data = new int[0]; 

	}

	public void addValue(int value) {
		if (data == null) {
			data = new int[] { value };
			return;
		}
		
		int [] erg=new int[data.length+1];
		if(data!=null) {
			for(int i=0; i<data.length; i++) {
				erg[i]=data[i]; 
			}
		}
		erg[data.length]=value;
		 
		data=erg.clone(); 

	}

	public void addValues(int[] values) {
		if(data.length==0){
			if(values.length!=0) {
				data=values.clone(); 
			}
		}
		else if(data.length!=0){
			if(values.length!=0) {
				int[] erg=new int [data.length+values.length]; 
				for(int i=0; i<data.length; i++) {
					erg[i]=data[i]; 
				}
				for(int j=data.length; j<erg.length; j++) {
									
					erg[j]=values[j-data.length]; 
				}
				data=erg.clone(); 
			}
		}

	}

	public int getMinimumValue() {
		int v=Integer.MAX_VALUE; 
		
		for(int i=0; i<data.length;i++){
			if(v>data[i]){
				v=data[i]; 
			}
		}
		
		return v;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int count=0; 
		int [] erg; 
		
		for(int i=0; i<data.length;i++) {
			if(data[i]>threshold){
				count++;
			}
		}
		
		erg=new int[count]; 
		count=0; 
		for (int i=0; i<data.length; i++){
			if(data[i]>threshold){
				erg[count]=data[i]; 
				count++; 
			}
		}
		
		
		
		return erg;
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

		System.out
				.println("------------------------------------------------------------------");

	
	
		System.out.println("Hinzufügen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();

		System.out
				.println("------------------------------------------------------------------");

		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzfügen einer Menge von Werten. m:");
		// Erwartete Ausgabe:
		// [85, 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93]
		m.printData();

		System.out
				.println("------------------------------------------------------------------");

		int minimumValue = m.getMinimumValue();
		System.out.println("Minimaler Wert der Messreihe m:");
		// Erwartete Ausgabe: 58
		System.out.println(minimumValue);

		System.out
				.println("------------------------------------------------------------------");

		int[] valuesAbove78 = m.getValuesAboveThreshold(78);
		System.out.println("Messwerte über 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));

		System.out
				.println("------------------------------------------------------------------");

		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte über 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
