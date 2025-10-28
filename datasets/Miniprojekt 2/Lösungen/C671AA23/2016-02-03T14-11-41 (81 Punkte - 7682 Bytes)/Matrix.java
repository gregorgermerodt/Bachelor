
import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		int lengthvalueszeil = initialValues.length;
		int lengthcaluesspalt = initialValues[0].length;
		this.values = new int[lengthvalueszeil][lengthcaluesspalt];
		for(int i=0;i<lengthvalueszeil;i++){
			for(int n=0;n<lengthcaluesspalt;n++){
				values[i][n] = initialValues[i][n];
			}
		}
	}

	public void scalarMultiplication(int c) {
		int zeil = values.length;
		int spalt = values[0].length;
		for(int i=0;i<zeil;i++){
			for(int n=0;n<spalt;n++){
				values[i][n] = values[i][n] * c;
			}
		}
	}

	public void add(Matrix m) {
		int zeil = values.length;
		int spalt = values[0].length;
		int mzeil = m.values.length;
		int mspalt = m.values[0].length;
		if(zeil == mzeil && spalt == mspalt){
			for(int i=0;i<zeil;i++){
				for(int n=0;n<spalt;n++){
					values[i][n] = values[i][n] + m.values[i][n];
				}
			}
		}
		else return;
	}

	public int[] getColumnVector(int col) {
		int zeil = values.length;
		int spalt = values[0].length;
		int[] res = new int[zeil];
		if(col > spalt || col == spalt) return null;
		else{
			for(int i=0;i<zeil;i++){
				res[i] = values[i][col];
			}
			return res;
		}
	}

	public boolean isEqualTo(Matrix m) {
		int zeil = values.length;
		int spalt = values[0].length;
		int mzeil = m.values.length;
		int mspalt = m.values[0].length;
		if(zeil == mzeil && spalt == mspalt){
			for(int i=0;i<zeil;i++){
				for(int n=0;n<spalt;){
					if(values[i][n] == m.values[i][n])
						n++;
					else return false;
				}
			}
			return true;
		}
		else return false;
	}

	public void transpose() {
		int zeil = values.length;
		int spalt = values[0].length;
		int[][] temp = new int[spalt][zeil];
		for(int i=0;i<zeil;i++){
			for(int n=0;n<spalt;n++){
				temp[n][i] = values[i][n];
			}
		}
		values = new int[spalt][zeil];
		for(int i=0;i<spalt;i++){
			for(int n=0;n<zeil;n++){
				values[i][n] = temp[i][n];
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

