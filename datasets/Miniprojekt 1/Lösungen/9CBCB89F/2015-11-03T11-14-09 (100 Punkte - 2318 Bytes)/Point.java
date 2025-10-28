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
		return this.x;
	}

	public void setX(double newX) {
	 this.x = newX;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		this.y = newY;
		
	}

	public double getDistance(Point p) {
		double varX,varY,solve;
		varX = Math.pow(p.getX()-x, 2.0);
		varY = Math.pow(p.getY()-y, 2.0);
		solve = Math.sqrt(varX+varY);
		return solve;
	}
}
