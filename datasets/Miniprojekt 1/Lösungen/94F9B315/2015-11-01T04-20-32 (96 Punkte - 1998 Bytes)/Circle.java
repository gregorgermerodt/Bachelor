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
		setLocation(initLocation);
		setRadius(initRadius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	public Point getLocation() {
		location.getX();
		location.getY();
		return location;
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return getRadius()*2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI*Math.pow(getRadius(),2);
	}

	public boolean containsPoint(Point point) {
		if(point == getLocation()){
			return true;
		}
		else{
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
		circle.setRadius(p.getDistance(center));

		return circle;
	}

}
