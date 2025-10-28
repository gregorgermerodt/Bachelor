/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle 
{
	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() 
	{
		
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
		return 2*radius;
	}
	// Umfang
	public double getCircumference() 
	{
		return Math.PI*this.getDiameter();
	}
	// Fläche
	public double getArea() 
	{
		return radius*radius*Math.PI;
	}
	public boolean containsPoint(Point point) 
	{	
		if(this.location.getDistance(point)<this.radius)
		{
			return true;
		}
		return false;
	}
	public static Circle fromPoints(Point center, Point p) 
	{
		Circle circle = new Circle();
		circle.location = center;
		circle.radius = center.getDistance(p);
		// An dieser Stelle das circle-Objekt bearbeiten
		return circle;
	}
}