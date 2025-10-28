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
		initLocation=getLocation();
		initRadius=getRadius();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius=newRadius;
	}

	public Point getLocation() {
		return new Point();
	}

	public void setLocation(Point newLocation) {
		location=newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		return 2*Math.PI*getDiameter();
	}

	// Fl�che
	public double getArea() {
		return Math.pow(2, Math.PI*radius);
	}

	public boolean containsPoint(Point point) {
		Point nullpunkt= new Point();
		nullpunkt.setX(0);
		nullpunkt.setY(0);
		return point.getDistance(nullpunkt)<(location.getDistance(nullpunkt)-radius);
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
