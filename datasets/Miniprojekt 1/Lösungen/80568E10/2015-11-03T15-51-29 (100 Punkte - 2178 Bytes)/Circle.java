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
		
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		
		return 2*Math.PI*radius;
	}

	// Fläche
	public double getArea() {
		
		return Math.PI*(Math.pow(radius,2));
	}

	public boolean containsPoint(Point point) {
		
		boolean imKreis = false;
		
		if (Math.pow(point.getX() - location.getX(),2) + Math.pow(point.getY() - 
				location.getY(),2) < Math.pow(radius,2))
		{
			imKreis = true;
		}
		else
		{
			imKreis = false;
		}
		return imKreis;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		circle.setLocation(center);
		circle.setRadius(Math.sqrt(Math.pow(p.getX()- circle.location.getX(),2) + 
				Math.pow(p.getY()- circle.location.getY(),2)));
		
		return circle;
	}

}
