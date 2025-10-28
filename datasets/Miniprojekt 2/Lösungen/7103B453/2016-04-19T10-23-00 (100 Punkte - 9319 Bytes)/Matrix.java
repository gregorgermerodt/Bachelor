import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		this.values = initialValues;
	}

	public void scalarMultiplication(int c) {
		//array.length() ergibt die Anzahl der Zeilen
		//array[0].length() ergibt die Anzahl der Spalten.
		int[][] skalarmultiplizierteMatrix
				= new int[this.values.length]
						 [this.values[0].length];
		for (int zeile = 0;
				zeile < this.values.length;
				zeile++){
			for (int spalte = 0; spalte < this.values[0].length; spalte++){
				skalarmultiplizierteMatrix[zeile][spalte]
						= c * this.values[zeile][spalte];
			}
		}
		this.values = skalarmultiplizierteMatrix;
	}

	public void add(Matrix m) {
		//array.length() ergibt die Anzahl der Zeilen
		//array[0].length() ergibt die Anzahl der Spalten.
		int[][] addierteMatrix
			= new int[this.values.length]
					 [this.values[0].length];
		for (int zeile = 0;
			zeile < this.values.length;
			zeile++)
		{
			for (int spalte = 0;
				 spalte < this.values[0].length;
				 spalte++)
			{
				addierteMatrix[zeile][spalte]
								= m.values[zeile][spalte] + this.values[zeile][spalte];
			}
		}
		this.values = addierteMatrix;
	}

	public int[] getColumnVector(int col) {
		//array.length() ergibt die Anzahl der Zeilen
		//array[0].length() ergibt die Anzahl der Spalten.
		int[] spalteMitIndexCol
			= new int[this.values.length];
		for (int zeile = 0;
				zeile < this.values.length;
				zeile++)
		{
			spalteMitIndexCol[zeile]
						= this.values[zeile][col];
		}
		return spalteMitIndexCol;
	}

	public boolean isEqualTo(Matrix m) {
		if(this.values.length != m.values.length){
			return false;
		}
		else if(this.values[0].length != m.values[0].length){
			return false;
		}
		else{
			for (int zeile = 0;
					zeile < this.values.length;
					zeile++){
				for (int spalte = 0; spalte < this.values[0].length; spalte++)
				{
					if(m.values[zeile][spalte]
							!= this.values[zeile][spalte])
					{
						return false;
					}
				}
			}
		}
		return true;
	}

	public void transpose() {
		//array.length() ergibt die Anzahl der Zeilen
		//array[0].length() ergibt die Anzahl der Spalten.
		int[][] transponierteMatrix
				= new int[this.values[0].length]
						 [this.values.length];
		for (int zeile = 0;
				zeile < this.values.length;
				zeile++){
			for (int spalte = 0; spalte < this.values[0].length; spalte++){
				transponierteMatrix[spalte][zeile]
						= this.values[zeile][spalte];
			}
		}
		this.values = transponierteMatrix;
	

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