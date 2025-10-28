
public class Circle {

	private static Point location;
	private static double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {

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
		return Math.PI*getDiameter();
	}
	// Fläche
	public double getArea() {
		return Math.PI*Math.pow(radius,2);
	}

	public boolean containsPoint(Point point) {
		if(point.getDistance(location)<=radius)
		{return true;
		}
		else
		{ return false;
		} 
		};
	

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		location = center;
		radius = p.getDistance(center);
		circle = new Circle(location,radius);

		return circle;
	}

}
