import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values = initialValues;
	}

	public void scalarMultiplication(int c) {
		int row = this.values.length;
		int col = this.values[0].length;
		
		for (int rowindex = 0; rowindex < row; rowindex++){
			for (int columnindex = 0; columnindex < col; columnindex++){
				this.values[rowindex][columnindex] = this.values[rowindex][columnindex]*c;
			}
		}
	}

	public void add(Matrix m) {
		int row = this.values.length;
		int col = this.values[0].length;
		
		for (int rowindex = 0; rowindex < row; rowindex++){
			for (int columnindex = 0; columnindex < col; columnindex++){
				this.values[rowindex][columnindex] = this.values[rowindex][columnindex] + m.values[rowindex][columnindex];
			}
		}
	}
	

	public int[] getColumnVector(int col) {
		int rows = this.values.length;
		int [] returnarray = new int [rows];
		
		for (int i =0; i<rows; i++){
			returnarray[i] = this.values[i][col];	
		}
		return returnarray;
	}

	public boolean isEqualTo(Matrix m) {
		boolean ergebnis = false;
		
		int row1 = this.values.length;
		int col1 = this.values[0].length;
		int row2 = m.values.length;
		int col2 = m.values[0].length;
		
		if(row1==row2&&col1==col2){ 
			ergebnis = true;
		}else return false;
		
		for (int rowindex = 0; rowindex < row1; rowindex++){
			for (int columnindex = 0; columnindex < col1; columnindex++){
				if(this.values[rowindex][columnindex] == m.values[rowindex][columnindex]){
					 ergebnis = true;
				}else return false;
			}
		}
		return ergebnis;
	}

	public void transpose() {
		int row = this.values.length;
		int col = this.values[0].length;
		
		int[][] neuesArray = new int[col][row];
		
		for (int rowindex = 0; rowindex < row; rowindex++){
			for (int columnindex = 0; columnindex < col; columnindex++){
				neuesArray[columnindex][rowindex] = this.values[rowindex][columnindex];
		
			}
		}
		
		this.values=neuesArray;
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
