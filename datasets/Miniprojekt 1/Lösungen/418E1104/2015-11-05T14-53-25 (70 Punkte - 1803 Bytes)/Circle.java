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

	public Circle(Point initLocation, double initRadius) { initLocation=this.location; initRadius=this.radius;

	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double newRadius) { 
		newRadius=this.radius;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point newLocation) {
	newLocation=this.location;}
	
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
		return location.getDistance(point)< getRadius();
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));;// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
