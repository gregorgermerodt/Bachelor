package MINIprojekt;
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

	}

	public double getRadius() {
		return -1.0;
	}

	public void setRadius(double newRadius) {
	}

	public Point getLocation() {
		return new Point();
	}

	public void setLocation(Point newLocation) {
	}
	
	// Durchmesser
	public double getDiameter() {
		return -1.0;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI;
	}

	// Fläche
	public double getArea() {
		return -1.0;
	}

	public boolean containsPoint(Point point) {
		return false;
		nhujnhlöhi
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stellbhiuhijioe das circle-Objekt bearbeiten

		return circle;
	}

}
