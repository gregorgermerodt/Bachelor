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
		this.location = initLocation;
		this.radius = initRadius;

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
		return radius * radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI * 2 * radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI * getDiameter();
	}

	public boolean containsPoint(Point point) {
		// da die location von Klasse Point ist, enthält sie xy und somit Koordinaten eines bestimmten Punktes 
		if(point.getDistance(location) < radius){
			return true;
		}
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.location = center; 
		// der radius ist genau so groß wie die Entfernung zwischen dem Punkt p und dem center
		circle.radius = p.getDistance(center);

		return circle;
	}

}
