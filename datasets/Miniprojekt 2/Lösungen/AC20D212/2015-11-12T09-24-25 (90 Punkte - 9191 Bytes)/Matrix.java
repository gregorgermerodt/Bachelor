import java.util.Arrays;
public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values = initialValues;

	}

	public void scalarMultiplication(int c) {
		for(int i=0; i < values.length; i++){ // durchläuft die zeile
			for( int j = 0; j < values[i].length; j++){// durchläuft die spalte um jeden Wert zu bekommen.
				values[i][j] = values [i][j]*c;// jetzt wird jeder Wert des Arrays mit c multipliziert
			}
		}
		

	}

	public void add(Matrix m) {
		for(int i=0; i < values.length; i++){
			for( int j = 0; j < values[i].length; j++){
				values[i][j] = values[i][j] + m.values[i][j];//nicht nur m da nicht mit der matrix sondern nur mit deren Werten addieren
			}                                                //values ist die matrix und nicht m
		}

	}

	public int[] getColumnVector(int col) {// int col ist die Spaltenzahl/spaltenindex
		int [] spalte = new int [values.length];
		for( int i = 0; i < values.length; i++){
			spalte [i] = values[i][col]; // col ist fix deshalb kein j sondern nur i und col. col stellt die spalte dar
		}
		
		return spalte;
	}

	public boolean isEqualTo(Matrix m) {
		if(values.length == m.values.length || values[0].length != m.values[0].length){
			return false;
		}
		for( int i = 0; i < values.length; i++){
			for( int j = 0; j < values[i].length; j++){
				if(values [i][j] != m.values[i][j]){
					return false;
				}
				
				}
			}
		
		return true;
}
	

	public void transpose() {
		int [][]neu = new int [values[0].length][values.length];// hier wird die Größe verändert 
		for( int i = 0; i < values.length; i++){
			
		
			for( int j = 0; j < values[i].length; j++){
				neu[j][i] = values[i][j];//hier werden zeilen und spalten vertauscht
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
