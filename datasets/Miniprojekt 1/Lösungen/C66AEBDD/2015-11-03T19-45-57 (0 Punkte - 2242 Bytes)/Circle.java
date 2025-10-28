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
		double diameter;
		
		diameter=2*radius;
		
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		
		double umpfang;
		
		umpfang=Math.PI*2*radius;
		
		
		return umpfang;
	}

	// Fläche
	public double getArea() {
		
		double fläche;
		
		fläche=Math.PI*Math.pow(radius, 2);
		return fläche;
	}

	public boolean containsPoint(Point point) {
		
		//(x_kreis-x_p)² + (y_kreis-y_p)²<radius²
		
		boolean imKreis;
		
		if (Math.pow(location.getX()-point.getX(), 2)+Math.pow(location.getY()-point.getY(), 2)<Math.pow(radius, 2)){
			imKreis=true;
		}
		else{
			imKreis=false;
		}
		return imKreis;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten 
		
		circle.location=center;
		circle.radius= circle.location.getDistance(p);

		return circle;
	}

}
