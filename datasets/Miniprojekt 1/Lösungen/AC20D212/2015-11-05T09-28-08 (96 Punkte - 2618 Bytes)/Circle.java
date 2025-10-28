
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
		return 2*radius; // oder return 2*getRadius()
	}

	// Umfang
	public double getCircumference() {
		return Math.PI*getDiameter(); //Math.PI*getDiameter
	}

	// Fläche
	public double getArea() {
		return Math.PI*getDiameter();
	}

	public boolean containsPoint(Point point) {
		
		if(point.getDistance(location) <= radius){ // der . ruft die Methode getDistance auf
			//Also falls die distance vom Mittelpunkt (location) größer als der Radius ist, liegt er außerhalb des Punktes sonst innerhalb
			//location stellt dabei den Mittelpunkt des Kreises dar.
			return true;
		} else {
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();//neues Objekt ohne Eingangswerte erstellt mit dem Namen circle vom Typ Circle , new Circle ist die Objekterzeugung

		circle.setLocation(center);
		double radius = center.getDistance(p);
		circle.setRadius(radius);
	
		return circle;
	}

}