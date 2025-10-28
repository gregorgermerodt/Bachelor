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
		
		initX = getX(); 
		initY = getY();

	}

	public double getX() {
			
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

	public double getDistance(Point p) {
		
		Point p1 = new Point(getX() , getY());
		Point p2 = new Point(getX() , getY()); 
		
		double Ausgabe; 
			double term1 = (p2.getX() - p1.getX()) * (p2.getX() - p1.getX());	
			double term2 = (p2.getY() - p1.getY()) * (p2.getY() - p1.getY());
				Ausgabe = Math.sqrt(term1 + term2);
		return Ausgabe;
	}
}







