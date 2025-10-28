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
	
	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	

	// Durchmesser
	public double getDiameter() {
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI*(Math.pow(radius, 2));
	}

	public boolean containsPoint(Point point) {
		
		double x2 = point.getX();
		double y2 = point.getY();
		double y1 = getLocation().getX();
		double x1 = getLocation().getY();
		
		double ecuMate = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		
		if (ecuMate <= radius){
			return true;
		}
		else return false;
		
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		
		circle.setLocation(center);

		return circle;
	}

}
