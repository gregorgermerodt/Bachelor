
public class Circle {
/* Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
	 * zweidimensionalen Koordinatensystem
	 */

		// Mittelpunkt des Kreises
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
			radius = newRadius;
		}

		public Point getLocation() {
			return location;
		}

		public void setLocation(Point newLocation) {
			location=newLocation;
		}
		
		// Durchmesser
		public double getDiameter() {
			double d;
			d= (2*radius);
			return d;
		}

		// Umfang
		public double getCircumference() {
			double U =  Math.PI*this.getDiameter();
			return U;
		}

		// Fläche
		public double getArea() {
			double A;
			A= Math.PI*(radius*radius);
			return A;
		}

		public boolean containsPoint(Point point) {
			if (location.getDistance(point)>=radius)	
			{
				return false;
			}
			
			return true;
		}

		public static Circle fromPoints(Point center, Point p) {
			Circle circle = new Circle(center, center.getDistance(p));
			// An dieser Stelle das circle-Objekt bearbeiten

			return circle;
		}

}
