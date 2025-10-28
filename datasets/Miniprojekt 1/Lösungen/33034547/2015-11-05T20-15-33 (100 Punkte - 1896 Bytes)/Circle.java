 
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
		this.location=initLocation;
		this.radius=initRadius;

	}
		public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius=newRadius;
	}

	public Point getLocation() {
		return location;
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
		return Math.PI*2*radius;
	}

	// Fläche
	public double getArea() {
		return Math.pow(radius, 2)*Math.PI;
	}

	public boolean containsPoint(Point point) {
		boolean gut=true;
		boolean nicht_gut=false;
		gut=point.getDistance(location)<radius;
		nicht_gut=point.getDistance(location)>radius;
		return gut;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		double mittel;
		mittel=p.getDistance(center);

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle=new Circle(center,mittel);
	}

}
