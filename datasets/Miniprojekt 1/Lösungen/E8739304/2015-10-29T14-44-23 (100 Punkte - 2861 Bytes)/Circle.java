/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;
	private double d;
	private double u;
	private double a;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
		this.location = initLocation;
		this.radius = initRadius;
	}

	public double getRadius() {
		// Radius zurückgeben.
		return radius;
	}

	public void setRadius(double newRadius) {
		// Radius einen neuen Wert zuweisen.
		this.radius = newRadius;
	}

	public Point getLocation() {
		// Location zurückgeben.
		return location;
	}

	public void setLocation(Point newLocation) {
		// Location einen neuen Wert zuweisen.
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		d = 2 * radius;
		return d;
	}

	// Umfang
	public double getCircumference() {
		u = 2 * Math.PI * radius;
		return u;
	}

	// Fläche
	public double getArea() {
		a = Math.PI * Math.pow(radius, 2);
		return a;
	}

	public boolean containsPoint(Point point) {
		// Falls die Location des Punktes kleiner oder gleich des Radius ist, dann liegt der Punkt
		// im Kreis, ansonsten nicht.
		if(location.getDistance(point) <= radius){
			return true;
		}else{
		
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		
		//Location und Radius neue Werte zuweisen.
			circle.setLocation(center);
			circle.setRadius(center.getDistance(p));
			
		return circle;
	}

}
