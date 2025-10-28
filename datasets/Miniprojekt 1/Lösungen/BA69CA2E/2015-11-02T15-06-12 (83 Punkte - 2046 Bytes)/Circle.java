
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
		this.radius = initRadius;

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double diameter;
		diameter = radius*2;
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		double kreisUmfang = 2*Math.PI*radius;
		return kreisUmfang;
	}

	// Fläche
	public double getArea() {
		double kreisFlaeche = Math.PI * Math.pow(radius, 2);
		return kreisFlaeche;
	}

	public boolean containsPoint(Point point) {
		if(location.getDistance(point) >= radius){
			return true;
		}
		else
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));

		return circle;
	}

}
