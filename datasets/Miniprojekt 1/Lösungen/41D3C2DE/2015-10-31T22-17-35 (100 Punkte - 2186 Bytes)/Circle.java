/**
 * Definiert einen Kreis �ber einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises, Klassenvariablen
	private Point location; // location beinhaltet x und y
	private double radius;

	public Circle() {
	}
		// ab hier bearbeiten
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
		double a;
		a = radius * 2;
		return a;
	}

	// Umfang
	public double getCircumference() {
		double u;
		u = 2 * Math.PI * radius ;
		return u;
	}

	// Flaeche
	public double getArea() {
		double a;
		a = Math.PI * Math.pow(radius, 2);
		return a;
	}


	 public boolean containsPoint(Point point) {
	
		 if (point.getDistance(location) <= radius) {
			 return true;
		 }else{
			return false;
		}
	 }
	 
	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.location = center;
		circle.radius = center.getDistance(p);
		return circle;
	} 

} 
