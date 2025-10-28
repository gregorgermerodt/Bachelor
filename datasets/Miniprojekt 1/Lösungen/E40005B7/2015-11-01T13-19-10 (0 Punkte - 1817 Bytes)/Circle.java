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
		location=initLocation;
		radius=initRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
	radius=newRadius;}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
	location=newLocation;}
	
	// Durchmesser
	public double getDiameter(double diameter) {
		diameter= 2*radius;
		return diameter ;
	}

	// Umfang
	public double getCircumference(double U) {
		U= 2*Math.PI*radius;
		return U;
	}

	// Flaeche
	public double getArea(double A) {
		A = Math.pow(Math.PI*radius,2);
		return A;
	}

	public boolean containsPoint(Point point) {
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		center=radius;
		p<=radius;
		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
