/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

	// Koordinaten
	private double x;
	private double y;

	public Point() {  //hier konstruktor der muss nicht ver�ndert werden 
	}

	public Point(double initX, double initY) {
		this.x = initX;  //erst oben dann die in der klammer!
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
		return Math.sqrt(Math.pow(p.x-x, 2) +(Math.pow(p.y-y, 2)));
	}
}
