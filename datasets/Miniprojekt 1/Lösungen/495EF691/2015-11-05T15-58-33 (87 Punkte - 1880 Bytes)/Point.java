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
	this.y = initY;
	
		
	}

	public double getX() {
		return this.x;
	}

	public void setX(double newX) {
		this.x = newX;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		this.y = newY;
	}

	public double getDistance(Point p) {
		double result = 0.0;
        result = Math.sqrt(Math.pow(Math.abs(p.getX() - this.x), 2) + Math.pow(Math.abs(p.getY() - this.y), 2));

        return result;
	}
}
