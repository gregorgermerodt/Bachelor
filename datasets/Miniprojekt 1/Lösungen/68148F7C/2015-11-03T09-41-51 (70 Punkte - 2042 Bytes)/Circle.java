/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	//Konstruktor
	public Circle() {
	}

	//1.
	public Circle(Point initLocation, double initRadius) {
		location = initLocation;
		radius = initRadius;
	}

	//2.
	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	public Point getLocation() {
		
		return new Point();
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
	}
	
	//3.
	// Durchmesser
	public double getDiameter() {
		
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		double u;
		u = (2*Math.PI*radius);
		return u;
	}

	// Fläche
	public double getArea() {
		double a;
		a = (Math.PI*(Math.pow(radius, 2)));
		return a;
	}

	public boolean containsPoint(Point point) {
		if (location.getDistance(point) <= radius) {
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
