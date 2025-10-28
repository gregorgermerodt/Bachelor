import java.util.Arrays;
 
public class Matrix {
 
    private int[][] values;
 
    public Matrix(int[][] initialValues) {
        values = initialValues;
    }
 
    public void scalarMultiplication(int c) {
        for(int rows = 0; rows<=values.length - 1;rows++)
        {
            for (int columns = 0; columns<=values[rows].length -1; columns++)
            {
                values[rows][columns] = values[rows][columns] * c;
            }
        }
    }
 
    public void add(Matrix m) {
        for(int rows = 0; rows<=values.length - 1;rows++)
        {
            for (int columns = 0; columns<=values[rows].length -1; columns++)
            {
                values[rows][columns] = values[rows][columns] + m.values[rows][columns];
            }
        }
    }
 
    public int[] getColumnVector(int col) {
        int[] columnVector = new int[values.length];
        int counter = 0;
         
        for(int rows = 0; rows<=values.length - 1; rows++)
        {
            columnVector[counter] = values[rows][col]; 
            counter++;
        }
        return columnVector;
    }
 
    public boolean isEqualTo(Matrix m) {
     
        if (Arrays.deepEquals(m.values, values))
        {
            return true;
        }
        return false;
    }
 
    public void transpose() {
        int valuesColumnsLength = values.length;
        int valuesRowsLength = values[0].length;
        int[][] transValue = new int[valuesRowsLength][valuesColumnsLength];
         
        for(int columnsIndex = 0; columnsIndex <= transValue.length - 1 ; columnsIndex++)
        {
            for (int rowsIndex = 0; rowsIndex <= transValue[columnsIndex].length - 1; rowsIndex++)
            {
                transValue[columnsIndex][rowsIndex] = values[rowsIndex][columnsIndex];
            }
        }
        values = transValue;
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