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

	public Point(double initX, double initY) {
		x = initX;
		y = initY;

	}

	public double getX() {//soll Point.x zurueckgeben
		return x;
	}

	public void setX(double newX) {//setzt x
		x = newX;
	}

	public double getY() {//soll Point.y zurueckgeben
		return y;
	}

	public void setY(double newY) {//setzt y
		y = newY;
	}

	public double getDistance(Point p) {//Abstand zum Punkt p
		double d = (p.getX()-x)*(p.getX()-x) + (p.getY()-y)*(p.getY()-y);
		double b = Math.sqrt(d);
		
		return b;
		
		
	}
}
