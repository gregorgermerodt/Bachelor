import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {

		//Aufgabe 2) a)
		this.values = initialValues;
	}

	//Aufgabe 2) b)
	public void scalarMultiplication(int c) {

		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[0].length; j++) {		//WICHTIG values[0].length !!!
				
				values[i][j] = c * values[i][j];
			}
		}
	}

	//Aufgabe 2) c)
	public void add(Matrix m) {

		for (int i = 0 ; i < values.length; i++){
			for (int k = 0; k < values[0].length; k++){		//WICHTIG values[0].length !!!
				
				values[i][k] = values[i][k] + m.values[i][k];
			}
		}
	}

	//Aufgabe 2) d)
	public int[] getColumnVector(int col) {

		int[] loesung = new int[values.length];
		
		for (int i = 0 ; i < values.length; i++)
		{
			loesung[i] = values[i][col];
		}
		return loesung;	
	}

	//Aufgabe 2) e)
	public boolean isEqualTo(Matrix m) {

		if(values[0].length != m.values[0].length || values.length != m.values.length) return false; 	//1. & 2. Bedingung in einem
		
		else
		{
			for (int i = 0 ; i < values.length ; i++)
			{
				for (int k = 0 ; k < values[0].length ; k ++)
				{
					if (values[i][k] != m.values[i][k]) return false;									//3. Bedingung
				}
			}
		}	
		return true;
	}

	//Aufgabe 2) f)
	public void transpose() {
	
		int[][] loesung = new int[values[0].length][values.length];	//Neues Array, wo Spalte und Zeile vom values Array getauscht wurde

		for (int i = 0; i < loesung.length; i++)		//Lösung Array durchgehen, da dieses kleiner ist von den Spalten
		{
			for (int k = 0; k < loesung[0].length; k++)
			{
				loesung[i][k] = values[k][i];						//Zeilen mit Spalten tauschen
			}
		}	
		values = loesung;					//das value Array mit den Werten vom loesung Array speichern, da immer nur das value array aufgerufen wird
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
