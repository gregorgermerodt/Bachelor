/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;
	private double dia;
	private double cir;
	private double area;

	public Circle() //Standardkonstruktor
	{
		
	}

	public Circle(Point initLocation, double initRadius) //Konstruktor mit übergebenen Parametern
	{
		location = initLocation;
		radius = initRadius;
	}

	public double getRadius() //get-Methode für den Radius
	{
		return radius;
	}

	public void setRadius(double newRadius) //set-Methode für den Radius
	{
		radius = newRadius;
	}

	public Point getLocation() //get-Methode für den Mittelpunkt
	{
		return location;
	}

	public void setLocation(Point newLocation) //set-Methode für den Mittelpunkt
	{
		location = newLocation;
	}
	
	public double getDiameter()  //Berechnung des Durchmessers
	{
		dia = radius*2;
		return dia;
	}

	public double getCircumference() //Berechnung des Umfangs
	{
		cir = Math.PI*radius*2;
		return cir;
	}

	public double getArea() //Berechnung des Flächeninhalts
	{
		area = Math.PI*radius*radius;
		return area;
	}

	public boolean containsPoint(Point point) //Überprüfung ob der Punkt innerhalb des Kreises liegt
	{
		if (location.getDistance(point)<=radius)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) //Erzeugt ein neues Objekt der Klasse Circle mit Hilfe zweier Punkte
	{
		Circle circle = new Circle();
		circle.setLocation(center);			
		circle.setRadius(circle.location.getDistance(p));
		
		return circle;
	}

}
