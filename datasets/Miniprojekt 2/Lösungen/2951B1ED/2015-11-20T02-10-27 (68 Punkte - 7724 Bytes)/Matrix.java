import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
values=initialValues;
	}

	public void scalarMultiplication(int c) {
//int[][] multi =new int[values.length][values[0].length];
for (int i=0;i<values[0].length;i++) {
	
for (int z=0;z<values.length;z++) {
	values[z][i]=c*values[z][i];
	
   }	
  }
/*for (int y=0;y<values[0].length;y++) {
for (int x=0;x<values.length;x++) {
	values[x][y]=multi[x][y];
	
  }
 }*/
}

	public void add(Matrix m) {
	//int[][] addition=new int[values.length][values[0].length];
		for (int i=0;i<values[0].length;i++) {
			
			for (int z=0;z<values.length;z++) {
				int ergebnis=(values[z][i]+m.values[z][i]);
				values[z][i]=ergebnis;
				
				
			   }	
			  }
		//values=addition;
	}

	public int[] getColumnVector(int col) {
		int[] column=new int[values.length];
		for (int i=0;i<column.length;i++) {
			column[i]=values[i][col]; 
			} 	
		
		return column;
	}

	public boolean isEqualTo(Matrix m) {
		for (int i=0;i<values[0].length;i++){	
		for (int x=0;x<values.length;x++) {
		if (values.length==m.values.length & values[0].length==m.values[0].length)	{
		for (int z=0;z<values.length;z++) {
			if (values[z][x]==m.values[z][x]) {
				return true;
			}
		  }	
	   }
	}			
 }
	
		return false;
}
		

	public void transpose() {
int[][] transpose=new int[values.length-1][values[0].length+1];
		for (int i=0;i<transpose[0].length;i++){
	for (int x=0;x<transpose.length;x++) {
		transpose[x][i]=values[i][x];
	}
	
  }
		values=new int[transpose.length][transpose[0].length];
	for (int z=0;z<transpose[0].length;z++) {
		for (int h=0;h<transpose.length;h++) {
			values[h][z]=transpose[h][z];
		}
	}
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
