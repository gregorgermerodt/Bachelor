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
		return new Point();
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double r = radius *2;
		
		return r;
	}

	// Umfang
	public double getCircumference() {
		double u = radius * 2;
		
		
		return Math.PI * u;
	}

	// Fläche
	public double getArea() {
		double a = radius * radius;
		
		return Math.PI * a;
	}

	public boolean containsPoint(Point point) {
		boolean cp = false;
		double cr = (Math.pow(point.getX() - location.getX(),2))+(Math.pow(point.getY() - location.getY() ,2));
		if (cr < (Math.pow(radius,2))) {
			cp = true;
		}
	return cp;
}

		
	

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
