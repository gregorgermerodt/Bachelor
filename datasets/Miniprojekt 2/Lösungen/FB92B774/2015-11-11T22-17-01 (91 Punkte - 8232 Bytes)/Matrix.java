import java.util.Arrays;
//FÜR PRIMITIVE DATENTYPEN gibt es KEIN nullH
public class Matrix 
{

	private int[][] values;

	//Constructor
	/* VERSTEHE!
	Das Parameter "initialValues" kann grundsätzlich beliebig heißen, 
	denn der Name des Parameters hat nur eine semantische Bedeutung.
	Logisch dient er als "Platzhalter" für ein Parameter, 
	das mit angegeben/übergeben werden muss, immer dann wenn ein neues Objekt erstellt wird,
	was zur Folge hat, dass dieser Constructor aufgerufen wird.*/

/**2a)*/		
	public Matrix(int[][] initialValues) 	
						
	{
		this.values = initialValues;
	}

/**2b)*/	
	public void scalarMultiplication(int c) 
	{
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				values[i][j] *= c;
			}
		}
	}

/**2c)*/	
	public void add(Matrix m) 
	{
		for(int i = 0; i< values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++ )
			{
				this.values[i][j] += m.values[i][j];
			}
		}
	}

/**2d)*/	
	public int[] getColumnVector(int col) // "col" gibt den Index des inneren Arrays an.
	{
		int[] vector = new int[values.length]; // der aus der Matrix zu extrahierende Vektor hat so viele Indizes, wie die Matrix im äußeren Array besitzt.
		
		for(int i = 0; i < values.length; i++)
		{
			vector[i] = values[i][col]; //col bleibt fix; Die Zeilen aus values werden so in den vector übertragen;
		}

		return vector;
	}

	
/**2e)*/	
 
	public boolean isEqualTo(Matrix m) //Prinzip: Wenn true, dann weiter, sonst false
	{
		if(this.values.length == m.values.length && this.values[0].length == m.values[0].length) //1. Zeilen && Spalten sind gleich?
		{
			for(int i = 0; i < m.values.length; i++) // 3. Inhalt identisch?
				{
				for(int j = 0; j < m.values[i].length; j++)
					{
						if(this.values[i][j] == m.values[i][j])
							return true;
					}
						return false;
				}
		}
		return false;		
	}
	
	
/**2f)*/	
	public void transpose()  //getcolumnVector() nutzen!!!
	{
		
		
	
		
	}
	
	
/**Hilfsmethoden*/
	
	int getRowLength()
	{
		return values.length;
	}
	
	int getColumnLength()
	{
		return values[0].length;
	}

	// --------------------------------------------------------------
	
	private void print() 
	{
		if (values == null) {
			System.out.println("null");
		} else {
			System.out.printf("%dx%x:%n", values.length, values[0].length);

			for (int[] row : values) {
				System.out.println(Arrays.toString(row));
			}
		}
	}

	public static void main(String[] args) 
	{
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
