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
		initLocation = location ;
		initRadius = radius ;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		newRadius = radius ;
		
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		newLocation = location ;
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) {
		return point.getDistance (location) <= radius ;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle(center, center.getDistance(p));

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}

