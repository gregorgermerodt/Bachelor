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

	public Point(double initX, double initY) { //Konstruktor
		
			
		this.x = initX;
		this.y = initY;
		
	

	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		this.x = newX;
		
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		this.y = newY;
	}

	public double getDistance(Point p) { //p.getX() ist x2 p ist der Name des Opjekts
		return Math.sqrt((Math.pow(p.getX()-x,2)+Math.pow(p.getY()-y,2)));
		
		
	}
}