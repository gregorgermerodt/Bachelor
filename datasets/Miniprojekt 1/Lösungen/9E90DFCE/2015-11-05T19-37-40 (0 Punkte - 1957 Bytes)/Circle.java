/**
 * Definiert einen Kreis &#xfffd;ber einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
		this.radius = initRadius;
		this.location = initLocation;

	}

	public double getRadius() {

		return radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public Point getLocation() {

		return location
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {

		return radius * 2 ;
	}

	// Umfang
	public double getCircumference() {

		return Math.PI * getDiameter();
	}

	// Fl�che
	public double getArea() {

		return Math.PI * Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) {

		if (point.getDistance(point) <= radius) {
			return true;
		}
				else return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));
		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
