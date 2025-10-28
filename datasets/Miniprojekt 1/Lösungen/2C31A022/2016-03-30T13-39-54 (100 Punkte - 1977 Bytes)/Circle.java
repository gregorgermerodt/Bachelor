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
		this.location = initLocation;
		this.radius = initRadius;

	}

	public double getRadius() {
		
		return radius;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		
		return radius * 2;
	}

	// Umfang
	public double getCircumference() {
		
		return Math.PI * this.getDiameter();
	}

	// Fl�che
	public double getArea() {
		
		return Math.PI * Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) {
		if(point.getDistance(location) < this.getRadius()){
			return true;
		}
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center);
		circle.radius = center.getDistance(p);

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
