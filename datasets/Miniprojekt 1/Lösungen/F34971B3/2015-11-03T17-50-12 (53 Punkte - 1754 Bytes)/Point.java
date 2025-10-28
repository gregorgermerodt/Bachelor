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

	public double getX() {
		return x;
		/*return -1.0;*/
	}

	public void setX(double newX) {
		x = newX;
	}

	public double getY() {
		return y;
		/*return -1.0;*/
	}

	public void setY(double newY) {
		y = newY;
		
	}

	public double getDistance(Point p) {
		
		double result = 0;
		result = Math.sqrt(Math.pow(p.x - x, 2))+(Math.pow(p.y - y, 2));
		return result;
		/*return -1.0;*/
   }
	
}
