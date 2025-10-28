	public class Circle {

		// Mittelpunkt des Kreises
		private Point location;
		private double radius;

		public Circle() {
		}

		public Circle(Point initLocation, double initRadius) {

	        this.location = initLocation;
	        this.radius   = initRadius;



		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double newRadius) {
			
			this.radius = newRadius;
			
			
		}

		public Point getLocation() {
			return location;
		}

		public void setLocation(Point newLocation) {
			
			this.location = newLocation;
			
			
			
		}
		
		// Durchmesser
		public double getDiameter() {
			
			
			
			return radius * 2;
		}

		// Umfang
		public double getCircumference() {
			
			
			
			return Math.PI * getDiameter();
		}

		// Fläche
		public double getArea() {
			
			
			
			return Math.pow(getRadius(), 2) * Math.PI;
		}

		public boolean containsPoint(Point point) {
			
			
			
			return;
		}

		public static Circle fromPoints(Point center, Point p) {
			Circle circle = new Circle();

			// An dieser Stelle das circle-Objekt bearbeiten

			return circle;
		}

	}

	