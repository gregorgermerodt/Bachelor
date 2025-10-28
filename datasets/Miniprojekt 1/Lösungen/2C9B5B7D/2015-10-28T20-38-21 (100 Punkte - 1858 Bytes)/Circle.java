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
		this.location=initLocation;
		this.radius=initRadius;
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
		
		location=newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return 2*radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*getDiameter();
	}

	// Fläche
	public double getArea() {
		double z =Math.pow(radius, 2)*Math.PI;
		return z;
	}

	public boolean containsPoint(Point point) {

		if (location.getDistance(point) <=radius) 
		       return true;		             
		else 			          
			   return false;
			       }
	
	
	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
	
		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));
		return circle;
	}

}
