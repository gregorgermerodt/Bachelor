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
		setRadius(initRadius);
		setLocation(initLocation);

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		this.radius=newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		this.location=newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double diameter= 0.0;
		
		diameter= radius*2;
		
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		double circumference=0.0;
		
		circumference = Math.PI*getDiameter();
		
		return circumference;
	}

	// Fläche
	public double getArea() {
		double area= 0.0;
		
		area= 2*Math.pow(radius,2);
		
		return area;
	}

	public boolean containsPoint(Point point) {
		
		if(point.getDistance(location)<radius){
			return true;
		}else{
			return false;
		}
		

	}

	public static Circle fromPoints(Point center, Point p) {
		double dist = p.getDistance(center);
		
		Circle circle = new Circle(center,dist);

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
