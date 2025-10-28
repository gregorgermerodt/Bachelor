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
		return this.radius;
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
		return (2 * this.radius);
	}

	// Umfang
	public double getCircumference() {
		return (2 * Math.PI * this.radius);
	}

	// Fl�che
	public double getArea() {
		return (Math.PI * Math.pow(this.radius, 2));
	}

	public boolean containsPoint(Point point) {
		if(Math.sqrt(Math.pow((point.getX()-this.location.getX()), 2) + Math.pow((point.getY()-this.location.getY()), 2)) <= this.radius){
			return true;
		} else {
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
		
		circle.setRadius(Math.sqrt(Math.pow((center.getX()-p.getX()), 2) + Math.pow((center.getY()-p.getY()), 2)));

		return circle;
	}

}
