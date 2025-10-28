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
		Point location = initLocation;
		radius = initRadius;
		System.out.println("TEST location: "+ location + " " + initLocation);
		System.out.println("TEST radius: "+ radius + " " + initRadius);

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double durchmesser = radius*2;
		return durchmesser;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*radius*2;
	}

	// Fläche
	public double getArea() {
		return Math.PI+radius*radius;
	}

	public boolean containsPoint(Point point) {
		if(point.getDistance(location)<radius)
			return true;
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		//radius = Point.getDistance(center, p);

		return circle;
	}

}
