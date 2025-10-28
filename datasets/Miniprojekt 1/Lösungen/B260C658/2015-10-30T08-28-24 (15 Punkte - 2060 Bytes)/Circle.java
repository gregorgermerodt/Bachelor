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
		this.getLocation();
		this.setRadius(initRadius);
	}

	public double getRadius() {
		return this.getRadius();
		
	}

	public void setRadius(double newRadius) {
		this.setRadius(newRadius);
		
	}

	public Point getLocation() {
		return this.getLocation();
	}

	public void setLocation(Point newLocation) {
		this.setLocation(newLocation);
	}
	
	// Durchmesser
	public double getDiameter() {
		return -1.0;
	}

	// Umfang
	public double getCircumference() {
			double c = 0;
		 c = (2*Math.PI*this.getRadius());
		return c;
	}

	// Fläche
	public double getArea() {
		
		double a = 0;
		
		a = Math.PI*(Math.pow(this.getRadius(), 2));
		
		return a;
		
		
	}

	public boolean containsPoint(Point point) {
		if (point.getDistance(point)<= this.getCircumference()){
			return true;
		}
		else{
			return false;
		}
		
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		
		
		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
