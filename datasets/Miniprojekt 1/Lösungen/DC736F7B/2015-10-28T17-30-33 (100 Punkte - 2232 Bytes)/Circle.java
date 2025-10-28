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
		this.location=initLocation;
		this.radius=initRadius;

	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double newRadius) {
		this.radius=newRadius;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point newLocation) {
		this.location=newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		double res=0.0;
		res=2*Math.PI*radius;
		return res;
	}

	// Fläche
	public double getArea() {
		double res=0.0;
		res=Math.pow(radius, 2)*Math.PI;
		return res;
	}

	public boolean containsPoint(Point point) {
		boolean res=true;
		double vergl=0.0;
		vergl=Math.pow(point.getX()-location.getX(),2)+Math.pow(point.getY()-location.getY(),2);
		vergl=Math.sqrt(vergl);
		if(vergl>radius)res=false;
		return res;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		circle.setLocation(center);
		double res=0.0;
		res=Math.pow(center.getX()-p.getX(), 2)+Math.pow(center.getY()-p.getY(), 2);// An dieser Stelle das circle-Objekt bearbeiten
		res=Math.sqrt(res);
		circle.setRadius(res);
		return circle;
	}

}
