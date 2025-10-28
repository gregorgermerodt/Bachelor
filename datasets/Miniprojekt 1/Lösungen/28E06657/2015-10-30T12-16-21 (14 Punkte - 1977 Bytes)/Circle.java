package Miniprojekt1;

/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
		location = new Point();
		radius = 0;
	}

	public Circle(Point initLocation, double initRadius) {
		location = initLocation;
		radius = initRadius;

	}

	public double getRadius() {
		return -1.0;
	}

	public void setRadius(double newRadius) {
	}

	public Point getLocation() {
		return new Point();
	}

	public void setLocation(Point newLocation) {
	}
	
	// Durchmesser
	public double getDiameter() {
		return 2 * radius ;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI * getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI * (radius * radius);
	}

	public boolean containsPoint(Point point) {
		if (location.getDistance(point) <= radius){
			return true;
		} else { 
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle(center,center.getDistance(p));

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}

