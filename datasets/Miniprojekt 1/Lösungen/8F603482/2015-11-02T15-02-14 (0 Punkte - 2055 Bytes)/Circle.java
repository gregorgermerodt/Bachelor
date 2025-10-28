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
		this.initLocation = initLocation;
		this.initRadius = initRadius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public Point getLocation() {
		return new Point(this.location);
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation
	}
	
	// Durchmesser
	public double getDiameter() {
		return (this.radius * 2);
	}

	// Umfang
	public double getCircumference() {
		return (Math.PI * this.getDiameter());
	}

	// Fläche
	public double getArea() {
		return (Math.PI * this.getRadius() * this.getRadius());
	}

	public boolean containsPoint(Point point) {
		double distance = this.location.getDistance(point);
		if (distance <=this.getRadius())
			(
				return true
				)
				else
				(
				return false;
			)
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		double radius = center.getDistance(p);
		// An dieser Stelle das circle-Objekt bearbeiten

		return new Circle(center, radius);
	}

}