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

	public Point(double x, double y) {
		this.x=x;
		this.y=y;
		
		

	}

	public double getX() {
		
		
		return x;
	}

	public void setX(double x) {
		this.x=x;
		
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y=y;
	}

	public double getDistance(Point p) {
		
		double distance;
		//Math.sqrt()=distance;
		distance= Math.sqrt((this.getX()-p.getX())*(this.getX()-p.getX())+(this.getY()-p.getY())*(this.getY()-p.getY()));
		//Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)))
		//distance= Math.sqrt((2-0)*(2-0)+(1-0)*(1-0));
		return distance;
	}
}
