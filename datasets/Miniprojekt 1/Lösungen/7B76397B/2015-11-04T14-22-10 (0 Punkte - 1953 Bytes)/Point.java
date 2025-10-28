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
		x = double initX
		y = double initY
	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		x = double newX
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		x = double newY
	}

	public double getDistance(Point p) {
		return Math.sqrt((math.pow(p.x-x), 2)+(Math.pow(p.y-y), 2));
	}
}
