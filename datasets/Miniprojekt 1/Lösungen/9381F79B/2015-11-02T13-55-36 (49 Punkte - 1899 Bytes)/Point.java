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
		initX=getX();
		initY=getY();

	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		x=getX();
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y=getY();
	}

	public double getDistance(Point p) {
		return (Math.sqrt(Math.pow(2, getX()-p.getX())+(Math.pow(2, getY()-p.getY()))));
	}
}
