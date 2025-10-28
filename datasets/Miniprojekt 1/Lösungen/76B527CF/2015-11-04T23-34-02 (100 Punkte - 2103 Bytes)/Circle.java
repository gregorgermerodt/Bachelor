
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
		location =initLocation;
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
		return 2*radius;
	}

	// Umfang
	public double getCircumference() {
		double Pi = Math.PI;
		double d = 2*radius;
		double u = Pi*d;
		return u;
	}

	// Fläche
	public double getArea() {
		double r =radius;
		double Pi = Math.PI;
		double A = Pi *Math.pow(r, 2);
		return A;
	}

	public boolean containsPoint(Point point) {
		if(radius > point.getDistance(location))
		{
		return true;}	
		
		return false;
		}
	
	

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		Point newLocation;
		double newRadius;
		newLocation = center;
		newRadius =p.getDistance(center);
		 circle =new Circle(newLocation, newRadius);
		
				

		return circle;
	}

}
