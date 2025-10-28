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
		double durchmesser;
		durchmesser = 2 * this.radius;
		return durchmesser;
	}

	// Umfang
	public double getCircumference() {
		double umfang;
		umfang = 2 * Math.PI * this.radius;
		return umfang;
	}

	// Fläche
	public double getArea() {
		double flaeche;
		flaeche = Math.PI * Math.pow(this.radius, 2);
		return flaeche;
	}

	public boolean containsPoint(Point point) {
		if (Math.sqrt(Math.pow(point.getX() - location.getX(), 2)
				+ Math.pow(point.getY() - location.getY(), 2)) <= radius) {
			return true;
		} else {
			return false;
		}

	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.location = center;
		circle.radius = Math.sqrt(Math.pow(p.getX() - center.getX(), 2)
				+ Math.pow(p.getY() - center.getY(), 2));

		return circle;
	}

}
