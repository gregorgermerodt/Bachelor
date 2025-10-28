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
		durchmesser = radius * 2;
		
		return durchmesser ;
	}

	// Umfang
	public double getCircumference() {
		
		double U;
		U = Math.PI * radius *2 ;
		return U;
	}

	// Fläche
	public double getArea() {
		double A;
		A = Math.PI * radius * radius;
		return A;
	}

	public boolean containsPoint(Point point) {
		
		boolean drinne;
		
		if (radius < point.getDistance(location)){
			drinne = false;
			
		}else{
		drinne = true;
		}
		return drinne; 
	}

	public static Circle fromPoints(Point center, Point p) {
		// An dieser Stelle das circle-Objekt bearbeiten

		double distance = center.getDistance(p);
		
		Circle circle= new Circle(center,distance);
		
		return circle;
	}
	

}
