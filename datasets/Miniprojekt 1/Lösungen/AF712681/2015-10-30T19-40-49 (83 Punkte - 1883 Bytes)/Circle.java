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
		
		double a = radius*2;
		return a;
	}

	// Umfang
	public double getCircumference() {
		
		double U = Math.PI*this.getDiameter();
		return U;
	}

	// Fl�che
	public double getArea() {
		
		double A = Math.PI*radius*radius; 
		return A;
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
