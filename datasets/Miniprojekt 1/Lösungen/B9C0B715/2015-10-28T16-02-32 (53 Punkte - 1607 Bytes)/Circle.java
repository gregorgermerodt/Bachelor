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
		
		location = initLocation;
		radius = initRadius;
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
	}
	
	// Durchmesser
	public double getDiameter() {
		return -1.0;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI;
	}

	// Fl�che
	public double getArea() {
		return -1.0;
	}

	public boolean containsPoint(Point point) {
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
