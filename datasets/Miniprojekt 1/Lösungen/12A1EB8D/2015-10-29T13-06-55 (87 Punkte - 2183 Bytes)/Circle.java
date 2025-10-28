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
		double a = this.radius;
		return a;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public Point getLocation() {
		Point b = this.location;
		return b;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double a = this.radius * 2;
		return a;
		
	}

	// Umfang
	public double getCircumference() {
		double u = (2 * Math.PI * this.radius);
		return u;
	}

	// Fläche
	public double getArea() {
		double a = Math.PI *Math.pow(this.radius, 2);
		return a;
	}

	public boolean containsPoint(Point point) {
		if (this.radius >= point.getX() && this.radius >= point.getY()){
			return true; 
		}
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		if (circle.radius == center.getX() && circle.radius == center.getY() &&
				circle.radius == p.getX() && circle.radius == p.getY());
		return circle;
	}

}
