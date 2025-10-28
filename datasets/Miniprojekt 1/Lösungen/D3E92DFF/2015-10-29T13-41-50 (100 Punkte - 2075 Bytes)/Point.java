
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
		double distance;
		double a; // (x2 - x1)
		double b; // (y2- y1)
		a = p.getX() - x;
		b = p.getY() - y;
		distance = Math.sqrt(a*a + b*b);
		

		return distance;
	}
}
