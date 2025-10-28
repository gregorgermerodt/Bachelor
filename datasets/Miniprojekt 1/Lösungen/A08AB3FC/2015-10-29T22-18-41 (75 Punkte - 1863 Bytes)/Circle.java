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
		return new Point();
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
		
	}
	
	// Durchmesser
	public double getDiameter() {
		double diameter;
		diameter = 2 * radius;
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		double x;
		x = 3.14 * 2 * radius;
		return x;
	}

	// Fläche
	public double getArea() {
		double x;
		x = 3.14 * radius * radius;
		return x;
	}

	public boolean containsPoint(Point point) {
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
