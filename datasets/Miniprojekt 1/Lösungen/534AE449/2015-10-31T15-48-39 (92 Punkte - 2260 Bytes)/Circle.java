/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
location = new Point();
	}

	public Circle(Point initLocation, double initRadius) {
		location = new Point(initLocation.getX(),initLocation.getY());
		radius = initRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius =newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location.setX(newLocation.getX());
		location.setY(newLocation.getY());
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius*2.0;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*radius*2.0;
	}

	// Fläche
	public double getArea() {
		return Math.PI*radius*radius;
	}

	public boolean containsPoint(Point point) {
		
		double EVU;
		EVU = Math.sqrt(Math.pow((point.getX()-location.getX()),2)+Math.pow((point.getY()-location.getY()),2));
		EVU = Math.abs(EVU);
		
		if 
			(EVU > radius)
				return false;
		
		return true;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.setLocation(center);
		double radius;
		radius = Math.sqrt(Math.pow((p.getX()-center.getX()),2)+Math.pow((p.getY()-center.getY()),2));
		radius = Math.abs(radius);
	    circle.setRadius(radius);
				// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
