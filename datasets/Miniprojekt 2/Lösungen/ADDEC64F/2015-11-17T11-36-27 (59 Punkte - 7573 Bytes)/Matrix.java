import java.util.Arrays;

public class Matrix {

	private int[][] values;
	//Aufgabe 2a
	public Matrix(int[][] initialValues) {
		this.values = initialValues;

	}
	//Aufgabe 2b
	public void scalarMultiplication(int c) {
		for (int i = 0; i < values.length; i++) {	//values.length gibt die Länge der Zeilen an
			for (int j = 0; j < values[0].length; j++){  //values[0].length gibt die Länge der Spalten an
				// auslesen der Länge von Zeile und Spalte => notwendig für Multiplikation
			
			values[i][j] = values [i][j] * c;
			
			}
		}
	}
	//Aufgabe 2c
	public void add(Matrix m) {
		for (int i = 0; i < values.length; i++){
			for (int j = 0; j < values[0].length; j++){
				
				values [i][j] = values[i][j] + m.values[i][j];
			}
		}

	}
	//Aufagbe 2d
	public int[] getColumnVector(int col) {
		int zeiSpa = values.length;// hilfsvaribale zum auslesen der Zeilen und Spalten
		
		
		int loesung [] = new int[zeiSpa];//hilfsarray für die Lösung
		
		
		for (int i = 0 ; i < values.length; i++ ){// auslesen der zeilen und spalten
			
			
			
		loesung[i] = values[i][col]; // ausgabe des geforderten arrays
		
		}
		
		return loesung;
		
	
	}
	
	//Aufageb 2e
	public boolean isEqualTo(Matrix m) {
		if ( values[0].length  != m.values.length  ||  values.length != m.values.length) return false;
		else
		{
			for (int i = 0; i < values.length; i++)
			{
				for (int k = 0; k < values[0].length; k++)
				{
					if ( values[i][k] != m.values[i][k])return false;
				}
				
				}
			}
		
	return true;
	}
	//Aufgabe 2f
	public void transpose() {
		
		int[][] loesung = new int[values[0].length][values.length];
			
		for (int i = 0; i < loesung.length; i++)
		{
			for (int k = 0; k < loesung[0].length; k++)
			{
				
				
				loesung[i][k] = values[k][i];
			}
		}	
		
		
		values = loesung;
		
		
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
