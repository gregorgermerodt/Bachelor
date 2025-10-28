import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
	
		//values mit initialValues überschreiben
		this.values = initialValues;

	}

	public void scalarMultiplication(int c) {
		
		//da Matrix --> zeilen und spalten also verschachtelte for schleife benutzen
		for(int i=0;i<this.values.length;i++){
			for(int j=0;j<this.values[i].length;j++){
				
				//Werte aus zeile und Spalte in i und j mit c multiplizieren
				this.values[i][j]=this.values[i][j]*c;				
							
			}
		}

	}

	public void add(Matrix m) {
		//da Matrix verschachtelte for schleife
		for(int i=0;i<this.values.length;i++){
			for(int j=0;j<this.values[i].length;j++){
				
				//Werte aus Matrix mit Matrix m addieren
				this.values[i][j]=this.values[i][j]+m.values[i][j];
			}
		}
	}

	public int[] getColumnVector(int col) {
		
		//neues eindimensionales Array mit der Länge des aktuellen Arrays erzeugen
		int[] vector=new int[this.values.length];
		
		//for Schleife zum durchgehen
		for(int i=0;i<this.values.length;i++){
			
			//vector kriegt die werte des aktuellen Arrays aus der Spalte col
			vector[i]=this.values[i][col];
			
		}
		//vector zurückgeben
		return vector;
	}

	public boolean isEqualTo(Matrix m) {
		
		//falls die Anzahl der Zeilen & Anzahl der Spalten übereinstimmen
		if(this.values.length==m.values.length && this.values[0].length==m.values[0].length){
			
			// zähler initialisieren um die Spalten und Zeilen anzahl zu überprüfen
			int zaehler = 0;
             
			//for Schleife verschachtelt
             for(int i = 0; i < m.values.length; i++){
             
            	 for(int j = 0; j < m.values[i].length; j++){
                    	 
            		 //falls sie übereinstimmen
            		 if(this.values[i][j] == m.values[i][j]){
                         
            			 //zähler erhöhen    
            			 zaehler++;
                             }
                     }
             }
             //falls die Spalten und Zeilen anzahl stimmt true 
             if(zaehler==this.values.length*this.values[0].length){
            	 return true;
             }else{
            	 return false;
             }
             
		}
		//sonst false
		else{
            
			return false;
			
             }
		
		
	}

	public void transpose() {
		//Hilfsarray initialisieren mit vertauschten Längen
		
		int[][] hilfsArray=new int[this.values[0].length][this.values.length];
		
		//for schleife zum überschreiben
		for(int i=0;i<this.values[0].length;i++){
			
			for(int j=0;j<this.values.length;j++){
				
				//verkehrt herum überschreiben
				hilfsArray[i][j]=this.values[j][i];
			}
		}
		//values mit hilfsArray überschreiben
		this.values=hilfsArray;
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
