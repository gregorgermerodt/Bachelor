
public class Circle {



//Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
		
	}

	public Circle(Point initLocation, double initRadius) {
		initLocation = location ;
		

	}

	public double getRadius() {
		return radius ;
	}

	public void setRadius(double newRadius) {
		newRadius = radius ;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		newLocation = location ; 
	}
	
	// Durchmesser
	public double getDiameter() {
		return Math.pow(radius, 2) ; 

	}

	// Umfang
	public double getCircumference() {
		return 2*Math.PI*radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI*radius*2;
	}

	public boolean containsPoint(Point point) {
		 if (location.getDistance(point) <=radius)
			 return true;
		 else
			 return false;
			 
		 }
	
	

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
