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
	// ab hier bearbeiten
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
		newY = y;
	}

	public double getDistance(Point p) {
	return -1.0;
	}
}
