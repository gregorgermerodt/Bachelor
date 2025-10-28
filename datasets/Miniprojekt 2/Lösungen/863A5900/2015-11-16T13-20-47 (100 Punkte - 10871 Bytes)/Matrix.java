import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
			values = initialValues;
	}

	public void scalarMultiplication(int c) {
		// durchlauf der reihe
		for(int row = 0; row < values.length; row++){
			// durchlauf der Spalte      reihen länge
			for(int column =0 ; column < values[row].length; column++){
				//values[row][column] = values[row][column]*c; oder die untere
				values[row][column] *= c;
			}
		}
	}

	public void add(Matrix m) {
		for(int row = 0; row < values.length; row++){
			// durchlauf der Spalte      reihen länge
			for(int column =0 ; column < values[row].length; column++){
				 values[row][column] = values[row][column] + m.values[row][column];
			}
	
		} 
	}
	
	// Spaltenindex
	public int[] getColumnVector(int col) {
		int[] neu = new int [values.length];
		for(int i = 0 ; i <neu.length; i++){
			neu[i] =values[i][col];
		}
		return neu;
	}

	
	
	public boolean isEqualTo(Matrix m) {
		
		//In dieser Methode soll �berpr�ft werden ob die aufgerufene Matrix mit der Matrtrix �bereinstimmt
				//Dies ist der Fall wenn Matrix A und Matrix B die gleiche anzahl an Spalten und Zeilen haben.
				//Bsp: 	Matrix A = 4x3 und Matrix B = 4x3; das passt also :-) --> "true"
				//Bsp2:	Matrix A = 3x3 und Matrix B = 4x3; das passt also nicht --> "false"
				
				//Wir machen also eine IF-then-else Bedingung.
				//Man k�nnte theoretisch mit: if (Matrix A = Matrix B) arbeiten, jedoch hier haben wir es anders gemacht
				//um ein bi�chen Arbeit zu sparen :-)
				
				//Wir vergleichen also nicht auf Gleichheit, sondern auf "UNGLEICHHEIT"
				//1.Schritt: Erkl�rung hier als Pseudo Code
				//Pseudo-Code: 	wenn(if) (Spaltenl�nge Matrix n ungleich Spaltenl�nge Matrix m ist ODER
				//						 (Zeilenl�nge Matrix n ungleich Zeilenl�nge ist) wenn ja, return "false"
				if (values[0].length != m.values[0].length || values.length != m.values.length) return false;
				//sollte das jetzt der Fall sein, wird sofort "false" zur�ckgegeben und die Methode wird beendet
				
				else //andernfalls(also wenn die obere Bedingung "true" ist, was hier der Fall ist:
				{
						//Spaltenl�nge lesen
					for (int i = 0; i < values.length; i++)
					{
							//Zeilenl�nge lesen
						for (int k = 0; k < values[0].length; k++)
						{
								//vergleichen ob Zeilen und Spalten Matrix n "UNGLEICH" Matrix m ist, wenn ja return false
							if (values[i][k] != m.values[i][k]) return false;
						}
					}
				}
				//andernfalls return true
				return true;
			}

		
		
		
		
		
		/*	if(values.length == values.length && values[0].length == values[0].length){
		for(int i =0; i < values.length; i++){
			for(int j =0; j< values[0].length; j++){
				if(values[i][j]==values[i][j]){
					return false;
				}
			}
		}
	}
	
	else
	{
		return false;
	}
	
	return false;
	
	}
*/
	public void transpose() {
		int[][] trans = new int [values[0].length][values.length];
		 for (int i = 0; i < this.values[0].length; i++) {
	            for (int j = 0; j < this.values.length; j++) {
	                // hier muss man bei values i und j vertauschen, damit es Sinn ergibt
	                // tut man es nicht, kriegt man einen Fehler ausgegeben
	                // da die Längen der Zeilen und Spalten jetzt unterschiedlich sind
	                trans[i][j] = values[j][i];
	            }
	        }

	        // Auf values verweisen.
	        values = trans;
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
