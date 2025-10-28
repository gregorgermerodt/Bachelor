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
		newRadius = radius;
	}

	public Point getLocation() {
		return new Point();
	}

	public void setLocation(Point newLocation) {
		newLocation = location;
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius * 2;
	}

	// Umfang
	public double getCircumference() {
		return 2*(Math.PI + radius);
	}

	// Fläche
	public double getArea() {
		return Math.PI * (radius * radius);
	}

	public boolean containsPoint(Point point) {
		//if (location.getX() + radius > point + radius)
		//	return true;
		//else
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		return circle;
	}

}
