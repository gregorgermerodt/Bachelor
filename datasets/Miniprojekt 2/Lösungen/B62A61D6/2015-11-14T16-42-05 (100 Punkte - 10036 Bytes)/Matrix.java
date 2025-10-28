import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values = initialValues;
	}

	public void scalarMultiplication(int c) {
		for(int row = 0; row < values.length; row++){
			for (int column = 0; column < values[row].length;column++){
				values[row][column] = values[row][column] * c;
				
			}
		}
				
			
	}

	public void add(Matrix m) {
		for(int row = 0; row < values.length; row++){
			for (int column = 0; column < values[row].length;column++){
				values[row][column] = values[row][column] + m.values [row][column];
				
			}
		}
		

	}

	public int[] getColumnVector(int col) {
		
	    // Hilfsarray erstellen, gesuchte Spalte wird gespeichert
        int[] colVector = new int[this.values.length];
       
        // for-Schleife zum Übertragen der Spaltenwerte in colVector
        for(int i = 0; i < this.values.length; i++)
        {      
                // i gibt die Zeile an und col die Spalte, da die Spalte sich nicht
                // ändert, for-Schleife zum durchlaufen der Zeile
                colVector[i] = this.values[i][col];
        }              
       
        return colVector;
	}

	public boolean isEqualTo(Matrix m ) {
       
        if(this.values.length == m.values.length
        && this.values[0].length == m.values[0].length)
        {      
                // Hilfsvariable zum Zählen der gleichen Werte innerhalb der Matrizen
                int counter = 0;
               
                // for-Schleifen zum Durchlaufen der Matrizen
                for(int i = 0; i < m.values.length; i++)
                {
                        for(int j = 0; j < m.values[i].length; j++)
                        {
                                // Abfrage der dritten Bedingung für die Gleichheit
                                // jeder Wert der Matrizen muss an den gleichen Stellen
                                // gleich sein
                                if(this.values[i][j] == m.values[i][j])
                                {      
                                        // Falls die Werte in den jeweiligen "Zellen" gleich
                                        // sind erhöhe den counter um 1
                                        // einfache Zählvariable
                                        counter++;
                                }
                        }
                }
                return (counter == this.values.length * this.values[0].length) ? true : false;
        // Falls die Spalten und Zeilen nicht übereinstimmen, geben wir direct false aus
        }else
        {
               return false;}

	}

	public void transpose() {
		  {      
         // Hilfsarray erstellen mit vertauschten Zeilen- und Spaltenlängen, siehe
         // Abbildung in Miniprojekt 2 pdf
			  
              int[][] transMatrix = new int[this.values[0].length][this.values.length];
              
              // for-Schleife zum durchlaufen der Matrix
              for(int i = 0; i < this.values[0].length; i++)
              {
                      for(int j = 0; j < this.values.length; j++)
                      {      
                     // hier muss man bei values i und j vertauschen, damit es Sinn ergibt
                     // macht man es nicht, bekommt man einen Fehler ausgegeben
                     // da die Längen der Zeilen und Spalten jetzt unterschiedlich sind
                    	  
                              transMatrix[i][j] = this.values[j][i];
                      }
              }
             
              // Auf values verweisen.
              this.values = transMatrix;
      }}
		//Alternative Lösung
        //if (values.length > 0) {
            //for (int i = 0; i < values[0].length; i++) {
                //for (int j = 0; j < values.length; j++) {
                    //System.out.print(values[j][i] + " ");
                //}
               // System.out.print("\n");
               // }}}
		
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
