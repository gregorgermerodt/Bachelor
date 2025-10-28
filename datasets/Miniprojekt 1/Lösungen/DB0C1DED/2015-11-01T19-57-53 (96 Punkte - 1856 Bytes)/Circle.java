
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
		radius= newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return (radius*2);
	}

	// Umfang
	public double getCircumference() {
		return (Math.PI*2*radius);
	}

	// Fl�che
	public double getArea() {

		return (Math.PI*(radius+radius));
	}

	public boolean containsPoint(Point point) {
		//double x1 = point.getX();
		//double y1 = point.getY();
         double zw1= location.getDistance(point);
         if(zw1<=radius){
        	return true;
         }
         else 
		  return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		double r2 = 0;
		r2 =center.getDistance(p);
		Circle circle = new Circle(center, r2 );

		

		return circle;
	}

}
