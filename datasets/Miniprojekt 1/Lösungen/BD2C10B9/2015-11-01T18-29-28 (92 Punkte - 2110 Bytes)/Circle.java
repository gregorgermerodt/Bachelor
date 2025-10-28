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
		location=initLocation;
		radius=initRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius=newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location=newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return 2 * radius;
	}

	// Umfang
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public boolean containsPoint(Point point) {
		double x1 = point.getX();
		double y1 = point.getY();
		double x2 = location.getX();
		double y2 = location.getY();
		double abstand = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		if (abstand <= radius) {
			return true;
		} else {
		return false;  
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		double x1 = center.getX();
		double y1 = center.getY();
		double x2 = p.getX();
		double y2 = p.getY();
		// Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
