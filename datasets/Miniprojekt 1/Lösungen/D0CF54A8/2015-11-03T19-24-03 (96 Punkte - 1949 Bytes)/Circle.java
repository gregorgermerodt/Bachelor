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
		//return new Point();
		
		return new Point(location.getX(), location.getY());
	}

	public void setLocation(Point newLocation) {		
		location = newLocation;
	}
	
	
	
	// Durchmesser
	public double getDiameter() {
		return 2*radius;
	}

	// Umfang
	public double getCircumference() {
		double U = Math.PI*getDiameter();
		
		return U;
	}

	// Fläche
	public double getArea() {
		return radius*Math.PI*radius;
	}

	public boolean containsPoint(Point point) {
		
		return (location.getDistance(point) <= radius);
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		
		
		circle.setLocation(center);
		
		circle.setRadius(center.getDistance(p));
		

		return circle;
	}

}
