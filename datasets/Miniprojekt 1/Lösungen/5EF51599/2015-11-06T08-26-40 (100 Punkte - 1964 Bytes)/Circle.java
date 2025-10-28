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
		this.radius = newRadius;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return this.getRadius() * 2;
	}

	// Umfang
	public double getCircumference() {
		return 2 * Math.PI * this.getRadius();
	}

	// Fl�che
	public double getArea() {
		return Math.PI * Math.pow(this.getRadius(), 2);
	}

	public boolean containsPoint(Point point) {
		if(location.getDistance(point) <= radius){
			return true;
		}
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));
		return circle;
	}

}
