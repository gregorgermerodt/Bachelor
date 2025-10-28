import java.util.Arrays;

public class Measurement {

	private int[] data;
	

	public Measurement() {
		data = new int [0];

	}

	public void addValue(int value) {
        if(data.length == 0) {
             int[] data2 = {value};
             data = data2;
             }else{           
	          int[] data2 = new int[this.data.length+1];                        
                for(int i = 0; i < this.data.length; i++){
                       data2[i] = this.data[i];
                         if(i == this.data.length-1){
                             data2[i+1]=value;
                                }
                             }
                        data = data2;
                }		
	}

	public void addValues(int[] values) {
		int value=0;
		int i = 0;
		while (i<values.length){
			 value=values[i];
			 addValue(value);
			 i++;
		 }
		

	}

	public int getMinimumValue() {
		int min=data[0];
		int i=0;
		while (i<data.length){
			if(min>=data[i]){
				min=data[i];
			}
			i++;
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int i=0;
		int[]o=new int[data.length];
		for (int j=0; j < this.data.length; j++){
		if(data[j]>threshold){
			o[i]=data[j];
			i++;
		}
		}
		int[]over=new int[i];
		for (int z=0; z < over.length; z++){
			over[z]=o[z];
		}
		return over;
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
