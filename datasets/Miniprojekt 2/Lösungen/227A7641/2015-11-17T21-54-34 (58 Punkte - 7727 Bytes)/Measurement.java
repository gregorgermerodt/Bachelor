import java.util.Arrays; 
 
 
 public class Measurement { 
 
 
 	private int[] data; 
 
 
 	public Measurement() { 
 		// create empty array 
	data = new int[0]; 
	} 
 
  	public void addValue(int value) { 
 		// create array with one more space to save the added value 
 		int [] newArr = new int[data.length + 1]; 
		 
 		// save "old" array in "new" array 
		for (int i=0; i<data.length; i++) { 
			newArr[i] = data[i]; 
 		} 
 		 
 		// add the value 
 		newArr[data.length] = value; 
 		 
 		// save new Array 
 		data = newArr; 
 	} 
 
 
 	public void addValues(int[] values) { 
 		// create array with space to save all old and new values 
 		int [] newArr = new int[data.length + values.length]; 
 		 
 		// save "old" array in "new" array 
 		for (int i=0; i<data.length; i++) { 
 			newArr[i] = data[i]; 
 		} 

// save "new" values in "new" array 
 		for (int i=data.length; i<(data.length + values.length); i++) { 
 			newArr[i] = values[i - data.length]; 
		}  		 
 		// this.printData(); 
 		// save new array 
		data = newArr; 
		// this.printData(); 
 	} 
 
 
 	public int getMinimumValue() { 
 		// initialize "min" with first value of array 
 		int min = data[0]; 
 		 
 		// iterate through array 
 		for (int i=1; i<data.length; i++) { 
 			// is current value smaller than current min? 
 			if (data[i] < min)  
 				// then save as min 
 				min = data[i]; 
 		} 
 		 
 		return min; 
 	} 
 
 
 	public int[] getValuesAboveThreshold(int threshold) { 
 		// counter to count how many values are above the threshold 
 		int count = 0; 
 		 
 		// count 
 		for (int i: data) { 
 			if (i > threshold)  
 				count++; 
 		} 
 		 
 		// initialize Array with place for the values above the threshold 
 		int[] returnArray = new int[count]; 
 		 
 		// nothing above? Then return empty array 
 		if (count == 0)  
 			return returnArray; 
	 
	// iterate through both arrays and save all values above 
	// j is index for the "returnArray" 
	int j = 0; 
	// i is index for our old array 
	for (int i=0; i<data.length; i++) { 
		if (data[i] > threshold) { 
			returnArray[j] = data[i]; 
			// manually increase index for returnArray when we found a value above 
			j++; 
		} 
	} 
	 
 		return returnArray; 
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

