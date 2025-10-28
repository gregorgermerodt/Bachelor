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
		return this.x;
	}

	public void setX(double newX) {
		newX = this.x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		newY = this.y;
	}

	public double getDistance(Point p) {
		return Math.sqrt (Math.pow(2, this.x - this.getX()) + (Math.pow(2, this.y - this.getY())));
	}
}
