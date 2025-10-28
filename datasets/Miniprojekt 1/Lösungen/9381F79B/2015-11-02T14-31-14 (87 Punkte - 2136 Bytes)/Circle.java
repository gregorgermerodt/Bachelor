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
		this.location=initLocation;
		this.radius=initRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		this.radius=newRadius;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		this.location=newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius*2;
	}

	// Umfang
	public double getCircumference() {
		return 2*Math.PI*getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI*Math.pow(getRadius(), 2);
	}

	public boolean containsPoint(Point point) {
        if((location.getX()-radius)<point.getX()&&point.getX()<(location.getX()+radius)&&(location.getY()-radius)<point.getY()&&point.getY()<(location.getY()+radius)){
        	return true;
        }
        return false;}
     
	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
        circle.setLocation(center);
        circle.setRadius(Math.sqrt(Math.pow(p.getX()-center.getX(), p.getY()-center.getY())));
		return circle;
	}

}
