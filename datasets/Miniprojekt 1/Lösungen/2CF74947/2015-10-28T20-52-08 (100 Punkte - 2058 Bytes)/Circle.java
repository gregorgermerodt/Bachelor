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
		return radius*2.0;
	}

	// Umfang
	public double getCircumference() {
		double u = 0.0;
		u = 2.0*radius*Math.PI;
		return u;
	}

	// Fläche
	public double getArea() {
		double a = 0.0;
		a = Math.PI * Math.pow(radius, 2.0);
		return a;
	}

	public boolean containsPoint(Point point) {
		 if (location.getDistance(point) <=radius) {
			
			 return true;
			              
			 } else {

		return false;}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
	    circle.setRadius(center.getDistance(p));
		return circle;
	}

}
