import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		this.values = initialValues;
	}

	public void scalarMultiplication(int c) {
		int zeilen = this.values.length;
		int spalten = this.values[0].length;
		
		for (int z=0; z < zeilen; z++){				// Durchlauf Zeilen
			for (int s=0; s < spalten; s++){			// Durchlauf Spalten
				values[z][s] *= c;						// Skalarmultiplikation
			}
		}
	}

	public void add(Matrix m) {					
		int zeilen = this.values.length;
		int spalten = this.values[0].length;
			
		for (int z=0; z < zeilen; z++){					// Durchlauf Zeilen
			for (int s=0; s < spalten; s++){			// Durchlauf Spalten
				values[z][s] += m.values[z][s];			// Addition der Matrizen 
			}
		}
	}

	public int[] getColumnVector(int col) {
		int rows = this.values.length;
		int [] columnVector = new int [rows];
		
		for (int i=0; i < rows; i++){
			columnVector [i] = this.values[i][col];
		}
		return columnVector;
	}

	public boolean isEqualTo(Matrix m) {
		boolean result = true;
		int rows = this.values.length;
		int cols = this.values[0].length;
		
		for (int i=0; i < rows; i++){
			for (int j=0; j < cols; j++){
				if (this.values[i][j]!= m.values[i][j]){
					result = false;
					return result;
				}
			}
		}
		
		return result;
	}

	public void transpose() {
		int [][]temp = this.values.clone();			// Hilfsmatrix Sicherung alte Matrix
		int rows_old = this.values.length;
		int cols_old = this.values[0].length;
		
		this.values = new int [cols_old][rows_old];		// Neue Dimension der Matrix
		
		for (int i=0; i < rows_old; i++){
			for (int j=0; j < cols_old; j++){
				this.values[j][i] = temp[i][j];				// Spiegeln der Matrix - Vertauschen Spalten und Zeilen
			}
		}
		

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
