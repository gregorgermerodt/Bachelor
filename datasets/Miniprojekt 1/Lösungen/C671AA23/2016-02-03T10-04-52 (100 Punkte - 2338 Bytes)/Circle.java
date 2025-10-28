
/**
 * Definiert einen Kreis ¸ber einen Radius und einem Mittelpunkt in einem
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
		return 2 * this.radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI * this.getDiameter();
	}

	// Fl‰che
	public double getArea() {
		return Math.PI * (this.radius * this.radius);
	}

	public boolean containsPoint(Point point) {
		double minx = this.getLocation().getX() - this.radius;
		double maxx = this.getLocation().getX() + this.radius;
		double miny = this.getLocation().getY() - this.radius;
		double maxy = this.getLocation().getY() + this.radius;
		if(point.getX() < maxx && point.getX() > minx){
			if(point.getY() < maxy && point.getY() > miny)
				return true;
			else return false;
		}
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center);
		double newradius = center.getDistance(p);
		circle.setRadius(newradius);
		return circle;
	}

}

