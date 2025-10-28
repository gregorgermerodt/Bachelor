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
		
		double distance = 0;
		distance = Math.sqrt((Math.pow(this.x - p.x,2))+(Math.pow(this.y - p.y ,2)));
		//return Math.sqrt((p.getX()-x)* (p.getX()-x) +(p.getY()-y)*(p.getY()-y));
		return distance; //Math.sqrt(((p.x)* (p.x)) +((p.y)*(p.y)));
	
	}
}
