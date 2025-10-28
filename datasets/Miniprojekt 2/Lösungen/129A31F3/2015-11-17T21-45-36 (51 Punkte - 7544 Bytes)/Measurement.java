import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		this.data = new int[0] ;
					
	}

	public void addValue(int value) {
		int i=0;
		if(data.length == 0 ){
			data[i] = value;
			}
		else{
			int j=0;
			int neu[] = new int[j];
			for(int m=0; m<data.length;m++){
				if(m==j){
					data[m]= neu[j];
				j++;}
				else if(m<j){
					neu[j]= value;
				}
				}

			data = neu;}
	}

	public void addValues(int[] values) {

		
		
		
	}			

	public int getMinimumValue() {
		
		int wert=0;
		for(int i=0; i<data.length;i++){
			if(data[i] >= wert){
				return wert;
			}
			else if(data[i]<= wert){
				data[i] =wert;
			return wert;
			}
		}
		return wert;
	
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int laenge=0;
		for(int j=0; j< data.length;j++){
		if(data[j] > threshold){
			laenge++;}
		}
		int over []= new int[laenge];
		
		for(int k=0; k< data.length;k++){
		if(data[k] > threshold){
				
				over[laenge]= data[k];
				laenge++;
				return over;
			}
			else{
		k++;
		if(over.length == 0 || data.length ==0 ){
			return over;
		}
				return over;
				}}
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
