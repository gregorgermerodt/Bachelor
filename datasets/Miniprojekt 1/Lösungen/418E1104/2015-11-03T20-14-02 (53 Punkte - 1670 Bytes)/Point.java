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
		this.x=initX;
		this.y= initY;
		
	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {
	newX=x;}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
	newY=y;}

	public double getDistance(Point p) {
		return Math.sqrt( (getX()-p.getX())   
						*(getX()-p.getX() )
				+
				       (getY()-p.getY())*(getY()-p.getY()));
	}
}
