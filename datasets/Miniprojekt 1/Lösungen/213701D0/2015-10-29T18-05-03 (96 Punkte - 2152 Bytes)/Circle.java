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
		radius = newRadius;
	}

	public Point getLocation() {
		return new Point();
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double x = 0.0;
		x = this.radius * 2;
		return x;
	}

	// Umfang
	public double getCircumference() {
		
		double U = 0.0;
		U = Math.PI*getDiameter();
		return U;
	}

	// Fläche
	public double getArea() {

		double A = 0.0;
		A = Math.PI*Math.pow(this.radius, 2);
		return A;
	}

	public boolean containsPoint(Point point) {
		
		boolean B = false;
		double distance = Math.abs(point.getDistance(this.location));
		if (distance <= this.radius){
			return true;
		}
		return B;
	}

	public static Circle fromPoints(Point center, Point p) {
		
		double r = center.getDistance(p);
		
		Circle circle = new Circle(center, r);

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
