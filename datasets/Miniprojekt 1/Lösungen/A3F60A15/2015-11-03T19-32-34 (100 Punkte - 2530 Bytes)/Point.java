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
		double
			dx = p.getX() - this.x,
			dy = p.getY() - this.y;
		
		return Math.sqrt(dx*dx + dy*dy);
		//return Math.sqrt((p.getX()-x)*(p.getX()-x) + (p.getY()-y)*(p.getY()-y));
		//return Math.sqrt(Math.pow(p.getX()-x, 2) + Math.pow(p.getY()-y, 2));
		}
}
