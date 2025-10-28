import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		data = new int[0];

	}

	public void addValue(int value) {
		int[] newData = new int[data.length +1];
		
		for(int i=0; i<data.length; i++){
			   newData[i]= data[i];
			   
		}
      
        	newData[newData.length -1]= value; 
        	this.data = newData;
        
	}

	public void addValues(int[] values) {
		int[] newData = new int[data.length + values.length]; 
		
		for(int i=0; i<data.length; i++){
			newData[i]= data[i];
		}
		for(int x=0; x<values.length; x++){
			newData[data.length + x]= values[x];
		
		}
    this.data = newData;
    
	}

	public int getMinimumValue() {
		int Min = Integer.MAX_VALUE;
		for(int i=0; i<data.length; i++){
			if(data[i]< Min){
				Min = data[i];
			}
		}
		return Min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] newArray = new int[data.length];
		int counter =0;
		if(threshold >0){
		
			for(int i =0; i< data.length; i++){
				if(data[i]> threshold){
					newArray[counter] = data[i];  // wenn ich counter habe, brauche ich unbedingt noch das neue Array
					counter++;
				}
			}
		}
		
				int[] allThreshold = new int[newArray.length];
				
				for(int a=0; a< newArray.length; a++){ // geht auch allThreshold.length
					allThreshold[a] = newArray[a];
				}
				return allThreshold;
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
