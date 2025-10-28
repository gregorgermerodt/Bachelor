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
		return this.x;
	}

	public void setX(double newX) {
		this.x = newX;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		this.x = newY;
	}

	public double getDistance(Point p) {
		double x1 = this.x;
		double x2 = p.x;
		double y1 = this.y;
		double y2 = p.y;
		double dq = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		double d = Math.sqrt(dq);
		return d;
	}
}
