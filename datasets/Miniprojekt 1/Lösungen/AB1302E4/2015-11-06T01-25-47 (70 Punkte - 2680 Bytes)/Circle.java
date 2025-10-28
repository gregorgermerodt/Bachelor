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
//-------------------------------------------------------------------------------
	

	public void setRadius(double newRadius) {
		radius = newRadius;
		
	}
	
	public double getRadius() {
		return radius;
	}
//------------------------------------------------------------------------------
	
	public void setLocation(Point newLocation) {
		location = newLocation;
	}
	
	public Point getLocation() {
		return location;
	}

//------------------------------------------------------------------------------	
	// Durchmesser
	public double getDiameter() {
		return radius*radius;
	}
//-----------------------------------------------------------------------------
	// Umfang
	public double getCircumference() {
		return Math.PI*2*radius;
	}
//------------------------------------------------------------------------------
	// Fläche
	public double getArea() {
		return Math.PI* Math.pow(radius, 2);
	}
//-------------------------------------------------------------------------------
	public boolean containsPoint(Point point) {
		return location.getDistance(point)<radius;
	}
	
	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.setLocation(center);
		circle.location= center;
		circle.setRadius(center.getDistance(p));
		return circle;
	}

}
