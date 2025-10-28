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
		setLocation(initLocation);
		setRadius(initRadius);
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
		double diameter;
		diameter = getRadius() * 2;
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		double circum;
		circum = Math.PI * getDiameter();
		return circum;
	}

	// Fläche
	public double getArea() {
		double area;
		area = Math.PI * Math.pow(getRadius(), 2);
		return area;
	}

	public boolean containsPoint(Point point) {
		if (getRadius() >= point.getDistance(location))
		{
			return true;
		}
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));
		return circle;
	}

}
