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
		location=initLocation;
		radius=initRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius=newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location=newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return 2 * radius;
	}

	// Umfang
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public boolean containsPoint(Point point) {
		/*Abstand von center zum Punkt </=/> radius
		double dx = m.x - p.x;
		double dy = m.y - p.y;
		return (dx*dx + dy*dy <= radius * radius);
		*/
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
