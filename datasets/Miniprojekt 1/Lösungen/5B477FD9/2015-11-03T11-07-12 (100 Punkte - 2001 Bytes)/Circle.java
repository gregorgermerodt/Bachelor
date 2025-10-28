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
			location = initLocation;
			radius = initRadius;
	}

	public double getRadius() {
		return this.radius;
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
		
		return 2*this.radius;
	}

	// Umfang
	public double getCircumference() {
		return 2*this.radius*Math.PI;
	}

	// Fläche
	public double getArea() {
		return (this.radius*this.radius)*Math.PI;
	}

	public boolean containsPoint(Point point) {
	
			if(location.getDistance(point)<= radius){
					return true;
				}
			else{
			return false;
			}
		}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle(center,center.getDistance(p));

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
