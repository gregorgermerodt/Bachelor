/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
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
		this.radius = newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		return getDiameter()*Math.PI;
	}

	// Fläche
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public boolean containsPoint(Point point) {
		return point.getDistance(location) <= getRadius();
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		// An dieser Stelle das circle-Objekt bearbeiten
		circle.location = center;
		circle.radius = center.getDistance(p);
		return circle;
	}

}
