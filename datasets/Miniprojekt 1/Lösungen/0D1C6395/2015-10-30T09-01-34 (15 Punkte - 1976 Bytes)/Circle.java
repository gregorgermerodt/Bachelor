import java.awt.Point;

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
		return Math.PI*2*radius;
	}

	// Fl�che
	public double getArea() {
		return Math.PI*(radius*radius);
	}

	public boolean containsPoint(Point point) {
		if(location.distance(point) <= radius )
		{
			return true;
		}else{return false;}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
		circle.setRadius(Math.sqrt((center.getX()-p.getX())*(center.getX()-p.getX())+(center.getY()-p.getY())*(center.getY()-p.getY())));

		return circle;
	}

}
