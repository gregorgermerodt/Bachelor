/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */

public class Point {

	// Koordinaten
	private double x;
	private double y;
	private double dis;

	public Point()  //Standardkonstruktor
	{
		
	}

	public Point(double initX, double initY) //Konstruktor mit �bergebenen Parametern
	{
    x = initX;
    y = initY;
	}

	public double getX() //get-Methode f�r die X-Variable
	{
		return x;
	}

	public void setX(double newX) //set-Methode f�r die X-Variable
	{
		x = newX;
	}

	public double getY() //get-Methode f�r die Y-Variable
	{
		return y;
	}

	public void setY(double newY) //set-Methode f�r die Y-Variable
	{
		y = newY;
	}

	public double getDistance(Point p)  //Berechnung der Distanz zweier Punkte
	{
		dis = Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
		
		return dis;
	}
}
