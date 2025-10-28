/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
		//location = new Point ();
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
		//return new Point (location.getX(), location.getY());
		//wir erstellen einen neuen Punkt, der Mittelpunkt vom Kreis.
	}

	public void setLocation(Point newLocation) {
		// location.setX(newLocation.getX());
		// location.setY(newLocation.getY());
	}
	
	
	// Durchmesser
	public double getDiameter() {
		return 2*radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI*radius*radius;
	}

	public boolean containsPoint(Point point) {
		return (location.getDistance(point) <= radius);
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.setLocation( center);
		circle.setRadius(p.getDistance(p));

		return circle;
   }
}
