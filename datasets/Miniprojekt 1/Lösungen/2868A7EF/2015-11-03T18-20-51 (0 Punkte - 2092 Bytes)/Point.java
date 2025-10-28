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

	// X-Varriable
	public double getX() {
		return x;
	}
	
	public void setX(double newX) {
		x = newX;
	}

	// Y-Varriable
	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y = newY;
	}

	// Abstand
	public double getDistance(Point p) {
		double distance = (( p.getX() - getX() ) * ( p.getX() - getX() )) + (( p.getY() - getY() ) * ( p.getY() - getY() )) ;
		return Math.sqrt(distance);
	}
}
