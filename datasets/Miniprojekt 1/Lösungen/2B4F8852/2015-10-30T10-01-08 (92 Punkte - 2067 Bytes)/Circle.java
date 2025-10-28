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
		radius = newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location =newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return 2*radius;
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
		double dx=location.getX()-point.getX();
		double dy=location.getY()-point.getY();
		if(dx*dx-dy*dy<=radius){
			return true;
		}
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.location = center;
		
		double dx=p.getX()-center.getX();
		double dy=p.getY()-center.getY();
		
		
		circle.radius =Math.sqrt(dx*dx+dy*dy); 

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
