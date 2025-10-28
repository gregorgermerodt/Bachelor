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
		
		//TODO
		
		return this.x;
	}

	public void setX(double newX) {
	
	//TODO
		
		this.x=newX;
		
	}

	public double getY() {
		//TODO
		
		return this.y;
	}

	public void setY(double newY) {
	
	this.y=newY;
		
	}

	public double getDistance(Point p) {
		
		double abstand=0.0;
		
		
		abstand=Math.sqrt(  Math.pow((p.x-this.x), 2)+Math.pow((p.y-this.y), 2));
		
		return abstand;
	}
}
