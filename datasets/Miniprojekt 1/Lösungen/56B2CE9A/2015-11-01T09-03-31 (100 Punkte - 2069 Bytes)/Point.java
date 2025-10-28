/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

	// Koordinaten
	private double x;
	private double y;

	private double x1;
	private double y1;
	private double x2;
	private double y2;
			
	public Point() {
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
		x2 = p.x;
		y2 = p.y;
		x1 = x;
		y1 = y;
				
	return Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));

	}
}
