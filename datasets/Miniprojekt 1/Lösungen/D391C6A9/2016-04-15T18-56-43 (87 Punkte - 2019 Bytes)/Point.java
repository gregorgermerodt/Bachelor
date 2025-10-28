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
		
		x=initX;
		y=initY;

	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		
		x=newX;
		
		
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		
		y=newY;
	}

	public double getDistance(Point p) {
		double q,r;
		q = (((p.x-x)*(p.x-x))+((p.y-y)*(p.y-y)));
		
		if(q<0){
			q=q*-1;
		}
		
		r=Math.sqrt(q);
		
		
		return r;
	}
}
