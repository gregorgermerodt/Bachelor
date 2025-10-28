/**
 * Definiert einen Kreis ueber einen Radius und einem Mittelpunkt in einem
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
		return Radius;
	}
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	public Point getLocation() {
		return Location;
	}
	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return 2*Radius;
	}
	// Umfang
	public double getCircumference() {
		return 2*Math.PI*Radius; // oder return Math.PI*getDiameter();
	}
	// Flaeche
	public double getArea() {
		return Math.PI*Math.pow(Radius, 2);
	}
	public boolean containsPoint(Point point) {
		
			if(location.getDistance(point)>=radius){
		
			return false;
			}
			else {
				return true;
			}
		
		
	}
	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		// An dieser Stelle das circle-Objekt bearbeiten
		return circle;
	}
}