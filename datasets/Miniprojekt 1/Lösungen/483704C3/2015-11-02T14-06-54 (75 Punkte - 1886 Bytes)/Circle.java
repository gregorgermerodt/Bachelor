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
		radius = newRadius;
	}

	public Point getLocation() {
		return new Point();
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return Math.PI*2;
	}

	// Umfang
	public double getCircumference() {
		return 2*Math.PI*radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) {//
		if(location.getDistance(point)<= radius){
			
			return false;
		}
		return true;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));

		
		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
