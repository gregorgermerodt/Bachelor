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
		double diameter = 2*radius;
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		double u = 2 * Math.PI * radius;
		return u;
	}

	// Fl�che
	public double getArea() {
		double a = Math.PI * Math.pow(radius, 2);
		return a;
	}

	public boolean containsPoint(Point point) {
		if (point.getDistance(location)<= radius) {
			return true;
		}
		else {
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center);
		circle.setRadius(p.getDistance(center));

		return circle;
	}

}
