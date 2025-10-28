import java.util.Arrays;

public class Measurement {

	private int[] data;
	
	
	public Measurement() {
		
		data= new int[0];
		

	}

	public void addValue(int value) {
		int[] end= new int[data.length];
		
		for(int i=0; i<data.length; i++){
			
			end[i] = data[i];
			
		}
		
		//int neuelaenge= data.length +1;		muss ich das so machen? Ich habe im nächsten schritt sowieso das array um eine Stelle erweitert
		
		data= new int[end.length +1];
		
		for(int k=0; k< end.length; k++){
			
			data[k] = end[k];
		}
		
		data[end.length]= value;				//oder muss hier in die klammer end.length?

	}

	public void addValues(int[] values) {
		
		int[] ende= new int [data.length];
		
		for(int i=0; i<data.length; i++){
			
			ende[i] = data[i];
			
		}
		
		//ende-Werte in data back-kopieren
		data= new int[ende.length + values.length];		//ende.length ist doch dasselbe wie data.length? -ja geht so auch
		
		for(int k=0; k<ende.length; k++){
			
			data[k] = ende[k];
			
		}
		
		for(int j=0; j< values.length; j++){
			
			data[ende.length +j] = values[j];
			
		}
		
		
		

	}

	public int getMinimumValue() {
		
		int wert= Integer.MAX_VALUE;
		
		for(int i=0; i<data.length; i++){
			
			if(data[i]< wert){
				
				wert= data[i];
				
			}
			
		}
		
		
		
		return wert;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		
		int counter1 = 0;                           //Counter zum zählen, wie groß das neue Array werden soll
        
        for (int i = 0 ; i < data.length ; i++){ //Größe des neuen Arrays bestimmen
            if(data[i] > threshold)
                counter1++;
        }
         
        int[] arrayloesung = new int[counter1];     //Neues Array mit der vorher bestimmten Größe
         
        int counter2 = 0;                           //2. Counter um die Zahlen zu ermitteln die größer als threshold sind
         
        for(int j = 0 ; j < arrayloesung.length; j++)    //'j' wird für die Stellen im arrayloesung gebraucht, wo wir was abspeichern wollen
        {
                 
                while(counter2 < data.length)        //solange wir uns im data array befinden (also Zahl ist < als Zahl für die Größe des data Arrays)...
                {
                    if(data[counter2] > threshold)   //Wenn die Zahl an der Stelle des Counters im data Array > threshold...
                    {
                        arrayloesung[j] = data[counter2];   //...Dann speicher die Zahl in unserem Lösungs Array an der jeweiligen Stelle ab
                        counter2++;                         //Counter muss erhöht werden, sonst überschreibt er immer die selbe Zahl
                        break;
                    }
                    counter2++;                     //...falls keine Zahl gefunden wurde die > threshold dann geh zur nächsten Stelle [Zahl]
                }
        }
        return arrayloesung;   
		
		
		
		/* int array[]= new int[data.length];
		
		for(int i=0; i<data.length; i++){
			
			if(data[i] > threshold){
				
				array[i] = data[i];
			}
		} 
		
		
		
		
		return arrayloesung*/
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
		System.out.println("HinzufÃ¼gen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("HinzuzfÃ¼gen einer Menge von Werten. m:");
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
		System.out.println("Messwerte Ã¼ber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte Ã¼ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
