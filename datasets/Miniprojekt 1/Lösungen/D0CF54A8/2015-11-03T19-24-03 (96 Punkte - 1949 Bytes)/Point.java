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
		this.x = initX;
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
		double 
			dx = p.getX() - x,
			dy = p.getY() - y;		
		
		return Math.sqrt(dx*dx + dy*dy);
		
	}
}
