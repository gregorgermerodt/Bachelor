import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {

	values = initialValues;
		
	}

	public void scalarMultiplication(int c) {
		
		for(int zeile=0; zeile<values.length; zeile++)
		{
			for(int spalte=0; spalte<values[zeile].length; spalte++)
			{
				values[zeile][spalte] = values[zeile][spalte]*c;
			}
		}

	}

	public void add(Matrix m) {
		
		for(int zeile=0; zeile<values.length; zeile++)
		{
			for(int spalte=0; spalte<values[zeile].length; spalte++)
			{
				values[zeile][spalte] = values[zeile][spalte] + m.values[zeile][spalte];
			}
		}

	}

	public int[] getColumnVector(int col) {
		
	int[] vektor = new int[values[col].length];
	
		for(int zeilen=0; zeilen < values[col].length; zeilen++)
		{
			vektor[zeilen] = values[zeilen][col];
		}
		
		return vektor;
	}

	public boolean isEqualTo(Matrix m) {

// zuerst schauen, wie groß (Anzahl Zeilen und Spalten) die beiden Matrizen sind		
		
	int a = values.length;
	int b = values[0].length;
	
// m.values, weil Matrix eine Klasse ist und values zu dieser Klasse Matrix gehört	
	
	int c = m.values.length;
	int d = m.values[0].length;
	
// wenn mehrere Sachen überprüft werden sollen, dann immer Schritt für Schritt und vor allem:
// immer zuerst Fälle überprüfen, wo etwas nicht zutreffen kann
	
// es wird geprüft, ob die Zeilenanzahl gleich ist	
	
	if(a != c)
	{
		return false;
	}
	
// es wird geprüft, ob die Spaltenanzahl gleich ist	
	
	if(b != d)
	{
		return false;
	}
	
// dann wird geprüft ob die einzelnen Elemente innerhalb der Matrix gleich sind
	
		for(int zeile=0; zeile<values.length; zeile++)
		{
			for(int spalte=0; spalte<values[0].length; spalte++)
			{
					if(values[zeile][spalte] != m.values[zeile][spalte])
					{
						return false;
					}
			}
		}
		
// true muss hier zurückgegeben werden, da alle anderen Kriterien zum Abbruch des Programms führen 
		
		return true;
	}

	public void transpose() {

// Abfrage, wie viele Zeilen/ Spalten die Matrix values hat		
		
	int a = values.length;
	int b = values[0].length;
	
// neues 2D Array für transponierte Matrix erstellt	
	
	int[][] neueMatrix = new int[b][a];
		
		for(int zeile=0; zeile<values.length; zeile++)
		{
			for(int spalte=0; spalte<values[zeile].length; spalte++)
			{
				neueMatrix[spalte][zeile] = values[zeile][spalte];
			}
		}
		
		values = neueMatrix;  
		
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
