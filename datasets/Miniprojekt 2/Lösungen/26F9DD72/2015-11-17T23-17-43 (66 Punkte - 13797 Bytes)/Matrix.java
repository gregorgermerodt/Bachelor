import java.util.Arrays;
 
public class Matrix
{
        private int[][] values;
       
        /*
         * Aufgabe 2
         */
       
        // a)
        public Matrix(int[][] initialValues)
        {      
                // auf values verweisen
                this.values = initialValues;   
        }
       
        // b)
        public void scalarMultiplication(int c)
        {      
                // �u�ere for-Schleife durchl�uft die Zeilen
                for(int i = 0; i < this.values.length; i++)
                {      
                        // Innere for-Schleife durchl�uft die Spalten
                        for( int j = 0; j < this.values[i].length; j++)
                        {
                                // Jeden Wert mit c multiplizieren
                                // alternativ kann man auch
                                // values[i][j] = values[i][j] * c;
                                // schreiben - ich verwende lieber die verk�rzte Schreibweise
                                this.values[i][j] *= c;
                        }
                }
        }
       
        // c)
        public void add(Matrix m)
        {      
                // �u�ere for-Schleife durchl�uft die Zeilen
                for(int i = 0; i < this.values.length; i++)
                {      
                        // Innere for-Schleife durchl�uft die Spalten
                        for( int j = 0; j < this.values[i].length; j++)
                        {      
                                // Addition der Werte
                                // wir m�ssen hier �ber den Punkoperator "." auf die Matrix in m zugreifen
                                // da es sich um ein Object handelt, dass wir �bergeben kriegen
                                this.values[i][j] += m.values[i][j];
                        }
                }
        }
       
        // d)
        public int[] getColumnVector(int col)
        {      
                // Hilfsarray erstellen, in dem wir die gesuchte Spalte speichern werden
                int[] colVector = new int[this.values.length];
               
                // for-Schleife zum �bertragen der Spaltenwerte in unseren
                // Spaltenarray colVector
                for(int i = 0; i < this.values.length; i++)
                {      
                        // i gibt die Zeile an und col die Spalte, da die Spalte sich nicht
                        // �ndert, brauchen wir nichts weiter als eine for-Schleife, die die
                        // Zeilen durchl�uft
                        colVector[i] = this.values[i][col];
                }              
               
                // Array zur�ckgeben
                return colVector;
        }
       
        // e)
        public boolean isEqualTo(Matrix m)
        {      
                // Abfrage von den ersen zwei Bedingungen f�r Gleichheit von zwei Matrizen
                // Annzahl der Spalten und Anzahl der Zeilen m�ssen gleich sein
                // && wichtig, da alles true sein muss
                if(this.values.length == m.values.length
                && this.values[0].length == m.values[0].length)
                {      
                        // Hilfsvariable zum Z�hlen der gleichen Werte innerhalb der Matrizen
                        int counter = 0;
                       
                        // for-Schleifen zum Durchlaufen der Matrizen
                        for(int i = 0; i < m.values.length; i++)
                        {
                                for(int j = 0; j < m.values[i].length; j++)
                                {
                                        // Abfrage der dritten Bedingung f�r die Gleichheit
                                        // jeder Wert der Matrizen muss an den gleichen Stellen
                                        // gleich sein
                                        if(this.values[i][j] == m.values[i][j])
                                        {      
                                                // Falls die Werte in den jeweiligen "Zellen" gleich
                                                // sind erh�he den counter um 1
                                                // einfache Z�hlvariable
                                                counter++;
                                        }
                                }
                        }
                        // hier �berpr�fe ich, ob die Anzahl der Werte die gleich sind
                        // gleich gro� sind der gesamten Anzahl aus einer Matrix
                        // Zeilen * Spalten = gesamte Anzahl der Werte einer Matrix
                        // Falls ja, gebe ich true zur�ck , sonst false
                        // Ich benutze den conditional Operator ?
                        // Beispiel (Bedingung f�r true oder false) ? (Antwort f�r true) : (Antwort f�r false);
                        return (counter == this.values.length * this.values[0].length) ? true : false;
                // Falls die Spalten und Zeilen nicht �bereinstimmen, geben wir direct false aus
                }else
                {
                        return false;
                }
               
        }
       
        // f)
        public void transpose()
        {      
                // Hilfsarray erstellen mit vertauschten Zeilen- und Spaltenl�ngen, siehe
                // Abbildung in Miniprojekt 2 pdf
                int[][] transMatrix = new int[this.values[0].length][this.values.length];
                // for-Schleife zum durchlaufen der Matrix
                for(int i = 0; i < this.values[0].length; i++)
                {
                        for(int j = 0; j < this.values.length; j++)
                        {      
                                // hier muss man bei values i und j vertauschen, damit es Sinn ergibt
                                // tut man es nicht, kriegt man einen Fehler ausgegeben
                                // da die L�ngen der Zeilen und Spalten jetzt unterschiedlich sind
                                transMatrix[i][j] = this.values[j][i];
                        }
                }
               
                // Auf values verweisen.
                this.values = transMatrix;
        }
 
        // --------------------------------------------------------------
       
        private void print()
        {
                if (values == null)
                {
                        System.out.println("null");
                } else
                {
                        System.out.printf("%dx%x:%n", values.length, values[0].length);
 
                        for (int[] row : values)
                        {
                                System.out.println(Arrays.toString(row));
                        }
                }
        }
 
        public static void main(String[] args)
        {
                Matrix m = new Matrix(new int[][]
                                {
                                {  2, 4, 5},
                                {  3, 7, 2},
                                { -2, 0, 1},
                                {  5, 1, 1}
                                });
 
                System.out.println("Neue Matrix m erzeugt. Matrix m:");
                // Erwartete Ausgabe:
                // 4x3:
                // [ 2, 4, 5]
                // [ 3, 7, 2]
                // [-2, 0, 1]
                // [ 5, 1, 1]
                m.print();
 
                System.out
                                .println("------------------------------------------------------------------");
 
                Matrix n = new Matrix(new int[][]
                                {
                                { 1,  0, -1},
                                { 1,  3,  3},
                                {-2, -4,  1},
                                { 0,  0,  1}
                                });
 
                System.out.println("Neue Matrix n erzeugt. Matrix n:");
                // Erwartete Ausgabe:
                // 4x3:
                // [ 1,  0, -1]
                // [ 1,  3,  3]
                // [-2, -4,  1]
                // [ 0,  0,  1]
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
 
                Matrix o = new Matrix(new int[][]
                                {
                                { 1, 4,  6 },
                                { 2, 4, -1 },
                                { 0, 4,  0 },
                                { 5, 1,  0 }
                                });
 
                System.out.println("Neue Matrix o erzeugt. Matrix o:");
                // Erwartete Ausgabe:
                // 4x3:
                // [1, 4,  6]
                // [2, 4, -1]
                // [0, 4,  0]
                // [5, 1,  0]
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
                // [1,  2, 0, 5]
                // [4,  4, 4, 1]
                // [6, -1, 0, 0]
                o.print();
        }
}