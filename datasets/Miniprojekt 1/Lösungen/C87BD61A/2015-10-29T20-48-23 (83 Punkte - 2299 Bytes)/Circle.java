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
		return this.radius*2;
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*this.getDiameter();
	}

	// Fläche
	public double getArea() {
		return Math.PI*(Math.pow(this.getRadius(), 2));
	}

	public boolean containsPoint(Point point) {
		double wert = Math.pow((point.getX() - this.getLocation().getX()),2);
		double wert2 = Math.pow((point.getY() - this.getLocation().getY()), 2);
		
		if(wert+wert2 <= Math.pow(getRadius(), 2)){
			return false;
		}else{
			return true;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
		
		double wert = Math.pow((p.getX() - circle.getLocation().getX()),2);
		double wert2 = Math.pow((p.getY() - circle.getLocation().getY()), 2);
		
		double wert3 = wert+wert2;
		
		circle.setRadius(Math.sqrt(wert3));
		

		return circle;
	}

}
