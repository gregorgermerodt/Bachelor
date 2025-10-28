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
	
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		
	}

	public double getDistance(Point p) {
		
		return Math.sqrt(p.x * p.x + p.y * p.y);
	}
}
