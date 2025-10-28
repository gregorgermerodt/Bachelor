/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {
	// Koordinaten
	private double x;
	private double y;

	public Point() { //leerer Konstruktor
	}

	public Point(double initX, double initY) { //Konstruktor initialisieren
		x=initX;
		y=initY;
	}
	//getter und setter setzen
	public double getX() {
		return x;
	}

	public void setX(double newX) {
		x=newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y=newY;
	}

	public double getDistance(Point p) {
		return Math.sqrt((Math.pow(getX()-p.getX(), 2)+Math.pow(getY()-p.getY(), 2)));
	}
}
