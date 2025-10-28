/*
 * 
 * Definiert einen Kreis ueber einen Radius und einem Mittelpunkt in einem
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
		double x;
		x = radius*2;
		return x;
	}	

	// Umfang
	public double getCircumference() {
		double u;
		u = Math.PI*(radius*2);
		return u;
	}

	// Flaeche
	public double getArea() {
		double a;
		a = Math.PI*(radius*radius);
		return a;
	}

	public boolean containsPoint(Point point) {
		double e;
		e = Math.sqrt(Math.pow((point.getX() - location.getX()), 2) + Math.pow((point.getY() - location.getY()), 2));
		if (radius <= e){
			return false;
		}else {
			return true;
		}		
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.location = center;
		circle.radius = p.getDistance(center);
		return circle;
	}

} 