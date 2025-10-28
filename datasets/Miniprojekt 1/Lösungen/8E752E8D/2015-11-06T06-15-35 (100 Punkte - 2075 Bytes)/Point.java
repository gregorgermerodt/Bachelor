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
		double res = 0;
	    double x1 = this.x;
		double x2 = p.getX();
		double y1 = this.y;
		double y2 = p.getY();
		res = Math.sqrt(Math.pow(x2-x1, 2.0)+Math.pow(y2-y1, 2.0));
		return res;
		
	}
	}
