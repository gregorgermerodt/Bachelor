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
		
		double b1 = 2*radius;
		return b1;
	}

	// Umfang
	public double getCircumference() {
		
		double b2 = 2*Math.PI*radius;
		
		return b2;
	}

	// Fläche
	public double getArea() {
		
		double b3 = (Math.PI)*(Math.pow(radius,2));
		return b3;
	}

	public boolean containsPoint(Point point) {
		
		double cMax = location.getX() + radius;
		double cMin = location.getX() - radius;
		double dMax = location.getY() + radius;
		double dMin = location.getY() - radius;
		
		
		if (point.getX() <= cMax)
			if (point.getX() >= cMin)
				if (point.getY() <= dMax)
					if (point.getY() >= dMin)
					
		return true;
					else
						
		return false;
		return false;
					
		
		               
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		

		// An dieser Stelle das circle-Objekt bearbeiten
		
		circle.setLocation(center);
       // circle.radius = center.getDistance(p);
		double r1 = center.getDistance(p);
		circle.setRadius(r1);
		System.out.println("is" + circle.radius );
        
	
		return circle;
	}

}
