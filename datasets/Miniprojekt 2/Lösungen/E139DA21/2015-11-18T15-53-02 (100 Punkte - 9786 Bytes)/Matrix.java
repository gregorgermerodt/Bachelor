import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values=initialValues;

	}

	public void scalarMultiplication(int c) {
		/*for (int indexZeile = 0; indexZeile < values.lenght; indexZeile++)
		 * {
		 * for(int indexSpalte = 0; indexSpalte < values[0].lenght;indexSpalte++);
		 * {
		 * values[indexZeile][indexSpalte]*=c; ODER 
		 * values[indexZeile][indexSpalte]= values[indexZeile][indexSpalte]*c;}}
		 */
		for(int row=0;row<values.length;row++){
			for(int column=0;column<values[row].length;column++){
				//values[row][column] = values[row][column]*c; identisch
				values[row][column] *= c;
			}
		}
	}

	public void add(Matrix m) {
		/*for(int indexZeile =0 ; indexZeile <values.length; index++);
		 * {
		 * for(int indexSpalte = 0 ; indexSpalte <values[indexZeile].lenght; indexSpalte++);
		 * {values[indexZeile][indexSpalte]+= m.value[indexZeile][indexSpalte];}}
		 * 
		 */
		for(int row=0;row<values.length;row++){
			for(int column=0;column<values[row].length;column++){
				values[row][column]=values[row][column]+m.values[row][column];
			}
		}
	}

	public int[] getColumnVector(int col) {
		/*int [] neu = new int[value.lenght];
		 * for (int index = 0; index < value.length; index++)
		 * {
		 * neu[index] = value[index][col];
		 * }
		 * return neu;
		 * }
		 * 
		 * 
		 */
		int[] colAusgabe = new int[values.length];
		for(int index=0;index<colAusgabe.length;index++){
			colAusgabe[index]=values[index][col];
		}
		return colAusgabe;
	}

	public boolean isEqualTo(Matrix m) {
		
		if(values.length == m.values.length && values[0].length == m.values[0].length)
		  {
		  for (int indexZeile = 0; indexZeile <values.length; indexZeile++)
		  {
		  for (int indexSpalte = 0; indexSpalte <values[0].length; indexSpalte++)
		  {
		  if (values[indexZeile][indexSpalte] != m.values[indexZeile][indexSpalte])
		  {
		  return false;
		  }
		  }
		  }
		  return true;
		  }
		  else
		  return false;
		  
		 }
		 
		 
		//FALSCH, NOCHMALS MACHEN!
		/*boolean wahrheit=false;
		for(int row=0;row<values.length;row++){
			for(int column=0;column<values[row].length;column++){
				if(m.values[row][column]==values[row][column]){
					wahrheit=true;
				}else{
					wahrheit=false;
				}
			}
		}
		return wahrheit;
	}*/

	public void transpose() {
		  /*int[] neu = new int[values[0].length];
		  for (int indexZeile=0; indexZeile<values.length; indexZeile++)
		  {
		  for (int indexSpalte=0; indexSpalte<values[0].length; indexSpalte++)
		  {
		   values[indexSpalte][indexZeile] = values[indexZeile][indexSpalte];
		  {
		  values = neu;
		  }}}}*/
		int [][] neu= new int[values[0].length][values.length];
		for (int indexZeile=0; indexZeile<neu.length;indexZeile++)
		{
		for (int indexSpalte = 0; indexSpalte<neu[indexZeile].length;indexSpalte++){
			neu[indexZeile][indexSpalte]=values[indexSpalte][indexZeile];
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
