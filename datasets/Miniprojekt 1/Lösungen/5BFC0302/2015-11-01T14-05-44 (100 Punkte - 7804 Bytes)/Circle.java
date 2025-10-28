
public class Circle {
	private Point location;
	private double radius;

	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
		location=initLocation;
		radius=initRadius;
	}

	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius=newRadius;
	}
	

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point newLocation) {
		location=newLocation;
	}
	
	

	public double getDiameter() {
		return 2*radius;
	}

	
	public double getCircumference() {
		return 2*Math.PI*radius;
	}

	public double getArea() {
		return Math.PI*radius*radius;
	}

	public boolean containsPoint(Point point) {
		if(location.getDistance(point)<=radius){
			return true;
		}
		else{
		return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center);
		circle.setRadius(center.getDistance(p));
		

		return circle;
		}
	public static void main(String[] args) {
		Point pointO = new Point(0.0, 0.0);
		Point pointA = new Point(2.0, 1.0);
		Point pointB = new Point(4.0, -3.0);
		Point pointC = new Point(2.0, 2.0);
		Point pointD = new Point(-3.0, 3.0);
		Point pointE = new Point(-4.0, 3.0);

		Circle circleC1 = new Circle(pointA, 2.0);
		Circle circleC2 = Circle.fromPoints(pointD, pointE);

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

		System.out.println();
		System.out.println("Kreis C1:");
		System.out.println("\tMittelpunkt: (" + circleC1.getLocation().getX()
				+ "|" + circleC1.getLocation().getY() + ")");
		System.out.println("\tRadius: " + circleC1.getRadius());
		System.out.println("\tDurchmesser: " + circleC1.getDiameter());
		System.out.println("\tFlächeninhalt: " + circleC1.getArea());
		System.out.println("\tUmfang: " + circleC1.getCircumference());
		System.out.println("\tEnthält O: " + circleC1.containsPoint(pointO));
		System.out.println("\tEnthält A: " + circleC1.containsPoint(pointA));
		System.out.println("\tEnthält B: " + circleC1.containsPoint(pointB));
		System.out.println("\tEnthält C: " + circleC1.containsPoint(pointC));
		System.out.println("\tEnthält D: " + circleC1.containsPoint(pointD));
		System.out.println("\tEnthält E: " + circleC1.containsPoint(pointE));		
		
		System.out.println();
		System.out.println("Kreis C2:");
		System.out.println("\tMittelpunkt: (" + circleC2.getLocation().getX()
				+ "|" + circleC2.getLocation().getY() + ")");
		System.out.println("\tRadius: " + circleC2.getRadius());
		System.out.println("\tDurchmesser: " + circleC2.getDiameter());
		System.out.println("\tFlächeninhalt: " + circleC2.getArea());
		System.out.println("\tUmfang: " + circleC2.getCircumference());
		System.out.println("\tEnthält O: " + circleC2.containsPoint(pointO));
		System.out.println("\tEnthält A: " + circleC2.containsPoint(pointA));
		System.out.println("\tEnthält B: " + circleC2.containsPoint(pointB));
		System.out.println("\tEnthält C: " + circleC2.containsPoint(pointC));
		System.out.println("\tEnthält D: " + circleC2.containsPoint(pointD));
		System.out.println("\tEnthält E: " + circleC2.containsPoint(pointE));		
		
	}

}
