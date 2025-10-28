public class Circle {

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
		return this.location;
	}

	public void setLocation(Point newLocation) {
		this.location= newLocation;
	}


	public double getDiameter() {

		return 2*this.radius;
	}


	public double getCircumference() {

		return Math.PI* getDiameter();
	}

	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
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