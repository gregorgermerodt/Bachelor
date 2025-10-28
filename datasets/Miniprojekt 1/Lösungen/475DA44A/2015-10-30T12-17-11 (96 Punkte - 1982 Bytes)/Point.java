/**
 * Beschreibt einen Punkt im zweidimensionalen Koordinatensystem mit x- und
 * y-Wert
 */
public class Point {
	// Koordinaten
		private double x;
		private double y;

		public Point() {
		}

		public Point(double initX, double initY) {
			this.x = initX;
			this.y = initY;
		}

		public double getX() {
			return x;
		}

		public void setX(double newX) {
			this.x = newX;
		}

		public double getY() {
			return y;
		}

		public void setY(double newY) {
			this.x = newY;
		}

		public double getDistance(Point p) {
			double m = x - p.getX();
			double n = y - p.getY();
			return Math.sqrt((Math.pow(m, 2)) + (Math.pow(n, 2)));
		}

}
