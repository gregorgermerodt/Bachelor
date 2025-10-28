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
		location = initLocation;
		radius = initRadius;
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
		double d;
		d = 2*radius;
		return d;
	}

	// Umfang
	public double getCircumference() {
		double umfang;
		umfang = 2 * Math.PI * radius;
		return umfang;
	}

	// Fläche
	public double getArea() {
		double a;
		a = Math.PI*(radius * radius);
		return a;
	}

	public boolean containsPoint(Point point) {
		if(location.getDistance(point)>radius) {
			return false;
		} 	else {
			return true;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		
		// An dieser Stelle das circle-Objekt bearbeiten	
		circle.setRadius(center.getDistance(p));
		circle.setLocation(center);

		return circle;
	}

}
