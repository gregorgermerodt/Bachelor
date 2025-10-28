import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data=new int[0];


	}

	public void addValue(int value) {
		// ich errichte ein hilfarray um die werte aus dem data-Array darin zu speichern	
		int[] hilfsarray= new int[data.length];

		//jetzt bestimmen wir mit der for-schleife die tatsachliche länge des arrays    
		for (int i=0; i<data.length;i++){

			//danach setzen wir die werte von data in das hilfarray ein		
			hilfsarray[i]=data[i];

			// damit ist das erstmal zwischengespeichert	
		}

		int neueLaenge = data.length + 1;
		// ja wir wollen nur eine werte einlesen und erweitern

		// das array data wird ein neues Array mit der länge aus
		//unserer hilfsvariable	
		data=new int[neueLaenge];

		for(int j=0; j<hilfsarray.length;j++){
			data[j]=hilfsarray[j];
		}
		data[data.length-1]=value;
		//
		//for (int i = 0; i < hilfsarray.length; i++){
		//	data[i+1]=hilfsarray[i];
		//}
		//data[0]=value;    hinfugen am kopf


	}

	public void addValues(int[] values) {
		int[]hilfsarray=new int[data.length]	;
		for(int i=0;i <data.length;i++){
			hilfsarray[i]=data[i];
		}
		int neueLaenge= data.length + values.length;
		// dann wieder  neu initialisieren mit der "neueLaenge"
		data= new int[neueLaenge];

		//laenge des Hilfsarrays zahlen

		// for (int j=0;j<data.length;j++){
		// in j speichern
		//	 data[j]=hilfsarray[j];
		// }
		// die werte von "values" zahlen und in k speichern

		for(int k=0;k <values.length;k++){
			data[hilfsarray.length + k]=values[k];

			//jedoch wird dieses data array erweitert um die Anzahl der in der variable k gespeicherten
			//zahl. danach werde die Werte aus "values" an das data array hinzugefügt.

		}
	}

	public int getMinimumValue() {
		// bestimmen eines mininales wertes in dem Array
		// wir erstellen eine Hilfsvariable L mit dem maximale inzteger werte
		int L= Integer.MAX_VALUE;
		for (int i=0;i<data.length;i++){
			if (data[i]<=L);
			// diesen Werte in L speichern
			L=data[i];
		}

		return L ;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int hilfe=0;
		for (int i=0;i<data.length;i++){
			if(data[i]>threshold){
				hilfe++;
			}
		}
		int[]loesung=new int[hilfe];
		int counter=0;
		for(int j=0; j<loesung.length; j++)
		{
			while(counter<data.length){
				loesung[j]=data[counter];
				counter++;
				break;
			}
			counter++;
		}



		return loesung;
	}
	// --------------------------------------------------------------

	public void printData() {
		data= new int[0];
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
