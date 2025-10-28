// Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 // zweidimensionalen Koordinatensystem
 //
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
     radius = initRadius;
     location = initLocation;
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
		double di = 2 * radius;
		return di;
	}

	// Umfang
	public double getCircumference() {
		double um = 2 * Math.PI * radius;
		
		return um;
	}

	// Fläche
	public double getArea() {
		double fl = (Math.PI * radius) * (Math.PI * radius);
		
		return fl;
	}

	public boolean containsPoint(Point point) {
		if (location.getDistance(point) > radius){
		return false;
		}
		else {
		return true ;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.location = center;
		circle.radius = p.getDistance(center);
		

		return circle;
	}

}
