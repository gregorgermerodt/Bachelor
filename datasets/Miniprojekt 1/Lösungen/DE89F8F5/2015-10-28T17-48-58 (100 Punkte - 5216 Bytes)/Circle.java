
	public class Circle {

		// Mittelpunkt des Kreises
		private Point location;
		private double radius;

		public Circle() {
			location = new Point();
			radius = 0.0;
		}

		public Circle(Point initLocation, double initRadius) {
			location = initLocation;
			radius = initRadius;
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double newRadius) {
			radius = newRadius;
		}

		public Point getLocation() {
			return location;
		}

		public void setLocation(Point newLocation) {
			location = newLocation;
		}
		
		// Durchmesser
		public double getDiameter() {
			return (radius * 2.0);
		}

		// Umfang
		public double getCircumference() {
			return (Math.PI * 2.0 * radius);
		}

		// Fläche
		public double getArea() {
			return (Math.PI * radius * radius);
		}

		public boolean containsPoint(Point point) {
			return ((location.getDistance(point)) <= radius);
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


