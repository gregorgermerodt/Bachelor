
import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		//1a) Konstruktor 
		//Implementieren Sie den Konstruktor so, 
		//dass data als neues int-Array mit der L�nge 0 initialisiert wird.
		
		data = new int [0];

	}

	public void addValue(int value) {
		
		//1b) Die Methode addValues(int value) nimmt einen Messwert 
		//value entgegen und soll diesen als neuen Messwert an das 
		//Ende des data-Arrays setzen. Erzeugen Sie dazu ein neues, vergr��ertes Array.
		
		int [] temp= new int [data.length+1];
		
		for (int i=0; i<data.length; i++){
			temp[i]= data[i];	
		}
			temp [temp.length-1]= value;
				data= temp;
	}

	public void addValues(int[] values) {
		
		//1c) Die Methode addValues(int[] values) nimmt ein ganzes Array 
		//von Messwerten entgegen und soll diese als neue Messwerte an 
		//das Ende des data-Arrays setzen. 
		//Erzeugen Sie auch hier ein neues, vergr��ertes Array.		

		int [] temp = new int [data.length+ values.length];
		
		for (int i=0; i<data.length; i++){
			temp[i]= data[i];
		}
		
		for (int i=0; i<values.length; i++){
			temp[data.length+i]= values[i];
		}
		data= temp;
	}
	
	public int getMinimumValue() {

		//1d) Kleinster Wert 
		//Die Methode getMinimumValue() soll den kleinsten, 
		//in data enthaltenen Wert zur�ckgeben. 
		//Sie k�nnen den Fall, dass data keine Messwerte enth�lt, ignorieren.
		
		int min=data[0];
		           
		           for(int i=0; i<data.length; i++){
		               
		               if( min> data[i]){
		                   min=data[i];
		               }
		           }
		          return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		//1e) Werte �ber Schwellenwert 
		//Implementieren Sie die Methode getValuesAboveThreshold(int threshold) so, 
		//dass sie ein int-Array mit allen Werten aus data zur�ckgibt, die echt gr��er sind als 
		//der Schwellenwert treshold. Entspricht kein Wert diesem Kriterium oder enth�lt data keine Elemente, 
		//soll die Methode ein int-Array der Gr��e 0 zur�ckgeben.
		
		int[] temp= new int[0];
		           int anzahl= 0;
		           
		           for (int i=0; i< data.length; i++){
		               
		               if (data[i]>threshold){
		                   anzahl ++;
		               }
		           }
		           if (anzahl ==0){
		               return temp;
		           }
		           temp= new int[anzahl];
		           int index=0;
		           
		           for (int i=0; i< data.length; i++){
		               
		               if (data[i]>threshold){
		                  
		                   temp[index]= data[i];
		                   }
		               }
		           return temp;
	}
}

	
	