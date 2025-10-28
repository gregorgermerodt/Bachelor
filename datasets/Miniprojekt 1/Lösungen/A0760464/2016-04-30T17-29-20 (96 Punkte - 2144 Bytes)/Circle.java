/**
 * Definiert einen Kreis ¸ber einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
           this.location= initLocation;
           this.radius = initRadius;
	
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
		
		location =  newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return 2*radius;
	}

	// Umfang
	public double getCircumference() {
		return 2*Math.PI*radius;
	}

	// Fl‰che
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) {
	       
		Circle circle = new Circle();
if ( (location.getX() - point.getX())*(location.getX()-point.getX()) + (location.getY()-point.getY())*(location.getY()-point.getY())  <  Math.pow(getRadius(), 2)) 
		{
			return true;
		}
		
		
		return false;
		
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
		
		
	    circle.setRadius(Math.sqrt((center.getX()-p.getX())*(center.getX()-p.getX()) - (center.getY()-p.getY())*(center.getY()-p.getY())));

		return circle;
	}

}
