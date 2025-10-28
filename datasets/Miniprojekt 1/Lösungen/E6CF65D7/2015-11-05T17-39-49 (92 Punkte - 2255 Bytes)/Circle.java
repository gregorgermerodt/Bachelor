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

	public Circle(Point initLocation, double initRadius) {
		
		this.location = initLocation;
		this.radius   = initRadius;

	}

	public double getRadius() {
		
		return this.radius;
		
	}

	public void setRadius(double newRadius) {
		
		this.radius = newRadius;
		
	}

	public Point getLocation() {
	
		return this.location;
		
	}

	public void setLocation(Point newLocation) {
		
		this.location = newLocation;
		
	}
	
	// Durchmesser
	public double getDiameter() {
		
		double D = this.radius*this.radius;
		
		return D;
		
	}

	// Umfang
	public double getCircumference() {
		
		double U = Math.PI*getDiameter();
		
		return U;
		
	}

	// Fläche
	public double getArea() {
		
		double A = Math.PI*(Math.pow(this.radius, 2));
		
		return A;
		
	}

	public boolean containsPoint(Point point) {
		
      
		if(getLocation().getDistance(point)>getRadius()) 
		
		{return false;}
		
		else {return true;}
		
	}

	public static Circle fromPoints(Point center, Point p) {
		
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		
		circle.setLocation(center);
		
		circle.setRadius(center.getDistance(p));
		
		;

		return circle;
		
	}

}
