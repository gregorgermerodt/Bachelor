/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
		//location = new Point();
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
		return new Point(location.getX(), location.getY());
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
		//location.setX(location.getX());
		//location.setY(location.getY());
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius * 2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI* getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI*radius*radius;
	}

	public boolean containsPoint(Point point) {
		return (location.getDistance(point)<= radius);
		//if(location.getDistance(point)<= radius){
			//return true;
		//}
		//else{
			//return false;
		//}
		//return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		
		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));
		return circle;
	}

}
