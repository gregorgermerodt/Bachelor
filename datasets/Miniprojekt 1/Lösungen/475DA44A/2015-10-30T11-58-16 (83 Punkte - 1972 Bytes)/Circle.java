/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {
	// Mittelpunkt des Kreises
		private Point location;
		private double radius;

		public Circle() {
		}

		public Circle(Point initLocation, double initRadius) {
			initLocation = this.location;
			initRadius = this.radius;
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
			//d = ;
			return 2*radius;
		}

		// Umfang
		public double getCircumference() {
			return 2*Math.PI*radius;
		}
		// Fläche
		public double getArea() {
			return Math.PI*Math.pow(radius, 2);
		}

		public boolean containsPoint(Point point) {
			boolean b = false;
			if (point.getX() < radius && point.getY() < radius)
				b = true;
			return b;
		}

		public static Circle fromPoints(Point center, Point p) {
			Circle circle = new Circle();
			circle.location = center;
			circle.radius = p.getDistance(center);
			return circle;
		}

	}

	
