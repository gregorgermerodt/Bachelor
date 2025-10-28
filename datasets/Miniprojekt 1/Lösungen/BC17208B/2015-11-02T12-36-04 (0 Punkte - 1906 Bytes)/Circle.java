
public class Circle {

	// Mittelpunkt des Kreises
		private Point location;
		private double radius;
        private double durchmesser;
		
		public Circle() {
		}

		public Circle(Point initLocation, double initRadius) {
			
			initLocation = location;
			
			initRadius = radius;

		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double newRadius) {
			
			radius = newRadius;
		}

		public Point getLocation() {
			return  location;
		}

		public void setLocation(Point newLocation) {
			
			location = newLocation;
			
			
		}
		
		// Durchmesser
		public double getDiameter() {
			
			double durchmesser = radius*2;
			
			return durchmesser;
		}

		// Umfang
		public double getCircumference() {
			
			double Umfang = durchmesser*Math.PI;
			
			return Umfang;
		}

		// Fläche
		public double getArea() {
			
			double Flaeche = Math.PI * Math.pow(radius, 2);
			return Flaeche;
		}

		public boolean containsPoint(Point point) {
			
		if(			
			
			
			return false;
		}

		public static Circle fromPoints(Point center, Point p) {
			Circle circle = new Circle();

			// An dieser Stelle das circle-Objekt bearbeiten

			return circle;
		}

	}

}
