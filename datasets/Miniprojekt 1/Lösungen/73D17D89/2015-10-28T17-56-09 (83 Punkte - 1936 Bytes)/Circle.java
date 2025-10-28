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
     this.radius=initRadius;
     this.location=initLocation;
     
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
	this.radius=newRadius;
	
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
	this.location=newLocation;
	
	}
	
	// Durchmesser
	public double getDiameter() {
		
		
		
		double d=2 * radius;
		
		
		
		
		
		 return d;
	}

	// Umfang
	public double getCircumference() {
		
		double u= 2*Math.PI*radius;
		
		
		
		
		return u;
	}

	// Fläche
	public double getArea() {
		double a=Math.PI* Math.pow(radius, 2);
		
		
		return a;
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
