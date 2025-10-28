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
		this.setX(initX);
		this.setY(initY);
	}

	public double getX() {
		return this.x;
	}

	public void setX(double newX) {
		this.x=newX;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		this.y=newY;
	}

	public double getDistance(Point p) {
		return Math.sqrt(Math.pow(this.getX(), 2.0)+Math.pow(this.getY(), 2.0));
	}
}
