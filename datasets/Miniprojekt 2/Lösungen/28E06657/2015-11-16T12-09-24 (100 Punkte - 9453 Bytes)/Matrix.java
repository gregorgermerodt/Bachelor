import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		// initialize values
		values = initialValues;
	}

	public void scalarMultiplication(int c) {
		// iterate through every element of 2D-Array
		// m is index for column
		for (int m=0; m<values.length; m++) {
			// n is index for row
			for (int n=0; n<values[0].length; n++) {
				// multiply every element with the scalar and save at the same position
				values[m][n] = values[m][n] * c;
			}
		}
	}

	public void add(Matrix m) {
		// iterate through every element of both 2D-Arrays 
		// o is index for column
		for (int o=0; o<values.length; o++) {
			// n is index for row
			for (int n=0; n<values[0].length; n++) {
				// add the values and save at the same position
				values[o][n] = values[o][n] + m.getValues()[o][n];
			}
		}
	}

	public int[] getColumnVector(int col) {
		// initialize new vector with column length
		int[] columnVec = new int[values.length];
		
		// iterate through the column and save the values
		for (int i=0; i<values.length; i++) {
			columnVec[i] = values[i][col];
		}
		
		return columnVec;
	}

	public boolean isEqualTo(Matrix m) {
		// same number of columns?
		if (values.length != m.getValues().length)
			return false;
		// same number of row?
		if (values[0].length != m.getValues()[0].length)
			return false;
		
		// iterate through every element of both 2D-Arrays 
		// o is index for column
		for (int o=0; o<values.length; o++) {
			// n for rows
			for (int n=0; n<values[0].length; n++) {
				// check for equality of every element
				if (values[o][n] != m.getValues()[o][n])
					return false;
			}
		}
		// passed every element? Then it's equal
		return true;		
	}

	public void transpose() {
		// intialize 2D-Array with "switched" dimensions
		int[][] returnMatrix = new int[values[0].length][values.length];
		
		// iterate through every element of both 2D-Arrays 
		// o is index for column
		for (int o=0; o<values.length; o++) {
			// n for rows
			for (int n=0; n<values[0].length; n++) {
				// save values with switched indices
				returnMatrix[n][o] = values[o][n];
			}
		}
		
		values = returnMatrix;
	}
	
	public int[][] getValues() {
		return values;
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