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
		return  this.X; 
				
	}

	public void setX(double newX) {
		this.point.X = X;  
		return X;
	}

	public double getY() {
		return this.Y; 
	}

	public void setY(double newY) {
		this.point.Y = Y; 
		return Y;
	}

	public double getDistance(Point p) {
		
	double rechneE = (wurzel (((X - this.X) * (X - this.X)) * ((Y - this.Y) * (Y - this.y)))); 
	
		
		return rechneE;
				
	}
}
