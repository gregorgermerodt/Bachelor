import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data=new int[0];
		
		

	}

	public void addValue(int value) {
		int[]neu=new int[data.length+1]; //neues array angelegt
		for(int index=0;index<data.length;index++){ //geht schleife durch um die elemente zu bekommen
			neu[index]=data[index]; // wert von neu wird in data kopiert,
		}
		neu[data.length]=value; // der neue messwert value wird an im neuen array an data.length stelle drangesetzt;
		data=neu;
		
	}

	public void addValues(int[] values) {
		int[]neu= new int[data.length+values.length];//neues array angelegt
		for(int index=0;index<data.length;index++){// schleife wird durchlaufen,um werte aufzurufen
			neu[index]=data[index];  //  werte werden kopiert
		}
		for(int index=0;index<values.length;index++){ //2.schleife wird durchlaufen,um werte vom anderen array aufzurufen
			neu[data.length+index]=values[index]; // werte von array values werden in neu kopiert und zwar an stelle von data.length
		}
		data=neu; 
		
	}

	public int getMinimumValue() {
		int min=Integer.MAX_VALUE;  // int min wird angelegt mit dem höchstmöglichen wert iwas mit 21928303ß3
		for(int index=0;index<data.length;index++){ // schleife wird durchlaufen;um werte von data aufzurufen
			if(data[index]<min){  // falls der index von data kleiner ist als das min(2194904403)
				min=data[index];  // wird das min abgespeichert 
			}
		}
		return min;   // min wird zurückgegeben
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[]temp=new int[0];                                      // neues array wird angelegt
		int[]neu;                                                  //array name neu
		for(int index=0;index<data.length;index++){                  // schleife wird durchlaufen um werte von data aufzurufen
			if(data[index]>threshold){ 
				                             
				neu=new int[temp.length+1];                            // es wird neues array angelegt 
				for(int index2=0;index2<temp.length;index2++){  // schleife durchlaufen um an die werte des kurac arrays zu gelangen
					neu[index2]= temp[index2];
				}
				neu[temp.length]=data[index];
				temp=neu;
			}
		}
		return temp;
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
