import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {				// Bei initial... immer auf den jeweiligen Wert verweisen
		this.values = initialValues;

	}

	public void scalarMultiplication(int c) {
		for (int i=0 ; i<values.length ; i++){		 	// Durchlaufen der Zeilen
			for (int j=0 ; j<values[i].length ; j++){	// Durchlaufen der Spalten
				values[i][j] *= c;						// Jeder Wert wird mit c multipliziert
			}
		}

	}

	public void add(Matrix m) {
		for (int i=0 ; i<values.length ; i++){
			for (int j=0 ; j<values[i].length ; j++){
				values[i][j] += m.values[i][j];			// Verwendung des Punktoperators, da wir auf die Matrix m zugreifen
			}
		}

	}

	public int[] getColumnVector(int col) {
		int[] colVector = new int[values.length];
		
		for (int i=0 ; i<values.length ; i++){			// Schleife zum übertragen der Werte in das Spaltenarray	
			colVector[i] = values[i][col];				// i gibt die Zeile an und col die Spalte
		}
		
		return colVector;
	}

	public boolean isEqualTo(Matrix m) {
		if (values.length == m.values.length && values[0].length == m.values[0].length){	// Überprüfung, ob Zeilen und Spaltenlänge identisch sind
			
			int counter = 0;		// Zum Zählen der gleichen Werte innerhalb der Matrizen
			
			for (int i=0 ; i<m.values.length ; i++){
				for (int j=0 ; j<m.values[i].length ; j++){
					if (values[i][j] == m.values[i][j]){	// Abfrage, ob jede Stelle gleich ist
						counter++;		// Falls ja, dann erhöht sich der Counter um 1
					}
				}
			}
			// Überprüfung, ob die Anzahl der Werte die gleich sind gleich der gesamten Anzahl aus einer Matrix sind
			// Zeilen * Spalten = gesamte Anzahl der Werte einer Matrix
			// conditional Operator ?
			// Beispiel (Bedingung für true oder false) ? (Antwort für true) : (Antwort für false);
						
			return (counter == this.values.length * this.values[0].length) ? true : false; 
		}else{
			return false;
		}
	}

	public void transpose() {
		int[][] transMatrix = new int[values[0].length][values.length]; // Zeilen und Spaltenlänge vertauschen
		
		for (int i=0 ; i<values[0].length ; i++){
			for (int j=0 ; j<values.length ; j++){
				transMatrix [i][j] = values[j][i];	// Zeilen und Spaltenwerte vertauschen
			}
		}
		values = transMatrix;
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
