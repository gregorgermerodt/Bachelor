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
location = initLocation;
radius = initRadius; 

	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
		radius = newRadius;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point newLocation) {
		this.location= newLocation;
		location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double Durchmesser = radius * 2;
		return Durchmesser;
	}

	// Umfang
	public double getCircumference() {
		double Umfang = 2 * (Math.PI) * radius;
		return Umfang;
	}

	// Fläche
	public double getArea() {
		double Fläche = Math.PI *(radius*radius) ;
		return Fläche;
	}

	public boolean containsPoint(Point point) {
		if (location.getDistance(point)<= radius){
		return true;
	}
		else
		{
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		
		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
