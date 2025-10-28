
public class Point {
	
	private double x;
	private double y;

	public Point() {
	}

	public Point(double initX, double initY) {
		x = initX;
		y = initY;
	}
	public double getX() {
    return x;
	}
public void setX(double newX){
	x = newX;
}
public double getY(){
	return y;
}
public void setY(double newY){
	y = newY;
	
}
	public double getDistance(Point p) {
	
	double x1 = x;
	double y1 = y;
	
	double x2 = p.getX();
	double y2 = p.getY();
	
	double a = x2-x1;
	double b = y2-y1;
	
	double distanz = Math.sqrt((a*a)+(b*b));
	
	return distanz;

	}
}
