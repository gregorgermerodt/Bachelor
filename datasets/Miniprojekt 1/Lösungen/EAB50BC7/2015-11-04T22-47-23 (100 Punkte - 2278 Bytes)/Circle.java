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
		return radius *2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI * 2 * radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI * (radius * radius);
	}

	public boolean containsPoint(Point point) {
		
		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;
		
		x1 = location.getX() - radius;
		x2 = location.getX() + radius;
		
		y1 = location.getY() - radius;
		y2 = location.getY() + radius;
		
		if(point.getX() > x1 && point.getX() < x2){
			if(point.getY() > y1 && point.getY() < y2){
				return true;
			}
		}
		
		
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.location = center;
		circle.radius = Math.sqrt(Math.pow(p.getX() - center.getX() , 2) + Math.pow(p.getY() - center.getY(), 2));
		
		return circle;
	}

}
