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
		return (2*radius);
	}

	// Umfang
	public double getCircumference() {
		return (2*Math.PI*radius);
	}

	// Fläche
	public double getArea() {
		return (radius*radius*Math.PI);
	}

	public boolean containsPoint(Point point) {
		double d=0;
		d = Math.sqrt(((point.getX()-location.getX()) * (point.getX()-location.getX()))
			+ ((point.getY()-location.getY()) * (point.getY()-location.getY())));
		
		if (d <= radius) {
			return true;
		} else 
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		double d = Math.sqrt(((p.getX()-center.getX()) * (p.getX()-center.getX()))
				+ ((p.getY()-center.getY()) * (p.getY()-center.getY())));
		// An dieser Stelle das circle-Objekt bearbeiten
		
		circle.setLocation(center);
		circle.setRadius(d);

		return circle;
	}

}
