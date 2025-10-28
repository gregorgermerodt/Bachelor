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
		initLocation = this.location;
		initRadius = this.radius;

	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double newRadius) 
	{
		newRadius = this.radius;
	}

	public Point getLocation() 
	{
		return this.location;
	}

	public void setLocation(Point newLocation) 
	{
		newLocation = this.location;
	}
	
	// Durchmesser
	public double getDiameter() {
		return this.radius *2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI * getDiameter();
	}

	// Fläche
	public double getArea() 
	{
		return Math.PI * Math.pow(this.radius,2);
	}

	public boolean containsPoint(Point point) 
	{
		if(point.getDistance(location) <= radius)
		{
			return true;
		}
		return false;
		
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center);
		double radius = center.getDistance(p);
		circle.setRadius(radius);

		

		return circle;
	}

}
