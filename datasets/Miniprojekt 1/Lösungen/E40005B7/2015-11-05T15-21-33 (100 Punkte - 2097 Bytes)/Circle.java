/**
 * Definiert einen Kreis �ber einen Radius und einem Mittelpunkt in einem
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
	radius=newRadius;}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
	location=newLocation;}
	
	// Durchmesser
	public double getDiameter() {
		return 2*getRadius();
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*getDiameter();
	}

	// Flaeche
	public double getArea() {
		return Math.pow(radius,2) * Math.PI;
		
	}

	public boolean containsPoint(Point point) {
		if (point.getDistance(location)<=radius)
			return true;
		else return false;
		
		//if (location.getX()<= radius && location.getY()<= radius)
		//	return true; 
		//else return false; 
			
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		
		circle.setLocation(center);
		double radius=p.getDistance(center);
		circle.setRadius(radius);
		return circle;
									// Meine falsche Lösung
									//circle.location=center;
									//circle.radius=p.getDistance(p);
										//	return circle;
	}

}
