/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

	// Koordinaten
	private double x;
	private double y;
	private double d;
	private double z;

	public Point() {
	}

	public Point(double initX, double initY) {
		x = initX;
		y = initY;
		// this muss HIER nicht verwendet werden, weil die Variablen unterschiedliche Bezeichnungen
		// haben und es klar ist, welche Variable gemeint ist.
		// Bei gleichen Variablen muss man this benutzen.

	}

	public double getX() {
		// x zurückgeben.
		return x;
	}

	public void setX(double newX) {
		// x einen neuen Wert zuweisen.
		x = newX;
	}

	public double getY() {
		// y zurückgeben.
		return y;
	}

	public void setY(double newY) {
		// y einen neuen Wert zuweisen.
		y = newY;
	}

	public double getDistance(Point p) {
		// Der akutelle Punkt ist der des Objekts, in dem diese Methode aufgerufen wird.
		// Der zweite Punkt ist p, dieser wird beim Aufruf der Methode übergeben.
		z = Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2);
		d = Math.sqrt(z);
		return d;
	}
}
