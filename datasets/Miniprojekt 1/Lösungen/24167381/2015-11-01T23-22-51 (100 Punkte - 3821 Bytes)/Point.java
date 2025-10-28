public class Point {
 
        // Koordinaten
        private double x;
        private double y;
       
        // Standartkonstruktor, muss nicht ver�ndert werden.
        public Point() {
        }
       
        // Parametisierte Konstruktor, erwartet auf jeden Fall 2 double Werte.
        public Point(double initX, double initY) {
                // Man h�tte das this HIER auch weglassen k�nnen.
                // Wieso? Weil die Variablen unterschiedliche Bezeichnungen haben und es klar ist,
                // welche Variablen gemeint sind.      
                // Bei Variablen mit gleicher Bezeichnung, muss man this verwenden.
                this.x = initX;
                this.y = initY;
        }
       
        // Getter / Setter
        public double getX() {
                // Einfach den x-Wert zur�ckgeben.
                return x;
        }
 
        // Getter / Setter
        public void setX(double newX) {
                // Man h�tte das this HIER auch weglassen k�nnen.
                // Dem x-Wert neuen Wert zuweisen.
                this.x = newX;
        }
       
        // Getter / Setter
        public double getY() {
                // Einfach den y-Wert zur�ckgeben.
                return y;
        }
 
        // Getter / Setter
        public void setY(double newY) {
                // Man h�tte das this HIER auch weglassen k�nnen.
                // Dem y-Wert neuen Wert zuweisen.
                this.y = newY;
        }
 
        public double getDistance(Point p) {
                // Der aktuelle Punkt ist der des Objekts, in dem diese Methode aufgerufen wird.
                // Der zweite Punkt is p, dieser wird ja beim Aufruf der Methode �bergeben. Siehe main-Methode.
                // Somit haben x1, x2, y1, y2 und k�nnen den Abstand mit Hilfe der Formel berechnen.
 
                return Math.sqrt(Math.pow((p.getX() - x), 2)+(Math.pow((p.getY() - y), 2)));
        }
}
