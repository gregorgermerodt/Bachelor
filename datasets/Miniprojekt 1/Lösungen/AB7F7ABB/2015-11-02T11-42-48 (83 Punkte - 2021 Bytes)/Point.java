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
		//keine Ahnung
		x = initX;
		y = initY;

	}

	public double getX() {
		//????
		return x;
	}

	public void setX(double newX) {				//bei void ohne Rückgabe
		//???
		x = newX;
		
		
	}

	public double getY() {
		//?????
		return y;
	}

	public void setY(double newY) {
		//??
		y = newY;
	}

	public double getDistance(Point p) {
		//:
		
		return Math.sqrt(Math.pow(x-p.getX(),2.0) + (Math.pow(y-p.getY(),2.0)));
	}
}
