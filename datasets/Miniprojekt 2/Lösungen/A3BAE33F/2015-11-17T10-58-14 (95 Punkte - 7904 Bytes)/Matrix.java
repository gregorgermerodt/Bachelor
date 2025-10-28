


import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		
		this.values = initialValues;
	}

	public void scalarMultiplication(int c) {
		
		
		for (int i = 0; i < values.length; i++){		//values.length = L�nge der Zeilen
			for (int j = 0; j < values[0].length; j++){	//values[0].length = L�nge der Spalten
								
				values[i][j] = values[i][j] * c; 
				
			}
		}
	}

	public void add(Matrix m) {
		
		for (int i = 0; i < values.length; i++){				//L�nge der Zeilen
			for (int j = 0; j < values[0].length; j++){			//L�nge der Spalten
				
				values[i][j] = values[i][j] + m.values[i][j];
				
			}
		}
		
	}
	public int[] getColumnVector(int col) {
		
		
			
		int hilfe = values.length;
			//diese soll mir ddie L�nge der Spalte auslesen und sie in "hilfe" speichern
		
			//hier errichte ich mir ein Hilfsarray welches ich loesung nenne
		int [] loesung = new int[hilfe];
			//das Array loesung = ein neues Array mit der L�nge [hilfe]
			//meiner Ansicht nach die beste Methode um die dynamik zu behalten und einen 
			//outofbounderies zu entgehen.
		
			//damit ich auf die Werte zugreifen kann mache ich wieder eine For-Schleife
		for (int i = 0; i < hilfe; i++){
			
			//und sage nun der Methode:
			//loesung(mein Hilfsarray) mit der L�nge[i] bekommt die Werte von 
			//Matrix(values) mit der L�nge[i] und der Spalte[col]
		loesung[i] = values[i][col];
		}
		
		//das ganze Returnen und da habt ihr die L�sung :-)
		return loesung;
	}

	public boolean isEqualTo(Matrix m) {

		if (values[0].length != m.values[0].length || values.length != m.values.length) return false;

		
		else //andernfalls(also wenn die obere Bedingung "true" ist, was hier der Fall ist:
		{

			for (int i = 0; i < values.length; i++)
			{

				for (int k = 0; k < values[0].length; k++)
				{
 
					if (values[i][k] != m.values[i][k]) return false;
				}
			}
		}

		return true;
	}

	public void transpose() {

		int[][] loesung = new int[values[0].length][values.length];

		for (int i = 0; i < loesung.length; i++)
		{
			for (int k = 0; k < loesung[0].length; k++)
			{

				loesung[i][k] = values[k][i];
			}
		}	
		

		values = loesung;
		
		
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

		m.print();

		System.out
				.println("------------------------------------------------------------------");

		Matrix n = new Matrix(new int[][] { { 1, 0, -1 }, { 1, 3, 3 },
				{ -2, -4, 1 }, { 0, 0, 1 } });

		System.out.println("Neue Matrix n erzeugt. Matrix n:");

		n.print();

		System.out
				.println("------------------------------------------------------------------");

		System.out
				.println("Skalarmultiplikation von Matrix n mit dem Wert -1. Matrix n:");
		n.scalarMultiplication(-1);

		n.print();

		System.out
				.println("------------------------------------------------------------------");

		System.out.println("Matrix n wird zu Matrix m addiert. Matrix m:");
		m.add(n);

		m.print();

		System.out
				.println("------------------------------------------------------------------");

		System.out.println("Spaltenvektor mit Index 1 von Matrix m:");
		int[] columnVector = m.getColumnVector(1);
		System.out.println(Arrays.toString(columnVector));

		System.out
				.println("------------------------------------------------------------------");

		System.out.println("Vergleich von Matrix m mit Matrix n:");

		System.out.println(m.isEqualTo(n));

		System.out
				.println("------------------------------------------------------------------");

		Matrix o = new Matrix(new int[][] { { 1, 4, 6 }, { 2, 4, -1 },
				{ 0, 4, 0 }, { 5, 1, 0 } });

		System.out.println("Neue Matrix o erzeugt. Matrix o:");

		o.print();

		System.out
				.println("------------------------------------------------------------------");

		System.out.println("Vergleich von Matrix o mit Matrix m:");
		System.out.println(o.isEqualTo(m));

		System.out
				.println("------------------------------------------------------------------");

		System.out.println("Transponieren von Matrix o. Matrix o:");
		o.transpose();

		o.print();
	}
}