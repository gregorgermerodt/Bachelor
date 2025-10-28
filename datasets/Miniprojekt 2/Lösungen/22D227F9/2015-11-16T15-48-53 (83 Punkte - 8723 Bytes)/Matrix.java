import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values = initialValues; //initialisierung von values;

	}

	public void scalarMultiplication(int c) {
		for(int i = 0; i < values.length;i ++){//laufvariablen um die beiden 
			for(int j = 0; j < values[i].length; j++){//Matrizen durchzugehen;
				values[i][j] *= c; //zum Schluss einfach die Elemte an den Stellen I und J mit der Variable C multiplizieren;
			}
		}

	}

	public void add(Matrix m) {
		for(int i = 0; i<values.length; i++){//SAME AS USUAL
			for(int j = 0; j<values[i].length; j++){//SAME AS USUAL	
				this.values[i][j] += m.values[i][j];//was wichtig war, war es zu bemerken das man nicht direkt die Matrix m 
				//verwenden konnte. Es musste klar gestellt werden, dass es sich bei m auch um ein Array handelt;
			}
		}

	}

	public int[] getColumnVector(int col) {
		int temp[] = new int [this.values.length];
		for(int i = 0; i < values.length; i++){//Same as usual
			temp[i] = values[i][col];//War schon etwas schwerer zu verstehen wie die Ausgabe funktionieren sollte. Im enddefekt übernimmt temp[i] einfach die Spalten werden von col. Die Zeile wird außer acht gelassen;
		}
		return temp;
	}

	public boolean isEqualTo(Matrix m) {
		if(values[0] == m.values[0] && values[0].length == m.values[0].length){//Wenn unsere beiden Matrizen die selbe länge haben erstellen wir eine Zählvariable
			int counter = 0; //Die im Ende einfach wieder unsere Länge der beiden Matrizen wiederspiegeln sollte, wenn denn dann auch beide Matrizen die selbe Länge haben
			for(int i = 0; i < values.length; i++){//Same as usual
				for(int j = 0; j<values.length; j++){//Same as usual
					if(values[i][j] == m.values[i][j]){//hier vergleichen wir einfach die Elemente der beiden Matrizen und erhöhen somit unsere Laufvariable
						counter++;//entspricht diesse am Ende der länge von M und Values. Return true
					}
					if(counter == values.length && counter == m.values.length && counter == values[i].length && counter == m.values[i].length){
						return true;
					}
				}
			}
	
		}
		 return false;
	}

	public void transpose() {
	int [][] temp = new int [values[0].length][values.length];
	for(int i = 0 ; i < values[0].length; i++){
		for(int j = 0; j < values.length; j++){
			temp[i][j] = values[j][i];
			
		}
	}
	values = temp;

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
