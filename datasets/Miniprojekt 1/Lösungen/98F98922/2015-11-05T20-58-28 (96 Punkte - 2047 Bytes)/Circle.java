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
		double diameter;
		diameter = (radius * 2);
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		double u;
		u = (2 * (Math.PI) * radius);
		return u;
	}

	// Fläche
	public double getArea() {
		double a;
		a = (Math.PI) * (Math.pow(radius, 2));
		return a;
	}

	public boolean containsPoint(Point point) {
		double abstand = point.getDistance(this.location); 
		if (abstand <= this.radius){
			return true;
		}
		else {
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
			circle.location = center;
			circle.radius = center.getDistance(p);
		return circle;
	}

}
