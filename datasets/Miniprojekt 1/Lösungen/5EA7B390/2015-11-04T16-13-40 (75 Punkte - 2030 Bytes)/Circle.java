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
		return 0.0;
		
		
		
	}

	// Umfang
	public double getCircumference() {
		return 0.0;
		
		
	}

	// Fläche
	public double getArea() {
		return 0.0;
		
	}

	public boolean containsPoint(Point point) {
		
		/*if(){
			return true;
		}
		else{
			return false;
		}*/
		
		if((location.getX() - radius)< point.getX() && point.getX() < (location.getX() + radius) && (location.getY() - radius)< point.getY() && point.getY() < (location.getY() + radius)){
			return true;
		}
		else{
		return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
