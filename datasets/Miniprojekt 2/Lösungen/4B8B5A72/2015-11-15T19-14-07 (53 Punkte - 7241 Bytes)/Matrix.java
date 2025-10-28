import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values = initialValues;

	}

	public void scalarMultiplication(int c) {
		int skalar = c;
		for(int i = 0; i < values.length; i++){
			for(int j = 0; j < values[i].length; j++){
				values[i][j] *= skalar;
			}
		}
	}

	public void add(Matrix m) {
		for(int i = 0; i < values.length; i++){
			for(int j = 0; j < values[i].length; j++){
				this.values[i][j] += m.values[i][j];
			}
		}
	}

	public int[] getColumnVector(int col) {
		int[] columnVector = new int[values.length];
		int k = 0;
		//System.out.println(columnVector.length);
		for(int i = 0; i < values.length; i++){
			for(int j = 0; j < values[i].length;j++){
				if(j == col){
					columnVector[k] = values[i][j];
					k++;
				}
			}
		}
		
		return columnVector;
	}

	public boolean isEqualTo(Matrix m) {
		boolean res = false;
		boolean c = false;
		boolean f = false;
		boolean k = false;
		int a = this.values.length;
		int b = m.values.length;
		//System.out.println(a + " " + b);
		if( a == b){
			c = true;
		}else{
			c = false;
		}
		int d = this.values[0].length;
		int e = m.values[0].length;
		//System.out.println(d + " " + e);
		if(d == e){
			f = true;
		}else{
			f = false;
		}
		if(this.values == m.values){
			k = true;
		}else{
			k = false;
		}
		if(c && f && k){
			res = true;
		}else{
			res = false;
		}
		return res;
	}

	public void transpose() {
		int[][] t = new int[values[0].length][values.length];
		//System.out.println(t.length + " " + t[0].length);
		for(int i = 0; i < values.length; i++){
			for(int j = 0; j < values[0].length; j++){
				t[j][i] = values[i][j];
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
