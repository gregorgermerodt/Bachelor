
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
	}

	public double getY() {
		return -1.0;
	}

	public void setY(double newY) {
		this.y = newY;
	}

	public double getDistance(Point p) {
		double disx;
		double disy;
		disx = (p.x - this.x) * (p.x - this.x) ;
		disy = (p.y - this.y) * (p.y - this.y) ;
		return Math.sqrt(disx + disy);
	}
}


