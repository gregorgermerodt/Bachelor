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
		 
		return 2*radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*2*radius;
	}

	// Fl�che
	public double getArea() {
		return (radius*radius)*Math.PI;
	}

	public boolean containsPoint(Point point) {
		
		if(radius <= location.getDistance(point)) { // Abstand location -> point
		return true;
		}
		else {
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.setLocation(center);
		circle.setRadius(center.getDistance(p)); // Radius = Abstand center -> p

		return circle;
	}

}
