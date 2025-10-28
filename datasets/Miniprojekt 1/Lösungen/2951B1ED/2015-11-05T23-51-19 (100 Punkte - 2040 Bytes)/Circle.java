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
 location= initLocation;
 radius= initRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
	this.radius= newRadius;
	}

	public Point getLocation() {
		
		return location;
	}

	public void setLocation(Point newLocation) {
	this.location= newLocation;
	
	}
	
	// Durchmesser
	public double getDiameter() {
	double ergebnis = 2*radius;
		
		return ergebnis;
	}

	// Umfang
	public double getCircumference() {
		double ergebnis = 2*Math.PI*radius;
		
		return ergebnis;
	}

	// Fläche
	public double getArea() {
		double ergebnis = Math.PI*Math.pow(radius, 2);
		
		
		return ergebnis;
	}

	public boolean containsPoint(Point point) {
		if (location.getDistance(point)<=radius) {
			return true;
			
		}
		else {return false;}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		/*An dieser Stelle das circle-Objekt bearbeite*/
        circle.location=center;
        circle.radius=center.getDistance(p);
		
		return circle;
	}

}
