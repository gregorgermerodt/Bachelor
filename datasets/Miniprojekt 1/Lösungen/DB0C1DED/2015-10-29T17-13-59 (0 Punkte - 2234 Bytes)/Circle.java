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
      location = initLocation ;
      radius = initRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	public Point getLocation() {
		return new Point();
	}

	public void setLocation(Point newLocation) {
		locations = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return -1.0;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI;
	}

	// Fläche
	public double getArea() {
		return -1.0;
	}

	public boolean containsPoint(Point point) {
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}


	public double getDiameter() {
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		return (2*Math.PI*radius);
	}

	// Fläche
	public double getArea() {
		return (Math.PI*radius);
	}

	public boolean containsPoint(Point point) {
        zw = new Boolean;
        //
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
         // a= center
         //b=p
         nk= new circle(center , p ) 
		return circle;
	}

}
