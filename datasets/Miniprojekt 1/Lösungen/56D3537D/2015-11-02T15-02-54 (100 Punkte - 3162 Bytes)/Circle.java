/**
 * Definiert einen Kreis �ber einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location; // Mittelpunkt im Kreis
	private double radius;  // Radius erstellen als Zahl (z.B. 1.0 double) / int = 1

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) { // Konstrukt ohne R�ckgabewert
		this.location=initLocation;  //Platzhalter f�r aktuellen radius / Mittelpunkt
		this.radius=initRadius;
	}

	public double getRadius() { // Methode mit R�ckgabewert / Erhalten bzw erfahren des Radius
		return this.radius;
	}

	public void setRadius(double newRadius) { // Zum neuen setzen eines Radiuses
		this.radius=newRadius;
	}

	public Point getLocation() {   // Erhalten bzw erfahren des Mittelpunktes
		return this.location;
	}

	public void setLocation(Point newLocation) {// Zum neuen setzen eines Mittelpunktes
		this.location=newLocation;
	}
	
	// Durchmesser
	public double getDiameter() { // Erfahren des Durchmessers
		return 2*this.radius;
	}

	// Umfang
	public double getCircumference() { // Erfahren des Umfangs
		return Math.PI*this.getDiameter();
	}

	// Fl�che
	public double getArea() {  // getArea zum Erfahren der Fl�che
		return Math.PI*this.radius*this.radius; //wieso nicht getRadius?!?
	}

	public boolean containsPoint(Point point) { // (Point point) = 1. Klasse | 2. f�r Objekt
		//Abfrage ob punkt innerhalb des Kreises ist // containsPoint zuvor erstellte Methode
		double distance=this.location.getDistance(point);
		if(distance<=this.radius){
			return true;
		}else{
			return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) { //static = starten von Klasse (Teilprogramm)/ Point center f�r Mittelpunkt / Point p =Radius
		 Circle circle =  new Circle();
		 
		// An dieser Stelle das circle-Objekt bearbeiten
		double radius =center.getDistance(p); // neuen Radius setzen
		
		return new Circle(center,radius);
	}

}
