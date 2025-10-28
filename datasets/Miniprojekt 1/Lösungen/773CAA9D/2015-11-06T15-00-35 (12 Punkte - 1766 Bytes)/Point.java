

public class Point {
	//Variablen Declarierung
	private double x;
	private double y;
	
	//Der Konstruktor
	public Point(double initX, double initY)
	{
		this.x = initX;
		this.y = initY;
		
	}
	
	//Getters and setters

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		this.x = newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		this.y = newY;
	}
	
	
	//die Methode getDistance
	
	public double getDistance(Point point)
	{
		return Math.sqrt((this.x - point.x)*(this.x - point.x) + (this.y - point.y)*(this.y - point.y));
	}
	
	
	
	

	
}
