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
		radius = initRadius;
	

	}

	public double getRadius() {
		
		
		return radius;
	}

	public void setRadius(double newRadius) {
		
		radius= newRadius;
	}

	public Point getLocation() {
		
		
		return location;
	}

	public void setLocation(Point newLocation) {
		
		location= newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		
		
		return this.getRadius()*2;
	}

	// Umfang
	public double getCircumference() {
		
		
		
		
		return (Math.PI*2)*getRadius();
	}

	// Fläche
	public double getArea() {
	
		
		
		
		return Math.PI*(Math.pow(getRadius(), 2));
	}

	public boolean containsPoint(Point point) {
		
		
		if(Math.pow(point.getX() - location.getX(), 2) + Math.pow(point.getY() - location.getY(), 2) <= radius * radius)
        {
            return true;
        }
		
		
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		
		circle.setLocation(center);
		circle.radius = Math.sqrt(Math.pow(p.getX() - center.getX() , 2) + Math.pow(p.getY() - center.getY(), 2));

		

		return circle;
	}

}
