public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
		location = initLocation;
		radius = initRadius;

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;   
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double Durchmesser = radius * 2;
		return Durchmesser;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI * 2 * radius;
		
	}

	// Fläche
	public double getArea() {
		double Fläche = (Math.PI * radius) * (Math.PI * radius);
		return Fläche; 
	
	}

	public boolean containsPoint(Point point) {
		if (location.getDistance(point) <= radius) {
			return true;
		}
		else 
		{
		return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		
		 Circle circle = new Circle(center, p.getDistance(center)); 
		
	
		return circle;
	}

}    
    