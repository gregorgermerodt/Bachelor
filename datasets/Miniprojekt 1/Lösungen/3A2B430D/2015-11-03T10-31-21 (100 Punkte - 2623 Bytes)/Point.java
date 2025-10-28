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

	 this.x= initX;
	 this.y = initY;
	 
		
		
	}

	public double getX() {
		
		return this.x;
	}

	public void setX(double newX) {
				x=newX;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {

         y= newY;
	}

	public double getDistance(Point p) {
		
		double a ;
		double b;
		a= Math.pow((p.getX()-this.x), 2);
		
		b= Math.pow((p.getY()-this.y),2);
		double result = Math.sqrt(a+b);
		
		return result;
	}
}
