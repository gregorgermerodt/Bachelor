/**
 * Definiert einen Kreis ¸ber einen Radius und einem Mittelpunkt in einem
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
		this.location = initLocation;
		this.radius = initRadius;
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
		return radius * 2;
	}

	// Umfang
	public double getCircumference() 
	{
		return 2 * Math.PI * radius;
	}

	// Fl‰che
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) 
	{								//IDEE: Distanz zwischen aktuellem Punkt und *point* darf nicht größer als der Radius sein.
									//FRAGE:Wie kommt man an die die Position des aktuellen Punktes?
									//		Bzw. i.A. wie zeigt man auf das aktuelle Objekt?
		Circle varCircle = new Circle();
		if(varCircle.getRadius() <= varCircle.getDistance(point))
		{
			return true;
		}
		
		return false;
	}

	public static Circle fromPoints(Point center, Point p) 
	{
		Circle circle = new Circle();	//Wir erzeugen einen neuen Kreis namens "circle"

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);		//Die Position bzw. Location des erzeugten Kreises wird durch den Punkt namens "center" definiert 
		circle.setRadius(p.getDistance(p)); /*Wenn *radius von circle* = *Distanz von p* (zum aktuellen Punkt *center*), 
								  			  dann liegt p genau auf dem Kreisrand, weil der Radius immer gleich ist*/
		return circle;
	}

}
