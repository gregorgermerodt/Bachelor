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
		initLocation = location;
		initRadius = radius;

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		newRadius = radius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return 2*radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI*Math.pow(radius,2);
	}

	public boolean containsPoint(Point point) {
		return getLocation().getDistance(point)< getRadius();
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));
		return circle;
		
	}

}
