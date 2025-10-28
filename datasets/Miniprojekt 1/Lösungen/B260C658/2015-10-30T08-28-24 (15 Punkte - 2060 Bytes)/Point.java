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
		initX = 0;
		initY = 0;
	}

	public double getX() {
		return this.getX();
		
	}

	public void setX(double newX) {
		this.setX(newX);
	}

	public double getY() {
		return this.getY();
		
	}

	public void setY(double newY) {
		this.setY(newY);
	}

	public double getDistance(Point p) {
		double d = 0;
		
		d = Math.sqrt((p.getX() - x)*(p.getX() - x) + (p.getY() - y)*(p.getY() - y));
		return d;
	}
}
