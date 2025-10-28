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
		location =initLocation;
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

	public void setLocation(Point newLocation) {// wollen neue Location bekommen
		location = newLocation;
	
	}
	
	// Durchmesser
	public double getDiameter() { // kann man auch mit double variabel machen
		return 2*radius;
	
	}

	// Umfang
	public double getCircumference() {
		double Pi = Math.PI;
	
		return 2*Pi*radius;
	}

	// Fläche
	public double getArea() {
		double Pi = Math.PI;
	
		return Math.pow(radius,2)*Pi;
	}

	public boolean containsPoint(Point point) {
		if(radius > point.getDistance(location))
		{
					return true;
		}			
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		
		Point newLocation; 
		double newRadius;
		newLocation = center;
		newRadius = p.getDistance(center);
		Circle circle = new Circle(newLocation, newRadius);

		return circle;
	}}

