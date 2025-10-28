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
		location=initLocation;
		radius=initRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius=newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location=newLocation;
	}

	// Durchmesser
	public double getDiameter() {
		double durchmesser = radius*2;
		return durchmesser;
	}

	// Umfang
	public double getCircumference() {
		double umfang = Math.PI*this.getDiameter();
				return umfang;
	}

	// Fläche
	public double getArea() {
		double fläche = Math.PI*Math.pow(radius, 2.0);
		return fläche;
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
		Circle circle = new Circle(center, center.getDistance(p));
		
		

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
