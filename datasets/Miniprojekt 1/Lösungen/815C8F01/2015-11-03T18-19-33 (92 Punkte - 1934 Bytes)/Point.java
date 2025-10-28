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
		return this.x;
	}

	public void setX(double newX) {
		newX = this.x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		newY = this.y;
	}

	public double getDistance(Point p) {
	double d = 0;
	Point p2 = this;
		d = Math.sqrt((p.x-p2.x)*(p.x-p2.x)+(p.y-p2.y)*(p.y-p2.y));
	return d;
	}
}
	
