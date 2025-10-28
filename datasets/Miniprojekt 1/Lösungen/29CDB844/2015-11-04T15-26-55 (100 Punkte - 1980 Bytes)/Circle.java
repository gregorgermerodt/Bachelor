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
		location = initLocation;
		radius = initRadius ;

	}

	public double getRadius() {
		return  radius ;
	}

	public void setRadius(double newRadius) {
		radius = newRadius ; 
	}

	public Point getLocation() {
		return  location ;
	}

	public void setLocation(Point newLocation) {
		location = newLocation ;
	}
	
	// Durchmesser
	public double getDiameter() {
		return  ( radius * 2 );
	}

	// Umfang
	public double getCircumference() {
		return ( 2 * Math.PI * radius );
	}

	// Fl�che
	public double getArea() {
		return ( Math.PI * radius * radius );
	}

	public boolean containsPoint(Point point) {
		if  (( location.getDistance(point) - radius ) > 0) {
			return false;
		}
		else {
			return true ; 
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle Kreis = new Circle();
		
		
		// An dieser Stelle das circle-Objekt bearbeiten
		double a = center.getDistance(p);
		Kreis.setRadius(a); 
		Kreis.setLocation(center) ; 
		return Kreis;
		
	}

}
