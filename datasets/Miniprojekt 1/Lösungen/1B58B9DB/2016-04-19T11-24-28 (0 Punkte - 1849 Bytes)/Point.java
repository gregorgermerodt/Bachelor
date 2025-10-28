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
		
		// zu bearbeiten 
		System.out.println ( "Punkt: (" + initX + " /" + initY +  ")" );
	}

	public double getX() 
	{
		return x; 
				
	}

	public void setX(double newX) {
		 x = newX;
		
	}

	public double getY() {
		return y; 
	}

	public void setY(double newY) {
		y = newY;
	}

	public double getDistance(Point p) { // diese Aufgabe ist nicht richtig 
		
	double rechneE =  (((x- this.x) * (x - this.x)) * ((y - this.y) * (y - this.y)));

		 
	
		
		return rechneE;
				
	}
}
