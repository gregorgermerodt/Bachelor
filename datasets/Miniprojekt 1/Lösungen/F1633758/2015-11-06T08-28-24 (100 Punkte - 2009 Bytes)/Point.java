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
		return x;  //nicht initX, da keine Variable
	}

	public void setX(double newX) {
		x= newX;
	}

	public double getY() {
		return y; //nicht initY, da keine Variable
	}

	public void setY(double newY) {
		y=newY;
	}

	public double getDistance(Point p) {
		double x1 = x;
		double y1=y;
		
		double x2=p.getX();
		double y2 = p.getY();
		
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		
	}
}
