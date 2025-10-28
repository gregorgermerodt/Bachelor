/**
 * Definiert einen Kreis �ber einen Radius und einem Mittelpunkt in einem
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
		radius=newRadius;
	}

	public Point getLocation() {
		return new Point();
	}

	public void setLocation(Point newLocation) {
		location=newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		return 2*Math.PI*radius;
	}

	// Fl�che
	public double getArea() {
		return Math.PI*radius*radius;
	}

	public boolean containsPoint(Point point) {
			if (point.getDistance(point)<=radius)
				return true;
			return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		//location=center;
		//radius=java.awt.Point.distance(, y1, x2, y2)
// hier muss Center der Mittelpunkt des Kreises sein und der Radius 
		//wird auf den Abstand von p und center gesetzt
		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
