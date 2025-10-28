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
		double diameter = radius * 2;
		
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		 
		double circumference = Math.PI * getDiameter() ;
		
		return circumference;
	}

	// Fläche
	public double getArea() {
		double area = Math.PI * Math.pow(getRadius(), 2);
		
		return area;
	}

	public boolean containsPoint(Point point) {
		return getDistance(point) < getRadius();
	}
	
	private double getDistance(Point point) {
	      return Math.sqrt(Math.pow(point.getX() - getLocation().getX(), 2) + (Math.pow(point.getY() - getLocation().getY(), 2)));
	   }

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		circle.setLocation(center);
		circle.setRadius(Math.sqrt(Math.pow(p.getX(),2)+ (Math.pow(p.getY() - center.getY(), 2))));
		return circle;
	}

}
