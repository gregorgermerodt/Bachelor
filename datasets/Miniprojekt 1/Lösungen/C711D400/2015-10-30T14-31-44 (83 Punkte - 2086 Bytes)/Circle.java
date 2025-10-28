/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;
	private double diameter;
	private double circumference;
	private double area;
    //private boolean check;
	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
		this.location = initLocation ;
		this.radius = initRadius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius ;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation ;
	}
	
	// Durchmesser
	public double getDiameter() {
		diameter = radius*2;
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		circumference = Math.PI * diameter;
		return circumference ;
	}

	// Fläche
	public double getArea() {
		area = Math.PI *radius*radius;
		return area;
	}

	public boolean containsPoint(Point point) {
	/**     If(){
		    return check = true;
		}else{
			return check = false;
		}
		*/
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
