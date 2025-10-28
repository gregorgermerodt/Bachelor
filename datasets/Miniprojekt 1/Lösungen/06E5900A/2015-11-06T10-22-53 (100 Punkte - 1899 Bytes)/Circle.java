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
		return 2*getRadius();
	}

	// Umfang
	public double getCircumference() {
		return Math.PI * getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI *Math.pow(getRadius(), 2);
	}

	public boolean containsPoint(Point point) {
		if(point.getDistance(location)> getRadius()){
			return false;
		}
		else{
			return true;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center);
		circle.setRadius(p.getDistance(center));

		return circle;
	}

}
