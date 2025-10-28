import java.util.Arrays;

public class Matrix {

	private int[][] values; //2Dimensionale Arrays;
	/* |1|2|3| 
	 * |4|5|6|
	 * |7|8|9|
	 * Zeile/ Row und Spalte/ Column 
	 * [zeile][spalte]
	 * [2][0] -> Wert 7
	 * 
	 * 
	 * */
	/*Ergänzen Sie den Konstruktor so, dass dem Feld 
	 * Matrix.values der Parameter initialValues zugewiesen wird 
	 * */
	public Matrix(int[][] initialValues) {
		this.values = initialValues; //da keine Namensdopplung herrscht würde value = init...
									 //auch gehen
	}
	/*Implementieren Sie die Methode scalarMultiplication(int c) so, 
	 * dass sie die durch values definierte Matrix mit dem 
	 * Skalarwert c multipliziert: */
	public void scalarMultiplication(int c) {
		for(int reihe =0; reihe < values.length;reihe++){ //Zeile
			//Spalte
			//values[0].lenght würde auch gehen, da unsere matrix in jeder zeile gleichlang ist
			// aber values[reihe] is sicherer 
			for(int spalte = 0; spalte <values[reihe].length;spalte++){
				//Zeile 1; Spalte 1,2,3 erst danach nchste Zeile etc
				values [reihe][spalte]*=c; 
				//bsp. [0] [0] * c
				//	   [0] [1] * c
				//	   [0] [2] * c
				//     [1] [0] * c ......
			}			
		}
	}
	/*Die Methode add(Matrix m) soll die übergebene Matrix m 
	 * zu der durch values definierten Matrix addieren: */
	public void add(Matrix m) {
		//Lsg. nicht ganz richtig, weil die Prüfung der Dimensionen fehlt
		// man kann nur gleich große Matrizen addieren
		for(int reihe=0; reihe <values.length;reihe++){
			for(int spalte =0;spalte <values[reihe].length;spalte++){
				values [reihe][spalte]+=m.values[reihe][spalte];
				//[0][1]+=[0][1] also werte die dadrin sind
				//m.values = werte vom Objekt M
			}
		}
	}
	/*Die Methode getColumnVector(int col) soll den Vektor, der Spalte col 
	beschreibt, als int-Array zurückgeben: */
	
	public int[] getColumnVector(int col) {
		//neues array mit länge von values wegen zeilen
		int [] spalte = new int [values.length];
		// 
		for(int i=0; i <values.length;i++){
			spalte [i] = values [i][col];
		}

		return spalte;
	}
	
	//WENN ZEILE gefragt gewesen wäre einfach int []zeile = col;
	
	
	/*Die Methode isEqualTo(Matrix m) soll true zurückgeben, wenn die Matrix, auf der 
	die Methode aufgerufen wurde, identisch zu m ist, 
	ansonsten false. Zwei Matrizen sind identisch, wenn 
	x sie in der Anzahl der Zeilen übereinstimmen 
	x  sie in der Anzahl der Spalten übereinstimmen 
	x jeder Wert a ij  aus der einen Matrix mit a ij  aus der anderen Matrix übereinstimmt 
	 * */
	public boolean isEqualTo(Matrix m) {
		//gucken ob die gleich groß sind, sonst direkt falsch 
		if(values.length==m.values.length && values[0].length ==m.values[0].length){
			for(int reihe=0;reihe<values.length;reihe++){
				for(int spalte=0;spalte<values[reihe].length;spalte++){
					//wenn ein element gefunden wird,dass ungleich ist gibt der falsch aus
					if(values[reihe][spalte]!=m.values [reihe][spalte]){
						return false;
					}
				}
			}
			return true; //außerhalb der Schleifen, damit jeder Wert überprüft wird und nicht 
			//nach dem ersten richtigen schon aufgehört wird (wenn man else{ nach dem if 
			//implementiert hätte
		}
		else{ 
			return false;
		}
		
	}
	/*Die Methode transpose() soll die in values 
	 * definierte Matrix transponieren, d.h. an ihrer 
	 * Hauptdiagonalen spiegeln („Zeilen und Spalten werden vertauscht“): 
	 * */
	public void transpose() {
		//zeile und spalten tauschen
		//normalerweise values[0].length = spaltenlänge
		//das als zeilen länge definieren und umgekehrt
		int trans [][]= new int [values[0].length][values.length];
		//durchlaufe spalte und danach zeilen 
		for(int spalte=0;spalte<values[0].length;spalte++){
			for(int reihe=0;reihe<values.length;reihe++){
				trans[spalte][reihe]= values [reihe][spalte];
			}
		}
		values = trans;
	}

	// --------------------------------------------------------------

	private void print() {
		if (values == null) {
			System.out.println("null");
		} else {
			System.out.printf("%dx%x:%n", values.length, values[0].length);

			for (int[] row : values) {
				System.out.println(Arrays.toString(row));
			}
		}
	}

	public static void main(String[] args) {
		Matrix m = new Matrix(new int[][] { { 2, 4, 5 }, { 3, 7, 2 },
			{ -2, 0, 1 }, { 5, 1, 1 } });

		System.out.println("Neue Matrix m erzeugt. Matrix m:");
		// Erwartete Ausgabe:
		// 4x3:
		// [2, 4, 5]
		// [3, 7, 2]
		// [-2, 0, 1]
		// [5, 1, 1]
		m.print();

		System.out
		.println("------------------------------------------------------------------");

		Matrix n = new Matrix(new int[][] { { 1, 0, -1 }, { 1, 3, 3 },
			{ -2, -4, 1 }, { 0, 0, 1 } });

		System.out.println("Neue Matrix n erzeugt. Matrix n:");
		// Erwartete Ausgabe:
		// 4x3:
		// [1, 0, -1]
		// [1, 3, 3]
		// [-2, -4, 1]
		// [0, 0, 1]
		n.print();

		System.out
		.println("------------------------------------------------------------------");

		System.out
		.println("Skalarmultiplikation von Matrix n mit dem Wert -1. Matrix n:");
		n.scalarMultiplication(-1);
		// Erwartete Ausgabe:
		// 4x3:
		// [-1, 0, 1]
		// [-1, -3, -3]
		// [2, 4, -1]
		// [0, 0, -1]
		n.print();

		System.out
		.println("------------------------------------------------------------------");

		System.out.println("Matrix n wird zu Matrix m addiert. Matrix m:");
		m.add(n);
		// Erwartete Ausgabe:
		// 4x3:
		// [1, 4, 6]
		// [2, 4, -1]
		// [0, 4, 0]
		// [5, 1, 0]
		m.print();

		System.out
		.println("------------------------------------------------------------------");

		System.out.println("Spaltenvektor mit Index 1 von Matrix m:");
		int[] columnVector = m.getColumnVector(1);
		// Erwartete Ausgabe:
		// [4, 4, 4, 1]
		System.out.println(Arrays.toString(columnVector));

		System.out
		.println("------------------------------------------------------------------");

		System.out.println("Vergleich von Matrix m mit Matrix n:");
		// Erwartete Ausgabe:
		// false
		System.out.println(m.isEqualTo(n));

		System.out
		.println("------------------------------------------------------------------");

		Matrix o = new Matrix(new int[][] { { 1, 4, 6 }, { 2, 4, -1 },
			{ 0, 4, 0 }, { 5, 1, 0 } });

		System.out.println("Neue Matrix o erzeugt. Matrix o:");
		// Erwartete Ausgabe:
		// 4x3:
		// [1, 4, 6]
		// [2, 4, -1]
		// [0, 4, 0]
		// [5, 1, 0]
		o.print();

		System.out
		.println("------------------------------------------------------------------");

		System.out.println("Vergleich von Matrix o mit Matrix m:");
		// Erwartete Ausgabe:
		// true
		System.out.println(o.isEqualTo(m));

		System.out
		.println("------------------------------------------------------------------");

		System.out.println("Transponieren von Matrix o. Matrix o:");
		o.transpose();
		// Erwartete Ausgabe:
		// 3x4:
		// [1, 2, 0, 5]
		// [4, 4, 4, 1]
		// [6, -1, 0, 0]
		o.print();
	}
}
