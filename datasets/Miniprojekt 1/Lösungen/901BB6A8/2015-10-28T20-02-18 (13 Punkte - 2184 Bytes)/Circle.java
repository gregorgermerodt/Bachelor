package just.miniprojekt.org;

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
		return this.radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return 2*radius;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*this.getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI*Math.pow(radius, 2.0);
	}

	public boolean containsPoint(Point point) {
		boolean solve;
		if (point.getX()<=radius && point.getY()<=radius){
			solve = true;
		}else{
			solve = false;
		}
		return solve;
	}

	public static Circle fromPoints(Point center, Point p) {
		double varX,varY,solve;
		varX = Math.pow(p.getX()-center.getX(), 2.0);
		varY = Math.pow(p.getY()-center.getY(), 2.0);
		solve = Math.sqrt(varX+varY);
		Circle newCircle = new Circle(center, solve);
		return newCircle;
	}

}
