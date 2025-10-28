/**
 * Definiert einen Kreis �ber einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
		this.setLocation(initLocation);
		this.setRadius(initRadius);

	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double newRadius) {
		this.radius=newRadius;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point newLocation) {
		this.location=newLocation;
		
	}
	
	// Durchmesser
	public double getDiameter() {
		return this.radius*2.0;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*this.getDiameter();
	}

	// Fl�che
	public double getArea() {
		return Math.PI*Math.pow(this.getRadius(), 2.0);
	}

	public boolean containsPoint(Point point) {
		
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
	
		return null;
	}

}
