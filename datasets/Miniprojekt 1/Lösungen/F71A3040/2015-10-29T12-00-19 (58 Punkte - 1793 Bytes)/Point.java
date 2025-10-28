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
		return this.x;
	}

	public void setX(double newX) {
		newX=x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		newY=y;
	}

	public double getDistance(Point p) {
		return Math.sqrt(Math.pow(this.getX()-this.x, 2)+Math.pow(this.getY()-this.y, 2));
	}
}
