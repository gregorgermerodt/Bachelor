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

		initLocation = location;
		initRadius = radius;
		
	}

	public double getRadius() {
		
		return radius;
	
	}

	public void setRadius(double newRadius) {
	
		newRadius = radius;
		
	}

	public Point getLocation() {
		
		return location;
	
	}

	public void setLocation(Point newLocation) {
	
		newLocation = location;
		
	}
	
	// Durchmesser
	public double getDiameter() {
		
		double durchmesser;
		
		durchmesser = 2 * radius;
		
		return durchmesser;
	
	}

	// Umfang
	public double getCircumference() {
		
		double kreisUmfang;
		
		kreisUmfang = 2 * Math.PI * radius;
		
		return kreisUmfang;
	
	}

	// Fläche
	public double getArea() {
		
		double flaechenInhalt;
		
		flaechenInhalt = Math.PI * Math.pow(radius, 2);
		
		return flaechenInhalt;
	
	}

	public boolean containsPoint(Point point) {
	
		if (location.getDistance(point) <= radius)
				
				return true;
		
		else
		
		return false;
	
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));

		return circle;
	}

}
