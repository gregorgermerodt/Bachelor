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
		double difx = p.x - this.x; 		//Differenz X2 - x1
		double dify = p.y - this.y; 		// Differenz y2 - y1
		double distance = Math.sqrt(Math.pow(difx, 2)+Math.pow(dify, 2)); // Formel Hypotenus über Satz des Phytagoras
			
		return distance;
	}
}
