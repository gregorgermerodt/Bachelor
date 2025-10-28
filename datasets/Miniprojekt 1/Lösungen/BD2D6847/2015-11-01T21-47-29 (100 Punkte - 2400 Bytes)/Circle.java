/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 * @author: Zohaib Sajid
 * Matrikelnr: 3033021
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
		return (radius*2);
	}

	// Umfang
	public double getCircumference() {
		//U= 2.Pi = 
		
		return (Math.PI*getDiameter());
	}

	// Fläche
	public double getArea() {
		return (Math.PI*radius*radius);
	}

	public boolean containsPoint(Point point) {
		double a = location.getX()-point.getX();
		double b = location.getY()-point.getY();
		double c = Math.pow(a, 2)+Math.pow(b, 2);
		if (c<=(radius*radius))
			return true;
		else
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.location= center;
		double a = center.getX()-p.getX();
		double b = center.getY()-p.getY();
		double c = Math.pow(a, 2)+Math.pow(b, 2);
		circle.radius= Math.sqrt(c);

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}

