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
		
		initLocation=location;
		initRadius=radius;
		

	}

	public double getRadius() {
		return -1.0;
	}

	public void setRadius(double newRadius) {
		newRadius=radius;
	}

	public Point getLocation() {
		return new Point();
	}

	public void setLocation(Point newLocation) {
	}
	
	// Durchmesser
	public double getDiameter(double initDiameter) {
		
		initDiameter=(radius*2);
		return -1.0;
	}

	// Umfang
	public double getCircumference(double initCircumference) {
		
		initCircumference=(2*Math.PI*radius);
		return Math.PI;
	}

	// Fläche
	public double getArea(double initArea) {
		initArea=(Math.PI*(radius*radius));
		
		return -1.0;
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