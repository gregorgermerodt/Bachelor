import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values=initialValues;
	}

	public void scalarMultiplication(int c) {
		for (int i=0;i<values.length;i++){
			for (int j=0;j<values[i].length;j++){
				values[i][j] = values[i][j] * c;
			}
		}
	}

	public void add(Matrix m) {
		int[][] varArray = m.getMatrix();
		for (int i=0;i<values.length;i++){
			for (int j=0;j<values[i].length;j++){
				values[i][j] = values[i][j] + varArray[i][j];
			}
		}
	}

	public int[] getColumnVector(int col) {
		int[] varArray = new int[values.length];
		for(int i=0; i<values.length;i++){
			varArray[i] = values[i][col];
		}
		return varArray ;
	}

	public boolean isEqualTo(Matrix m) {
		int[][] varArray = m.getMatrix();
		boolean bedingung1=false,bedingung2=false,bedingung3=false;

		if(varArray.length == values.length){
			bedingung1=true;

		}else{
			bedingung1=false;
		}
		for(int i = 0;i<values.length;i++){
			if(varArray[i].length==values[i].length){
				if(bedingung2 == true || i==0){
					bedingung2=true;
				}else{
					bedingung2=false;
				}
			}else{
				bedingung2=false;
			}

		}
		for(int i=0;i<values.length;i++){
			for(int j=0;j<values[i].length;j++){
				if(varArray[i][j]==values[i][j]){
					if((bedingung3 == true) || (i==0&&j==0)){
						bedingung3=true;
					}else{
						bedingung3=false;
					}
				}else{
					bedingung3=false;
				}
			}
		}
		if((bedingung1==true)&&(bedingung2==true)&&(bedingung3==true)){
			return true;
		}else{
			return false;
		}
	}

	public void transpose() {
		int[][] varArray =new int[values[0].length][values.length];
		
		/*for (int i = 0; i<values.length;i++){
			for(int j = 0; j<values[i].length;j++){
				varArray = new int[j][i];
			}
		}*/
		
		for (int i = 0; i<values.length;i++){
			for(int j = 0; j<values[i].length;j++){
				varArray[j][i] = values[i][j];
			}
		}
		
		values=varArray;

	}
	public int[][] getMatrix(){
		return values;

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
