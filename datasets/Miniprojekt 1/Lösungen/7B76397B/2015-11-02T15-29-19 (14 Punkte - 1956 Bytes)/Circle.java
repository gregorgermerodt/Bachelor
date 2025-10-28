package Miniprojekt;

/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	public Point location;
	public double radius;

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
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius * 2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI * radius * 2;
	}

	// Fläche
	public double getArea() {
		return Math.PI * (Math.pow(radius, 2));
	}

	public boolean containsPoint(Point point) {
		if  (Math.sqrt(Math.pow(point.getX(),2) + Math.pow(point.getY(), 2)) <= radius) 
				return true;
		else 
				return false;
		
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.location = center;
		circle.radius = Math.sqrt(Math.pow((p.getX() - center.getX()), 2) + Math.pow((p.getY() - center.getY()), 2));
		return circle;
	}

}
