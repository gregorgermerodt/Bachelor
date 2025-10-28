/**
 * Definiert einen Kreis �ber einen Radius und einem Mittelpunkt in einem
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
		double diameter = radius *2;
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		double u = Math.PI * getDiameter(); 
		return u;
	}

	// Fl�che
	public double getArea() { 
	double a = Math.PI * Math.pow(radius, 2);
	return a;
	}

	public boolean containsPoint(Point point) {
		
		double i = Math.pow(point.getX() - location.getX(), 2) + Math.pow(point.getY()
				- location.getY(), 2);
		
		double j = Math.pow(radius,  2);
		
		if (i<j)
		
		{ 
			return true;
		}
		else
		
		{
			return false;
		}
		
		}
			
		

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle(center, p.getDistance(p));

		// An dieser Stelle das circle-Objekt bearbeiten
       
        return circle;
	
	}

}