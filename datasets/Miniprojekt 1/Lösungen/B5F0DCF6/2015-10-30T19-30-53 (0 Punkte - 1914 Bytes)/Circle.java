package MiniPorojekt1;
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
		return 2*radius;
	}

	// Umfang
	public double getCircumference() {
		return 2*Math.PI*radius; // oder return Math.PI*getDiameter();
	}

	// Fl�che
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) {
		
			if(location.getDistance(point)>=radius){
		
			return false;
			}
			else {
				return true;
			}
		
		
	}

	public static Circle fromPoints(Point center, Point p) {

            circle.setRadius(center.getDistance(p));
            Circle circle = newCircle(center);

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}

