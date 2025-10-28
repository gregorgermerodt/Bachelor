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
		//location.setX(initLocation.getX());
		//location.setY(initLocation.getY());
		//location = initLocation;
		location = new Point(initLocation.getX(), initLocation.getY()); 
		radius = initRadius;
		System.out.println("TEST location: x= "+ location.getX() +"y= " + location.getY() + "testX= " + initLocation.getX()+ "testY= "+ initLocation.getY());
		System.out.println("TEST radius: "+ radius + " " + initRadius);

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
		double durchmesser = radius*2;
		return durchmesser;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*radius*2;
	}

	// Fläche
	public double getArea() {
		return Math.PI*radius*radius;
	}

	public boolean containsPoint(Point point) {
		if(point.getDistance(location)<radius)
			return true;
		return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		//radius = Point.getDistance(center, p);
		/*
		double x1 = center.getX();
		double y1 = center.getY();
		double x2 = p.getX();
		double y2 = p.getY();
		*/
		double r = center.getDistance(p);
		//Circle fromcircle = new Circle(center, r);
		double l1 = center.getX();
		double l2 = center.getY();
		Point loc = new Point(l1,l2);
		Circle fromcircle1 = new Circle(loc, r);
		
		

		return fromcircle1;
	}

}
