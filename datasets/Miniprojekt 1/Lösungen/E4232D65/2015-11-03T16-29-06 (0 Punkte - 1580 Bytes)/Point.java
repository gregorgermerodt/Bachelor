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
		public double getX() {
			return initX;
		}
		public void setX(double newX) {
		this.x=newX;
		}
		public double getY() {
			return initY;
		}
		public void setY (double newY){
		this.y=newY;
		}

	}
	
	public double getDistance(Point p) {
		return Math.sqrt((p.getX()-x)*(p.getX()-x)+(p.getY()-y)*(p.get>()-y));
	}
}
