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
		location = initLocation;
		radius = initRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public Point getLocation() {
		return new Point();
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}

	// Durchmesser
	public double getDiameter() {
		double erg = 0;
		erg = radius * 2;
		return erg;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*getDiameter();
	}

	// Fläche
	public double getArea() {
		double erg =0;
		erg=Math.PI*radius*radius;
		return erg;
	}

	public boolean containsPoint(Point point) {
		if(getLocation().getDistance(point)>getRadius()){
			return false;
		}	
		else{
		return true;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		// An dieser Stelle das circle-Objekt bearbeiten
		
		circle.setLocation(center);	
		circle.containsPoint(p);
		
		return circle;
	}

}