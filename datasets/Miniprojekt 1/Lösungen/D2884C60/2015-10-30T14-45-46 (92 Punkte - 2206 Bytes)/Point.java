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
		this.y=initY;
	}

	public double getX() {
		return this.x;
	}

	public void setX(double newX) {
		this.x=newX; 
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		this.y=newY;
	}

	public double getDistance(Point p) {
	 double erg=0; 
	 double erg1=0;
	 double erg2=0;
	 erg1=Math.pow(this.x-p.getX(), 2.0);
	 erg2=Math.pow(this.y-p.getY(),2.0);
	 erg=Math.sqrt(erg1+erg2);
	 
	 return erg;
	 
	}
}
