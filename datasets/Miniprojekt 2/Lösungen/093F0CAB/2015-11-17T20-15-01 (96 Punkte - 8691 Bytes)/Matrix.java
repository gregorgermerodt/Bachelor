import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values = initialValues;

	}

	public void scalarMultiplication(int c) {
		for (int reihe = 0; reihe < values.length; reihe++){
			for (int spalte = 0; spalte < values[reihe].length; spalte++){
				values[reihe][spalte] = values[reihe][spalte] * c;
			}
		}
	}

	public void add(Matrix m) {
		for (int reihe = 0; reihe < values.length; reihe++){
			for (int spalte = 0; spalte < values[reihe].length; spalte++){
				values[reihe][spalte] = values[reihe][spalte] + m.values[reihe][spalte];
			}
		}

	}

	public int[] getColumnVector(int col) {
		
		int [] columnVector = new int[values.length];
				for (int i = 0; i < values.length; i++){
					columnVector[i] = values[i][col];
		}
		return columnVector;
	}

	public boolean isEqualTo(Matrix m) {
		
		boolean ergebnis = false;
		int reihen = values.length;
		int spalten = values[0].length;
		
		if (reihen != m.values.length)
		{
			if (spalten != m.values[0].length)
			{
				for (int reihe = 0; reihe < values.length; reihe++)
				{
					for (int spalte = 0; spalte < values[reihe].length; spalte++)
					{
						if (values[reihe][spalte] == m.values[reihe][spalte])
						{ 
							ergebnis = true;
						}			
					}			
				}
			}
		}
		return ergebnis;
	}

	public void transpose() {
		
		int reihen = values.length;
		int spalten = values[0].length;
		
		int[][] neuesArray = new int[reihen][spalten]; // Kopie des alten Array
		
		for (int i = 0; i < values.length; i++){
			for (int j = 0; j < values[i].length; j++){
				neuesArray[i][j] = values[i][j];
			}
		}
		
		int [][] arrayAusgabe = new int [spalten][reihen];
		
		for (int i = 0; i <neuesArray.length; i++){
			for (int j = 0; j < neuesArray[i].length; j++){
				arrayAusgabe[j][i] = neuesArray[i][j];
				values = arrayAusgabe;
			}
		}
		
//		int reihen = values.length;
//		int spalten = values[0].length;
//		
//		int[][] neuesArray = new int[spalten][reihen];
//		
//		for (int reihe = 0; reihe < values.length; reihe++){
//			for (int spalte = 0; spalte < values[reihe].length; spalte++){
//				neuesArray[spalte][reihe] = values[reihe][spalte];
//				values = neuesArray;
//			}
//		}

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
