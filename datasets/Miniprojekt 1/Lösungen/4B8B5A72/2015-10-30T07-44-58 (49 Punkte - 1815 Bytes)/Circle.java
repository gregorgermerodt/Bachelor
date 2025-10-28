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
		return 2 * getRadius();
	}

	// Umfang
	public double getCircumference() {
		return 2 * Math.PI * getRadius();
	}

	// Fläche
	public double getArea() {
		return Math.PI * getDiameter();
	}

	public boolean containsPoint(Point point) {
		if(location.getDistance(point) <= getRadius()){
			return true;
		}else{
		return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		
		//center = circle.location; //nicht notwendig
		circle.location = center;
		
		
		return circle;
	}

}
