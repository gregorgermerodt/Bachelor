/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle { //BAUPLAN

	// Mittelpunkt des Kreises
	private Point location; // hat Attribute und Methoden von Point
	private double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
     location = initLocation;
     radius = initRadius;
	}

	//da Attribute private sind -> andere Klassen drauf zugreifen
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) { //andere KLassen sollen Radius des Kreises bestimmen können / von anderer Klasse gesetzt werden
		//diese Methode "setRadius" gibt neue Variable an "newRadius"	
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
		return 2*radius; //Variable ist ja 
	}

	// Umfang
	public double getCircumference() {
		return 2*Math.PI*radius;
	}

	// Fläche
	public double getArea() {
		return Math.PI*Math.pow(radius,2);
	}

	public boolean containsPoint(Point point) { //point ist eine neue Variable von der Klasse Point
		if(point.getDistance(location) <= radius) {//deshalb kann Miniprojekt1.java wieder Werte für Point festlegen. 
			//In Miniprojekt1 sind Werte für point hinterlegt) point = 
			return true;
		}else {
		return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {//Variable Center hat HIER noch keinen Wert
		Circle circle = new Circle();
		circle.setLocation(center);//Kreismittelpunkt wird auf die Variable center gesetzt
		circle.setRadius(center.getDistance(p)); //center = Variable , berechnet den Radius den Kreises (= Abstand vom
		// Mittelpunkt des Kreises (center) zum Punkt p
		

		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
