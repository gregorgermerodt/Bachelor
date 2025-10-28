/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class point {

	// Koordinaten
	private double x;
	private double y;

	public point() {
	}

	public point(double initX, double initY) {
		x = initX;
		y = initY;
	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		x= newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y= newY;
	}

	public double getDistance(point p) {
		return -1.0;
	}
}
