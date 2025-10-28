public class Point {
 
        // Koordinaten
        private double x;
        private double y;
       
        // Standartkonstruktor, muss nicht verändert werden.
        public Point() {
        }
       
        // Parametisierte Konstruktor, erwartet auf jeden Fall 2 double Werte.
        public Point(double initX, double initY) {
                // Man hätte das this HIER auch weglassen können.
                // Wieso? Weil die Variablen unterschiedliche Bezeichnungen haben und es klar ist,
                // welche Variablen gemeint sind.      
                // Bei Variablen mit gleicher Bezeichnung, muss man this verwenden.
                this.x = initX;
                this.y = initY;
        }
       
        // Getter / Setter
        public double getX() {
                // Einfach den x-Wert zurückgeben.
                return x;
        }
 
        // Getter / Setter
        public void setX(double newX) {
                // Man hätte das this HIER auch weglassen können.
                // Dem x-Wert neuen Wert zuweisen.
                this.x = newX;
        }
       
        // Getter / Setter
        public double getY() {
                // Einfach den y-Wert zurückgeben.
                return y;
        }
 
        // Getter / Setter
        public void setY(double newY) {
                // Man hätte das this HIER auch weglassen können.
                // Dem y-Wert neuen Wert zuweisen.
                this.y = newY;
        }
 
        // Methode, um die Distanz zwischen zwei Punkten auszurechen.
        // Wir benutzen die eigene Java-Klasse Math, um mathematische Funktionen zu nutzen.
        // Math.sqrt(dauble a) für das Ziehen der Wurzel
        // Math.pow(double a, double b) für das Potenzieren
        public double getDistance(Point p) {
                // Der aktuelle Punkt ist der des Objekts, in dem diese Methode aufgerufen wird.
                // Der zweite Punkt is p, dieser wird ja beim Aufruf der Methode übergeben. Siehe main-Methode.
                // Somit haben x1, x2, y1, y2 und können den Abstand mit Hilfe der Formel berechnen.
 
                return Math.sqrt(Math.pow((p.getX() - x), 2)+(Math.pow((p.getY() - y), 2)));
        }
}