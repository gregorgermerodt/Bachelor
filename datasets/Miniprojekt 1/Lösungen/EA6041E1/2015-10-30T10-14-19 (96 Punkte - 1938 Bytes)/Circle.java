import java.io.ObjectInputStream.GetField;

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
	
	public double getDiameter() {
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		double U = Math.PI*getDiameter();
		return U;
	}

	// Fläche
	public double getArea() {
		double A = Math.PI*Math.pow(radius, 2);
		return A;
	}

	public boolean containsPoint(Point point) {
		
		if (point.getDistance(location) < radius){
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
