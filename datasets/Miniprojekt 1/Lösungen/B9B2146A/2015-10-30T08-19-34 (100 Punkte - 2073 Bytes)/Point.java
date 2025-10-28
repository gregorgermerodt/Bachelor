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
		this.x = initX;
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

	public double getDistance(Point p) {
		double a = p.x - getX();
		double b = p.y - getY();
		double d = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		return d;
	}
}
