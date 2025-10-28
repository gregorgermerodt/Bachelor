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
		setLocation(initLocation);
		setRadius(initRadius);
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public Point getLocation() {
		this.location.getX();
		this.location.getY();
		return location;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return getRadius()*2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI*Math.pow(getRadius(),2);
	}

	public boolean containsPoint(Point point) {
		if( (getLocation().getX()-getRadius() <= point.getX() && point.getX() <= getLocation().getX()+getRadius() ||
				getLocation().getX()-getRadius() >= point.getX() && point.getX() >= getLocation().getX()+getRadius() ) &&
			(getLocation().getY()-getRadius() <= point.getY() && point.getY() <= getLocation().getY()+getRadius() ||
				getLocation().getY()-getRadius() >= point.getY() && point.getY() >= getLocation().getY()+getRadius()) ){
			return true;
		}
		else{
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
		circle.setRadius(p.getDistance(center));

		return circle;
	}

}
