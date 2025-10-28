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
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*(radius*2);
	}

	// Fl�che
	public double getArea() {
		return (Math.PI*radius*radius);
	}

	public boolean containsPoint(Point point) {
		double kreisX = location.getX();
		double kreisY = location.getY();
		double punktX = point.getX();
		double punktY = point.getY();
		if((kreisX-punktX)*(kreisX-punktX)+(kreisY-punktY)*(kreisY-punktY)<=(radius*radius)) {
		return true;
		} return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.location = center;
		circle.radius = Math.sqrt((p.getX()-circle.location.getX())*(p.getX()-circle.location.getX())+(p.getY()-circle.location.getY())*(p.getY()-circle.location.getY()));

		return circle;
	}

}
