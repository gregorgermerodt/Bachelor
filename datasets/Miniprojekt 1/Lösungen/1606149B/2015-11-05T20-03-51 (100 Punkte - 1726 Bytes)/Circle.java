public class Circle {

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
		location= newLocation;
	}


	public double getDiameter() {

		return 2*radius;
	}


	public double getCircumference() {

		return Math.PI* getDiameter();
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public boolean containsPoint(Point point) {
		if((location.getX() - radius)< point.getX() && point.getX() < (location.getX() + radius) && (location.getY() - radius)< point.getY() && point.getY() < (location.getY() + radius)){
			return true;
		}
		else{
		return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.location = center;
		circle.radius = Math.sqrt(Math.pow(p.getX() - center.getX() , 2) + Math.pow(p.getY() - center.getY(), 2));

		return circle;
	}

}