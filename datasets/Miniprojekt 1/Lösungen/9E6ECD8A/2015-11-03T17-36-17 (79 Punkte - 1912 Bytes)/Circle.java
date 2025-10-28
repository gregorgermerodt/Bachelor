/**
 * Definiert einen Kreis �ber einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
		location=initLocation;
		radius=initRadius;

	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double newRadius) {
		this.radius=newRadius;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point newLocation) {
		this.location=newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return getRadius()*2;
	}

	// Umfang
	public double getCircumference() {
		return 2*Math.PI*getRadius();
	}

	// Fl�che
	public double getArea() {
		return Math.PI*Math.pow(getRadius(), 2);
	}

	public boolean containsPoint(Point point) {
		if(point.getDistance(point)>getRadius()){
			return false;
		}
		else return true;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center);
		circle.setRadius(Math.sqrt((Math.pow((center.getX()-p.getX()), 2))-Math.pow((center.getY()-p.getY()), 2)));

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}

