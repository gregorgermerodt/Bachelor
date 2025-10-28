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
		return location;
	}

	public void setLocation(Point newLocation) {
		this.location=newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double a= 2*this.radius;
		return a;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*2*radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) {
		if (Math.pow(point.getX() - location.getX(), 2) + 
				Math.pow(point.getY()- location.getY(), 2)
			<= radius *radius)
		{
			return true;
		}
		else return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
		double hilfe =center.getDistance(p);
		circle.setRadius(hilfe);
		
		
		

		return circle;
	}

}
