/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

	// Koordinaten
	private static double x;
	private static double y;

	public Point() {
	}

	public Point(double initX, double initY) {
		x=initX;
		y=initY;
	}

	public double getX() {
		return Point.x;
	}

	public void setX(double newX) {
		Point.x= newX;
	}

	public double getY() {
		return Point.y;
	}

	public void setY(double newY) {
		Point.y= newY;
	}

	public double getDistance(Point p) {
		double d;
		double a;
		a= (Point.x-Point.x)*(Point.x-Point.x)+(Point.y-Point.y)*(Point.y-Point.y);
		d= Math.sqrt(a);
		return d;
	}
}
