import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];

	}

	public void addValue(int value) {
		
		//neues array mit größe altes array+1
		//altes array in neues kopieren
		//neuen value hinzufügen
		
		int[] data2 = new int[data.length+1];
		data2=data;
		data2[data2.length-1]=value;
		data=data2;
		return;
		
		
		
	}

	public void addValues(int[] values) {
		int laenge = data.length+values.length-1;
		int[] data2 = new int[laenge];
		data2=data;
		for(int i=0;i<values.length;i++){
			data2[data.length+i] = values[i];
			
		}
		data=data2;
		return;
		

	}

	public int getMinimumValue() {
		/*
		int min=0;
		int laenge = data.length;
		while(laenge!=0){
			if( min < data[laenge-1]){
				min = data[laenge-1];
			}
			laenge--;
		}
		return min;
		*/
		/* -array durchlaufen und wert in int speichern
		 * -int mit allen werten vergleichen
		 * -wenn neuer wert kleiner -> neuer int
		 * 
		 */
		int min=data[0];
		for(int i=0;i<data.length-1;i++){
			if(min<=data[i]){
				min=data[i];
			}
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		/*
		int[] uber = new int[1];
		int laenge = data.length;
		int uberlaenge=0;
		while(laenge!=0){
			if(threshold<data[laenge-1])
				uber[uberlaenge] = data[laenge-1];
				uberlaenge++;
				laenge--;
		}
		return uber;
		*/
		//-wenn array=null-> rückgabe=0
		//-array durchlaufen
		//-wert mit threshold vergleichen
		//-wenn wert>threshold-> in neues array
		int treffer=0;
		if(data==null)
			
		for(int i=0;i<data.length-1;i++){
			if(data[i]<threshold){
				treffer++;
			}
		}
		
		int[] thresh = new int[treffer];
		for(int i=0;i<data.length-1;i++){
			if(data[i]<threshold){
				thresh[i]=data[i];
			}
		}
		
		return thresh;
		
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
