/**
 * Definiert einen Kreis ¸ber einen Radius und einem Mittelpunkt in einem
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
		return this.location;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}

	// Durchmesser
	public double getDiameter() {
		return radius * 2;
	}

	// Umfang
	public double getCircumference() {
		//𝑈 = 2𝜋𝑟 = 𝜋𝑑
		return 2 * Math.PI * getRadius();
	}

	// Fl‰che
	public double getArea() {
		//𝐴 = 𝜋𝑟2
		return Math.PI * getRadius() * 2;
	}

	public boolean containsPoint(Point point) {
		//wenn der abstand zum mittelpunkt kleiner als der radius ist, dann liegt der punkt in dem kreis
		double distance = Math.sqrt(Math.pow((point.getX()-location.getX()), 2) + Math.pow((point.getY()-location.getY()), 2));

		return distance < radius;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
		circle.setRadius(Math.sqrt(Math.pow((p.getX()-center.getX()), 2) + Math.pow((p.getY()-center.getY()), 2)));
		return circle;
	}

}
