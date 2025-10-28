/**
 * Definiert einen Kreis über einen Radius und einem Mittelpunkt in einem
 * zweidimensionalen Koordinatensystem
 */
public class Circle {

	// Mittelpunkt des Kreises
	private Point location;
	private double radius;
	
	public Circle() {
	}

	public Circle(Point initLocation, double initRadius) {
		
		this.location = initLocation;
		this.radius = initRadius;
		

	
		
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point newLocation) {
		this.location = newLocation;
	}
	
	// Durchmesser
	public double getDiameter() {
		double x ;
		
		x = 2* this.radius;
		return x;
	}

	// Umfang
	public double getCircumference() {
		double U ;
		U = Math.PI * getDiameter();
		
		return U;
	}

	// Fläche
	public double getArea() {
		double A ;
		
		A= Math.PI * Math.pow(this.radius,2);
		
		return A;
	}

	public boolean containsPoint(Point point) {
	/*	if((location.getX() - radius)< point.getX()
				 && point.getX() < (location.getX() + radius)
				  && (location.getY()- radius)< point.getY() 
					&& point.getY() < (location.getY() + radius))*/
		if((location.getX()- radius)<point.getX()
			&& point.getX()< (location.getX()+radius)
			&& (location.getY()-radius) < point.getY()
			&& point.getY() < (location.getY()+radius))
		{
			return true;
			
		}else{
			
		return false;
		}
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		circle.location = center;
		double a = Math.pow((p.getX()- center.getX()), 2)
				+ Math.pow((p.getY()- center.getY()),2);
		circle.radius = Math.sqrt(a) ;

		return circle;
	}

}
