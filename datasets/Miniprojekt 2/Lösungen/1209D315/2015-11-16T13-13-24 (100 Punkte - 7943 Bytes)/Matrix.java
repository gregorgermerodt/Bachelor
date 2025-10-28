import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) 
	{
		values= initialValues;
		
	}

	public void scalarMultiplication(int c) {
		for(int row=0 ;row<values.length; row++ ){
			for(int column =0; column < values[row].length; column++){
				values[row][column] = values[row][column] *c;
				//values[row][column] *= c;
			}
		}
	}

	public void add(Matrix m) {
		if(m.values.length== values.length)
		for(int row=0 ;row<values.length; row++ ){
			for(int column =0; column < values[row].length; column++){
				values[row][column] = m.values[row][column]+ values[row][column];
			}
		}

	}

	public int[] getColumnVector(int col) {
		int groesse= 0;
		for(int index=0; index<values.length;index++)
		{
			groesse++;
		}
		int[] neu= new int[groesse];
		for(int index=0; index<values.length; index++)
		{
			neu[index]= values[index][col];
		}
		return neu;
	}

	public boolean isEqualTo(Matrix m) {
		
		if(m.values.length== values.length && m.values[0].length== values[0].length)
		{
			for(int index=0; index<values.length; index++)
			{
				for(int indexC=0; indexC<values[indexC].length; indexC++)
				{
					if(m.values[index][indexC]== values[index][indexC]);
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}

	public void transpose() {

		int[][] neu = new int[values[0].length][values.length];
		for(int indexRow= 0; indexRow< values.length;indexRow++)
		{
			for(int indexColumn=0; indexColumn<values[indexRow].length; indexColumn++)
			{
				neu[indexColumn][indexRow]= values[indexRow][indexColumn];
			}
		}
		values= neu;
			
		
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
