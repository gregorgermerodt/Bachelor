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
		x=newX	
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		y=newY
	}

	public double getDistance(Point p) {
		return Math.sqrt(((point.x-this.x)*(point.x-this.x))+((point.y-this.y)*(point.y-this.y)))
;
	}
}
