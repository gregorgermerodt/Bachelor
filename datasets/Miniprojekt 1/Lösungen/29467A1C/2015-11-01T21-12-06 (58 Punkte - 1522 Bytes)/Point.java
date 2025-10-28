/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

	// Koordinaten
	private double x;
	private double y;
	private double u;
	private double v;

	public Point() {
	}

	public Point(double initX, double initY) {
		u=initX;
		v=initY;
	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		x=newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y=newY;
	}

	public double getDistance(Point p) {
		return Math.sqrt((x-u)*(x-u)+(y-v)*(y-v));
	}
}
