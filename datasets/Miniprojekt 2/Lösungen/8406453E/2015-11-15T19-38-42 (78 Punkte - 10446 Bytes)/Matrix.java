import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values = initialValues;
		/* Aufgabe a) Konstruktor
		 * Ergänzen Sie den Konstruktor so, dass dem Feld Matrix.values
		 * der Parameter initialValues zugewiesen wird.
		 */

	}

	public void scalarMultiplication(int c) {
		for(int row = 0; row < values.length; row++){
			for(int column = 0; column < values[row].length; column++){
				values[row][column] = values[row][column] * c;
				//Zeile 15 und "values[row][column] *= c;" sind dasselbe
				/* Aufgabe b) Skalare Multiplikation
				 * Implementieren Sie die Methode scalarMultiplication
				 * (int c) so, dass sie die durch values definierte Matrix
				 * mit dem Skalarwert c multipliziert.
				 */
				
			}
		}

	}

	public void add(Matrix m) {
		for(int row = 0; row < values.length; row++){
			for(int column = 0; column < values[row].length; column++){
				values[row][column] = values[row][column] + m.values[row][column];
				/* Aufgabe c) Addition
				 * Die Methode add(matrix m) soll die übergebene
				 * Matrix m zu der durch values definierte Matrix
				 * addieren. 
				 */
			}
		}

	}

	public int[] getColumnVector(int col) {
		return null;
		/* Aufgabe d) Spaltenvektor
		 * Die Methode getColumnVector(int col) soll den Vektor,
		 * der Spalte co1 beschreibt, als int-Array zurückgeben.
		 */
	}

	public boolean isEqualTo(Matrix m) {
		return false;
		/* Aufgabe e) Vergleich
		 * Die Methode inEqualTo(Matrix m) soll true zurückgeben,
		 * wenn die Matrix, auf der die Methode aufgerufen wurde,
		 * identisch zu m ist, ansonsten false. Zwei Matrizen sind
		 * identisch, wenn :
		 * - sie in der Anzahl der Zeilen übereinstimmen,
		 * - sie in der Anzahl der Spalten übereinstimmen,
		 * - jeder Wert a-ij aus der Matrix mit a-ij aus der
		 * anderen Matirx übereinstimmt.
		 */
	}

	public void transpose() {
		
		/* Aufgabe f) Transponieren
		 * Die Methode transpose() soll die in values definierte Matrix
		 * transponieren, d.h. an ihrer Hauptdiagonalen spiegeln
		 * ("Zeilen und Spalten werden vertauscht").
		 */
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
