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
		location=initLocation;
		radius=initRadius;
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
		location=newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double durchmesser = 0;
		durchmesser = 2*radius;
		return durchmesser;
	}

	// Umfang
	public double getCircumference() {
		double umfang = 0;
		umfang = Math.PI*2*radius;
		return umfang;
	}

	// Fläche
	public double getArea() {
		double flaeche=0;
		flaeche=Math.PI*Math.pow(radius, 2);
		return flaeche;
	}

	public boolean containsPoint(Point point) {
		if(Math.pow(point.getX()-location.getX(),2)+Math.pow(point.getY()-location.getY(),2)<getDiameter()){
			return true;			
		}
	
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center);
		double distanzzwei = 0;
		distanzzwei = Math.sqrt(Math.pow(center.getX()- p.getX(), 2) + Math.pow(center.getY()- p.getY(), 2));
		circle.setRadius(distanzzwei);
		return circle;
	}

}
