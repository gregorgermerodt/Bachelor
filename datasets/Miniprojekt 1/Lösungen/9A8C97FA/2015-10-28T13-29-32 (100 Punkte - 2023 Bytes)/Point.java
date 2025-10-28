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
		double erg1 = 0;
		double erg2 = 0;
		double komplett = 0;
		erg1 = Math.pow((p.getX()-x), 2);
		erg2 = Math.pow((p.getY()-y), 2);
		komplett = Math.sqrt(erg1+erg2);
		return komplett;
	}
}
