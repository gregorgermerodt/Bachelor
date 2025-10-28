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
		setX(initX);
		setY(initY);
	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		x = newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y = newY;
	}

	public double getDistance(Point p) {
		double distance;
		double xDistance = Math.pow(p.getX() - this.getX(), 2);
		double yDistance = Math.pow(p.getY() - this.getY(), 2);
		distance = Math.sqrt(xDistance + yDistance);		
		return distance;
	}
}
