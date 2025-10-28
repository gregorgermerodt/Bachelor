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
		radius=newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location=newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double durchmesser;
		
		durchmesser=2*radius;
		
		return durchmesser;
	}

	// Umfang
	public double getCircumference() {
		
		double umpfang;
		
		umpfang=2*Math.PI*radius;
		
		return umpfang;
	}

	// Fläche
	public double getArea() {
		
		double flaeche;
		
		flaeche=Math.PI*Math.pow(radius, 2);
				
		return flaeche;
	}

	public boolean containsPoint(Point point) {
		
		boolean imKreis=false;
		
		if(location.getDistance(point)<radius*2){
			imKreis=true;
		}
		return imKreis;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		
		circle.location=center;
		
		

		return circle;
	}

}
