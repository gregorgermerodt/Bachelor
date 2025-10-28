public class Point{
	private double x;
	private double y;
	Point point = new Point();
    
	public Point() {
		
	}
	
	public Point(double initX, double initY) 
	
	{
      this.x = initX;
      this.y = initY;
      
	}
	
		
	public double getX() {
		return point.x;
	}

	public void setX(double newX) {
           this.point.x = newX;
           
	}

	public double getY() {
		return point.y;
	}

	public void setY(double newY) {
		this.point.y = newY;
		
	}

	public double getDistance(Point p) {
		 return Math.sqrt( point.x - x) * (point.x - x) + (point.y - y) * (point.y -y);
		 
	}
}


