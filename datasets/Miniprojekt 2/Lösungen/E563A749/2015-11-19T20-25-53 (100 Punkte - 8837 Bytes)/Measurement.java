import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
          data = new int[0];
	}

	public void addValue(int value) {
		int[] neudata = new int[data.length];
		
		for(int i=0; i<data.length;i++){
			neudata[i] = data[i];
		}
		
		data = new int[data.length+1];
		
		for(int j=0;j<neudata.length;j++){
			data[j] = neudata[j];
			
		}
		
		data[data.length-1] = value;
        
	}
	

	public void addValues(int[] values) {
        int dataneu[] = new int [data.length];
        for(int i=0; i<data.length;i++){
        	dataneu[i] = data[i];
        	
        }
		
        data = new int[data.length+values.length];
        
        for(int j=0;j<dataneu.length;j++){
        	data[j] = dataneu[j];
        }
		for(int a=0;a< values.length;a++){
			data[dataneu.length + a] = values[a];
		}

	}

	public int getMinimumValue() {
		int minimalValue = data[0];
		
		for(int i=0;i<data.length;i++){
			if(data[i] < minimalValue){
				minimalValue = data[i];
			}
		}
		return minimalValue;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
			if(threshold == 0){
			   return null;
			  }
			  
			else{
			   int zaehler = 0;
			   int thresholder[] = new int[data.length];
			   for(int i=0; i<data.length;i++){
			    if(data[i] > threshold){
			     thresholder[zaehler] = data[i];
			     zaehler++;
			    }
			    
			   }
			   int finalArray[] = new int[zaehler];
			   for(int i=0; i<finalArray.length;i++){
			    finalArray[i] = thresholder[i];
			   }
			   
			   return finalArray;
			  
			  }
			
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
