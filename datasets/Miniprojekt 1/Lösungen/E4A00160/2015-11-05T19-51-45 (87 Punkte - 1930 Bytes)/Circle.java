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
		this.location = initLocation;
		this.radius = initRadius;

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		   this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius + radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI * (radius + radius);
	}

	// Fläche
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public boolean containsPoint(Point point) {
		
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		
          center.getX();
          center.getY();
          p.getDistance(p);
		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
