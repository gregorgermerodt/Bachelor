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
		System.out.println (initLocation);
		System.out.println (initRadius); 
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius = newRadius; 
	}

	public Point getLocation() {
		return new Point();
	}

	public void setLocation(Point newLocation) {
	}
	
	// Durchmesser
	public double getDiameter() {
		return 2 *radius;
	}

	// Umfang
	public double getCircumference() {
		return (Math.PI * (2 * radius)) ;
	}

	// Fl�che
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public boolean containsPoint(Point point) {
		while  (point == (Math.PI * radius * radius ) )
			return true; 
		else 
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
