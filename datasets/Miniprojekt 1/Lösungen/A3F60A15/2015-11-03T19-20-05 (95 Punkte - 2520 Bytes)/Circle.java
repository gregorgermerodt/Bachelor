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
		//location = new Point();
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

	public Point getLocation() //Mittelpukt des Kreises mit Koordinaten von getX und getY
		{
		return new Point(location.getX() , location.getY());
		}

	public void setLocation(Point newLocation) 
		{
		//location.setX(newLocation.getX()); 
		//location.setY(newLocation.getY());
		
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
		double U = Math.PI*getDiameter();
		return U;
		}

	// Fläche
	public double getArea() 
		{
		return Math.PI*radius*radius;
		}

	public boolean containsPoint(Point point) 
		{
		return (location.getDistance(point) <= radius);
		//if(location.getDistance(point) <= radius){return true;}
		//else {return false;}//wir brauchen kein else, da die Funktion diesen Punkt nie erreciht und bei return true endet
		}

	public static Circle fromPoints(Point center, Point p) 
		{
		Circle circle = new Circle();
		
		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));
		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
		}

}
