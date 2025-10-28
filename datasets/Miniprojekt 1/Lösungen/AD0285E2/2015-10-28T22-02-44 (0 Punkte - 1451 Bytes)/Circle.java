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
	public double getCircumference(double radius) {
		return Math.PI *2* radius;
	}

	// Fläche
	public double getArea(double radius) {
		return Math.PI* Math.pow(radius, 2) ;
	}

	public boolean containsPoint(Point point) {
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}




}
