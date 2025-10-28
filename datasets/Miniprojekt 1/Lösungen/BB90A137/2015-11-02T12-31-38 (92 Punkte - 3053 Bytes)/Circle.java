/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;
	private double area;
	private double diameter;
	private double circumference;

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
		diameter = radius * 2;
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		circumference = 2 * Math.PI * radius;
		return circumference;
	}

	// Fläche
	public double getArea() {
		area = Math.PI * radius * radius;
		return area;
	}

	public boolean containsPoint(Point point) {
		
		if((location.getX()>0 && location.getY()>0) && (point.getX()<0 && point.getY()<0))
		{
			return false;
		}
		
		if(location.getDistance(point) <= radius)
		{
			return true;
		}
		
		else
		{
			return false;
		}		
		/**double pointX = point.getX();
		double pointY = point.getY();
		
		double mittelPX = this.getLocation().getX();
		double mittelPY = this.getLocation().getY();
		
		double breitePX = mittelPX + this.getRadius();  // Grenze für Breite
		double breitePY = mittelPY + this.getRadius();
		
		boolean ergX = false;
		boolean ergY = false;
		
		if (breitePX >= pointX && pointX >= mittelPX || breitePX <= pointX && pointX <= mittelPX)
		{
			ergX = true;
		}
		if (breitePY >= pointY && pointY >= mittelPY || breitePY <= pointY && pointY <= mittelPY)
		{
			ergY = true;
		}
		if (ergX == true && ergY == true)
		{
			return true;
		}
		else
		{
			return false;
		}**/
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();
		circle.setLocation(center);
		circle.setRadius(Math.sqrt(center.getX()-p.getX()*center.getX()-p.getX()+center.getY()-p.getY()*center.getY()-p.getY()));
		// An dieser Stelle das circle-Objekt bearbeiten

		return circle;
	}

}
