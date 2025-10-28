import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];

	}

	public void addValue(int value) {
		int [] neuesArray = new int[data.length + 1];
		for(int i = 0; i < data.length;i++){
			neuesArray[i]=data[i];
		}
		neuesArray[neuesArray.length -1] = value;
		data=neuesArray;

	}

	public void addValues(int[] values) {
		// 1. VERSION
		//int[] neuesArray= new int[data.length];
		//for(int i=0; i< data.length; i++){
		//	neuesArray[i]= data[i];
		//}
		//int neueGröße = data.length + values.length;
		//data= new int[neueGröße];
		
		//for(int j = 0; j< neuesArray.length; j++){
		//	data[j] = neuesArray[j];
		//}
		//for(int k=0; k < values.length; k++){
		//	data[neuesArray.length + k]= values[k];
		//}
	//}
		
		// 2.VERSION
		//for(int i=0; i< values.length; i++){
		//	addValue(values[i]);
		 //   }
		//}

		
		//3. VERSION 
		int[] neuesArray= new int[data.length +values.length];
		for(int i=0; i< data.length; i++){
			neuesArray[i]=data[i];
		}
		for(int i=0; i< values.length; i++){
			neuesArray[data.length + i]= values[i];
		}
		    data= neuesArray;
		
	}	
		
		
		
	//WICHTIG - getMaximumValue() selber machen
	public int getMinimumValue() {
		//int value = Integer.MAX_VALUE ;
		int value= data[0];
		
		for(int i=0 ; i< data.length; i++){
			if(data[i] < value){
				value = data[i];
			}
		}
		return value;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		//int echtGrößer = 0;
		//for(int i = 0; i< data.length; i++){
		//	if (data[i] > threshold){
			//	echtGrößer++;
		//	}
		//}
		
		//int[] loesung = new int[echtGrößer];
		//int counter = 0;
		//for (int j = 0; j < loesung.length; j++)
		//{
		//	while(counter < data.length)
		//	{
		//		if(data[counter] > threshold) 
		//		{
		//			loesung[j] = data[counter];
		//			counter++;
		//			break;
		//		}
		//		counter++;
		//	}
		//}return loesung;
		
		int[] echtGrößer = new int[0];
		for(int i=0; i< data.length; i++){
			if(data[i] > threshold){
				
			   int[] loesung = new int[echtGrößer.length +1];
			   for(int j=0;j< echtGrößer.length; j++){
				   loesung[j]=echtGrößer[j];
			   }
			   loesung[echtGrößer.length] = data[i];
			   echtGrößer=data;
			}
		}
		return echtGrößer;
 
	
	
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


