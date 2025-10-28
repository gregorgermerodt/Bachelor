/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location; //Mittelpunkt M(X|Y)
	private double radius;

	public Circle() { //Standardkonstruktor der nicht verändert werden soll
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
		return radius*2; //2*radius
	}

	// Umfang
	public double getCircumference() {
		return Math.PI *getDiameter(); //pi*2*radius oder pi*d
	}

	// Fläche
	public double getArea() {
		return Math.PI *Math.pow(radius, 2); // PI*radius^2
	}

	public boolean containsPoint(Point point) {
		//wenn abstand zwischen Mittelpunkt und Punkt maximal so groß wie radius
		//dann true
		if(location.getDistance(point)<= radius){ 
			return true;
		}
		else{
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center); //center als Mittelpunkt
		circle.setRadius(center.getDistance(p));//Abstand zw. center und p als radius

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
