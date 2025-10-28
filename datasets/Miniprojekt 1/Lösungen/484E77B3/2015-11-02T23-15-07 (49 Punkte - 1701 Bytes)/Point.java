/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point 
{

	// Koordinaten
	private double x;
	private double y;
	private double Distance;

	public Point() {
	}

	public Point(double initX, double initY) 
	{
		x = initX;
		y = initY;
	}

	public double getX() 
	{
		return x;
	}

	public void setX(double newX) 
	{
		this.x = newX;
	}

	public double getY() 
	{
		return y;
	}

	public void setY(double newY) 
	{
		this.y = newY;
	}

	public double getDistance(Point p) 
	{
		
		double distance  = (Math.pow(getX() - getX() , 2) + Math.pow(getY() - getY(), 2));
		
		return Math.sqrt(distance);
		
	}
}
