/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle()
	{
		
	}

	public Circle(Point initLocation, double initRadius)
	{
		setRadius(initRadius);
		setLocation(initLocation);
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
		return radius*2;
	}

	// Umfang
	public double getCircumference() 
	{
		return Math.PI*2*radius;
	}

	// Fläche
	public double getArea() 
	{
		return Math.PI*radius*radius;
	}

	public boolean containsPoint(Point point) 
	{
		double d;
		d = point.getDistance(location);
		if(d>radius)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public static Circle fromPoints(Point center, Point p) 
	{
		double d1;
		d1 = p.getDistance(center);
		Circle circle = new Circle(center, d1);

		return circle;
	}

}
