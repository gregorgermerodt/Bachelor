/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point { //Klasse Punkt -> P(X|Y)

	// Koordinaten
	private double x;  //X - Koordinate
	private double y;  // Y- Koordinate

	public Point() { //Standardkonstruktor, muss nicht verändert werden
	}
    /*Implementieren Sie den Konstruktor Point(double initX, double initY) so, 
     * dass dem x- und y-Wert 
     * die als Parameter übergebenen Werte zugewiesen werden */
	public Point(double initX, double initY) {
    this.x = initX; //this. operator dafür dass der richtiger wert initialisiert wird
    this.y = initY; 
	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		this.x = newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		this.y = newY;
	}
    
	public double getDistance(Point p) { //Distanzformel eingesetzt
		return Math.sqrt((Math.pow(getX()-p.getX(), 2))+(Math.pow(getY()-p.getY(), 2)));
	}
}
