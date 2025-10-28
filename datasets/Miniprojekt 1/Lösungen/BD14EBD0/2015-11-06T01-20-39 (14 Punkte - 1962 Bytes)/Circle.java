package miniprojekt1;

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
		return 2*this.radius;
	}

	// Umfang
	public double getCircumference() {
		return 2*Math.PI*this.radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI*Math.pow(this.radius, 2);
	}

	public boolean containsPoint(Point point) {
		if(point.getDistance(this.location) > this.radius) {
			return false;
		} else {
			return true;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));

		return circle;
	}

}
