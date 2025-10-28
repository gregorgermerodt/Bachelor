import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values = initialValues;

	}

	public void scalarMultiplication(int c) {
		
		int[][] values2 = new int[0][0];
		values2 = values.clone();
		
		for (int x = 0; x < values2.length; x++)
		{
			for (int y = 0; y < values2[1].length; y++)
			{
				values[x][y]=(values2[x][y])*c;
			}
		}
	}

	public void add(Matrix m) {

		int[][] values2 = new int[0][0];
		values2 = values.clone();
		
		for (int x = 0; x < values2.length; x++)
		{
			for (int y = 0; y < values2[1].length; y++)
			{
				values[x][y]=(values2[x][y]) + m.values[x][y];
			}
		}

	}

	public int[] getColumnVector(int col) {
		
		int laenge = values.length;
		int[] vector = new int[laenge];
		for (int i=0; i < laenge ; i++)
		{
			vector[i]= values[i][col];
		}
		return vector;
	}

	public boolean isEqualTo(Matrix m) {
		
		if(!(values.length == m.values.length))
		{
			return false;
		}
		
		if(!(values[1].length == m.values[1].length))
		{
			return false;
		}
		
		for (int x =0 ; x < values.length; x++)
		{
			for (int y = 0; y < values[0].length; y++)
			{
				if (!(values[x][y]== m.values[x][y]))
				{
					return false;
				}
			}
		}
		return true;
	}

	public void transpose() {
		
		int[][] matrix = new int[values[0].length][values.length];
		
		for (int x =0 ; x < values.length; x++)
		{
			for (int y = 0; y < values[0].length; y++)
			{
				matrix[y][x]=values[x][y];
			}
		}
		values = matrix.clone();

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
