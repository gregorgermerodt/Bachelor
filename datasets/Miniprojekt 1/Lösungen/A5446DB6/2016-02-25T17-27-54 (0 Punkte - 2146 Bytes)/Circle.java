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
		return this.radius;
	}

	public void setRadius(double newRadius) {
        this.radius = newRadius;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point newLocation) {
        this.location = newLocation;     
 	}
	
	// Durchmesser
	public double getDiameter() {
		return this.radius*2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*this.getDiameter();
	}

	// Fl�che
	public double getArea() {
		return Math.PI*this.getRadius()*this.getRadius();
	}

	public boolean containsPoint(Point point) {
        if(location.getDistance(point) < getRadius()){
                return true;
        } else {
		return false;
	} }

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
                circle.setLocation(center);
                circle.setRadius(location.getDistance(p));

		return circle;
	}

}
