import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		// a)  values initialValues zuordnen, wir benutzen hier das this.
		this.values = initialValues;
	}

	public void scalarMultiplication(int c) {
	// b) zwei for schleifen da wir einmal mit den zeilen und spalten
	// 	  arbeiten müssen. i steht für die zeile, j für die spalten.
	//	  im anschluss mulitplizieren wir die werte mit c und verweisen
	//    auf values[i][j]
		for (int i = 0; i < this.values.length; i++) {
			for ( int j = 0; j < this.values[0].length; j++) {
				values[i][j] = values[i][j]*c;
			}
		}

	}

	public void add(Matrix m) {
	// c) Selbe vorgehensweise wie in b), einziger unterschied, am ende
	// 	  addieren wir zu unseren werten die werte von m.values.
		for ( int i = 0; i < this.values.length; i++) {
			for ( int j = 0; j < this.values[0].length; j++) {
				values[i][j] = values[i][j] + m.values[i][j];
			}
		}
	}

	public int[] getColumnVector(int col) {
	// d) wir machen ein neues array mit der länge this.values.length
		int[] Schraube = new int [this.values.length]; 
	// for schleife, um die spaltenwerte zu erfassen. Da i die zeilen 
	//und col die spalten durchläuft, brauchen wir nur eine for-schleife für
	// die zeilen, da sich die spalten nicht ändern.
	// 
		for ( int i = 0; i < this.values.length; i++) {
			Schraube[i] = this.values[i][col];
		}
	// am  ende das array ausspucken
		return Schraube;
	}

	public boolean isEqualTo(Matrix m) {
	// große if-bedingung um sicherzugehen, das sämtliche
	// zeilen und spalten übereinstimmen, && steht für "und"
		if ( this.values.length == m.values.length 
				&& this.values[0].length == m.values[0].length) {
	// Variable zum erfassen gleicher Werte
			int bot = 0;
	// for-schleifen zum durchgehen der matrizen.		
			for ( int i = 0; i < this.values.length; i++) {
				for ( int j = 0; j < this.values[0].length; j++) {
	// if-bedingung um sicherzugehen, das alle werte übereinstimmen.
	// ist dies der Fall sucht bot nach weiteren werten.
					if ( this.values[i][j] == m.values[i][j]) {
						bot++;
					}
				}
	// es wird nochmals geprüft ob sämtliche werte und längen übereinstimmen
	// Ist dies der fall wird true zurückgegeben, wenn nicht false
			} return (bot == this.values.length*this.values[0].length) ? true :false;
		}
		return false;
	}

	public void transpose() {
	// wir brauchen ein zwei dimensionales array daher int [][], im anschluss
	// verweisen wir auf die arrays, jedoch in anderer reihenfolge.
		int[][] Mirror = new int [this.values[0].length][this.values.length];
	// for-schleife, wo i die spalten und j die zeilen durchläuft.
		for ( int i = 0; i < this.values[0].length; i++) {
			for (int j = 0; j < this.values.length; j++) {
	// anschliessender verweise der werte, wichtig ist das die werte bei 
	// values in einer anderen reihenfolge stehen als bei Mirror, damit
	// die matrix auch an den achsen gespiegelt wird.
				Mirror[i][j] = this.values[j][i];
			}
	// verweis von values auf mirror, finish	
		} this.values = Mirror;
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
