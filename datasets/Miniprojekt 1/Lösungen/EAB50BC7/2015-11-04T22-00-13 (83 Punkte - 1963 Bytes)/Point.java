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
		return x;
	}

	public void setX(double newX) {
		this.x = newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		this.y = newY;
	}

	public double getDistance(Point p) {

		double d = 0;
		double p1 = 0;
		double p2 = 0;
		
		p1 = Math.pow(x - p.getX(), 2);
		p2 = Math.pow(y - p.getY(), 2);
		
		d = Math.sqrt(p1 - p2);
		return d;
	}
}
