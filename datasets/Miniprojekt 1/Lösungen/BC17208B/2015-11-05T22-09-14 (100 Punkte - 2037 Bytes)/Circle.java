
public class Circle {

	// Mittelpunkt des Kreises
		private Point location;
		private double radius;
		
		public Circle() {
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
			return  location;
		}

		public void setLocation(Point newLocation) {
			
			location = newLocation;
			
			
		}
		
		// Durchmesser
		public double getDiameter() {
			
			
			return radius*2;
		}

		// Umfang
		public double getCircumference() {
			
			double Umfang = getDiameter()*Math.PI;
			
			return Umfang;
		}

		// Fläche
		public double getArea() {
			
			double Flaeche = Math.PI * Math.pow(radius, 2);
			return Flaeche;
		}

		public boolean containsPoint(Point point) {
			
			
		if (location.getDistance(point) <= radius)  {
			return true;}
		
		else{
			
			
			return false;
		}
		}

		public static Circle fromPoints(Point center, Point p) {
			Circle circle = new Circle();

			// An dieser Stelle das circle-Objekt bearbeiten

            circle.location = center;
            
            circle.radius = center.getDistance(p);
			
			return circle;
			
		}
		
		

	

}

