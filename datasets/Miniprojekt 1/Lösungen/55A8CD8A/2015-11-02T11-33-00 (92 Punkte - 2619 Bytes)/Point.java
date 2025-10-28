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
		this.x = newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y = newY;
	}

	public double getDistance(Point p) {
		
		double a = 0;
		a = Math.sqrt((Math.pow(p.x ,2))+(Math.pow(p.y ,2)));
		//return Math.sqrt((p.getX()-x)* (p.getX()-x) +(p.getY()-y)*(p.getY()-y));
		return a; //Math.sqrt(((p.x)* (p.x)) +((p.y)*(p.y)));
	
	}
}
