/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

	// Koordinaten
	public double x;
	public double y;
	
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
		double d;
		d = Math.cbrt((this.x-p.getX()*this.x-p.getX())+(this.y-p.getY()*this.y-p.getY()));
		return d;
	}
}
