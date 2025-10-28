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
		double r=this.radius;
		return r;
	}

	public void setRadius(double newRadius) {
		this.radius=newRadius;
	}

	public Point getLocation() {
		Point l=this.location;
		return l;
	}

	public void setLocation(Point newLocation) {
		this.location=newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double r=this.radius;
		return r*2;
	}

	// Umfang
	public double getCircumference() {
		double u=getDiameter();
		return u*Math.PI;
	}

	// Fläche
	public double getArea() {
		double a=getRadius();
		return a*a*Math.PI;
	}

	public boolean containsPoint(Point point) {
		if(location.getX()+this.radius>=point.getX()&&location.getY()+this.radius>=point.getY()&&location.getX()-this.radius<=point.getX()&&location.getY()-this.radius<=point.getY()) {
			return true;
		}
		else return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
