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

	public Point(double initX, double initY){ 
	x=initX;
	y=initY;
	 
	 //DAS AUCH BEARBEITEN  AMK

	}

	public double getX() {
		return x; 
	}

	public void setX(double newX) {
		this.x=newX; 
	}

	public double getY() {
		return y; 
	}

	public void setY(double newY) {
	y=newY;
	}

	public double getDistance(Point p) {
	return Math.sqrt(Math.pow(p.getX()-x, 2) +Math.pow(getY()-y, 2 ));
	
	//BEARBEITEN AMK
		
		
	
	}
}
