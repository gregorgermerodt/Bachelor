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

	public Point(double initX, double initY) 
	{
		x = initX;
		y = initY;
	}

	public double getX() 
	{
		return this.x;
	}

	public void setX(double newX) 
	{
		x = newX;
	}

	public double getY() 
	{
		return this.y;
	}

	public void setY(double newY) 
	{
		y = newY;
	}

	public double getDistance(Point p) 
	{
		double ergebnis;
		double wurzel;
		wurzel = Math.pow(this.x - p.x, 2) + (this.y - p.y);
		ergebnis = Math.sqrt(wurzel);
		return ergebnis;
	}
}
