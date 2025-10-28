/**
 * Definiert einen Kreis �ber einen Radius und einem Mittelpunkt in einem
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
		
		return 2 * getRadius();
	}

	// Umfang
	public double getCircumference() {
		
		return Math.PI * getDiameter();
	}

	// Fl�che
	public double getArea() {
		
		return Math.PI * Math.pow(getRadius(), 2);
	}

	public boolean containsPoint(Point point) {
		
		boolean a = false;
		
		double distance = point.getDistance(getLocation());
		
		if(distance < getRadius()){
			
			a = true;
			
		}
		
		else{
			
			a = false;
		}
		
		return a;
	}

	public static Circle fromPoints(Point center, Point p) {
		
		Circle circle = new Circle();
		
		circle.setLocation(center);
		
		double r = center.getDistance(p);
		
		circle.setRadius(r);

		return circle;
	}

}
