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
		double a = this.radius;
		return a;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public Point getLocation() {
		Point b = this.location;
		return b;
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
		double u = 2 * Math.PI * radius;
		return u;

	}

	// Fl‰che
	public double getArea() {
		double A = Math.PI * Math.pow(radius, 2);
		return A;
	}

	public boolean containsPoint(Point point) {
		if (point.getX() <= this.radius && point.getY() <= this.radius) {
			return true;
		}
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		double c = center.getDistance(p); //radius
		
		circle.setLocation(center);
		circle.setRadius(c);
		
			return circle;
		}

}