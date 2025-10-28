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
		
		double m = 2 * getRadius();
		
		return m;
	}

	// Umfang
	public double getCircumference() {
		
		return Math.PI * getDiameter();
	}

	// Fläche
	public double getArea() {
		double a; 
		a = Math.PI * Math.pow(getRadius(), 2);
		
				
		return a;
	}

	public boolean containsPoint(Point point) {
		
		double dp = Math.sqrt(Math.pow((location.getX() - point.getX()), 2) + Math.pow((location.getY() - point.getY()), 2)); 
		
		if(dp <= getRadius()){
			return true; 
			
		}
		
			
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.location = center;
		
		double cr = circle.getRadius();
		
		double ca = Math.sqrt((Math.pow((p.getX() - center.getX()) ,2) + Math.pow((p.getY() - center.getY()), 2)));
		
		cr = ca;
		
		

		return circle;
	}

}
