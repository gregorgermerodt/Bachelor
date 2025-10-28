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
		x =initX;
		y =initY;

	}

	public double getX() {
		
		return x;
	}

	public void setX(double newX) {
		x =newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		x=newY;
	}

	public double getDistance(Point p) {
		double a = x;
		double a1 = p.getX();
		double s = y;
		double s1 = p.getY();
		return Math.sqrt(Math.pow((a1-a), 2)+Math.pow((s1-s), 2));
	}
}

