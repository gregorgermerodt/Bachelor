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
		
		return new Point();
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius * 2;
	}

	// Umfang
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI * Math.pow(radius,2);
	}

	public boolean containsPoint(Point point) {
		boolean tr = false;
		double zr=(Math.pow(point.getX()-location.getX(),2))+(Math.pow(point.getY() - location.getY(),2));
		if (zr<(Math.pow(radius,2))) {
			tr = true;
		}
		/*location.getX();
		location.getY();
		
		//if ((point.x() - location.x) + point.getY() - location.getY() < (radius*2)) {
		
		if(Math.pow(point.getX()-location.getX(),2)+Math.pow(point.getY()-location.getY(),2)<radius*radius){
		
            return true;
		}*/
		
		return tr;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		
		// An dieser Stelle das circle-Objekt bearbeiten
		
		double r = 0;
		r = center.getDistance(p);
		circle.setLocation(center);
		circle.setRadius(r);
		return circle;
	}

}
