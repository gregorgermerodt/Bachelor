

/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

	// Koordinaten
	private double x;
	private double y;

	public Point() { 
		x = 0.0;
		y = 0.0;
	}

	public Point(double initX, double initY) {
		x = initX;
		y = initY;

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
		double x2 = p.getX();
		double y2 = p.getY();
	double ergebnis = Math.sqrt((x-x2)*(x-x2)+ (y-y2)*(y-y2));
	return ergebnis;
	}
}
