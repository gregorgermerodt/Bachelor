
public class Point {

	// Koordinaten
	private double x;
	private double y;

	public Point() {
	}

	public Point(double initX, double initY) {
initX=this.x;
initY=this.y;
	}

	public double getX() {
		return this.x;
	}

	public void setX(double newX) {
		this.x=newX;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		this.y=newY;
	}

	public double getDistance(Point p) {
		return Math.sqrt(Math.pow(p.getX()-x,2)+Math.pow(p.getY()-y,2));
	}
}