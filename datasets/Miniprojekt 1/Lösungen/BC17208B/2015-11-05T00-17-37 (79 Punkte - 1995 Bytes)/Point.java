
public class Point {
	
	// Koordinaten
		private double x;
		private double y;

		public Point() {
		}

		public Point(double initX, double initY) {
			
			initX = x;
			initY = y;

		}

		public double getX() {
			
			return x;
			

		}

		public void setX(double newX) {
			
			x = newX;
		}
		
		public double getY() {
			return y;
		}

		public void setY(double newY) {
			
			y = newY;
		}

		public double getDistance(Point p) {
			
			double Abstand;
			
			Abstand = Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2)); 
			
			
			
			return Abstand;
		}
	}


