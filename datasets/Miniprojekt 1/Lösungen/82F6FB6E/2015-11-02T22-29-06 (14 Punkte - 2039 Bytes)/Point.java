package miniprojekt;

public class Point {

	/**
	 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
	 * y-Wert
	 */
	

		// Koordinaten
		private double x;
		private double y;

		public Point() {
		}

		public Point(double initX, double initY) {

		}

		public double getX() {
			return x;
		}

		public void setX(double newX) {
			x=newX;
		}

		public double getY() {
			return y;
		}

		public void setY(double newY) {
			y=newY;
		}

		public double getDistance(Point p) {
			return Math.sqrt(Math.pow(getX()-x,2)-getY()-y);
		}
	}


