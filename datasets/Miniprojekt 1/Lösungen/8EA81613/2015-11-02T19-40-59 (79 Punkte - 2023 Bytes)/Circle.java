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
		this.location= initLocation;
		this.radius= initRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		this.radius= newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location.setX(newLocation.getX());
		location.setY(newLocation.getY());
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius+radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*radius*2;
	}

	// Fläche
	public double getArea() {
		return Math.PI*radius*radius;
	}

	public boolean containsPoint(Point point) {
		double t= point.getDistance(location);
		if(t<=radius){
		return false;
		}
		else {
			return true;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		
		circle.radius=p.getDistance(center);
		circle.location= center;
		
		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
