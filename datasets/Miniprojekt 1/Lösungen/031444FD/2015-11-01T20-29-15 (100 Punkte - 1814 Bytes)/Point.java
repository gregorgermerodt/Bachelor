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

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		x = newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y = newY;
	}

	public double getDistance(Point p) {
		final double dx = p.x - x;
		final double dy = p.y - y;

		return Math.sqrt(dx * dx + dy * dy);
	}
}
