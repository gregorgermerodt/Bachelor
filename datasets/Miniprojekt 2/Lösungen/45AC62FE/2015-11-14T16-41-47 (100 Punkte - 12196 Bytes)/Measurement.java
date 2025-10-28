import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		// a) einfache Instanzierung, siehe hierzu pdf Seite 9.
		//    Wichtig ist es in die eckigen Klammern 0 einzutragen.
		data = new int [0];
	}

	public void addValue(int value) {
		// b) Hier ist es notwendig am Anfang eine If bedingung einzubauen,
		// f�r den Fall dass das Array die L�nge 0 haben sollte, das sieht dann 
		// folgenderma�en aus.
		if ( data.length == 0){
		// int[]damn ist das array und value steht f�r den inhalt des Arrays
		// da wir mit einer L�nge von 0 nur einen Platz im Array haben, kann
		// es nur mit value belegt werden, im Anschluss der Verweis von data 
		// zu damn.
			int[]damn = {value};
			data = damn;
			} else {
		// Wir bauen das neue Array welches um +1 gr��er ist als data.
		int[] damn = new int [this.data.length+1];
		// es folgt die for-schleife.
		for ( int i = 0; i < this.data.length; i++) {
		// verweis von data[i] auf damn[i]
			damn[i] = data[i];
		// zweite if bedingung, diese ist wichtig damit das array weiss, an 
		// welcher stelle sp�ter value stehen soll, damn[i+1] = value;
			if ( i == this.data.length-1) {
				damn[i+1] = value;
			}
		} data = damn;
	}
	}
	public void addValues(int[] values) {
		//c) da wir zwei arrays haben m�ssen wir diese beim neuen Array
		// mit einbauen daher "new int[this.data.length + values.length"]
		int[] damn = new int[this.data.length + values.length];
		// f�r den fall das values leer sein sollte, nach der if bedingung 
		// kann man direkt zum else �bergehen ( {} nicht vergessen)
		if ( values == null) {
		} else {
		// for schleife
			for ( int i = 0; i <= data.length; i++) {
		// f�r den fall das i mit der l�nge von data �bereinstimmt.
				if (i == data.length) {
					// beim folgenden Schritt habe ich auch Probleme es richtig
					// nachzuvollziehen, daher sage ich lieber nichts bevor
					// ich was falsches erz�hle
					for ( int j = i, k = 0; j < damn.length; j++ , k++) {
						damn[j] = values[k];
					}
				} else {
					// verweis
					damn[i] = data[i];
				}
				
			} // verweis
		} data = damn;

	}

	public int getMinimumValue() {
		// wir brauchen eine variable f�r den kleinsten wert, der auf 
		// die [0] stelle im array verweist.
		int zwerg = data[0];
		for ( int i = 0; i < this.data.length; i++) {
		// If bedingung f�r den fall, das irgendein wert im array
		// kleiner als die variable sein sollte
			if (zwerg > data[i]) {
		// sollte irgendein index kleiner sein , so verweist unsere variable dann 
		// auf diesen wert
				zwerg = data[i];
			}
		} // return, da keine void methode
		return zwerg;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		// if bedingung f�r den fall das threshold 0 sein sollte, 
		// in diesem fall wird ein leeres objekt ausgespuckt, dennoch 
		// return null nicht vergessen.
		if ( threshold == 0) {
			return null;
		} else {
		// wir brauchen eine variable um die anzahl der wert > threshold zu bestimmen
			int Zahler = 0;
		// ein extra array mit der sleben l�nge wie data, da wir keine ahnung haben 
		// wie gro� der array wird.
			int[] doom = new int [this.data.length];
			for ( int i = 0; i < this.data.length; i++) {
		// if-bedingung f�r den fall das irgendein wert gr��er als threshold sein 
		// sollte, diese werden dann in Zahler gespeichert, dieser wird erh�ht, wenn
		// neue werte gefunden werden, daher muss Zahler auch weiterlaufen (Zahler++)
				if ( data[i] > threshold) {
					doom[Zahler] = data[i];
					Zahler++;
				}
			}
		// ein neues array mit der l�nge Zahler, da zahler die anzahl der werte 
		// und damit die l�nge wiedergibt.
			int [] newThreshold = new int[Zahler];
		// die werte von doom in threshold �bertragen, dazu for - schleife
		// und verweis, anschliessend wird das neue array ausgegeben.
			for ( int i = 0; i < newThreshold.length; i++) {
				newThreshold[i] = doom[i];
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
