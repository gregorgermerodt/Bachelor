import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[0];
	}

	private void setData(int[] data) {
	      this.data = data;
	   }
	
	public void addValue(int value) {
		setData(copyOldArrayInLargerArray(data, value));
	
		}

	 private int[] copyOldArrayInLargerArray(int[] data, int value) {
	      int[] result = new int[data.length + 1];

	      for (int i = 0; i < data.length; i++) {
	         result[i] = data[i];
	      }
	      result[result.length - 1] = value;

	      return result;
	   }
	
	
	public void addValues(int[] values) {
		setData(copyOldArrayInLargerArray(data, values));
	}

	private int[] copyOldArrayInLargerArray(int[] data, int[] values) {
	      int[] result = new int[data.length + values.length];

	      for (int i = 0; i < data.length; i++) {
	         result[i] = data[i];
	      }


	      for (int i = data.length, j = 0; i < result.length; i++, j++) {
	         result[i] = values[j];
	      }


	      return result;
	   }
	public int getMinimumValue() {
		
		int tempMin=data[0];
		
		for(int i=0; i<data.length-1; i++){
			if(data[i]<tempMin){
				tempMin=data[i];
				
			}
			
		}
		
		
		return tempMin;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int counter=0;
		int k=0;
		for(int i=0; i<data.length; i++){
			if(data[i]>threshold){
				counter++;
				}
			
		}
		
		int[] erg=new int[counter];
		
		for(int j=0; j<data.length; j++){
			
			
				if(data[j]>threshold){
				
					erg[k]=data[j];
					k++;
				
				
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
