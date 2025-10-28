/**
 * Definiert einen Kreis �ber einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
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
		return location;
	}

	public void setLocation(Point newLocation) {
		location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		return radius*2;
	}

	// Umfang: 𝑈 = 2𝜋𝑟 = 𝜋𝑑
	public double getCircumference() {
		return Math.PI*radius;
	}

	// Flaeche:𝐴 = 𝜋𝑟^2
	public double getArea() {
		return Math.pow(Math.PI*radius, 2);
	}

	public boolean containsPoint(Point point) {
		
		if( location.getDistance(point) <= radius ){
			return true;
		}
		else return false;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		//Implementieren Sie die Methode fromPoints(Point center, Point p) so, 
		//dass sie ein neues Circle-Objekt mit folgenden Eigenschaften zurückgibt:
		//o Der Mittelpunkt des so erzeugten Kreises ist center 
		//o Der Punkt p liegt genau auf dem Kreisrand
		
		circle.setLocation(center);
		circle.setRadius(circle.getLocation().getDistance(p));;

		return circle;
	}

}
