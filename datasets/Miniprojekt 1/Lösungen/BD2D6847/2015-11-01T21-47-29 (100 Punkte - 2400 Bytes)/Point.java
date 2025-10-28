/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 *  * @author: Zohaib Sajid
 * Matrikelnr: 3033021
 */
public class Point {

	// Koordinaten
	private double x;
	private double y;

	public Point() {
	}

	public Point(double initX, double initY) {

		x= initX;
		y=initY;
	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {

		x= newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {

		y = newY;
		
	}

	public double getDistance(Point p) {
		double distance;
		double a = this.x - p.x;
		double b =	this.y - p.y;

		//Mit Math.pow wird die Zahl quadriert und mit Math.sqrt wird die Wurzel berechnet
		distance = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));

		
		return distance;
	}
}
