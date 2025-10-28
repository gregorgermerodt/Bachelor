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
		this.location = initLocation;
		this.radius = initRadius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double diameter;
		diameter = (this.radius * 2);
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		double circumference;
		circumference = (2 * Math.PI * this.radius);
		return circumference;
	}

	// Fl�che
	public double getArea() {
		double area;
		area = Math.PI * Math.pow(this.radius, 2);
		return area;
	}

	public boolean containsPoint(Point point) {
		double abstand;
		abstand = location.getDistance(point);
		if (abstand <= radius)
			return true;
		else
			return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.location = center;
		circle.radius = center.getDistance(p);
		return circle;
	}

}
