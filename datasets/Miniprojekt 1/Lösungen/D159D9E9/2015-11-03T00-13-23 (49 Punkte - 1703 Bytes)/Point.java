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
		x= initX;
		y= initY;

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
		Point p1= new Point();
		Point p2= new Point();
		return Math.sqrt((Math.pow( (p1.getX() - p2.getX()) ,2 )) + (Math.pow( (p1.getY() - p2.getY()) ,2 )));

		
	}
}
