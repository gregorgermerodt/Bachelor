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

	public Circle(Point initLocation, double initRadius) 
	{
		location = initLocation;
		radius = initRadius;
	}

	public double getRadius() 
	{
		return radius;
	}

	public void setRadius(double newRadius) 
	{
		radius = newRadius;
	}

	public Point getLocation() 
	{
		return location;
	}

	public void setLocation(Point newLocation) 
	{
		location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() 
	{
		double ergebnis;
		ergebnis = radius * 2;
		return ergebnis;
	}

	// Umfang
	public double getCircumference() 
	{
		double ergebnis;
		ergebnis = 2 * Math.PI * radius;
		return ergebnis;
	}

	// Fläche
	public double getArea() 
	{
		double ergebnis;
		double pi;

		ergebnis = Math.pow (radius,2);
		pi = Math.PI * ergebnis;
		
		return pi;
	}

	public boolean containsPoint(Point point) 
	{
		boolean ergebnis = false;
		
		if(point.getDistance(location) <= radius)
		{
			ergebnis = true;
		}
		return ergebnis;
	}

	public static Circle fromPoints(Point center, Point p) 
	{
		Circle circle = new Circle();
		
		circle.setLocation(center);
		double radius;
		radius = center.getDistance(p);
		circle.setRadius(radius);

		return circle;
	}

}
