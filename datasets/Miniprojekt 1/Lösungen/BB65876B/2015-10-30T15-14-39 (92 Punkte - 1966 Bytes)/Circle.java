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
		initLocation = location;
		initRadius = radius;

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
		return radius * 2;
	}

	// Umfang
	public double getCircumference() {
		return 2 * radius * Math.PI;
	}

	// Fläche
	public double getArea() {
		double ergebnis = Math.pow(radius, 2) * Math.PI;
		return ergebnis;
	}

	public boolean containsPoint(Point point) {
		if (location.getDistance(point) <= radius) {
			return true;
		} else {

			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));

		return circle;
	}

}
