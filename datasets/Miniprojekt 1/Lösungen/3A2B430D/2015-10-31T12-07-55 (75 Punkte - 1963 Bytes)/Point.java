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

	public Point() {
		
	}

	public Point(double initX, double initY) {

	 x= initX;
	 y = initY;
	 
		
		
	}

	public double getX() {
		
		return x;
	}

	public void setX(double newX) {
				x1=newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {

		y1= newY;
	}

	public double getDistance(Point p) {
		double a ;
		double b;
		double d;
		
	
		a=Math.pow((x1-x), 2);
		b = Math.pow((y1-y),2);
		d = Math.sqrt((a+b));
		return d;
	}
}
