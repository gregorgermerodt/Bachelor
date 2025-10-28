package miniprojekt;

public class Circle {
	/**
	 * Definiert einen Kreis �ber einen Radius und einem Mittelpunkt in einem
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
			radius=newRadius;
		}

		public Point getLocation() {
			return location;
		}

		public void setLocation(Point newLocation) {
			location=newLocation;
		}
		
		// Durchmesser
		public double getDiameter() {
			return (radius*2);
		}

		// Umfang
		public double getCircumference() {
			return Math.PI*getDiameter();
		}

		// Fl�che
		public double getArea() {
			return Math.PI*Math.pow(radius, 2);
		}

		public boolean containsPoint(Point point) {
			if (point.getDistance(location)<= radius){
				return true;
			
			}
		else{ 
			return false;
		}
		}
	       

		public static Circle fromPoints(Point center, Point p) {
			Circle circle = new Circle();

			// An dieser Stelle das circle-Objekt bearbeiten
            circle.setLocation(center);
            circle.setRadius(p.getDistance(center));
            
            return circle;
        
		}

	}


