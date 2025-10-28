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
		this.x=initX;
		this.y=initY;
		
	}

	public double getX() {
		return this.x;
	}

	public void setX(double newX) {
		this.x=newX;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		this.y=newY;
	}

	public double getDistance(Point p) {
		double xi = this.x-p.x;
		double yi = this.y-p.y;
		return Math.sqrt(Math.pow(xi,2)+Math.pow(yi, 2));
	}
}
