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
		
		this.location=initLocation;
		this.radius=initRadius;

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
		
		double diameter;
		
		diameter=2*radius;
				
		return diameter;
	}

	// Umfang
	public double getCircumference() {
		
		double Umpfang;
		
		Umpfang=Math.PI*getDiameter();
		return Umpfang;
	}

	// Fläche
	public double getArea() {
		
		double flaeche;
		
		flaeche=Math.pow(Math.PI*radius,2);
		
		return flaeche;
	}

	public boolean containsPoint(Point point) {
		//(x_kreis-x_p)² + (y_kreis-y_p)²<radius²
		
		boolean imKreis;
		
		if(Math.pow(this.location.getX()-point.getX(),2) + Math.pow(this.location.getY()-point.getY(),2)<=Math.pow(radius,2)){
			
			imKreis=true;
		}
		else{
			imKreis=false;
		}
		return imKreis;
	}

	public static Circle fromPoints(Point center, Point p) {
		Circle circle = new Circle();

		// An dieser Stelle das circle-Objekt bearbeiten
		
		double radius;

		circle.location=center;
		radius=center.getDistance(p);
		
		return circle;
	}

}
