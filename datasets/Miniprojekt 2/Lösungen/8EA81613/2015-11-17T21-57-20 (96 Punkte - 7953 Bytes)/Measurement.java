import java.util.Arrays;

public class Measurement {

	private int[] data ;

	public Measurement() {
		data= new int[0];
	}

	public void addValue(int value) {
		int [] test;
		if (data.length>0)	
		{ 
		test= new int [data.length+1];
	
		   for (int i = 0; i < data.length; i++) {
			    test[i]=data[i];
			    
		  	}
	test[data.length]=value;
	data= test;	
	}
		else{
		test= new int[1];
		test[0]=value;
		data=test;
		}
		
	}
	public void addValues(int[] values) {
		int [] test;
		if (data.length>0)	
		{ 
		test= new int [data.length+values.length];
	
		   for (int i = 0; i < data.length; i++) {
			    test[i]=data[i];
			    
		  	}
		   for (int t=data.length,q=0; t<(data.length+values.length);t++,q++){
			   test[t]=values[q];
		   }
	data= test;	
	}
		else{
		test= new int[values.length-1];
		for (int i = 0; i < values.length-1; i++) {
		    test[i]=values[i];
		    
	  	}
		data=test;
		}
	}

	public int getMinimumValue() {
		int wert;
		wert=data[0];
		 for (int i = 1; i < data.length; i++) {
			   if (data[i]<wert){
				   wert=data[i];
			   }
			    
		  	}
		
		return wert;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int [] qual;
		qual=new int[0];
		for (int i = 0,m=0; i < data.length; i++){
		
			if(data[i]>threshold){
			data[m]=data[i];
			m++;
			}
			qual= new int[m];
			for (int z=0; z< qual.length; z++){
				qual[z]=data[z];
			}
		}
		return qual;
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
