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
		// Paramterübergabe
		double x1 = p.getX();
		double y1 = p.getY();
		//
		double x2 = this.getX();
		double y2 = this.getY();
		
		return Math.sqrt( Math.pow( (x2 - x1), 2) + Math.pow( (y2 - y1), 2));
	}
}
