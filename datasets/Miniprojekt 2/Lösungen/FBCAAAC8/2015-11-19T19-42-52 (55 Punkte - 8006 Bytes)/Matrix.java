import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {

		values = initialValues;
		
		
	}

	public void scalarMultiplication(int c) {
		
	  values[0][0] = values[0][0] * c;
	  values[0][1] = values[0][1] * c;
	  values[0][2] = values[0][2] * c;

	  
	  values[1][0] = values[1][0] * c;
	  values[1][1] = values[1][1] * c;
	  values[1][2] = values[1][2] * c;
	  
	  
	  values[2][0] = values[2][0] * c;
	  values[2][1] = values[2][1] * c;
	  values[2][2] = values[2][2] * c;
	  
	  values[3][0] = values[3][0] * c;
	  values[3][1] = values[3][1] * c;
	  values[3][2] = values[3][2] * c;
	  

	}

	public void add(Matrix m) {
		
		
		
	 values[0][0] = values[0][0] + m.values[0][0];
     values[0][1] = values[0][1] + m.values[0][1];
	 values[0][2] = values[0][2] + m.values[0][2];;
  
     values[1][0] = values[1][0] + m.values[1][0];
     values[1][1] = values[1][1] + m.values[1][1];
     values[1][2] = values[1][2] + m.values[1][2];
		    
	 values[2][0] = values[2][0] + m.values[2][0];
     values[2][1] = values[2][1] + m.values[2][1];
	 values[2][2] = values[2][2] + m.values[2][2];
		  
     values[3][0] = values[3][0] + m.values[3][0];
	 values[3][1] = values[3][1] + m.values[3][1];
	 values[3][2] = values[3][2] + m.values[3][2];
		
		
		

	}

	public int[] getColumnVector(int col) {
		
		
		
		return null;
	}

	public boolean isEqualTo(Matrix m) {
		
		
		
		
		
		
		return false;
	}

	public void transpose() {
		
		
		
		
		

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
