package miniprojekt1;

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
		
		return this.radius;
	}

	public void setRadius(double newRadius) {
		
		this.radius = newRadius;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point newLocation) {
		
		this.location = newLocation;
		
	}
	
	// Durchmesser
	public double getDiameter() {
		return this.radius*2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI * getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public boolean containsPoint(Point point) {
		return getDistance(point) < getRadius();
	}

	private double getDistance(Point point) {

		return Math.sqrt(Math.pow(point.getX() - getLocation().getX(), 2) + Math.pow(point.getY() - getLocation().getY(), 2));
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.setLocation(center);
		circle.setRadius(Math.sqrt(Math.pow(center.getX() - p.getX(), 2) + Math.pow(center.getY() - p.getY(), 2)));

		return circle;
	}

}
