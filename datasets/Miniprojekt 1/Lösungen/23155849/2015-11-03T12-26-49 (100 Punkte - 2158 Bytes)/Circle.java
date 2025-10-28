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
		return 2*radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*2*radius;
	}

	// Fläche
	public double getArea() {
    	return Math.PI*radius*radius;
	}

	public boolean containsPoint(Point point) {
		if(point.getDistance(location)<=radius)
			return true;
		else{
		return false;}
	}

	public static Circle fromPoints(Point center, Point p) {
		double distX = p.getX()- center.getX();
		double distY = p.getY()- center.getY();
		double distRaw = Math.pow(distX,2)+Math.pow(distY,2);
		double dist = Math.sqrt(distRaw);
		Circle circle = new Circle();
		circle.setRadius(dist);
		circle.setLocation(center);

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
