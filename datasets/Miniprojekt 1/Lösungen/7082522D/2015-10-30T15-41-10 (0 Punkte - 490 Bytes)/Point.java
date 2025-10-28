
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

	public void setX(double newX) {
		x=new X;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y=new Y;
	}

	public double getDistance(Point p) {
		return math.sqrt(Math.pow(p.getX()-x, 2)+Math.pow(p.getY()-y, 2));

	}
}
