/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

	// Koordinaten
	private double x;
	private double y;

	public Point() {
	}

	public Point(double initX, double initY) {
		x = initX;
		y = initY;
	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		x = newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y = newY;
	}

	public double getDistance(Point p) {
		//𝑑 = √(𝑥2 − 𝑥1)2 + (𝑦2 − 𝑦1)2
		//Power :
		//double power = Math.pow(double basis, double potenz);
		return Math.sqrt(Math.pow((p.getX()-this.x), 2) + Math.pow((p.getY()-this.y), 2));
	}
}

