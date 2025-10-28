/**
 * Definiert einen Kreis �ber einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location; //Mittelpunkt M(X|Y)
	private double radius;

	public Circle() { //Standardkonstruktor der nicht ver�ndert werden soll
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
		return getRadius()*2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI *getDiameter();
	}

	// Fl�che
	public double getArea() {
		return Math.PI *Math.pow(getRadius(), 2);
	}

	public boolean containsPoint(Point point) {
		if(location.getDistance(point)<=getRadius()){
			return true;
		}
		else{
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
