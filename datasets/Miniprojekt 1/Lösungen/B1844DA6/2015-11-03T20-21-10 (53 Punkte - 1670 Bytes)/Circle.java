/**
 * Definiert einen Kreis ¸ber einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) { initLocation=location; initRadius=radius;

	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double newRadius) { 
		newRadius=radius;
	}

	public Point getLocation() {
		return new Point();
	}

	public void setLocation(Point newLocation) {
	newLocation=location;}
	
	// Durchmesser
	public double getDiameter() {
		return 2*this.radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*radius*radius;
	}

	// Fl‰che
	public double getArea() {
		return Math.PI*radius/2;
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
