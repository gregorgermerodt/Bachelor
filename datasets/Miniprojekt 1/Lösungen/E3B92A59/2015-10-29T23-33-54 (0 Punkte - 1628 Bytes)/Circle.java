/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class circle {

	// Mittelpunkt des Kreises
	private point location;
	private double radius;

	public circle() {
	}

	public circle(point initLocation, double initRadius) {
		
		location=initLocation;
		radius = initRadius;

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius=newRadius;
	}

	public point getLocation() {
		return new point();
	}

	public void setLocation(point newLocation) {
		location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return -1.0;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI* Math.pow(radius, 2);
	}

	// Fläche
	public double getArea() {
		return Math.PI * radius;
	}

	public boolean containsPoint(point point) {
	if (location.getDistance(point)>radius){
		return false;
	}
	else return true;
	}

	public static circle fromPoints(point center, point p) {
		circle circle = new circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
