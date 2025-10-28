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
		double d = this.radius * 2;
		return d;
	}

	// Umfang
	public double getCircumference() {
		double u = Math.PI * this.radius * 2;
		return u;
	}

	// Fläche
	public double getArea() {
		double a = Math.PI * Math.pow(this.radius, 2);
	return a;
	}

	public boolean containsPoint(Point point) {
		boolean pointinkreis = false;
			if (point.getDistance(location) <= this.radius) {
				pointinkreis = true ; }
	return pointinkreis;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.location = center;
		circle.radius = p.getDistance(center);
		
		return circle;
	}

}
