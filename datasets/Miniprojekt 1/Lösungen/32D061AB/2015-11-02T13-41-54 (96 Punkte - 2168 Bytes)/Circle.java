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
		double d = 2*radius;
		return d; 
	}

	// Umfang
	public double getCircumference() {
		double U = 2* Math.PI * radius;
		
		return U;
	}

	// Fläche
	public double getArea() {
		
		double A = Math.PI * Math.pow(radius, 2);
		return A;
	}

	public boolean containsPoint(Point point) {
	
		  return  getDistance(point) < getRadius();
	}

	 private double getDistance(Point point) {
		  return Math.sqrt(Math.pow(point.getX() - getLocation().getX(), 2) + (Math.pow(point.getY() - getLocation().getY(), 2)));
	 }
	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.setLocation(center);
		
		circle.setRadius(Math.sqrt(Math.pow(p.getX() - center.getX(), 2) + (Math.pow(p.getY() - center.getY(), 2))));
		

		return circle;
	}

}
