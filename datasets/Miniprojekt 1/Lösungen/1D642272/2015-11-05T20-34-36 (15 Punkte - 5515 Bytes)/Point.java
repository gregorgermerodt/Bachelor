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
    this.x = initX ;
    this.y = initY ;
	}

	public double getX() {
		return this.x ;
	}

	public void setX(double newX) {
		this.x = newX ;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double newY) {
		this.y = newY ;
	}

	public double getDistance(Point p) {
		double Distance = (this.x - p.getX())*(this.x - p.getX()) + (this.y - p.getY())*(this.y - p.getY()) ;
		
		
		
		return  Math.sqrt(Distance);
	}
	public static void main(String[] args) {
		Point pointO = new Point(0.0, 0.0);
		Point pointA = new Point(2.0, 1.0);
		Point pointB = new Point(4.0, -3.0);
		Point pointC = new Point(2.0, 2.0);
		Point pointD = new Point(-3.0, 3.0);
		Point pointE = new Point(-4.0, 3.0);
		System.out.println("Punkte:");
		System.out.println("\tO(" + pointO.getX() + "|" + pointO.getY() + ")");
		System.out.println("\tA(" + pointA.getX() + "|" + pointA.getY() + ")");
		System.out.println("\tB(" + pointB.getX() + "|" + pointB.getY() + ")");
		System.out.println("\tC(" + pointC.getX() + "|" + pointC.getY() + ")");
		System.out.println("\tD(" + pointD.getX() + "|" + pointD.getY() + ")");
		System.out.println("\tE(" + pointE.getX() + "|" + pointE.getY() + ")");

		System.out.println();
		System.out.println("Abstände:");
		System.out.println("\tO <--> A: " + pointO.getDistance(pointA));
		System.out.println("\tO <--> C: " + pointO.getDistance(pointC));
		System.out.println("\tA <--> B: " + pointA.getDistance(pointB));
		System.out.println("\tC <--> D: " + pointC.getDistance(pointD));
		System.out.println("\tD <--> C: " + pointD.getDistance(pointC));
		System.out.println("\tD <--> E: " + pointD.getDistance(pointE));
	
	}
	
	
	
}
