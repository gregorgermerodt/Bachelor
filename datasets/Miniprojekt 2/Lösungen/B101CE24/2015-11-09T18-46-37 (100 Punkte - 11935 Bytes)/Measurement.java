import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		//data wird als neues int Array mit der L�nge 0 initialisiert
		this.data=new int[0];

	}

	public void addValue(int value) {
		//falls das Array die L�nge 0 hat
		if(this.data.length==0){
			
			//wird ein neues Array mit dem vorgegebenen Messwert als Inhalt erzeugt
			int[] data2={value};
			
			//und data wird mit dem neuen Array �berschrieben
			this.data=data2;
			
		}
		//falls nicht
		else{
			
			 //wird ein neues Array mit der L�nge von data +1 erzeugt
			int[] data2=new int[this.data.length+1];
			
			//jetzt sollen die einzelnen Messwerte in data2 reingeschrieben werden --> for schleife
			for(int i=0;i<this.data.length;i++){
				
				//die Stelle i in data2 wird mit dem Messwert der Stelle i aus data �berschrieben
				data2[i]=data[i];
				
				//aber data2 ist um 1 l�nger und die letzte Stelle soll value erhalten
				//deswegen nachgucken ob die letzte stelle von data erreicht wurde (data.lenght-1 da Array bei 0 anf�ngt zu z�hlen)
				if(i==this.data.length-1){
					data2[i+1]=value;
				}
			}
			//wenn die for-schleife beendet ist soll data=data2 sein , damit mit data2 weitergearbeitet werden kann
			this.data=data2;
			
		}

	}

	public void addValues(int[] values) {
		
		//neues Array erzeugen mit der L�nge des data Arrays+der L�nge des zu hinzuf�genden Arrays
		int[] data2=new int[this.data.length+values.length];
		
		//falls values leer ist nichts tun
		if(values==null){
			
		}
		else{
			
			//wie oben for-Schleife verwenden, allerdings diesmal verschachtelt 
			// <= damit im fall von i==this.data.length kein Problem aufrtitt
			for(int i=0;i<=this.data.length;i++){
				
				//falls die Schleife das Ende von data erreicht bzw einen Schritt weiter ist
				if(i==this.data.length){
					
					//j dient f�r das data2 Array und k f�r das values Array
					//beides in eine Schleife packen dient zum gleichzeitigen weiterf�hren der Spr�nge
					for(int j=i,k=0;j<data2.length;j++,k++){
						
						//die Werte von values werden in das data2 Array �bertragen
						data2[j]=values[k];
						
					}
					
				}
				//falls das Ende von data noch nicht erreicht wurde
				else{
					
					//die Werte von data in data2 reinschreiben
					data2[i]=this.data[i];
				}
			}
		
		}
		//data wird als data2 �berschrieben
		this.data=data2;

	}

	public int getMinimumValue() {
		//neue Variable initialisieren , min ist der Wert an der ersten Stelle im data
		int min=data[0];
		
		//um durchgehen zu k�nnen --> for schleife
		for(int i=0;i<data.length;i++){
			
			//falls die Stelle i einen kleineren Wert als die Stelle min hat
			if(data[i]<min){
				
				//dann ist i das neue min
				min=data[i];
			}
		}
		//min soll z�r�ckgegeben werden
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		//falls der Schwellenwert 0 ist, dann soll es nichts zur�ckgeben
		if(threshold==0){
			return null;
		}
		else{
			
			//neue variable um die werte aufzufassen
			int neueWerte=0;
			
			//neues Array erzeugen um mit den Werten aus data arbeiten zu k�nnen, ohne data zu ver�ndern
			int[] hilfsArray=new int[data.length];
			
			//for schleife um durchgehen zu k�nnen
			for(int i=0;i<data.length;i++){
				
				//falls Wert i gr��er als der Schwellenwert ist
				if(data[i]>threshold){
					
					//das hilfsArray mit i �berschreiben
					hilfsArray[neueWerte]=data[i];
					
					//neueWerte weiterf�hren
					neueWerte++;
				}
			}
			//neues Array erzeugen, dass die neuen Werte enth�lt um einen Array zur�ckgeben zu k�nnen
			int[] newThreshold = new int[neueWerte];
                
				//mit einer for Schleife das Array durchgehen
                for(int i = 0; i < newThreshold.length; i++)
                {
                		//newThreshold �berschreiben
                        newThreshold[i] = hilfsArray[i];
                }
               
                return newThreshold;
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
