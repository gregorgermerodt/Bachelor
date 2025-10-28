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
		x = initX;
		y = initY;
	}
//---------------------------------------------------------------------------------------------------------------------

	public void setX(double newX) {
		x = newX;
	}
	
	public double getX() {
		return x;
	}

//------------------------------------------------------------------------------------------------------------------------
	

	public void setY(double newY) {
		y = newY;
	}
	
	public double getY() {
		return y;
	}
//---------------------------------------------------------------------------------------------------------------------------------
	public double getDistance(Point p) {
		return Math.sqrt(Math.pow(getX()-x,2) + Math.pow(getY()-y,2));

}
}