import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values = initialValues;
		/* Aufgabe a) Konstruktor
		 * Ergänzen Sie den Konstruktor so, dass dem Feld Matrix.values
		 * der Parameter initialValues zugewiesen wird.
		 */

	}

	//row = Zeile; column = Spalte
	
	public void scalarMultiplication(int c) { 
		for(int row = 0; row < values.length; row++){
			for(int column = 0; column < values[row].length; column++){ //Es werden alle Elemente innerhalb des Arrays nacheinander aufgezählt
				values[row][column] = values[row][column] * c; //Die Werte die durch row und column mittels der for-Schleife aufgelistet werden, werden einzeln mit Matrix c multipliziert
				
				/* Aufgabe b) Skalare Multiplikation
				 * Implementieren Sie die Methode scalarMultiplication
				 * (int c) so, dass sie die durch values definierte Matrix
				 * mit dem Skalarwert c multipliziert.
				 */
			}
		}

	}

	public void add(Matrix m) {
		for(int row = 0; row < values.length; row++){ //Es werden alle Elemente innerhalb des Arrays nacheinander aufgezählt
			for(int column = 0; column < values[row].length; column++){
				values[row][column] = values[row][column] + m.values[row][column]; //Die Werte die durch row und column mittels der for-Schleife aufgelistet werden, werden einzeln mit den Werten der anderen Mitrize addiert
			
				/* Aufgabe c) Addition
				 * Die Methode add(matrix m) soll die übergebene
				 * Matrix m zu der durch values definierte Matrix
				 * addieren. 
				 */
			}
		}

	}

	public int[] getColumnVector(int col) {
		int Spalte[] = new int[values.length]; //Einen neuen eindimensionalen Array erstellen der der Länge des andren Arrays entspricht
		for(int i = 0; i < values.length; i++){ //Alle Werte auflisten
			Spalte[i] = values[i][col]; //Dem neuen Array nur die Werte übergeben, die in der Spalte namens "col" stehen
		}
		return Spalte;
		
		/* Aufgabe d) Spaltenvektor
		 * Die Methode getColumnVector(int col) soll den Vektor,
		 * der Spalte co1 beschreibt, als int-Array zurückgeben.
		 */
	}

	public boolean isEqualTo(Matrix m) {
		int x = 0; //x und y werden benötigt um Länge der einzelnen Dimensionen der Arrays festzuhalten
		int y = 0;
		for (int i = 0; i < values.length; i++){
			x++; //x mit a vergleichen
			for (int j = 0 ; j < values[i].length; j++){ //Alle Werte der Matrize auflisten und bei jedem aufgelisteten Wert auf x und y 1 addieren um Anzahl der Werte festzuhalten
				y++; //y mit b vergleichen
				if( values[i][j] != m.values[i][j]){ //Überprüfen ob die Werte der Matrizen "values" und "m.values" an den jeweiligen Stellen ungleich sind
					return false;
				}				
			}
		}
		
		int a = 0; //a und b werden benötigt um Länge der einzelnen Dimensionen der Arrays festzuhalten
		int b = 0;
		for (int i = 0; i < m.values.length; i++){
			a++;
			for (int j = 0 ; j < m.values[i].length; j++){//Alle Werte der Matrize auflisten und bei jedem aufgelisteten Wert auf a und b 1 addieren um Anzahl der Werte festzuhalten
				b++;
				
			}
			}
		
		if ( a != x){ //Überprüfen ob die Länge von Matrize values und m.values in den Zeilen ungleich sind
			return false;
		}
		if ( b != y){//Überprüfen ob die Länge von Matrize values und m.values in den Spalten ungleich sind
			return false;
			/* a und b, bzw x und y geben an wie lang die
			 * Arrays sind, da jedes mal wenn die for-Schleife
			 * erneut ausgeführt wird a, b, x, y um einen Wert
			 * erhöht werden. D.h., wenn a und x, b und y, den
			 * gleichen Wert haben, sind die jeweiligen Dimensionen
			 * der Matrizen gleich lang.  
			 */
		}else{
		
		
		return true; //Sollte keiner der obigen Fälle zutreffen, sind die Matrizen gleich
		}
		
		/* Aufgabe e) Vergleich
		 * Die Methode inEqualTo(Matrix m) soll true zurückgeben,
		 * wenn die Matrix, auf der die Methode aufgerufen wurde,
		 * identisch zu m ist, ansonsten false. Zwei Matrizen sind
		 * identisch, wenn :
		 * - sie in der Anzahl der Zeilen übereinstimmen,
		 * - sie in der Anzahl der Spalten übereinstimmen,
		 * - jeder Wert a-ij aus der Matrix mit a-ij aus der
		 * anderen Matrix übereinstimmt.
		 */
	}

	public void transpose() {
		int neu[][] = new int[values[0].length][values.length];
		for ( int i = 0; i < values[0].length; i++){
			for (int j = 0; j < values.length; j++){
				neu[j][i] = values[i][j];
				
			}
			
		}
		values = neu;
		
	}
	/* Aufgabe f) Transponieren
	 * Die Methode transpose() soll die in values definierte Matrix
	 * transponieren, d.h. an ihrer Hauptdiagonalen spiegeln
	 * ("Zeilen und Spalten werden vertauscht").
	 */

	
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
