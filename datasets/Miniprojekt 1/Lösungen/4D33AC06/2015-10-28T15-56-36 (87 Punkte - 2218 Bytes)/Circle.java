/**
 * Definiert einen Kreis �ber einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {										//nicht verändern!
	}

	public Circle(Point initLocation, double initRadius) {

		location = initLocation;						//Parameter übergeben
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
		return this.getRadius() * 2;
	}

	// Umfang
	public double getCircumference() {
		return 2 * Math.PI * this.getRadius();
	}

	// Fl�che
	public double getArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	public boolean containsPoint(Point point) {
		
		if(point.getX() < this.location.getX() + this.radius
				&& point.getY() < this.location.getY() + this.radius
				)
		{
			return true;
		}
		
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		circle.setLocation(center);						//Der Mittelpunkt des so erzeugten Kreises ist center
		double hilfe = center.getDistance(p);
		circle.setRadius(hilfe);
		
		return circle;
	}

}
