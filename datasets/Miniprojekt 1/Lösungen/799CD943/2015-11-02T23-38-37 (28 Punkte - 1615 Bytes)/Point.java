/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

	// Koordinaten
	private double x;
	private double initX;
	private double y;
	private double initY;

	public Point() {
	}

	public Point(double initX, double initY) {

	}

	public double getX() {
		return initX;
	}

	public void setX(double newX) {
		newX = initX;
	}

	public double getY() {
		return initY;
	}

	public void setY(double newY) {
		newY = initY;
	}

	public double getDistance(Point p) {
		return Math.sqrt((initX-x)*(initX-x))+(initY-y)*(initY-y);
	}
}
