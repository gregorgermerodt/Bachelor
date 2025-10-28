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
		radius = initRadius;
		location = initLocation;
		
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
		return Math.PI*2*radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI*Math.pow(radius,2);
	}

	public boolean containsPoint(Point point) {
		if(location.getDistance(point) <=radius){
			return true;
		} else {
			return false;
		}	
		
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.location.setX(center.getX());
		circle.location.setY(center.getY());
		
		circle.radius = p.getX()-center.getX();
		
		return circle;
	}

}

