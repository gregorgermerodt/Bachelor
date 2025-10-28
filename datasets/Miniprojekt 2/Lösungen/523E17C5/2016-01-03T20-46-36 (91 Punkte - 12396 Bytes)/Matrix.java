import java.util.Arrays;

/**
 *
 * @author Martin Grunwald
 * @version 01.05.2014
 */
public class Matrix {

    private int[][] values;

    /**
     * Konstruktor der Klasse Matrix
     *
     * @param initialValues Matrix, die beim ersten Aufrufen der Klasse
     * uebergeben wird
     */
    public Matrix(int[][] initialValues) {
        values = initialValues;
    }

    /**
     * multipliziert die Matrix skalar mit dem Wert c
     *
     * @param c Wert, mit dem Skalar multipliziert wird
     */
    public void scalarMultiplication(int c) {
        // Schleife, die durch alle Zeilen geht
        for (int i = 0; i < values.length; i++) {
            // Schleife, die durch alle Spalten geht
            for (int j = 0; j < values[0].length; j++) {
                // der Wert in Zeile i und Spalte j steht, wird mit c multipliziert
                values[i][j] *= c;
            }
        }
    }

    /**
     * addiert die Matrix m zu der internen Matrix
     *
     * @param m zu addierende Matrix
     */
    public void add(Matrix m) {
        // Schleife, die durch alle Spalten geht
        // (dies kann auch wie in scalarMultiplication geloest werden)
        for (int i = 0; i < values[0].length; i++) {
            // aktuelle Spalte wird zwischengespeichert
            int[] tmp = m.getColumnVector(i);
            for (int j = 0; j < values.length; j++) {
                // der Wert an der Stelle (i,j) wird mit dem Wert an der Stelle
                // j in tmp addiert
                values[j][i] += tmp[j];
            }
        }
    }

    /**
     * gibt den Spaltenvektor an der Stelle col zurueck
     *
     * @param col Stelle fuer den Spaltenvektor
     * @return Spaltenvektor an der Stelle col
     */
    public int[] getColumnVector(int col) {
        // (Eigenart von mir; wenn man einen Wert mehr als ein mal braucht,
        // speichere ich ihn zwischen. muss man nicht, kann aber helfen)
        int resultlength = values.length;
        int[] result = new int[resultlength];
        // Schleife, die so oft ausgefuehrt wird, wie unsere Matrix Zeilen hat
        for (int i = 0; i < resultlength; i++) {
            // die Zeilennummer erhoeht sich bei jedem Aufruf, wohingegen
            // die Spalte immer die gleiche bleibt
            result[i] = values[i][col];
        }
        return result;
    }

    /**
     * gibt zurueck, ob die interne Matrix exakt gleich der Matrix m ist
     *
     * @param m Matrix, mit der verglichen wird
     * @return true, falls die interne Matrix exakt gleich der Matrix m ist;
     * false, wenn nicht
     */
    public boolean isEqualTo(Matrix m) {
        // gib false zurueck, wenn sie ungleich viele Spalten oder Zeilen haben
        if (values.length != m.values.length
                || values[0].length != m.values[0].length) {
            return false;
        }
        // gib false zurueck, falls sie sich in irgendeinem Wert unterscheiden
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                if (values[i][j] != m.values[i][j]) {
                    return false;
                }
            }
        }
        // wenn beide Schleifen durchlaufen wurden, sind die beiden Matrizen gleich
        return true;
    }

    /**
     * transponiert die Matrix
     */
    public void transpose() {
        // die Anzahl der Spalten wird die neue Anzahl der Zeilen
        // und umgekehrt und die neue Matrix wird in transposed zwischengespeichert
        int[][] transposed = new int[values[0].length][values.length];
        // Schleife, die alle Spalten durchlaeuft
        for (int i = 0; i < values[0].length; i++) {
            // Schleife, die alle Zeilen durchlaeuft
            for (int j = 0; j < values.length; j++) {
                // die Zeilen werden mit den Zeilen getauscht
                transposed[i][j] = values[j][i];
            }
        }
        // die Werte aus dem Zwischenspeicher transposed werden jetzt in values
        // geschrieben
        values = new int[transposed.length][transposed[0].length];
        for (int i = 0; i < transposed.length; i++) {
            // System.arraycopy(quellArray, startposition im Quellarray,
            // zielArray, startposition im zielarray, schritte)
            System.arraycopy(transposed[i], 0, values[i], 0, transposed[0].length);
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
        Matrix m = new Matrix(new int[][]{{2, 4, 5}, {3, 7, 2},
        {-2, 0, 1}, {5, 1, 1}});

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

        Matrix n = new Matrix(new int[][]{{1, 0, -1}, {1, 3, 3},
        {-2, -4, 1}, {0, 0, 1}});

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

        Matrix o = new Matrix(new int[][]{{1, 4, 6}, {2, 4, -1},
        {0, 4, 0}, {5, 1, 0}});

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
