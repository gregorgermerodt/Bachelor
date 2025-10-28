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
		double distances=(this.x-p.getX())*(this.x-p.getX())+(this.y-p.getY())*(this.y-p.getY()); 
		return Math.sqrt(distances); 
	}
	
}

