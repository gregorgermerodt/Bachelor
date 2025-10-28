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
		ergebnis = Math.PI * this.getDiameter();
		return ergebnis;
	}

	// Fläche
	public double getArea() 
	{
		double ergebnis;
		ergebnis = Math.PI * Math.pow(radius, 2);
		return ergebnis;
	}

	public boolean containsPoint(Point point) 
	{
		boolean contains = false;
		
		if (point.getDistance(location) <= radius)
		{
			contains = true;
		}
		return contains;
	}

	public static Circle fromPoints(Point center, Point p) 
	{
		Circle circle = new Circle();

		circle.location = center;
		circle.radius = p.getDistance(center);

		return circle;
	}

}
