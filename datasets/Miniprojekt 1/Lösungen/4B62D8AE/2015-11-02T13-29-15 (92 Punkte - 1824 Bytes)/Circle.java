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
	public double getDiameter(){
		double Diameter;
		return Diameter = radius+radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*getDiameter();		
	}
 

	// Fl‰che
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) {
		if (radius > point.getDistance(location)){
			return true;
		} else {
			return false;
		}
	}
  
	public static Circle fromPoints(Point center, Point p) {
		Point newLocation;
		double newRadius;
		newLocation = center;
		 newRadius = p.getDistance(center);
		 Circle circle = new Circle(newLocation, newRadius);
		return circle;
	}

}
