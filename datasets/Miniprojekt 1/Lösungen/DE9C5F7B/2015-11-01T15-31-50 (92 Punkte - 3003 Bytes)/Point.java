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

	public double getX() {
		return x;
	}

	public void setX(double newX){
		x = newX;
	}

	public double getY() {
		return y;
	}

	public void setY(double newY) {
		y = newY;
	}

	public double getDistance(Point p) {
	//Beispiel this --> Point O und Point p --> Point A
		double leftX = this.getX();
		double leftY = this.getY(); 
		double rightX = p.getX();  
		double rightY = p.getY();
		
		double resX = Math.pow((rightX - leftX),2); //Quadrat
		double resY = Math.pow((rightY - leftY),2); //Quadrat
		
		double result = Math.sqrt(resX + resY);
		
		return result;
	}
}
