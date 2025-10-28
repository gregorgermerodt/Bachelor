import java.awt.Point;

/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	double a;
	double umfang;
	double durchmesser;
	scan2 = new Scanner(System.in);
	private Point location;
	private double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
		
		radius = initRadius;
		location = initLocation;

	}

	public double getRadius(double newRadius) {
		return newRadius;
	}

	public void setRadius(double newRadius, Scanner(System.in) scan2,double initRadius) {
		double newRadius = scan2.next();
		double initRadius = newRadius;
		
		
	}

	public Point getLocation() {
		return newLocation;
	}

	public void setLocation(Point newLocation, Scanner(System.in) scan2, double initLocation) {
		double newLocation = scan2.next();
		initLocation = newLocation;
	}
	
	// Durchmesser
	public double getDiameter(double radius,double durchmesser) {
		durchmesser = (2*Math.PI*radius)/Math.PI;
		return durchmesser;
	}

	// Umfang
	public double getCircumference(double umfang, double radius) {
		umfang = 2*Math.PI*radius;
		return umfang;
	}

	// Fläche
	public double getArea(double a) {
		a = Math.PI*(radius)²;
		return a;
	}

	public boolean containsPoint(Point point, double a) {
		if point.x < a
		{
			return true;
		}
		else
		{
		return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
