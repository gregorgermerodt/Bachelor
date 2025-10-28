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
		return new Point();
	}

	public void setLocation(Point newLocation) {
	location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double diameter = 2*radius;
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		double circumference = getDiameter()*Math.PI;
		return circumference;
	}

	// Fläche
	public double getArea() {
		double area = (radius*radius)*Math.PI;
		return area;
	}

	public boolean containsPoint(Point point) {
	if 
	(point.getDistance(location) <=radius){
	
		return true;
	} else {
		
		return false; }
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle(center, p.getDistance(center));

		// An dieser Stelle das circle-Objekt bearbeiten
   
      
		return circle;
	}

}
