import java.awt.Point;

/**
 * Definiert einen Kreis 黚er einen Radius und einem Mittelpunkt in einem
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
		return this.radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius ;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation ;
	}
	
	// Durchmesser
	public double getDiameter() {
		return 2*this.radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*this.getDiameter();
	}

	// Fl鋍he
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}

	public boolean containsPoint(Point point) {
		double distance = location.distance(point) ;
		if(distance <= this.radius){
		return true;
			}
		else
		{
		return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		double r = center. distance(p) ;
		Circle circle = new Circle(center,r);

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}
	

}
