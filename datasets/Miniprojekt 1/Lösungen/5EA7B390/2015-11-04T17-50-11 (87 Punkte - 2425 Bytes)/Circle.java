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
	this.location = initLocation;
	this.radius = initRadius;
	}

	public double getRadius() {
		return radius;
		
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	public Point getLocation() {
		return location;
		
	}

	public void setLocation(Point newLocation) {
		location = newLocation;	
	}
	
	// Durchmesser
	public double getDiameter() {
		double a;
		a= 2*radius; // 2 x radius = Durchmesser
		
		return a;
		
	}

	// Umfang
	public double getCircumference() {
		/*double a,b;
		a= Math.PI;
		b= 2*radius;
		return a*b;
		*/
		return Math.PI* getDiameter();
		//return 2*radius*Math.PI;
	}

	// Fläche
	public double getArea() {
		double a;
		a= Math.pow(radius,2);
		return a*Math.PI;
	}

	public boolean containsPoint(Point point) {
		
		return false;
		
		/*if(){
			return true;
		}
		else{
			return false;
		}*/
		
		/*if((location.getX() - radius)< point.getX() && point.getX() < (location.getX() + radius) && (location.getY() - radius)< point.getY() && point.getY() < (location.getY() + radius)){
			return true;
		}
		else{
		return false;
		}
		*/
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
