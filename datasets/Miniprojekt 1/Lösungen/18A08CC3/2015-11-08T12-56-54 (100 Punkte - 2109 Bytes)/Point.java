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
		double e, d, x2, x1, y2, y1;
		//P2=p ; P1=aktueller Punkt
		
		x2=p.getX();
		x1=this.getX();
		y2=p.getY();
		y1=this.getY();		
		
		e=Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
		d=Math.sqrt(e);
				
		return d;
	}
}
