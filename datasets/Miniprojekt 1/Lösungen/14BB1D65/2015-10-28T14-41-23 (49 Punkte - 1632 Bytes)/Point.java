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
		return this.x;
	}

	public void setX(double newX) {
		x=newX;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		y=newY;
	}

	public double getDistance(Point p) {
		double distanz=0;
		
		distanz=Math.sqrt(Math.pow(this.x-this.y, 2)+Math.pow(p.x-p.y, 2));
		return distanz;
	}
}
