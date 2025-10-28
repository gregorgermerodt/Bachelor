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
		return this.x;
	}

	public void setX(double newX) {
		this.x = newX;
	x = newX;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		this.y = newY;
		y = newY;
	}

	public double getDistance(Point p) {
	double abstand = Math.sqrt ((p.getX()-x) * (p.getX()-x) + (p.getY()-y)* (p.getY()-y));
		return abstand;
	}

	}

