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
		double durchmesser;
		durchmesser = 2*radius;
		return durchmesser;
	}

	// Umfang
	public double getCircumference() {
		double umfang;
		umfang = 2*(Math.PI*radius);
		return umfang;
	}

	// Fläche
	public double getArea() {
		double a;
		a = (Math.PI*radius)*(Math.PI*radius);
		return a;
	}

	public boolean containsPoint(Point point) {
			if(Math.abs(radius) >= Math.abs((location.getDistance(point))))
			{return true;}
			else{ return false;}
		
	
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		
		//An dieser Stelle das circle-Objekt bearbeiten
		circle.location = center;
		circle.radius = center.getDistance(p) ;
		return circle;
	}

}
