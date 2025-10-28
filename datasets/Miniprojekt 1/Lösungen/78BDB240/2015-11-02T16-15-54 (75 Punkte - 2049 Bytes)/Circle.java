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
		double dmeter =0.0;
		dmeter = 2* radius;
		
		return dmeter;
	}

	// Umfang
	public double getCircumference() {
		double umfang = 0.0;
		umfang = Math.PI * getDiameter();
		
		return umfang;
	}

	// Fläche
	public double getArea() {
		
		double aire = 0.0;
		aire = Math.PI * Math.pow(radius, 2);
		
		return aire;
	}

	public boolean containsPoint(Point point) {
		if(point.getDistance(point) >= radius){
			
		
		return false;
	  	}
		else {
			return true;
		}
		
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		
		circle.setLocation(center);
		
		
		

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
