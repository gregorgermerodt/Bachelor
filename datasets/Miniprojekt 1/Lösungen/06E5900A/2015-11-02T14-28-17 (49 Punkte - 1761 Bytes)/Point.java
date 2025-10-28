/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

	// Koordinaten
	private double x;
	private double y;

	public Point() {
	}

	public Point(double initX, double initY) { //Konstruktor für die Klasse Punkt mit X und Y
		x = initX;
		y = initY;
	}

	public double getX() {  //Getter X Ko.
		return x;
	}

	public void setX(double newX) { //Setter X Ko.
		this.x = newX;
	}

	public double getY() {   // Getter Y - Ko.
		return y;
	}

	public void setY(double newY) { //Setter Y-Ko.
		this.y = newY;
	}

	public double getDistance(Point p) {
		double distanz;
		distanz = Math.sqrt(Math.pow(p.getX()-getX(), 2))+(Math.pow(p.getY()-getY(), 2));
		return distanz;
	}
}
