

public class Circle {
	
	private Point location;
	private double radius;
	
	//Der Standardkonstruktor
	
	public Circle(Point initLocation, double initRadius)
	{
		this.location = initLocation;
		this.radius= initRadius;
	}
	
	//Setters und Getters Methoden

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newlocation) {
		this.location = newlocation;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newradius) {
		this.radius = newradius;
	}
	
	
	//Methode getDiameter Implementierung
	
	public double getDiameter()
	{
		return 2*radius;
	}
	
	// Die Methode getCircumfence
	
	public double getCircumference()
	{
		return 2*Math.PI*radius;
	}
	
	//Die Methode getArea()
	
	public double getArea()
	{
		return Math.PI*radius*radius;
		
	}
	
	// Die Methode containsPoint
	
	public boolean containsPoint(Point point)
	{
		return (location.getDistance(point)<= radius);
	}

	// Die Methode fromPoint
	
	public void fromPoints(Point center, Point p)
	{
		double abstand ;
		
		abstand = center.getDistance(p);
		System.out.println("Der Kreis mit diameter "+ 2*abstand + " wird erzeught");
	}
	
}
