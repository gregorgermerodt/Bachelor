/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	// private Point location1;
	// private double radius1;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
		this.location = initLocation;
		this.radius = initRadius;

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
		return 2 * radius;
	}

	// Umfang
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) {
		if (point.getDistance(location) < radius) {
			return true;
		} else {
			return false;
		}

	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.setLocation(center);
		circle.setRadius((center.getDistance(p)));

		return circle;
	}

}
