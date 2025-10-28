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

	x=initX;
	y=initY;

	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {

	Point.x=newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {

	Point.y=newY;

	}

	public double getDistance(Point p) {

	p=Math.sqrt(double ((x2-x1)(x2-x1)+(y2-y1)(y2-y1)));
		return p;
	}
}
