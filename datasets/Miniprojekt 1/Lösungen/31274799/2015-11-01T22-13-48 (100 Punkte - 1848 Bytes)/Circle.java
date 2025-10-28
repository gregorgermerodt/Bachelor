
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
		double diameter;
		diameter = 2 * radius;
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		double circumference;
		circumference = 2 * Math.PI * radius;
		return circumference;
	}

	// Fl�che
	public double getArea() {
		double area;
		area = Math.PI * radius * radius;
		return area;
	}

	public boolean containsPoint(Point point) {
		boolean critical;
		double distance;
		distance = location.getDistance(point);
			if (distance <= radius)
			{ critical = true; }
			else
			{ critical = false; }
		return critical;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.location = center;
		circle.radius = center.getDistance(p);
		return circle;
	}

}
