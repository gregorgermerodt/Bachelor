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
		double d = radius * 2;
		return d;
	}

	// Umfang
	public double getCircumference() {
		double u = 2 * Math.PI * radius;
		return u;
	}

	// Fläche
	public double getArea() {
		double a = Math.PI * (Math.pow(radius, 2));
		return a;
	}

	public boolean containsPoint(Point point) {
		
		boolean containsP = false;
		if (point.getDistance(location)  <= radius) {
			containsP = true;
		}
		return containsP;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		 circle.location = center;
		 circle.radius = p.getDistance(center);

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
