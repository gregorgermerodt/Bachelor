/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;
	private double area;
	private double diameter;
	private double circumference;

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
		radius = newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		diameter = radius * 2;
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		circumference = 2 * Math.PI * radius;
		return circumference;
	}

	// Fläche
	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
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
