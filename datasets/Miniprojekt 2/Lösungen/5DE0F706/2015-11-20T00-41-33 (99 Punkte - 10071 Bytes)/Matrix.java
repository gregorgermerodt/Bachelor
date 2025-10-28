import java.util.Arrays;

public class Matrix {

    private int[][] values;

    public Matrix(int[][] initialValues) {
        int zeile = initialValues.length;
        int spalte = initialValues[0].length;
        
        values = new int [zeile][spalte];
        
        for(int a = 0; a < zeile; a++){
            for(int b = 0; b < spalte; b++){
                values[a][b]=initialValues[a][b];
            }
        }
    }

    public void scalarMultiplication(int c) {
        int zeile = values.length;
        int spalte = values[0].length;
        
        for(int a = 0; a < zeile; a++){
            for(int b = 0; b < spalte; b++){
                values[a][b]=values[a][b]*c;
            }
        }
    }

    public void add(Matrix m) {
        int zeile = values.length;
        int spalte = values[0].length;
        
        for(int a = 0; a < zeile; a++){
            for(int b = 0; b < spalte; b++){
                values[a][b]=values[a][b]+m.values[a][b];
            }
        }
    }

    public int[] getColumnVector(int col) {
        int [] re = new int [values.length];
        for(int a = 0; a < values.length; a++){
            re [a] = values [a][col];
        }
        return re;
    }

    public boolean isEqualTo(Matrix m) {
        if(values.length != m.values.length){
            return false;
        }
        else if(values[0].length != m.values[0].length){
            return false;
        }
        for(int a = 0; a < values.length; a++){
            for(int b = 0; b < values [0].length; b++){
                if(values [a][b] != m.values [a][b]){
                    return false;
                }
            }
        }
        
        return true;
    }

    public void transpose() {
        int [][] hilfsmatrix = new int [values[0].length][values.length];
        
        for(int a = 0; a < values.length; a ++){
            for(int b = 0; b < values[0].length; b++){
                hilfsmatrix [b][a] = values [a][b];
            }
        }
        
        values = new int [hilfsmatrix.length][hilfsmatrix[0].length];
        
        for(int a = 0; a < values.length; a ++){
            for(int b = 0; b < values[0].length; b++){
                values [a][b] = hilfsmatrix [a][b] ;
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
