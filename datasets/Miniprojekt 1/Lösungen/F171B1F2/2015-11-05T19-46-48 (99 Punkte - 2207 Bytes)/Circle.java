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
		radius	= initRadius;

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
		double dia;
		
		dia = 2.0 * radius;
		
		return dia;
	}

	// Umfang
	public double getCircumference() {
		double umfang;
		
		umfang = Math.PI * getDiameter();
		
		return umfang;
	}

	// Fläche
	public double getArea() {
		double flaeche;
		
		flaeche = Math.PI * getRadius() * getRadius();
		
		return flaeche;
	}

	public boolean containsPoint(Point point) {
		double d;
		
		d = location.getDistance(point);
		
		if(d > radius) {
			return false;
		}
		
		else {
			return true;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		double d;
		circle.setLocation(center);
		
		d = center.getDistance(p);
		
		circle.setRadius(d);
		
		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
