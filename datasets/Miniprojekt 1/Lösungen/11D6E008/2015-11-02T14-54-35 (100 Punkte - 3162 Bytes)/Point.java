/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

	// Koordinaten
	private double x; // private atribute nur f�r die klasse
	private double y;

	public Point() {
	}

	public Point(double initX, double initY) { //Quelltext zum Zuordnen der Daten f�r einen Punkt
		this.x=initX;		//this platzhalter f�r einen bestimmten (derzeitig behandelten punkt)
		this.y=initY;
	}

	public double getX() { // beim benutzen der koordinaten �ber einer klasse set & get werden be�tigt (Methode)
		return this.x;		// erhalten des x wertes eines punktes
	}

	public void setX(double newX) {
		this.x=newX;	// geben eines x wertes eines punktes
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		this.y=newY;
	}

	public double getDistance(Point p) {
		double distances=(this.x-p.getX())*(this.x-p.getX())+(this.y-p.getY())*(this.y-p.getY()); //this.x-p.getX() => gebe koordi von X von Punkt P //  Distanz siehe VL (Pytagoras)
		return Math.sqrt(distances); //Wurzel ziehen
	}
	
}

