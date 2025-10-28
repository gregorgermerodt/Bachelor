import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		this.data = new int[0];

	}

	public void addValue(int value) {
		
		int[] newData = new int[this.data.length+1];
		for(int i = 0;i < this.data.length;i++){
			newData[i] = this.data[i];
			
		}
		newData[newData.length - 1] = value;
		this.data = newData;

	}

	public void addValues(int[] values) {
		
		int[] newData = new int[this.data.length+values.length];         
         if(values != null){
             for(int i = 0; i <= this.data.length;i++){
               if(i == data.length){
                  for(int j = i, k = 0;j < newData.length;j++,k++){
                        newData[j] = values[k];
                     }
                 }
               else{
                 
                     newData[i] = this.data[i];
               }
             }
        }
        this.data = newData;	
	}

	public int getMinimumValue() {
		
		int minValue = this.data[0];
		for(int i = 1;i < this.data.length;i++){
			if(this.data[i] < minValue){
				minValue = this.data[i];
			}
		}
		return minValue;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		int[] ueberArray = new int[data.length];                         ///////
		for(int i = 0;i < ueberArray.length;i++){
			if(ueberArray[i] > threshold){
				ueberArray[i] = threshold;
			}
		}
		return ueberArray;
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
