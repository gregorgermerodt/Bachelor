

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

	public void setLocation(Point location) {
		this.location = location;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	//Methode getDiameter Implementierung
	
	public double getDiameter()
	{
		return 2*radius;
	}
	
	// Die Methode getCircumfence
	
	public double getCircumfence()
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
	
	public void fromPoint(Point center, Point p)
	{
		double abstand ;
		
		abstand = center.getDistance(p);
		System.out.println("Der Kreis mit diameter "+ 2*abstand + " wird erzeught");
	}
	
}
