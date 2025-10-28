
public class Point {

	// Koordinaten
	private double x;
	private double y;

	public Point() {
	}

	public Point(double initX, double initY) {
		x=initX;
		y=initY;
	}

	public double getX() {
		return x;
	}

	public void setX(double newX) {
		x=newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y=newY;
	}

	public double getDistance(Point p) {
	double distance;
	double zwischenwert1;
	double zwischenwert2;
	double zwischenwert3;
	double zwischenwert4;
	double zwischenwert5;

	zwischenwert1 = (p.getX()-x);
	zwischenwert2 = (p.getY()-y);
	zwischenwert3 = zwischenwert1 * zwischenwert1;
	zwischenwert4 = zwischenwert2 * zwischenwert2;
	zwischenwert5 = zwischenwert3 + zwischenwert4;
	distance = Math.sqrt(zwischenwert5);
	
	return distance;
	}
}

