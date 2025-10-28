import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values = initialValues; 
	}

	public void scalarMultiplication(int c) {
		for(int i=0; i<this.values.length; i++){
			for(int j=0; j<this.values[i].length; j++){
				this.values[i][j] = this.values[i][j]*c;
			}
		}
	}

	public void add(Matrix m) {
		int[][] sum1Values = this.values;
		int[][] sum2Values = m.values;
		for(int i=0; i<sum1Values.length; i++){
			for(int j=0; j<sum1Values[i].length; j++){
				sum1Values[i][j] = sum1Values[i][j]+sum2Values[i][j];
			}
		}
		this.values = sum1Values;
	}

	public int[] getColumnVector(int col) {
		//i = Zeile = 3
		//j = Spalte = col = 1
//		int[] newArr = new int[this.values.length];
		int[] newArr = new int[4];
		System.out.println(this.values[3][1]);
		
		for(int j=0;j<this.values[0].length;j++){
			for(int i=0;i<this.values.length;i++){
				if(j==col){
					newArr[i] = this.values[i][col];
				}
			}
		}
		return newArr;
	}

	public boolean isEqualTo(Matrix m) {
		boolean line = false;
		boolean col = false;
		boolean num = false;
		if(this.values.length == m.values.length){
			line = true;
		}
		if(this.values[0].length == m.values[0].length){
			col = true;
		}
		for(int i=0; i<this.values.length;i++){
			for(int j=0; j<this.values[i].length;j++){
				if(this.values[i][j]==m.values[i][j]){
					num = true;
				} else{
					num = false;
				}
			}
		}
		if(line == true && col == true && num == true){
			return true;
		}else{
			return false;
		}
	}

	public void transpose() {
		int newI = this.values[0].length; //I Zeilen = 3
		int newJ = this.values.length; //J Spalten = 4
		System.out.println(this.values.length);
		int[][] newArr = new int[newI][newJ];
		
		for(int i=0; i<newI;i++){
			for(int j=0; j<newJ;j++){
				newArr[i][j] = this.values[j][i];
			}
		}
		this.values = newArr;
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
