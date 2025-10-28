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
		setX(initX);
		setY(initY);
	}

	public double getX() 
	{
		return x;
	}

	public void setX(double newX) 
	{
		x = newX;
	}

	public double getY() 
	{
		return y;
	}

	public void setY(double newY) 
	{
		y = newY;
	}

	public double getDistance(Point p) 
	{
		double x1;
		double y1;
		x1 = p.getX();
		y1 = p.getY();
		return Math.sqrt((x1 - getX())*(x1 - getX()) + (y1 - getY())*(y1 - getY()));
	}
}
