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
		initRadius= radius;
	

	}

	public double getRadius() {
		
		
		return radius;
	}

	public void setRadius(double newRadius) {
		
		radius= newRadius;
	}

	public Point getLocation() {
		
		
		return location;
	}

	public void setLocation(Point newLocation) {
		
		location= newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		
		
		return this.getRadius()*2;
	}

	// Umfang
	public double getCircumference() {
		
		
		
		
		return (Math.PI*2)*getRadius();
	}

	// Fläche
	public double getArea() {
	
		
		
		
		return Math.PI*(Math.pow(getRadius(), 2));
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
