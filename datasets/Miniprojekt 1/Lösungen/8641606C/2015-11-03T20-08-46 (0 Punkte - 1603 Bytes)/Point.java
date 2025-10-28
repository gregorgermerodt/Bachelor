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
		return -1.0;
		return initX;
	}

	public void setX(double newX) {
		newX = x;
	}

	public double getY() {
		return -1.0;
		return initY;
	}

	public void setY(double newY) {
		newY = y;
	}

	public double getDistance(Point p) {
		return -1.0;
		return Math.sqrt(Math.pow((newX-initx),2)+Math.pow((newY-initY), 2));
	}
}
