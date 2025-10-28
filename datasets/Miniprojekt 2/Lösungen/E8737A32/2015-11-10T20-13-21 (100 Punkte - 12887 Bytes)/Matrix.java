import java.util.Arrays;

/*
 * Die Klasse Matrix verwaltet eine Matrix in Form 
 * eines zweidimensionalen int-Arrays. 
 * Dabei gibt die erste Dimension die Zeile, die zweite Dimension 
 * die Spalte eines Wertes in der Matrix an, d.h. values[0][1] 
 * bezeichnet den Wert in der ersten Zeile und zweiten Spalte, 
 * values[2][0] bezeichnet den Wert in der dritten Zeile, 
 * ersten Spalte, usw.
 * 
 * Mit der Methode print() bietet die Klasse Matrix eine Hilfsmethode 
 * zur formatierten Ausgabe ihrer Werte an.
 * 
 * Hinweis: Gehen Sie davon aus, dass die von Ihnen 
 * implementieren Methoden immer mit korrekten Parametern aufgerufen 
 * werden (bspw. der Konstruktor nicht mit null oder 
 * add() nie mit null bzw. einer Matrix inkompatibler Größe aufgerufen)
 */

public class Matrix {

	private int[][] values;
	
	/*
	 * Konstruktor 
	 * Ergänzen Sie den Konstruktor so, dass dem Feld Matrix.values 
	 * der Parameter initialValues zugewiesen wird
	 */

	public Matrix(int[][] initialValues) {
		if(initialValues != null)
		{
			values = initialValues;
		}
		else
		{
			values = new int[0][0];
		}
		
	}

	/*
	 * Skalare Multiplikation 
	 * Implementieren Sie die Methode scalarMultiplication(int c) so, 
	 * dass sie die durch values definierte Matrix mit dem 
	 * Skalarwert c multipliziert
	 */
	
	public void scalarMultiplication(int c) {
		
		//Values wird durchgegangen
		for(int i=0;i < values.length;i++)
		{
			for(int j=0;j < values[i].length;j++)
			{
				//Die Werte von values werden mit c multipliziert
				values[i][j] = values[i][j] * c;
			}
		}
			
	}

	
	
	
	
	
	
	
	
	/*
	 * Addition 
	 * Die Methode add(Matrix m) soll die übergebene Matrix m zu 
	 * der durch values definierten Matrix addieren
	 */
		
	public void add(Matrix m) {
		if(m != null && values.length == m.values.length && values[0].length == m.values[0].length)
		{
			//Values wird durchgegangen
			for(int i=0;i < values.length;i++)
			{
				for(int j=0;j < values[i].length;j++)
				{
					//Die Werte von values werden mit c multipliziert
					values[i][j] += m.values[i][j];
				}
			}
		}
	}

	/*
	 * Spaltenvektor 
	 * Die Methode getColumnVector(int col) soll den Vektor, 
	 * der Spalte col beschreibt, als int-Array zurückgeben
	 */
	
	public int[] getColumnVector(int col) {
		
		
		
		if(col >= 0 && col < values[0].length)
		{
			
			int[] array = new int[values.length];
			
			for(int i=0;i < values.length;i++)
			{
				array[i] = values[i][col];	
			}
			
			return array;
		}
		else
		{
			return null;
		}
		
	}

	/* 
	 * Vergleich
     * Die Methode isEqualTo(Matrix m) soll true zurückgeben, 
     * wenn die Matrix, auf der die Methode aufgerufen wurde, 
     * identisch zu m ist, ansonsten false. 
     * Zwei Matrizen sind identisch, wenn
     *   - sie in der Anzahl der Zeilen übereinstimmen
     *   - sie in der Anzahl der Spalten übereinstimmen
     *   - jeder Wert aij aus der einen Matrix mit aij 
     *     aus der anderen Matrix übereinstimmt
	 */
	
	public boolean isEqualTo(Matrix m) {
		
		if(values.length == m.values.length && values[0].length == m.values[0].length)
		{
			//Values wird durchgegangen
			for(int i=0;i < values.length;i++)
			{
				for(int j=0;j < values[i].length;j++)
				{
					//Die Werte von values und m.values werden vergleicht, wenn ungleich, sind die Matritzen nicht gleich
					if(values[i][j] != m.values[i][j])
					{
						return false;
					}
				}
			}
			
			return true;
		}
		else
		{
			return false;
		}
		
	}

	/*
	 * Transponieren 
	 * Die Methode transpose() soll die in values definierte 
	 * Matrix transponieren, d.h. an ihrer Hauptdiagonalen spiegeln 
	 * („Zeilen und Spalten werden vertauscht“)
	 */
	
	public void transpose() {
		int[][] array = new int[values[0].length][values.length];
		
		//Values wird durchgegangen
		for(int i=0;i < values.length;i++)
		{
			for(int j=0;j < values[i].length;j++)
			{
				//Die Werte von values werden invertiert in array übertragen
				array[j][i] = values[i][j];
			}
		}
		values = array;
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
