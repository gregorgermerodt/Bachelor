/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

	// Koordinaten
	private double x=0;
	private double y=0;

	public Point() {
	}

	public Point(double initX, double initY) {

		x=initX;
		y=initY;
	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		x=newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y=newY;
	}

	public double getDistance(Point p) {
		double easy=0;
		easy=Math.sqrt(Math.pow(p.x-this.x, 2.0)+Math.pow(p.y, this.y));
		
		return easy;
	}
}
