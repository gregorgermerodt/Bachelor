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
		this.radius = newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double durchmesser = 2*radius;
		return durchmesser;
	}

	// Umfang
	public double getCircumference() {
		double umfang = 2*Math.PI*radius;
		return umfang;
	}

	// Fläche
	public double getArea() {
		double flaeche = Math.PI * Math.pow(radius, 2);
		return flaeche;
	}

	public boolean containsPoint(Point point) {
		if(radius >= location.getDistance(point)){
		return true;
		} else {}
	return false;

}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.location = center;
		circle.radius = center.getDistance(p);

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
