import java.util.Arrays;

public class Matrix {

	private int[][] values; 											// values besteht aus zwei dimesionen
// Ergänzen Sie den Konstruktor so, dass dem Feld Matrix.values der Parameter initialValues zugewiesen wird
	public Matrix(int[][] initialValues) {
		
			values = initialValues;
	}
//Implementieren Sie die Methode scalarMultiplication(int c) so, 
//dass sie die durch values definierte Matrix mit dem Skalarwert c multipliziert
	public void scalarMultiplication(int c) {
		for (int row =0 ; row < values.length;row++){						// row = reihe  fragt zuerst die Reihenlänge ab
			for(int column =0; column < values[row].length; column++){		//  column = Spalte  abfrage des y Wertes
				
				values[row][column]=values[row][column]* c;					// values [x-Koordinate][y-Koordinate] values muss mit c multipliziert wegen Aufgabe
			}
		}
	}
//Die Methode add(Matrix m) soll die übergebene Matrix m zu der durch values definierten Matrix addieren:
	public void add(Matrix m) {
		for (int row =0 ; row < values.length;row++){						// row = reihe  fragt zuerst die Reihenlänge ab die Anzahl der Elemente in der Reihe
			for(int column =0; column < values[row].length; column++){		//  column = Spalte  abfrage des y Wertes
				
				values[row][column]=values[row][column] + m.values[row][column]; 	//m = matrix  row und clolumn sind wieder die Koodinaten, die addiert werden
			}
		}
	}
//Methode getColumnVector(int col) soll den Vektor, der Spalte col beschreibt, als int-Array zurückgeben:
	public int[] getColumnVector(int col) {
		int[] column= new int [values.length];
		for(int row =0; row< values.length; row++){
			column[row] = values[row][col];
	
	} 
		return column;
		}
/*Die Methode isEqualTo(Matrix m) soll true zurückgeben, wenn die Matrix, auf der die Methode aufgerufen wurde, identisch zu m ist, ansonsten false. Zwei Matrizen sind identisch, wenn
* sie in der Anzahl der Zeilen übereinstimmen
 *sie in der Anzahl der Spalten übereinstimmen
 *jeder Wert aij aus der einen Matrix mit aij aus der anderen Matrix übereinstimmt*/
	public boolean isEqualTo(Matrix m) {
		
		
		return Arrays.deepEquals(values, m.values); 		// vergleicht beide matrizen und gibt true wieder wenn es war ist , wenn es falsch ist gibt es falsch aus
	}
	//Die Methode transpose() soll die in values definierte Matrix transponieren,
	// d.h. an ihrer Hauptdiagonalen spiegeln („Zeilen und Spalten werden vertauscht“):
	public void  transpose() { 														// neues Array ersten dasdie Breite und länge von 
		int[][] neuMatrix  = new int [values[0].length][values.length];
		
			for (int row =0 ; row < values.length;row++){							
				for(int column =0; column < values[row].length; column++){			
																					
					neuMatrix[column][row] = values[row][column];
				}
			}  values = neuMatrix;
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