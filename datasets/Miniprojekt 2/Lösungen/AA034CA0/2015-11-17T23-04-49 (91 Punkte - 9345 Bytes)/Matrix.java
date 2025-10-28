import java.util.Arrays;

public class Matrix {

	private int[][] values; 		// quasi Erzeugung eines Musters

	public Matrix(int[][] initialValues) {  
		values = initialValues;		//  belege "Muster" mit einer Variable
		
	}

	public void scalarMultiplication(int c) { // FRAGE: Werden erst alleis, dann alle js durchlaufen)
//2 for Schleifen
		
		for (int i = 0; i <values.length; i++)
		{
			for (int j = 0; j < values [0].length; j++)
			{
				values [i] [j] *= c; //  man durchläuft erst alle Zeilen, dann alle Spalten 
			}
		}
	}

	public void add(Matrix m) {
		for (int i = 0; i <values.length; i++)
		{
			for (int j = 0; j < values [0].length; j++)
			{
				values [i] [j] += m.values [i] [j]; // man durchläuft erst alle Zeilen, dann alle Spalten 
			}
			}
	}

	public int[] getColumnVector(int col) { //hier:Spaltenindex
		
		int [] neu = new int [values.length];
		for (int i = 0; i < neu.length;i++)
		{
			neu [i] = values [i] [col];
		}
		return neu;
	}

	//ich muss
	public boolean isEqualTo(Matrix m) {
		if (values.length == m.values.length && values [0].length==m.values [0].length) // beide Matrizen mssen gleich viele Zeielen haben
		{
			for (int i = 0; i < values.length;i++)
			{
				for (int j = 0; j < values[0].length;j++)
				
				{
					//System.out.println(i + " "+j);
					if (values [i][j] == m.values [i] [j])
						
					{
						return true;
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

	public void transpose() { // Methode 
		int [] [] neu = new int [values[0].length][values.length];// Spalte der alten Matrix = höe der neuen Matrix
		for (int i = 0; i < values.length; i++)
		{
			for (int j =0; j < values [0].length; j++)
			{
				neu [j][i] = values [i] [j];
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
