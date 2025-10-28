/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

	// Koordinaten
	private double x;
	private double y;

	
	//Hier f‰ngt der Konstruktor an! Der muss genauso heiﬂen wie die Klasse.
	public Point() {
	}

	public Point(double initX, double initY) {
     this.x= initX;
     this.y=initY;
	}

	public double getX() {
		return this.x;
	}

	public void setX(double newX) {
		this.x= newX;
	}

	public double getY() {
		return this.x;
	}

	public void setY(double newY) {
		this.y= newY;
	}

	public double getDistance(Point p) {
		return Math.sqrt((Math.pow(p.getX() -this.x, 2.0)+ (Math.pow(p.getY()-this.y, 2.0))));
	}
}
