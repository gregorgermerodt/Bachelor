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
		return 2 * this.radius;
	}

	// Umfang
	public double getCircumference() {
		double u = 0.0;
		u = Math.PI * this.getDiameter();
		return u;
	}

	// Fläche
	public double getArea() {
		double a = 0.0;
		a = Math.PI * (this.radius * this.radius);
		return a;
	}

	public boolean containsPoint(Point point) {
		if (this.location.getDistance(point) <= this.radius) {
			return true;
		}
		else {
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
