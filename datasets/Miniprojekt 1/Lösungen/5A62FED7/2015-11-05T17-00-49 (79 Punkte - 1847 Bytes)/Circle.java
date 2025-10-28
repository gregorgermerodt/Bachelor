/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private static   Point location;
	private static double radius;

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
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI*radius*radius;
	}

	public boolean containsPoint(Point point) {
		if (location.getDistance(point)<=radius)
		return true;
		else 
			return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
    location=center;
   radius=center.getDistance(p);
		// An dieser Stelle das circle-Objekt bearbeiten

	  	return circle;
	}

}
