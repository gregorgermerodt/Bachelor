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
		double a= radius*2;
		return a;
	}

	// Umfang
	public double getCircumference() {
		double a = 2*Math.PI*radius;
		return a;
		
	}

	// Fläche
	public double getArea() {
		double a = Math.PI* Math.pow(radius, 2);
		return a;
	}

	public boolean containsPoint(Point point) {
		if( point.getDistance(this.getLocation()) <= radius ){
			return true;
		}
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
        circle.location = center;
        circle.radius = p.getDistance(center);
		

		return circle;
		
	}

}
