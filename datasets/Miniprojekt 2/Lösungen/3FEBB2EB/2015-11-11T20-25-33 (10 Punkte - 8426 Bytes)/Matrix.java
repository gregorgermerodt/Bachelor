import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values = initialValues;
	}

	public void scalarMultiplication(int c) {
		
		int a =0;	//zeilen
		int b =0;	//anzahl elemente in zeile
		
		while(a<=values.length-1 && b<=values[a].length){
			values[a][b]=values[a][b]*c;
			if(b==values[a].length-1){
				a=a+1;
				b=0;
			}
			else{
				b++;
			}
			if(b!=0){
				b=0;
			}
		}
		return;
	}

	public void add(Matrix m) {
		
		//zeile für zeile durchlauf
		//addieren und in neue matrix schreiben
		//nächste spalte
		//von vorne
		
		//a=anzahl zeilen
		int a =0;
		//b=anzahl elemente in zeile
		int b =0;
		
		while(a<=values.length-1 && b<=values[a].length){
			values[a][b]=values[a][b]+m.values[a][b];
			if(b==values[a].length-1){
				a++;
				b=0;
			}
			else{
				b++;
			}
			
		}
		return;
	}

	public int[] getColumnVector(int col) {
		/*
		 * 1.zu lesende spalte
		 * 2.element a aus spalte holen
		 * 3.in neuen array schreiben
		 */
		//col=zeile
		int b =col;
		int a =0;
		
		int[] vector = new int[values.length];
		
		while(a<values.length){
			vector[a] = values[a][b];
			a++;
		}
		
		return vector;
	}

	public boolean isEqualTo(Matrix m) {
		/* 1. anzahl zeilen überprüfen
		 * 2. anzahl spalten überprüfen
		 * 3. wenn 1. und 2. true -> alle elemente überprüfen
		 * 4. wenn ein fehler auftritt -> false 
		 */
		//a=anzahl zeilen
		int a =0;
		//b=anzahl elemente in zeile
		int b =0;
		
		if(values.length!=m.values.length || values[0].length!=m.values[0].length){
			while(a!=values.length && b!= values[0].length){
				if(values[a][b]!=values[a][b]){
					return false;
				}
				if(b==values.length-1){
					a++;
					b=0;
					if(a==values[0].length){
						return true;
					}
				}
				else{
					b++;
				}
			
			}
		}
			
		return false;
	}

	public void transpose() {
		/*
		 * 1) neue matrix mit spalten = zeilen(alt) und zeilen = spalten(alt)
		 * 2) 1.zeile in 1.spalte
		 * 3) nachste zeile
		*/
		int[][] spiegel = new int[values[0].length][values.length];
		//a=anzahl zeilen
		int a =0;
		//b=anzahl elemente in zeile
		int b =0;
		
		while(a!=values.length && b!= values[0].length){
			spiegel[b][a] = values[a][b];
			if(b==values.length-1){
				a++;
				b=0;
			}
			else{
				b++;
			}
		}
		return;
		
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
