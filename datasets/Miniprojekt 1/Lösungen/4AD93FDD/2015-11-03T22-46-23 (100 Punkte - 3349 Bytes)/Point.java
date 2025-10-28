/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point { //Klasse Point erstellt // BAUPLAN

	// Koordinaten
	private double x; // Attribute definiert
	private double y;

	public Point() { //KOnstruktor: Erstellt Point Objekt mit Attributen , leere Klammer = Methode macht nichts, als Start
	}

	public Point(double initX, double initY) { // Konstruktor = wei�t Attributen Startwerte zu, erkennt man daran, dass sie selben Namne haben wie Klasse
		//init = Name , auch Franz Denkbar 
		x = initX;
		y = initY;		
			}

	public double getX() {//Name = getx , R�ckgabetyp= double, keinen Parameter/Variable, 
		//getter geben nur Wert zur�ck, der in den Attr. steht / andere Klassen k�nnen drauf zugreifen
		return x; //ersetze -1.0 durch x 
	}

	public void setX(double newX) {//Ich muss neuen Varaiblen neuen Wert zuweisen, deshalb (double newX)
		x = newX; //damit andere Klassen x Wert zuweisen k�nnen, da private
	}//setter weisen Attributen neue Werte zu 

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y = newY;
	}

	public double getDistance(Point p) { //"Point" = Variable p hat Attribute und Methoden von der Klasse Point (Quasi Bauplan)
			
			
		return Math.sqrt(Math.pow(p.getX() - x,2) + Math.pow(p.getY() - y,2));
	}
}
