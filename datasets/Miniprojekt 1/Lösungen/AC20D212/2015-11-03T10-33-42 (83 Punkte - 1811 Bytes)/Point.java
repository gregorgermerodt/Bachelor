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
		
		//double Point = x;
		//double Point = y;
		
		
		
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
		return Math.sqrt((this.x-this.y)+(this.x-this.y));
	}
}