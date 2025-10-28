
import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		//1a) Konstruktor 
		//Implementieren Sie den Konstruktor so, 
		//dass data als neues int-Array mit der Länge 0 initialisiert wird.
		
		data = new int [0];

	}

	public void addValue(int value) {
		
		//1b) Die Methode addValues(int value) nimmt einen Messwert 
		//value entgegen und soll diesen als neuen Messwert an das 
		//Ende des data-Arrays setzen. Erzeugen Sie dazu ein neues, vergrößertes Array.
		
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
		//Erzeugen Sie auch hier ein neues, vergrößertes Array.		

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
		//in data enthaltenen Wert zurückgeben. 
		//Sie können den Fall, dass data keine Messwerte enthält, ignorieren.
		
		int min=data[0];
		           
		           for(int i=0; i<data.length; i++){
		               
		               if( min> data[i]){
		                   min=data[i];
		               }
		           }
		          return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		//1e) Werte über Schwellenwert 
		//Implementieren Sie die Methode getValuesAboveThreshold(int threshold) so, 
		//dass sie ein int-Array mit allen Werten aus data zurückgibt, die echt größer sind als 
		//der Schwellenwert treshold. Entspricht kein Wert diesem Kriterium oder enthält data keine Elemente, 
		//soll die Methode ein int-Array der Größe 0 zurückgeben.
		
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

	
	