
public class Point {
	
	private double x;
	private double y;
	private Point p;
	public Point(double xx, double yy)
	{
		System.out.println("In Konstruktor Point(x,y) mit xx= " + xx +  " yy = " + yy);
		x=xx;
		y=yy;
	}
	
	public Point()
	{
		
	}
	
	public void setX(double xx)
	{
		x=xx;
	}
	
	public double getX()
	{
		return x;
	}
	
	public void setY(double yy)
	{
		y=yy;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double EntfernungVomUrsprung() // Name für die Berechnungsvorschrift
	{
		return Math.sqrt(x*x +y*y);
	}

	public double getDistance(Point p) {
		// TODO Auto-generated method stub
		return 0;
	}



}
