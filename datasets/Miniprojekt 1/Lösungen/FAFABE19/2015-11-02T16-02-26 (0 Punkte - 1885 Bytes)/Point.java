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
		return x;
	}

	public void setX(double newX) {
		this.x=newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y=newY;
	    
	}

	public double getDistance(Point point) {
		return Math.sqrt(Math.pow(point.getX()-x,2)+Math.pow(point.getY()-y,2)) ;
	}
}
