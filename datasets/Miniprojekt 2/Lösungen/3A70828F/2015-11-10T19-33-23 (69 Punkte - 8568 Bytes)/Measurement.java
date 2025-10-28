import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		
		this.data = new int[0];
		
		

	}

	public void addValue(int value) {
		
		
		int laenge=data.length+1;
		
		
		int data2[] =new int[data.length+1];
		
		
		
		
		
		
		
		data=data2;
		
		
		
	}

	public void addValues(int[] values) {
		int dLength=arraylaenge(data);
		int vLength=arraylaenge(values);
		
		
		
		int data3[]=new int[dLength+vLength];
		
		arraysBefullen(data3,data,0);
		arraysBefullen(data3,values,data.length+1);
		
		
		
		
		
	}

	private void arraysBefullen(int[] data3, int[] fuellung, int j) {
		// TODO Auto-generated method stub
		int index=j;
		
		for(int i=0; i<data.length;i++){
			
			data3[i]=fuellung[index];
			index++;
			
		}
		
		
		
		
		
	}

	private int arraylaenge(int[] harry) {
		// TODO Auto-generated method stub
		
		int counter=0;
		
		for(int i=0; i<harry.length;i++){
			counter++;
		}
		
		
		
		return counter;
	}

	public int getMinimumValue() {
		
		int minValue=Integer.MAX_VALUE;
		
		for(int i=0;i<data.length;i++){
			
			if(minValue>=data[i]){
				
				
				minValue=data[i];
			}
			
			
			
			
		}
		
		
		
		
		
		return minValue;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		
		
		int returnHarry[]=new int[returnHarryslange(threshold)];
		
		
		
		
		if(returnHarry.length>0){
			int	indexHarry=0;
			
		for(int i=0; i<data.length;i++){
			
			if(data[i]>threshold){
				
			
				returnHarry[indexHarry]=data[i];
				
			
			
			indexHarry++;
			}
			
			
		}
		
			return returnHarry;
		
		}
		
		else{
			
			
			
			return returnHarry;
		}
		
		
		
		
	}

	private int returnHarryslange(int threshold) {
		// TODO Auto-generated method stub
		int counter=0;
		
		for(int i=0; i<data.length;i++){
			
			if(data[i]>threshold){
				counter++;
			}
			
		}
		
		
		
		return counter;
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
