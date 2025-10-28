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
		this.y = initY;
		this.x = initX;

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
		this.y=newY;
	}

	public double getDistance(Point p) {
		double d = 0;
		double i = 0;
		double k = 0;
		d = (x - p.x) * (x - p.x);
		i = (y - p.y) * (y - p.y);
		k = Math.sqrt(d+i);
		return k;
	}
}
