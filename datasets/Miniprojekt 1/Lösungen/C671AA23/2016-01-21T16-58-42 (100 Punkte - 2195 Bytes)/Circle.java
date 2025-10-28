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
			this.location = initLocation;
			this.radius = initRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

		public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double r = this.getRadius();
		double d = 2*r;
		return d;
	}

	// Umfang
	public double getCircumference() {
		double umfang = this.getDiameter()*Math.PI;
		return umfang;
	}

	// Fl�che
	public double getArea() {
		double area = Math.PI * this.getRadius()* this.getRadius();
		return area;
	}

	public boolean containsPoint(Point point) {
		double maxx,minx,maxy,miny,r;
		r = this.getRadius();
		maxx = this.location.getX() + r;
		maxy = this.location.getY() + r;
		minx = this.location.getX() - r;
		miny = this.location.getY() - r;
		if(point.getX() >= minx && point.getX() < maxx 
				&& point.getY() >= miny && point.getY() < maxy  )
			return true;
		else 
			return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.location = center;
		circle.radius = center.getDistance(p);
		return circle;
	}

}

