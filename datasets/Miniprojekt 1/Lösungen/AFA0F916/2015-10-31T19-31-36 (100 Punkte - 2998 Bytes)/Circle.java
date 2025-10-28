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

		location = initLocation;
		radius = initRadius;

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {

		radius = newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
	}

	// Durchmesser
	public double getDiameter() {

		return radius * 2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI * getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) {

		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;

		if (point.getX() <= location.getX()) {
			x1 = location.getX();
			x2 = point.getX();
		} else if (point.getX() > location.getX()) {

			x1 = point.getX();
			x2 = location.getX();

		}

		if (point.getY() <= location.getY()) {
			y1 = location.getY();
			y2 = point.getY();
		} else if (point.getY() > location.getY()) {

			y1 = point.getY();
			y2 = location.getY();

		}

		double abstand = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

		if (abstand <= radius) {
			return true;
		} else {
			return false;
		}

		

	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
		
		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;

		if (p.getX() <= center.getX()) {
			x1 = center.getX();
			x2 = p.getX();
		} else if (p.getX() > center.getX()) {

			x1 = p.getX();
			x2 = center.getX();

		}

		if (p.getY() <= center.getY()) {
			y1 = center.getY();
			y2 = p.getY();
		} else if (p.getY() > center.getY()) {

			y1 = p.getY();
			y2 = center.getY();

		}

		double abstand = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		circle.setRadius(abstand);
		

		return circle;
	}

}
