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
		x = newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y = newY;
	}

	public double getDistance(double x1, double x2, double y1, double y2) {
		double Distance = Math.sqrt ( (x2-x1)*(x2-x1) + (y2-y1)* (y2-y1));
		return Distance;
	}
}
