
/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;

	public Circle() {// in diesem Konstruktor wurden noch keine Werte zugewiesen, trotzdem ist dieser mit gettern und settern zu bearbeiten
	}

	public Circle(Point initLocation, double initRadius) {//hier wurden schon Werte zugeordnet
		location = initLocation;
		radius = initRadius;

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
		return 2*radius; // oder return 2*getRadius()
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*2*radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI*radius*radius;
	}

	public boolean containsPoint(Point point) {
		
		if(point.getDistance(location) <= radius){ // der . ruft die Methode getDistance auf
			//Also falls die distance vom Mittelpunkt größer als der Radius ist, liegt er außerhalb des Punktes sonst innerhalb
			//location stellt dabei den Mittelpunkt der Kreises dar.
			return true;
		} else {
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();//neues Objekt ohne Eingangswerte erstellt mit dem Namen circle vom Typ Circle , new Circle ist die Objekterzeugung

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.setLocation(center);
		double radius = center.getDistance(p);
		circle.setRadius(radius);
	
		
		

		return circle;
	}

}