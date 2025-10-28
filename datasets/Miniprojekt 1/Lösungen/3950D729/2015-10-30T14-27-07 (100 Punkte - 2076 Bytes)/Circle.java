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
		return this.radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public Point getLocation() {
		Point gl = new Point();
		gl = this.location;
		return gl;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return 2*this.radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*this.getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI*Math.pow(this.radius, 2);
	}

	public boolean containsPoint(Point point) {
		double dis = this.location.getDistance(point);
		if(dis < this.radius)
		{
			return true;
		}
		else return false;
		
	
	}
	
	

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		double radius = center.getDistance(p);
		circle.setRadius(radius);
		circle.setLocation(center);

		return circle;
	}

}
