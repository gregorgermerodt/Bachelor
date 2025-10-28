/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {

	// Koordinaten
	private double x;
	private double y;

	public Point() {
	}

	public Point(double initX, double initY) {
this.X=initX;
this.Y=initY;

	}

	public double getX() {
		return X;
	}

	public void setX(double newX) {
this.X=newX
	}

	public double getY() /{
return Y;

	}

	public void setY(double newY) {
this.y=newY
	}

	public double getDistance(Point p) {
		return math.sqrt ((p.getX * getX - x*x) + (p.getY * p.getY - y*y)) ;
	}
}
