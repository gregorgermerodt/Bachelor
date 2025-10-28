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
		
		double Diameter = radius *2;
		
		return Diameter;
	}

	// Umfang
	public double getCircumference() {
		
		double U = Math.PI * getDiameter();
		
		return U;
	}

	// Fl�che
	public double getArea() {
								// getRadius = r
		double A = Math.PI * (radius*2);
		
		return A;
	}

	public boolean containsPoint(Point point) {
		//|PM|hoch2=(x −x )2 +(y −y )2
		double i = Math.pow(point.getX()-location.getX(),2) + Math.pow(point.getY() - location.getY(),2);
		double j = Math.pow(radius, 2);
		
		if (i < j)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		
		
		Circle circle = new Circle(center, p.getDistance(center));

		

		return circle;
	}

}
