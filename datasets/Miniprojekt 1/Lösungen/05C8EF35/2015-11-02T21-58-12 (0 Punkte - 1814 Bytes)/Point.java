public class Point{
	private double x;
	private double y;
	Point Point = new Point();
    
	public Point() {
		
	}
	
	public Point(double initX, double initY) 
	
	{
      this.x = initX;
      this.y = initY;
      
	}
	
		
	public double getX() {
		return Point.x;
	}

	public void setX(double newX) {
           this.Point.x = newX;
           
	}

	public double getY() {
		return Point.y;
	}

	public void setY(double newY) {
		this.Point.y = newY;
		
	}

	public double getDistance(Point p) {
		 return Math.sqrt( Point.x - x) * (Point.x - x) + (Point.y - y) * (Point.y -y);
		 
	}
}


