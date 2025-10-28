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
		location = initLocation;
		radius = initRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		newRadius = getRadius();
	}

	public Point getLocation() {
		return new Point();
	}

	public void setLocation(Point newLocation) {
		newLocation = getLocation();
	}
	
	// Durchmesser
	public double getDiameter() {
		return getRadius()*2;
	}

	// Umfang
	public double getCircumference() {
		return 2*Math.PI*getRadius();
	}

	// Fläche
	public double getArea() {
		return Math.PI*(getRadius()*getRadius());
	}

	public boolean containsPoint(Point point) {
		//if()
		{
			
		}
		//else
		{
		return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		
		return circle;
	}

}
