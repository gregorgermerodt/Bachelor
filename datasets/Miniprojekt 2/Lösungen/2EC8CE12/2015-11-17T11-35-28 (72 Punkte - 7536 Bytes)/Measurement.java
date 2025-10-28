import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data= new int[0];
	}

	public void addValue(int value) {
		int[] hilfe = new int[data.length];
		for(int i=0;i<data.length;i++){
			hilfe[i]=data[i];
		}
	data=new int[hilfe.length+1];
	for(int j=0;j<hilfe.length;j++){
		data[j]=hilfe[j];
	}
	data[data.length-1]=value;
	}

	public void addValues(int[] values) {
		int[] hilfe = new int[data.length];
		for(int i=0;i<data.length;i++){
			hilfe[i]=data[i];
		}
		int laenge= hilfe.length+values.length;
		data=new int[laenge];
		for(int j=0;j<hilfe.length;j++){
			data[j]=hilfe[j];
			}
		for(int k=0;k<values.length;k++){
			data[hilfe.length+k]=values[k];
		}
	}

	public int getMinimumValue() {
		int hilfe=Integer.MAX_VALUE;
		for(int i=0;i<data.length;i++){
			if(data[i]<hilfe){
				hilfe=data[i];
			}
		}
		return hilfe;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int counter=0;
		for(int i=0;i<data.length;i++){
			counter++;	
		}
		int laenge=counter/2;
		int[] hilfe1=new int[laenge];
		int[] hilfe2=new int[laenge];
		for(int j=0;j<data.length-laenge;j++){
			hilfe1[j]=data[j];
		}
		for(int k=0;k<data.length-laenge;k++){
			hilfe2[k]=data[k+laenge];
		}
		
		int[] data2=new int[laenge];
		for(int g=0;g<hilfe2.length;g++){
			if(hilfe2[g]>threshold){
				data2[g]=hilfe2[g];
			}
		}
		for(int f=0;f<hilfe1.length;f++){
			if(hilfe1[f]>threshold){
				data2[f]=hilfe1[f];
			}
		}
		
		return data2;
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
		System.out.println("Hinzuf�gen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzf�gen einer Menge von Werten. m:");
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
		System.out.println("Messwerte �ber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte �ber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
