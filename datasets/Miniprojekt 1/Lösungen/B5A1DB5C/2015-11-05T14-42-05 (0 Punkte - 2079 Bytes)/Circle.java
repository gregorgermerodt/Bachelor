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
		this.radius=initRadius	;	

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
		return this.radius*2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*2*this.radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}

	public boolean containsPoint(Point point) {
		return this.radius>=Math.sqrt(
				point.getX()-location.getX())*
				point.getX()-location.getX()+
				point.getY()-location.getY()*
				point.getY()-location.getY();
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.location=center;
		circle.radius=Math.sqrt(
				center.getX()-p.getX()*
				center.getX()-p.getX()+
				center.getY()-p.getY()*
				center.getY()-p.getY());
		
		return circle;
	}

}
