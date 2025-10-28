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
		radius	 = initRadius;
		
	}

	public double getRadius() {
		
		return this.radius;
		
	}

	public void setRadius(double newRadius) {
		
		radius = newRadius;
		
	}

	public Point getLocation() {
		
		return this.location;
		
	}

	public void setLocation(Point newLocation) {
		
		location = newLocation;
		
	}
	
	// Durchmesser
	public double getDiameter() {
		
		double D = 0.0;
		
		D = 2*radius;
		
		return D;
		
	}

	// Umfang
	public double getCircumference() {
		
		double U = 0.0;
		
		double D = getDiameter();
		
		U = Math.PI*D;
				
		return U;
	}

	// Fläche
	public double getArea() {
		
		double A = 0.0;
		
		double r = getRadius();
		
		A = Math.PI*(Math.pow(r,2));
		
		return A;
	}

	public boolean containsPoint(Point point) {
		
		Point L = getLocation();
		
		double r = getRadius();
		
		double D = L.getDistance(point);
		
	    if  (D>r){
	    	
	    	return false ;
	    	}
	    else { return true; } 
		
		}

	public static Circle fromPoints(Point center, Point p) {
		
		Circle circle = new Circle();
		
		circle.setLocation(center);;
		
		circle.radius = center.getDistance(p);
		
		return circle;
				
	}

}
