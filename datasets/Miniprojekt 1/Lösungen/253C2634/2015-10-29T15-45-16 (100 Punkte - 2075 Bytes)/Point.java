/** * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und * y-Wert */ 
public class Point { 
	// Koordinaten 
	private double x; 
	private double y; 
	
	public Point() { } 
	
	public Point(double initX, double initY) {
		this.x = initX;
		this.y = initY;
	}
	
	public double getX() { 
		return this.x; 
	} 
	
	public void setX(double newX) { 
		this.x = newX;
	}
	
	public double getY() {
		return this.y; 
	} 
	  
	public void setY(double newY) {
		this.y = newY;
	} 
	   
	public double getDistance(Point p) {
		// d = sqrt((x2-x1)^2 + (y2-y1)^2)
		double x_diff = p.getX() - x;
		double y_diff = p.getY() - y;
		double abstand_quadr =  (x_diff * x_diff) + (y_diff * y_diff);
		
		return Math.sqrt(abstand_quadr); 
	}
}