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
	
	//1.
	public Point(double initX, double initY) {
		
		x = initX;
		y = initY;

	}
	
	//2.
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

	//3.****
	public double getDistance(Point p) {
		
		double d;
		
		d = Math.sqrt(((Math.pow(p.getX(), 2) - (Math.pow(p.getX(), 2))) + (Math.pow(p.getY(), 2) - (Math.pow(p.getY(), 2)))));
		
		return d;
	}
}
