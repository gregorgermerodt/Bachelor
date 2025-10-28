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
		double ergebniss = 0;
		ergebniss = 2 * radius;
		return ergebniss;
	}

	// Umfang
	public double getCircumference() {
		double ergebniss = 0;
		
		ergebniss= 2* Math.PI * radius;
		
		return ergebniss;
	}

	// Fläche
	public double getArea() {
		double ergbeniss = 0;
		ergbeniss= Math.PI * Math.pow(radius , 2);
		return ergbeniss;
	}

	public boolean containsPoint(Point point) {
		if(point.getX()>=getArea())
		{ return false; }
		else
		{ return true; }
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle(); 
		
		
		
		
		return circle;
	}

}
