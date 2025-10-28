
import java.util.Arrays;
 
public class Measurement
{
 
        private int[] data;
 
        /*
         * Aufgabe 1
         *
         * beachtet "this" nicht - hier kann man es weglassen
         *
         * Was this genau bedeutet und wieso man diesen Operator
         * verwendet wird noch sp�ter deutlich
         */
       
        // a)
        public Measurement()
        {      
                // Neues Array der L�nge 0 anlegen.
                this.data = new int[0];
        }
       
        // b)
        public void addValue(int value)
        {      
                // Fall 1: data ist noch leer und mit keinem Wert gef�llt,
                // beim Aufruf der Methode
                if(data.length == 0)
                {
                        // Hilfsarray erstellen und direkt initialisieren
                        // der Parameter value enth�lt unseren neuen Wert
                        int[] data2 = {value};
                        // Auf data verweisen
                        data = data2;
                // Fall 2: data ist nicht leer beim Aufruf der Methode
                }else
                {      
                        // Hilfsarray mit der ben�tigten L�nge erstellen
                        // die L�nge von data + 1 - da die L�nge der Arrays
                        // den Modifizierer final hat und nicht mehr ge�ndert
                        // werden kann.
                        int[] data2 = new int[this.data.length+1];
                       
                        // Werte von data ins Hilfsarray �bertragen
                        for(int i = 0; i < this.data.length; i++)
                        {
                                data2[i] = this.data[i];
                                // letzte Stelle von data erreicht, nun den Wert aus
                                // value in die letzte Stelle von data2 speichern
                                if(i == this.data.length-1) {
                                        data2[i+1]=value;
                                }
                        }
                       
                        // Auf data verweisen
                        data = data2;
                       
                }
        }
       
        // c)
        public void addValues(int[] values)
        {
                // BEMERKUNG: Hier wurde der Fall nicht beachtet, dass beim
                // Aufruf der Methode data leer ist
               
                // Hilfsarray mit der ben�tigten L�nge erstellen
                int[] data2 = new int[this.data.length+values.length];
               
                // Falls values ein leeres Object ist - tun wir nichts
                if(values == null)
                {
                // Falls values werte enth�lt
                }else
                {      
                        // �u�ere for-Schleife �bertr�gt die werte von data in data2, solange
                        // i kleiner der L�nge von data ist
                        // <= in diesem Fall, da ich einen weiteren Durchlauf ben�tige um dann
                        // die innere for-Schleife zu erreichen
                        for(int i = 0; i <= data.length; i++) {
                                // letzte Stelle von data erreicht bzw. unser i hat den
                                // wert data.length erreicht - dieser Wert liegt au�erhalb
                                // des data Arrays - man beachte, dass die letzte Stelle im Array
                                // immer data.lenght - 1 ist - in unserem Beispiel
                                if(i == data.length) {
                                        // Innere for-Schleife �bertr�gt die Werte aus dem
                                        // values Array in die Restlichen freien Pl�tze des
                                        // data2 Arrays
                                        // Die innere for-Schleife startet bei i, das ist der n�chste
                                        // freie platz im data2 Array
                                        // k wird ben�tigt um im values Array von vorne anzufangen
                                        for(int j = i, k = 0; j < data2.length; j++, k++)
                                        {
                                                data2[j] = values[k];
                                        }
                                }else
                                {
                                        data2[i] = data[i];
                                }
                        }
                }
                // Auf data verweise
                data = data2;
        }
 
        // d)
        public int getMinimumValue()
        {      
                // Hilfsvariable um, den kleinsten Wert zu speichern
                // Einfach den ersten Wert des data Arrays zum Initialisieren verwendet
                // nicht mit 0 initialisieren
                int minValue = data[0];
               
                // for-Schleife zum durchlaufen des data Arrays
                for(int i = 0; i < this.data.length; i++) {
                        // Wenn ein Wert des data Arrays kleiner ist als der
                        // Wert der Hilfvariable minValue, dann wird minValue
                        // dieser neue Wert zugewiesen
                        if(data[i] < minValue)
                        {
                                minValue = data[i];
                        }
                }
                // Da die Methode den Datentyp int hat - muss int
                // auch zur�ckgeliefert werden
                return minValue;
        }
       
        // e)
        public int[] getValuesAboveThreshold(int threshold)
        {
                // Falls threshold 0 ist , dann geben wir ein leeres Object zur�ck
                if(threshold == 0)
                {
                        return null;
                }else
                {      
                        // Hilfsvariable zur Ermittlung der Anzahl der Werte, die
                        // echt gr��er sind als der Schwellenwert threshold
                        int counter = 0;
                        // Hilfsarray mit der selben L�nge wie data, da wir nicht wissen wie gro�
                        // unser Array werden wird, den wir zur�ckgeben m�ssen
                        int[] temp = new int[data.length];
                        // for-Schleife zum Durchlaufen des data Arrays
                        for(int i = 0; i < this.data.length; i++)
                        {      
                                // Bedingung f�r einen gefunden Wert, der ECHT gr��er ist
                                // als threshold
                                if(data[i] > threshold)
                                {      
                                        // die gefundenen Werte ins Hilfsarray speichern
                                        // an der Stelle counter , die nur dann erh�t wird
                                        // wenn neue Werte gefunden werden, und so
                                        // immer eine Stelle weiter geht
                                        temp[counter] = data[i];
                                        counter++;
                                }
                        }
                       
                        // Hilfsarray mit der L�nge counter anlegen, da wir nun wissen
                        // wie viele Werte gefunden wurden
                        int[] newThreshold = new int[counter];
                       
                        // Werte vom temp Array in das newTreshold �bertragen, ich nahm an,
                        // dass der zur�ckgegebene Array die l�nge der gefunden Werte haben
                        // musste. Nicht l�nger mit leeren Stellen oder k�rzer.
                        for(int i = 0; i < newThreshold.length; i++)
                        {
                                newThreshold[i] = temp[i];
                        }
                       
                        // den newTreshold Array zur�ckgeben
                        return newThreshold;
                }
        }
 
        // --------------------------------------------------------------
       
        public void printData()
        {
                System.out.println(Arrays.toString(data));
        }
 
        public static void main(String[] args)
        {
                Measurement m = new Measurement();
                System.out.println("Neues Measurement-Objekt m erzeugt. m:");
                // ErwarteteAusgabe:
                // []
                m.printData();
 
                System.out.println("------------------------------------------------------------------");
               
                m.addValue(85);
                System.out.println("Hinzuf�gen eines neuen Wertes. m:");
                // Erwartete Ausgabe:
                // [85]
                m.printData();
               
                System.out.println("------------------------------------------------------------------");
               
                m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
                System.out.println("Hinzuzf�gen einer Menge von Werten. m:");
                // Erwartete Ausgabe:
                // [85, 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93]
                m.printData();
               
                System.out.println("------------------------------------------------------------------");
               
                int minimumValue = m.getMinimumValue();
                System.out.println("Minimaler Wert der Messreihe m:");
                // Erwartete Ausgabe: 58
                System.out.println(minimumValue);
               
                System.out.println("------------------------------------------------------------------");
               
                int[] valuesAbove78 = m.getValuesAboveThreshold(78);
                System.out.println("Messwerte �ber 78:");
                // Erwartete Ausgabe:
                // [85, 93, 81, 79, 81, 93]
                System.out.println(Arrays.toString(valuesAbove78));
               
                System.out.println("------------------------------------------------------------------");
               
                int[] valuesAbove93 = m.getValuesAboveThreshold(93);
                System.out.println("Messwerte �ber 93:");
                // Erwartete Ausgabe:
                // []
                System.out.println(Arrays.toString(valuesAbove93));
        }
 
}