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
		location = initLocation;
		radius = initRadius;

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
		double durchmesser = radius * 2;
		return durchmesser;
	}

	// Umfang
	public double getCircumference() {
		double umfang = 2 * Math.PI * radius;
		return umfang;
	}

	// Fläche
	public double getArea() {
		double flaeche = (Math.PI * radius) * (Math.PI * radius);
		return flaeche;
	}

	public boolean containsPoint(Point point) {
		
		if (location.getDistance(point) <= radius) {
			return true;
		}
		
		else 
		{
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));

		return circle;
	}

}
