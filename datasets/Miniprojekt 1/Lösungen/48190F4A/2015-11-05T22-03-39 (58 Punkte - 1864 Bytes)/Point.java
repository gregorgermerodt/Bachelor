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
		initX = x;
		initY = y;

	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		newX = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y = newY;
	}

	public double getDistance(Point p) {
		return Math.sqrt(Math.pow(getX() - getX(), 2) + (Math.pow(getY() - getY(), 2)));
	
	}
}
