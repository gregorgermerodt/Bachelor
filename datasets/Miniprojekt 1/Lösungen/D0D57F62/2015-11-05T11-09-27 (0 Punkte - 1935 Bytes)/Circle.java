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
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		double umfang = 2*Math.PI*radius;;
		return umfang;
	}

	// Fl�che
	public double getArea() {
		double fl�che = Math.PI*Math.pow(radius, 2);
		return fl�che;
	}

	public boolean containsPoint(Point point) {
		boolean istdrin = false;
		if(point.getDistance(getLocation())<=radius){
			istdrin = true;
		}
		return istdrin;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.location = center;
		circle.radius = p.getDistance(center);
		return circle;
	}

}
