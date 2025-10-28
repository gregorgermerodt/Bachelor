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
		return radius + radius;
	}

	// Umfang
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI * (radius * radius);
	}

	public boolean containsPoint(Point point) {
        return point.getDistance(location) <= radius;
    }
     
    /**
     * erstellt einen Kreis mit dem Objekt center als Mittelpunkt
     * und dem Abstand zwischen center und point als Radius
     * @param center Mittelpunkt des Kreises
     * @param p ein Randpunkt des Kreises 
     * @return Kreis mit dem Objekt center als Mittelpunkt
     * und dem Abstand zwischen center und point als Radius
     */
     
    public static Circle fromPoints(Point center, Point p) {
        Circle circle = new Circle(center, center.getDistance(p));
        return circle;
    }
 
}