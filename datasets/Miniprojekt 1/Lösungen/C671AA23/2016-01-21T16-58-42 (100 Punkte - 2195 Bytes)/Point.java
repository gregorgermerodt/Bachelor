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
		return x;
	}

	public void setX(double newX) {
		this.x = newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		this.y = newY;
	}

	public double getDistance(Point p) {
		double d;
		double dx,dy;
		dx = (p.getX()-x) * (p.getX()-x) ;
		dy = (p.getY()-y) * (p.getY()-y);
		d = Math.sqrt(dx+dy);
		return d;
	}
}

