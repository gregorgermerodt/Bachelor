import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values=initialValues;    //parameter wird zugewiesen

	}

	public void scalarMultiplication(int c) {
		for(int row =0; row< values.length;row++){ // schleife wird durchlaufen um die zeilenwerte zu bekommen
			for(int column =0;column< values[row].length;column++ ){// schleife wird durchlaufen um spaltenwerte zu bekommen
				values[row][column]=values[row][column]*c;         // matrix mal c gerechnet
			}
		}

	}

	public void add(Matrix m) {
		for(int row =0; row< values.length;row++){   //schleife wird durchlaufen um zeilenwerte 
			for(int column =0;column< values[row].length;column++ ){//schleife durchlaufen für spaltenwerte
				values[row][column]= values[row][column]+m.values[row][column];   //matrix wird addiert 
			}
		}

	}

	public int[] getColumnVector(int col) {
		
		int[] neuer = new int [values.length];    //neues array erzeugt
		for(int index =0; index < neuer.length; index++){    // schleife durchlaufen um die matrixwerte aufzurufen
			neuer[index]= values[index][col]; // werte werden kopiert 
		}
		return neuer;  // array neuer wird zurückgegeben
			
	}

	public boolean isEqualTo(Matrix m) {
		if(values.length ==m.values.length &&values[0].length==  m.values[0].length){    // 
			for(int zeile =0; zeile < values.length;zeile++)
			{
				for(int spalte=0; spalte< values[0].length; spalte++)
				{
					if(values[zeile][spalte]!=m.values[zeile][spalte]){
						return false;
					}
				}
			}
		}
		else
		{
			return false;
		}
		return true;
	}

	public void transpose() {
		int[][]neu= new int [values[0].length][values.length];
		for(int row =0; row< values.length;row++ ){
			for(int column =0; column < values[0].length;column++ ){
				neu[column][row]=values[row][column];
			}
		}
		values = neu;

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
