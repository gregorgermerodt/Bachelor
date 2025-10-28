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
		return new Point();
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return 2*radius;
	}

	// Umfang
	public double getCircumference() {
		
		
		return 2*Math.PI*radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) {
		double d;
		
		d = Math.sqrt((Math.pow(point.getX()- getLocation().getX(), 2)+ Math.pow(point.getY() - getLocation().getY(), 2)));
		
		if(d<getRadius()){
			return true;
		}
		
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		
		circle.setLocation(center);
		circle.setRadius(Math.sqrt((Math.pow(p.getX()- center.getX(), 2)+ Math.pow(p.getY() - center.getY(), 2))));
		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
