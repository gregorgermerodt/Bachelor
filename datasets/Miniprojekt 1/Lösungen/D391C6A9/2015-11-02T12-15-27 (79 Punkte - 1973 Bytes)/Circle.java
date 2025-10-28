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
		
		location=initLocation;
		radius=initRadius;

	}

	public double getRadius() {
		
		
		return radius;
	}

	public void setRadius(double newRadius) {
		
		radius=newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		
		location=newLocation;
		
	}
	
	// Durchmesser
	public double getDiameter() {
		
		double durchmesser;
		
		durchmesser=2*radius;
		
		return durchmesser;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*2*radius;
	}

	// Fläche
	public double getArea() {
		return (Math.PI*Math.pow(radius, 2));
	}

	public boolean containsPoint(Point point) {
		
		
		
		if(Math.sqrt(Math.pow((point.getX()),2) + Math.pow((point.getY()),2))<=2){
			return false;
		}
		
		return true;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
