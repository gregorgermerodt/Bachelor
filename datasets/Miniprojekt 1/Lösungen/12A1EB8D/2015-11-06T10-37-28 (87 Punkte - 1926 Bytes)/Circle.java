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

	public Circle(Point initLocation, double initRadius) {
		this.location = initLocation;
		this.radius = initRadius;
	}

	public double getRadius() {
		double r = this.radius;
		return r;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public Point getLocation() {
		Point l = this.location;
		return l;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}

	// Durchmesser
	public double getDiameter() {
		double d = Math.pow(radius, 2);
		return d;
	}

	// Umfang
	public double getCircumference() {

		return 2 * Math.PI * radius;
	}

	// Fl‰che
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) {
		if (point.getX() <= radius && point.getY() <= radius) {
			return true;
		} else {
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));;

		return circle;
	}

}
