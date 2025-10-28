/**
 * Definiert einen Kreis ¸ber einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius)
	{ this.location=initLocation; this.radius=initRadius;

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
	this.location=newLocation;}
	
	// Durchmesser
	public double getDiameter() {
		return 2*radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*radius*2;
	}

	// Fl‰che
	public double getArea() {
		return Math.PI*radius*radius;
	}

	public boolean containsPoint(Point point) {
		return getLocation().getDistance(point)< getRadius();
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
